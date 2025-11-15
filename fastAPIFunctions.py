from __future__ import annotations

import os
import platform
import signal
import subprocess
import sys
import time
from typing import Iterable, Optional, Tuple
from urllib.error import HTTPError, URLError
from urllib.request import Request, urlopen

from ExprExceptions import ServerCouldNotStartException


def _normalize_paths(paths: Optional[Iterable[str]]) -> Tuple[str, ...]:
    if not paths:
        return ("/health", "/", "/docs", "/openapi.json")
    norm = []
    for p in paths:
        if not p:
            continue
        norm.append(p if p.startswith("/") else "/" + p)
    return tuple(norm) or ("/",)

"""
Função que verifica a disponiblidade do servidor FastAPI
"""
def ping_fastapi(
    base_url: str = "http://127.0.0.1:8000",
    paths: Optional[Iterable[str]] = None,
    timeout: float = 1.5,
    headers: Optional[dict] = None,
) -> dict:
    """
    Verifica rapidamente se um servidor FastAPI está rodando.

    Tenta fazer GET em uma sequência de caminhos comuns (ex.: /health, /, /docs,
    /openapi.json) e retorna um dicionário com detalhes do primeiro resultado
    útil encontrado.

    Critério de "rodando": receber QUALQUER resposta HTTP (mesmo 404/422) do
    host/porta informados. O campo "ok" indica especificamente status 2xx.

    Parâmetros:
        base_url: URL base do servidor (ex.: "http://127.0.0.1:8000").
        paths: caminhos a testar em ordem de preferência.
        timeout: timeout por requisição em segundos.
        headers: cabeçalhos HTTP extras para enviar.

    Retorna:
        dict com chaves:
            - running (bool): True se houve resposta HTTP.
            - ok (bool): True se status HTTP 2xx.
            - http_status (int|None): código de status retornado, se houver.
            - url (str): URL base testada.
            - path (str): caminho que respondeu.
            - duration_ms (float): duração da tentativa que respondeu.
            - error (str|None): mensagem de erro se não respondeu.
    """

    paths_to_try = _normalize_paths(paths)
    last_error: Optional[str] = None

    for path in paths_to_try:
        full_url = base_url.rstrip("/") + path
        req = Request(full_url, headers={"User-Agent": "fastAPIFunctions/1.0", **(headers or {})})
        start = time.perf_counter()
        try:
            with urlopen(req, timeout=timeout) as resp:  # nosec: B310 - URL controlado pelo usuário no contexto de teste
                status = getattr(resp, "status", None)
                duration_ms = (time.perf_counter() - start) * 1000.0
                return {
                    "running": True,
                    "ok": status is not None and 200 <= int(status) < 300,
                    "http_status": int(status) if status is not None else None,
                    "url": base_url,
                    "path": path,
                    "duration_ms": duration_ms,
                    "error": None,
                }
        except HTTPError as e:  # resposta HTTP não-2xx
            duration_ms = (time.perf_counter() - start) * 1000.0
            return {
                "running": True,  # houve resposta do servidor
                "ok": False,
                "http_status": int(getattr(e, "code", 0) or 0),
                "url": base_url,
                "path": path,
                "duration_ms": duration_ms,
                "error": str(e),
            }
        except URLError as e:  # não conectou (p.ex. recusado, timeout, DNS)
            last_error = str(getattr(e, "reason", e))
        except Exception as e:  # erro inesperado
            last_error = str(e)

    # Nenhum caminho respondeu
    return {
        "running": False,
        "ok": False,
        "http_status": None,
        "url": base_url,
        "path": "",
        "duration_ms": 0.0,
        "error": last_error or "sem resposta",
    }


def expect_running(
    base_url: str = "http://127.0.0.1:8000",
    paths: Optional[Iterable[str]] = None,
    timeout: float = 1.5,
    headers: Optional[dict] = None,
) -> dict:
    """
    Afirma (via AssertionError) que o servidor está rodando em ``base_url``.

    Útil para ser chamado em testes. Retorna o dicionário de ``ping_fastapi``
    para inspeção adicional quando necessário.
    """
    info = ping_fastapi(base_url=base_url, paths=paths, timeout=timeout, headers=headers)
    if not info["running"]:
        raise AssertionError(
            f"FastAPI não está respondendo em {info['url']}: {info.get('error') or 'sem resposta'}"
        )
    return info


def wait_until_running(
    base_url: str = "http://127.0.0.1:8000",
    paths: Optional[Iterable[str]] = None,
    timeout: float = 1.5,
    headers: Optional[dict] = None,
    attempts: int = 20,
    delay_s: float = 0.25,
    ) -> dict:
    """
    Faz polling até o servidor responder (ou estourar tentativas).

    Bom para cenários de CI onde o servidor é iniciado em background
    (uvicorn) e pode levar alguns instantes para aceitar conexões.
    """
    last_info: Optional[dict] = None
    for _ in range(max(1, int(attempts))):
        info = ping_fastapi(base_url=base_url, paths=paths, timeout=timeout, headers=headers)
        last_info = info
        if info.get("running"):
            return info
        time.sleep(max(0.0, float(delay_s)))

    raise TimeoutError(
        f"Servidor FastAPI não respondeu após {attempts} tentativas em {base_url}. "
        f"Último erro: {last_info.get('error') if last_info else 'desconhecido'}"
    )



def run_server_uvicorn(
    app_path: str = "pastaFastapiServer.app:app",
    host: str = "127.0.0.1",
    port: int = 8000,
    attempts: int = 40,
    delay_s: float = 0.25,
    keep_running: bool = False,
    env: Optional[dict] = None,
    log_level: str = "warning",
    reload: bool = False,
    extra_args: Optional[Iterable[str]] = None,
    show_server_output: bool = False,
) -> dict:
    """
    Sobe o servidor FastAPI via "python -m uvicorn" (sem .cmd) e verifica se está rodando.

    Parâmetros principais:
        app_path: caminho do app no formato módulo:objeto (ex.: "pastaFastapiServer.app:app").
        host, port: endereço para bind.
        attempts, delay_s: estratégia de polling para readiness.
        keep_running: se True, mantém o subprocess vivo após a verificação.
        env: variáveis de ambiente adicionais.
        log_level: nível de log do uvicorn.
        reload: ativa reload do uvicorn (desaconselhado para CI).
        extra_args: lista adicional de argumentos para o uvicorn.
    """
    # Os servidores fastapi majoritariamente utilizam o servidor uvicorn, então é preciso verificar se há o uvicorn instalado
    try:  
        import uvicorn 
    except Exception as exc:
        raise RuntimeError("Uvicorn não está instalado. Instale com: pip install uvicorn fastapi") from exc

    base_url = f"http://{host}:{port}"
    
    # Roda o fastapi através do CMD do windows. 
    cmd = [
        sys.executable,
        "-m",
        "uvicorn",
        app_path,
        "--host",
        host,
        "--port",
        str(port),
        "--log-level",
        log_level,
    ]
    if reload:
        cmd.append("--reload")
    if extra_args:
        cmd.extend(list(extra_args))

    creationflags = 0
    try:
        if platform.system().lower().startswith("win"):
            creationflags = subprocess.CREATE_NEW_PROCESS_GROUP  # type: ignore[attr-defined]
    except Exception:
        creationflags = 0

    std_out = None if show_server_output else subprocess.DEVNULL
    std_err = None if show_server_output else subprocess.DEVNULL

    proc = subprocess.Popen(
        cmd,
        stdout=std_out,
        stderr=std_err,
        creationflags=creationflags,
        env={**os.environ, **(env or {})},
    )

    error: Optional[Exception] = None
    info: Optional[dict] = None
    try:
        info = None
        for _ in range(max(1, int(attempts))):
            # Se o processo caiu, aborta cedo e informa
            if proc.poll() is not None:
                raise RuntimeError(
                    f"Uvicorn encerrou antes de ficar pronto (exit code {proc.returncode}). "
                    f"Ative show_server_output=True para ver os logs."
                )

            info = ping_fastapi(base_url=base_url)
            if info.get("running"):
                break
            time.sleep(max(0.0, float(delay_s)))

        if not info or not info.get("running"):
            raise TimeoutError(
                f"Servidor FastAPI não respondeu após {attempts} tentativas em {base_url}."
            )

        result = {"started": True, "pid": proc.pid, "info": info, "cmd": cmd}
    except Exception as exc:
        error = exc
        result = {"started": False, "pid": proc.pid, "info": None, "cmd": cmd, "error": str(exc)}
    finally:
        if not keep_running:
            try:
                proc.terminate()
            except Exception:
                try:
                    os.kill(proc.pid, signal.SIGTERM)
                except Exception:
                    pass

            try:
                proc.wait(timeout=3)
            except Exception:
                try:
                    proc.kill()
                except Exception:
                    pass

    if error:
        raise error
    return result


"""
Essa função é um handler que vai rodar o servidor fastapi, verificando se o servidor primeiramente existe. Depois, vamos rodar a
função que liga para o servidor.

"""
def handlerFastAPIRunTest(
        main_file = 'main.py',
        main_path = './pastaFastapiServer',
        app_name = 'app',
        host = '127.0.0.1',
        port = 8000,

):
    
    if not os.path.exists(main_path):
        print(f"O caminho {main_path} não existe")
        return
    if not os.path.isfile(os.path.join(main_path, main_file)):
        print(f"O caminho {main_file} não é um arquivo")
        return

    
    try:

        run_server_uvicorn(
            app_path = f"{main_path.split('/')[-1]}.{main_file.split('.py')[0]}:{app_name}",
            host = host,
            port = port,
            attempts = 40,
            show_server_output=True
        )
    except Exception as e:
        raise ServerCouldNotStartException(f"Não foi possível iniciar o servidor. {e}")


    print('O servidor foi iniciado com sucesso')
    return 