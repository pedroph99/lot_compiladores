import subprocess
import os
import time
import requests
from typing import List

def handlerExpressRunTest(main_file: str, main_path: str, port: int, routes: List[str] = None) -> bool:

    print(f"[Express] Starting server: {main_file} at {main_path} on port {port}...")

    if not routes:
        routes = ["/"]
    
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
        
        allRoutesPassed = True
        baseUrl = f"http://localhost:{port}"

        print(f"[Express] Testing Routes: {routes}")

        for route in routes:
            if not route.startswith("/"):
                route = "/" + route
            
            url = f"{baseUrl}{route}"
            try:
                response = requests.get(url, timeout=2)

                if response.status_code == 200:
                    print(f"[PASS] {route} -> 200 (OK)")
                else:
                    print(f"[FAIL] {route} -> Status {response.status_code}")
                    allRoutesPassed = False

            except requests.exceptions.RequestException as e:
                print(f"[FAIL] {route} -> Connection Error")
                allRoutesPassed = False
        
        return allRoutesPassed
        

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