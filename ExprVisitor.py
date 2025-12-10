# Generated from Expr.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser

# This class defines a complete generic visitor for a parse tree produced by ExprParser.

class ExprVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by ExprParser#document.
    def visitDocument(self, ctx:ExprParser.DocumentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#objectDeclaration.
    def visitObjectDeclaration(self, ctx:ExprParser.ObjectDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#testDeclaration.
    def visitTestDeclaration(self, ctx:ExprParser.TestDeclarationContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#serverPorts.
    def visitServerPorts(self, ctx:ExprParser.ServerPortsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#serverApps.
    def visitServerApps(self, ctx:ExprParser.ServerAppsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#args.
    def visitArgs(self, ctx:ExprParser.ArgsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#argsBulk.
    def visitArgsBulk(self, ctx:ExprParser.ArgsBulkContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#argsSpec.
    def visitArgsSpec(self, ctx:ExprParser.ArgsSpecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#argsBulkSpec.
    def visitArgsBulkSpec(self, ctx:ExprParser.ArgsBulkSpecContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by ExprParser#argsBulkBody.
    def visitArgsBulkBody(self, ctx:ExprParser.ArgsBulkBodyContext):
        return self.visitChildren(ctx)



del ExprParser