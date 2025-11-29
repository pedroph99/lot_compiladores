from antlr4 import ParserRuleContext
from ExprExceptions import InvalidFastAPITestException, InvalidFrameworkException, InvalidObjectException, VariableNotFoundException, InvalidTestArgException
from ExprParser import ExprParser
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

               

                if len(tree.objectName) > 1 and tree.TYPETEST().getText() == "run":
                    raise InvalidFastAPITestException("Tipo inválido de teste. Utilize o formato 'test runBulk Object1, Object2, ...'")
                for child in tree.objectName:
                    
                    if child.text not in self.object_variables:
                        raise VariableNotFoundException(f"Variável {child.text} não encontrada")
                    
                    
                
                if tree.TYPETEST().getText() == "run":
                    for x in tree.testargs:
                        print(type(x))
                        if type(x) is ExprParser.ArgsBulkContext:
                            raise InvalidTestArgException("Tipo inválido de args. Utilize o formato 'args: [ [...], ...]'")
                
                if tree.TYPETEST().getText() == "runBulk":
                    for x in tree.testargs:
                        print(type(x))
                        if type(x) is ExprParser.ArgsContext:
                            raise InvalidTestArgException("Tipo inválido de args. Utilize o formato 'args: [ [...], ...]'")