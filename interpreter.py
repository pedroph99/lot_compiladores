from typing import Dict, Any, List
import os
import requests 
import time

from antlr4 import ParserRuleContext

from ExprParser import ExprParser
from ExprExceptions import InvalidFastAPITestException
from PythonScriptsFunction import run_python_script
from NodeScriptsFunctions import run_node_script
import fastAPIFunctions 
from expressFunctions import handlerExpressRunTest


class ExprInterpreter:
    def __init__(self, objects_infos: Dict[str, Dict[str, Any]]):
        self.objects_infos = objects_infos

    def run(self, tree: ParserRuleContext) -> None:
        match tree:
            case ExprParser.DocumentContext():
                for child in tree.decs:
                    self.run(child)
            case ExprParser.TestDeclarationContext():
                self._run_test(tree)
            case _:
                return

    def _run_test(self, tree: ExprParser.TestDeclarationContext) -> None:
        args_list = self._arguments_to_list(tree)

        server_ports = []
        server_apps = []
        for x in tree.testargs:
            if type(x) is ExprParser.ServerPortsContext:
                for y in x.serverports:
                    server_ports.append(y.text)
            elif type(x) is ExprParser.ServerAppsContext:
                for y in x.serverapps:
                    server_apps.append(y.text)

        for i, child in enumerate(tree.objectName):
            obj_name = child.text
            print(f"Running test {obj_name}")
            current = self.objects_infos.get(obj_name)
            if not current:
                raise KeyError(f"Variable {obj_name} not found")

            typ = current.get("type")
            lang = current.get("language")
            framework = current.get("framework")
            main_file = current.get("mainFile")
            path = current.get("path") or "."

            if typ == "server":
                port = int(server_ports[i]) if server_ports and i < len(server_ports) else 8000
                app_name = server_apps[i] if server_apps and i < len(server_apps) else None
                current_routes = args_list[i] if args_list and i < len(args_list) else []

                if framework == "fastapi":
                    if not app_name:
                         pass 

                    print(f"[FastAPI] Iniciando servidor {obj_name} na porta {port}...")
                    process = fastAPIFunctions.start_fastapi_server(path, main_file, port)

                    if process:
                        try:
                            print(f"[FastAPI] Testing Routes: {current_routes}")
                            all_tests_passed = True

                            for route in current_routes:
                                clean_route = route.strip()
                                if not clean_route.startswith('/'):
                                    clean_route = '/' + clean_route
                                
                                url = f"http://127.0.0.1:{port}{clean_route}"

                                try:
                                    resp = requests.get(url, timeout=2)
                                    if 200 <= resp.status_code < 300:
                                        print(f"[PASS] {clean_route} -> {resp.status_code} (OK)")
                                    else:
                                        print(f"[FAIL] {clean_route} -> Status {resp.status_code}")
                                        all_tests_passed = False
                                except Exception as e:
                                    print(f"[FAIL] {clean_route} -> Erro de conexão/timeout")
                                    all_tests_passed = False
                            
                            if all_tests_passed:
                                print(f"Teste de servidor {obj_name} executado com sucesso")
                            else:
                                print(f"Falha ao executar alguns testes no servidor {obj_name}")

                        finally:
                            print("[FastAPI] Stopping server...")
                            process.terminate()
                            try:
                                process.wait(timeout=5)
                            except:
                                process.kill()
                    else:
                        print(f"Falha crítica: Não foi possível iniciar o servidor {obj_name}")

                elif framework == "express":
                    script_file = f"{main_file}.js" if not main_file.endswith('.js') else main_file
                    
                    result = handlerExpressRunTest(
                        main_file=script_file,
                        main_path=path,
                        port=port,
                        routes=current_routes
                    )
                    
                    if result is False:
                        print(f"Falha ao executar o teste de servidor {obj_name}")
                    else:
                        print(f"Teste de servidor {obj_name} executado com sucesso")

            if typ == "script":
                if lang == "python":
                    script_path = os.path.join(path, f"{main_file}.py")
                    result = run_python_script(
                        script_path=script_path,
                        args=args_list[i] if args_list and i < len(args_list) else None,
                        env=None,
                        timeout=None,
                        show_output=True,
                    )
                    
                if lang == "node":
                    script_path = os.path.join(path, f"{main_file}.js")
                    result = run_node_script(
                        script_path=script_path,
                        args=args_list[i] if args_list and i < len(args_list) else None,
                        env=None,
                        timeout=None,
                        show_output=True,
                    )
                
                if 'result' in locals():
                    if result is False:
                        print(f"Falha ao executar o teste de script {obj_name}")
                    else:
                        print(f"Teste de script {obj_name} executado com sucesso")
        return

    def _arguments_to_list(self, tree: ExprParser.ArgsSpecContext) -> List[str]:
        args_list = []

        args_bulk = None
        args = None
        for x in tree.testargs:
            if type(x) is ExprParser.ArgsBulkContext:
                args_bulk = x
            elif type(x) is ExprParser.ArgsContext:
                args = x
        
        if args_bulk:
            for x in args_bulk.argsValues.args:
                current_bulk_list = []
                for y in x.args:
                    current_bulk_list.append(y.text)
                args_list.append(current_bulk_list)
        elif args:
            current_args_list = []
            for x in args.argsValues.args:
                current_args_list.append(x.text)
            args_list.append(current_args_list)
        
        return args_list