from typing import Dict, Any, List
import os

from antlr4 import ParserRuleContext

from ExprParser import ExprParser
from ExprExceptions import InvalidFastAPITestException
from PythonScriptsFunction import run_python_script
from NodeScriptsFunctions import run_node_script
from fastAPIFunctions import handlerFastAPIRunTest


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
                # Ignora outras regras aqui (ex.: ObjectDeclaration)
                return

    def _run_test(self, tree: ExprParser.TestDeclarationContext) -> None:
        args_list = self._arguments_to_list(tree)
        

        for i, child  in enumerate(tree.objectName):
            obj_name = child.text
            print(f"Running test {obj_name}")
            current = self.objects_infos.get(obj_name)
            if not current:
                # O semântico deveria garantir existência; evita crash aqui
                raise KeyError(f"Variable {obj_name} not found")


            typ = current.get("type")
            lang = current.get("language")
            print(f"language: {lang}")
            framework = current.get("framework")
            main_file = current.get("mainFile")
            path = current.get("path") or "."
            

            

            if typ == "server":
                port = int(tree.serverport.text) if tree.serverport else 8000
                app_name = tree.serverapp.text if tree.serverapp else None

                if framework == "fastapi":
                    if not app_name:
                        raise InvalidFastAPITestException("FastAPI test must have a serverapp")
                    handlerFastAPIRunTest(
                        main_file=f"{main_file}.py",
                        main_path=path,
                        port=port,
                        app_name=app_name,
                    )
                return

            if typ == "script":
                if lang == "python":
                    script_path = os.path.join(path, f"{main_file}.py")
                    run_python_script(
                        script_path=script_path,
                        args=args_list[i],
                        env=None,
                        timeout=None,
                        show_output=True,
                    )
                    
                if lang == "node":
                
                    script_path = os.path.join(path, f"{main_file}.js")

                    run_node_script(
                        script_path=script_path,
                        args=args_list[i],
                        env=None,
                        timeout=None,
                        show_output=True,
                    )
        return

    def _arguments_to_list(self, tree: ExprParser.ArgsSpecContext) -> List[str]:
        args_list = []
        if tree.argBulk:
            

            for x in tree.argBulk.args:
                current_list = []
                for y in x.args:
                    
                    current_list.append(y.text)
                args_list.append(current_list)
        
        return args_list
