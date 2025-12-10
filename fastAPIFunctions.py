import subprocess
import time
import sys
import os
import requests 

def start_fastapi_server(path, main_file, port):
    print(f"[FastAPI] Iniciando servidor no path: {path}")
    
    full_path_file = os.path.join(path, main_file)
    if not full_path_file.endswith(".py"):
        full_path_file += ".py"
        
    if not os.path.exists(full_path_file):
        print(f"[Erro] Arquivo não encontrado: {full_path_file}")
        return None

    module_name = main_file.replace('.py', '')
    
    command = [
        sys.executable, "-m", "uvicorn", 
        f"{module_name}:app", 
        "--port", str(port)
    ]
    
    try:
        process = subprocess.Popen(
            command, 
            cwd=path, 
            stdout=subprocess.PIPE, 
            stderr=subprocess.PIPE
        )
        
        server_url = f"http://127.0.0.1:{port}/" 
        
        for _ in range(10):
            if process.poll() is not None:
                print("[Erro] O servidor caiu ao iniciar.")
                print(process.stderr.read().decode())
                return None
            
            try:
                requests.get(server_url, timeout=0.5)
                return process 
            except requests.exceptions.ConnectionError:
                time.sleep(0.5)
                continue
                
        print("[Erro] Timeout: Servidor não respondeu.")
        process.terminate()
        return None
            
    except Exception as e:
        print(f"[Erro crítico] {e}")
        return None