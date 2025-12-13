# Generated from Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#document.
    def enterDocument(self, ctx:ExprParser.DocumentContext):
        pass

    # Exit a parse tree produced by ExprParser#document.
    def exitDocument(self, ctx:ExprParser.DocumentContext):
        pass


    # Enter a parse tree produced by ExprParser#objectDeclaration.
    def enterObjectDeclaration(self, ctx:ExprParser.ObjectDeclarationContext):
        pass

    # Exit a parse tree produced by ExprParser#objectDeclaration.
    def exitObjectDeclaration(self, ctx:ExprParser.ObjectDeclarationContext):
        pass


    # Enter a parse tree produced by ExprParser#testDeclaration.
    def enterTestDeclaration(self, ctx:ExprParser.TestDeclarationContext):
        pass

    # Exit a parse tree produced by ExprParser#testDeclaration.
    def exitTestDeclaration(self, ctx:ExprParser.TestDeclarationContext):
        pass


    # Enter a parse tree produced by ExprParser#serverPorts.
    def enterServerPorts(self, ctx:ExprParser.ServerPortsContext):
        pass

    # Exit a parse tree produced by ExprParser#serverPorts.
    def exitServerPorts(self, ctx:ExprParser.ServerPortsContext):
        pass


    # Enter a parse tree produced by ExprParser#serverApps.
    def enterServerApps(self, ctx:ExprParser.ServerAppsContext):
        pass

    # Exit a parse tree produced by ExprParser#serverApps.
    def exitServerApps(self, ctx:ExprParser.ServerAppsContext):
        pass


    # Enter a parse tree produced by ExprParser#args.
    def enterArgs(self, ctx:ExprParser.ArgsContext):
        pass

    # Exit a parse tree produced by ExprParser#args.
    def exitArgs(self, ctx:ExprParser.ArgsContext):
        pass


    # Enter a parse tree produced by ExprParser#argsBulk.
    def enterArgsBulk(self, ctx:ExprParser.ArgsBulkContext):
        pass

    # Exit a parse tree produced by ExprParser#argsBulk.
    def exitArgsBulk(self, ctx:ExprParser.ArgsBulkContext):
        pass


    # Enter a parse tree produced by ExprParser#argsSpec.
    def enterArgsSpec(self, ctx:ExprParser.ArgsSpecContext):
        pass

    # Exit a parse tree produced by ExprParser#argsSpec.
    def exitArgsSpec(self, ctx:ExprParser.ArgsSpecContext):
        pass


    # Enter a parse tree produced by ExprParser#argsBulkSpec.
    def enterArgsBulkSpec(self, ctx:ExprParser.ArgsBulkSpecContext):
        pass

    # Exit a parse tree produced by ExprParser#argsBulkSpec.
    def exitArgsBulkSpec(self, ctx:ExprParser.ArgsBulkSpecContext):
        pass


    # Enter a parse tree produced by ExprParser#argsBulkBody.
    def enterArgsBulkBody(self, ctx:ExprParser.ArgsBulkBodyContext):
        pass

    # Exit a parse tree produced by ExprParser#argsBulkBody.
    def exitArgsBulkBody(self, ctx:ExprParser.ArgsBulkBodyContext):
        pass



del ExprParser