from antlr4 import ParserRuleContext
from ExprExceptions import InvalidFrameworkException, InvalidObjectException, VariableNotFoundException
from ExprParser import ExprParser
from ExprLexer import ExprLexer
class ExprSemanticAnalyser:
    def __init__(self):
        self.object_variables = []
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
                self.object_variables.append(tree.ID().getText())

                # Verifica a compatibilidade do framework e linguagem
                type_obj = tree.type_
                framework = tree.server
                language = tree.language
                print(framework, language)
                if language and framework:
                    if not self.frameworks_languages[framework.text] == language.text:
                        raise InvalidFrameworkException(f"Framework {framework.text} not compatible with language {language.text}")
                if not language and not framework:
                    raise InvalidObjectException(f"Object {tree.ID().getText()} must have a language or a framework")
            
                if type_obj.text == "server" and not framework:
                    raise InvalidObjectException(f"Object {tree.ID().getText()} must have a framework because it is a server")


            
            case ExprParser.TestDeclarationContext():
                print(tree.TYPETEST().getText())
                if not tree.ID().getText() in self.object_variables:
                    raise VariableNotFoundException(f"Variable {tree.ID().getText()} not found")
            
            
