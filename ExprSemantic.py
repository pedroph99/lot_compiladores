from antlr4 import ParserRuleContext
from ExprExceptions import InvalidFastAPITestException, InvalidFrameworkException, InvalidObjectException, VariableNotFoundException
from ExprParser import ExprParser
from ExprLexer import ExprLexer
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
                    "servermain": tree.servermain.text if tree.servermain else None,
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
                                main_file = f'{current_object["servermain"]}.py',
                                main_path = f"{current_object['path']}",
                                port = serverport,
                                app_name= serverapp,

                            )


                        



                server_framework = tree.objectName.text
            
            
