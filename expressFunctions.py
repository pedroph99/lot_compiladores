import subprocess
import os
import time
import requests

def handlerExpressRunTest(main_file: str, main_path: str, port: int) -> bool:

    print(f"[Express] Starting server: {main_file} at {main_path} on port {port}...")
    
    env = os.environ.copy()
    env["PORT"] = str(port)

    command = ["node", main_file]
    
    process = None
    try:
        process = subprocess.Popen(
            command,
            cwd=main_path,
            env=env,
            stdout=subprocess.PIPE,
            stderr=subprocess.PIPE
        )
        
        time.sleep(2) 

        if process.poll() is not None:
            print("[Express] Server failed to start immediately.")
            print(process.stderr.read().decode())
            return False

        url = f"http://localhost:{port}/"
        try:
            response = requests.get(url, timeout=2)
            if response.status_code == 200:
                print(f"[Express] Health check passed: {response.json()}")
                return True
            else:
                print(f"[Express] Health check failed with status: {response.status_code}")
                return False
        except requests.exceptions.RequestException as e:
            print(f"[Express] Connection failed: {e}")
            return False

    except Exception as e:
        print(f"[Express] Error running test: {e}")
        return False
        
    finally:
        if process:
            print("[Express] Stopping server...")
            process.terminate()
            try:
                process.wait(timeout=5)
            except subprocess.TimeoutExpired:
                process.kill()