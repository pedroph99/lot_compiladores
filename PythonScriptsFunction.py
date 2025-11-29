from __future__ import annotations

import os
import subprocess
import sys
from typing import Iterable, Optional, Tuple, Dict, Any


def _to_tuple_args(args: Optional[Iterable[str] | str]) -> Tuple[str, ...]:
    if not args:
        return tuple()
    # Se vier como string (ex.: "args=[foo, bar]" ou "[foo bar]")
    if isinstance(args, str):
        raw = args.strip()
        # remove prefixo "args" e '=' se existir
        if raw.lower().startswith("args"):
            raw = raw[4:].lstrip()
            if raw.startswith("="):
                raw = raw[1:].lstrip()
        # remove colchetes se existirem
        if raw.startswith("[") and raw.endswith("]"):
            raw = raw[1:-1]
        # separa por vírgula ou espaço
        parts = []
        for chunk in raw.replace(",", " ").split():
            if chunk:
                parts.append(chunk)
        return tuple(parts)
    # Iterable normal
    return tuple(str(a) for a in args)


def run_python_script(
    script_path: str,
    args: Optional[Iterable[str] | str] = None,
    *,
    cwd: Optional[str] = None,
    env: Optional[dict] = None,
    timeout: Optional[float] = None,
    show_output: bool = False,
) -> Dict[str, Any]:
    
    """
    Executa um script Python localizado em ``script_path``.

    Parâmetros:
        script_path: caminho para o arquivo ``.py`` a ser executado.
        args: parâmetros adicionais passados ao script.
        cwd: diretório de trabalho para a execução (opcional).
        env: variáveis de ambiente extras (mescladas com ``os.environ``).
        timeout: tempo máximo (segundos) antes de abortar a execução.
        show_output: se True, repassa stdout/stderr para o console.

    Retorna:
        dict com chaves:
            - success (bool)
            - returncode (int)
            - stdout (str)
            - stderr (str)
            - cmd (list[str])

    Lança:
        FileNotFoundError: se ``script_path`` não existir.
        NotADirectoryError: se ``cwd`` for especificado mas não existir.
        subprocess.TimeoutExpired: se exceder ``timeout``.
        Exception: erros inesperados do subprocesso.
    """

    if not os.path.exists(script_path):
        
        print(f"O caminho do script não existe: {script_path}")
        return False
    if not os.path.isfile(script_path):
        
        print(f"O caminho não é um arquivo: {script_path}")
        return False

    if cwd is not None and not os.path.isdir(cwd):
        print(f"Diretório de trabalho inválido: {cwd}")
        return False

    extra_env = {**os.environ, **(env or {})}
    arg_tuple = _to_tuple_args(args)

    cmd = [
        sys.executable,
        script_path,
        *arg_tuple,
    ]
    

    if show_output:
        # Repassa saída diretamente ao terminal
        try:
            completed = subprocess.run(
                cmd,
                cwd=cwd,
                env=extra_env,
                timeout=timeout,
                check=False,
            )
        except Exception as exc:
            print(f"Erro ao executar script: {exc}")
            return False

        if completed.returncode != 0:
            print(f"Script retornou código {completed.returncode}")
            return False

        return {
            "success": True,
            "returncode": int(completed.returncode),
            "stdout": "",
            "stderr": "",
            "cmd": cmd,
        }

    # Captura stdout/stderr
    try:
        print('aassaas')
        completed = subprocess.run(
            cmd,
            cwd=cwd,
            env=extra_env,
            timeout=timeout,
            check=False,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE,
            text=True,
        )
    except Exception as exc:
        print(f"Erro ao executar script: {exc}")
        return False

    if completed.returncode != 0:
        print(f"Script retornou código {completed.returncode}")
        if completed.stderr:
            print(completed.stderr)
        return False

    return {
        "success": True,
        "returncode": int(completed.returncode),
        "stdout": completed.stdout or "",
        "stderr": completed.stderr or "",
        "cmd": cmd,
    }
