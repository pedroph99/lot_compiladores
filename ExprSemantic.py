from antlr4 import ParserRuleContext
from ExprExceptions import InvalidFastAPITestException, InvalidFrameworkException, InvalidObjectException, VariableNotFoundException
from ExprParser import ExprParser
from ExprLexer import ExprLexer
from NodeScriptsFunctions import run_node_script
from PythonScriptsFunction import run_python_script
from fastAPIFunctions import handlerFastAPIRunTest
class ExprSemanticAnalyser:
    def __init__(self):
        self.object_variables = []
        self.objects_infos = {

        }
        self.frameworks_languages = {
            "fastapi": "python",
            "express": "node",
            "rails": "ruby"
        }
    def analyse(self, tree: ParserRuleContext):
        match tree:
            
            case ExprParser.DocumentContext():
               
                for child in tree.decs:
                    self.analyse(child)
            case ExprParser.ObjectDeclarationContext():
                # Adiciona o nome da variável ao dicionário
                self.object_variables.append(tree.objectName.text)

                # Verifica a compatibilidade do framework e linguagem
                type_obj = tree.type_
                framework = tree.server
                language = tree.language
                print(framework, language)
                if language and framework:
                    if not self.frameworks_languages[framework.text] == language.text:
                        raise InvalidFrameworkException(f"Framework {framework.text} not compatible with language {language.text}")
                if not language and not framework:
                   
                    raise InvalidObjectException(f"Object {tree.objectName.text} must have a language or a framework")
            
                if type_obj.text == "server" and not framework:
                    raise InvalidObjectException(f"Object {tree.objectName.text} must have a framework because it is a server")

                # Adiciona informações da variável

                self.objects_infos[tree.objectName.text] = {
                    "type": type_obj.text,
                    "framework": framework.text if framework else None,
                    "language": language.text if language else None,
                    "mainFile": tree.mainFile.text if tree.mainFile else None,
                    "path": tree.path.text if tree.PATH() else None
                    }
            
            case ExprParser.TestDeclarationContext():
                if not tree.objectName.text in self.object_variables:
                    raise VariableNotFoundException(f"Variable {tree.ID().getText()} not found")
                
                current_object = self.objects_infos[tree.objectName.text]
                
                if current_object["type"] == "server":
                    if tree.TYPETEST().getText() == "run":
                        # Handler para teste de servidor run 
                        serverport = 8000
                        serverapp = 'app'
                        if  tree.serverport:
                            serverport = tree.serverport.getText()
                        framework = current_object["framework"]

                        if tree.serverapp:
                            print('Existe serverapp')
                            serverapp = tree.serverapp.text
                        

                        if framework == "fastapi":
                            if not tree.serverapp:
                                raise InvalidFastAPITestException("FastAPI test must have a serverapp")
                            
                            
                            handlerFastAPIRunTest(
                                main_file = f'{current_object["mainFile"]}.py',
                                main_path = f"{current_object['path']}",
                                port = serverport,
                                app_name= serverapp,

                            )
                            return 
                
                if current_object["type"] == "script":
                    if tree.TYPETEST().getText() == "run":
                        argsScript = None
                        if argsScript:
                            argsScript = argsScript.split(',')
                        else:
                            argsScript = []
                        # Handler para teste de servidor run
                        if current_object["language"] == "python":
                            run_python_script(
                                script_path = f"{current_object['path']}/{current_object['mainFile']}.py",
                                args = argsScript,
                                #cwd = f"{current_object['path']}",
                                env = None,
                                timeout = None,
                                show_output = True
                            )

                            print('Teste de script executado com sucesso')
                            return
                        elif current_object['language'] == "node":
                            run_node_script(
                                script_path = f"{current_object['path']}/{current_object['mainFile']}.js",
                                args = argsScript,
                                #cwd = f"{current_object['path']}",
                                env = None,
                                timeout = None,
                                show_output = True
                            )
                            print('ok')
                            return 
                    




                
            
            
