from __future__ import annotations

import os
import subprocess
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


def run_node_script(
    script_path: str,
    args: Optional[Iterable[str] | str] = None,
    *,
    cwd: Optional[str] = None,
    env: Optional[dict] = None,
    timeout: Optional[float] = None,
    show_output: bool = False,
) -> Dict[str, Any]:
    """
    Executa um script Node.js localizado em ``script_path`` usando o binário ``node``.

    Parâmetros:
        script_path: caminho para o arquivo ``.js`` a ser executado.
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
        raise FileNotFoundError(f"O caminho do script não existe: {script_path}")
    if not os.path.isfile(script_path):
        raise FileNotFoundError(f"O caminho não é um arquivo: {script_path}")

    if cwd is not None and not os.path.isdir(cwd):
        raise NotADirectoryError(f"Diretório de trabalho inválido: {cwd}")

    extra_env = {**os.environ, **(env or {})}
    arg_tuple = _to_tuple_args(args)

    cmd = [
        "node",
        script_path,
        *arg_tuple,
    ]

    if show_output:
        completed = subprocess.run(
            cmd,
            cwd=cwd,
            env=extra_env,
            timeout=timeout,
            check=False,
        )
        return {
            "success": completed.returncode == 0,
            "returncode": int(completed.returncode),
            "stdout": "",
            "stderr": "",
            "cmd": cmd,
        }

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

    return {
        "success": completed.returncode == 0,
        "returncode": int(completed.returncode),
        "stdout": completed.stdout or "",
        "stderr": completed.stderr or "",
        "cmd": cmd,
    }
