import sys
from antlr4 import FileStream, CommonTokenStream
from antlr4.error.ErrorListener import ErrorListener

# Imports gerados pelo ANTLR após a compilação de Expr.g4
from ExprLexer import ExprLexer
from ExprParser import ExprParser
from ExprSemantic import ExprSemanticAnalyser

class CollectingErrorListener(ErrorListener):
    def __init__(self):
        super().__init__()
        self.errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        self.errors.append(f"linha {line}:{column} {msg}")
    


def parse_file(path: str):
    # Lê o arquivo e prepara lexer/parser
    input_stream = FileStream(path, encoding="utf-8")
    
    lexer = ExprLexer(input_stream)
    lexer.removeErrorListeners()
    lex_listener = CollectingErrorListener()
    lexer.addErrorListener(lex_listener)

    token_stream = CommonTokenStream(lexer)

    parser = ExprParser(token_stream)
    parser.removeErrorListeners()
    parse_listener = CollectingErrorListener()
    parser.addErrorListener(parse_listener)

    # Parse a partir da regra inicial 'document'
    tree = parser.document()
    # Junta erros léxicos e sintáticos
    all_errors = lex_listener.errors + parse_listener.errors
    if all_errors:
        print("Erros encontrados:")
        for err in all_errors:
            print(err)
        return "Error"
   
    # Retorna a Árvore (DocumentContext), não o parser
    return tree
    


if __name__ == "__main__":

    if len(sys.argv) < 2:
        print("Uso: python main.py <arquivo_de_entrada>")
        sys.exit(2)
    
    tree = parse_file(sys.argv[1])
    if isinstance(tree, str):
        sys.exit(2)
    
    
    #Analisa semanticamente o texto
    analisador_semantico  = ExprSemanticAnalyser()
    # Passa a árvore já construída (DocumentContext)
    analisador_semantico.analyse(tree)

