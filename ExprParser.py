# Generated from Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,25,127,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,1,0,4,
        0,14,8,0,11,0,12,0,15,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,3,1,31,8,1,1,1,1,1,1,1,1,1,3,1,37,8,1,1,1,1,1,1,1,1,1,
        3,1,43,8,1,1,1,1,1,1,1,1,1,3,1,49,8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,5,1,59,8,1,10,1,12,1,62,9,1,1,1,5,1,65,8,1,10,1,12,1,68,9,
        1,1,1,3,1,71,8,1,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,
        3,2,85,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,5,3,94,8,3,10,3,12,3,97,9,
        3,1,3,1,3,1,4,1,4,1,4,1,4,1,4,1,4,1,4,5,4,108,8,4,10,4,12,4,111,
        9,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,5,5,120,8,5,10,5,12,5,123,9,5,1,
        5,1,5,1,5,0,0,6,0,2,4,6,8,10,0,1,1,0,22,24,138,0,13,1,0,0,0,2,70,
        1,0,0,0,4,84,1,0,0,0,6,86,1,0,0,0,8,100,1,0,0,0,10,114,1,0,0,0,12,
        14,3,2,1,0,13,12,1,0,0,0,14,15,1,0,0,0,15,13,1,0,0,0,15,16,1,0,0,
        0,16,17,1,0,0,0,17,18,5,0,0,1,18,1,1,0,0,0,19,20,5,1,0,0,20,21,5,
        22,0,0,21,22,5,2,0,0,22,23,5,3,0,0,23,24,5,4,0,0,24,25,5,21,0,0,
        25,30,5,5,0,0,26,27,5,6,0,0,27,28,5,4,0,0,28,29,5,20,0,0,29,31,5,
        5,0,0,30,26,1,0,0,0,30,31,1,0,0,0,31,36,1,0,0,0,32,33,5,7,0,0,33,
        34,5,4,0,0,34,35,5,19,0,0,35,37,5,5,0,0,36,32,1,0,0,0,36,37,1,0,
        0,0,37,42,1,0,0,0,38,39,5,8,0,0,39,40,5,4,0,0,40,41,5,22,0,0,41,
        43,5,5,0,0,42,38,1,0,0,0,42,43,1,0,0,0,43,48,1,0,0,0,44,45,5,9,0,
        0,45,46,5,4,0,0,46,47,5,24,0,0,47,49,5,5,0,0,48,44,1,0,0,0,48,49,
        1,0,0,0,49,50,1,0,0,0,50,51,5,10,0,0,51,71,5,5,0,0,52,53,5,11,0,
        0,53,54,5,18,0,0,54,60,5,22,0,0,55,56,5,12,0,0,56,59,5,22,0,0,57,
        59,5,22,0,0,58,55,1,0,0,0,58,57,1,0,0,0,59,62,1,0,0,0,60,58,1,0,
        0,0,60,61,1,0,0,0,61,66,1,0,0,0,62,60,1,0,0,0,63,65,3,4,2,0,64,63,
        1,0,0,0,65,68,1,0,0,0,66,64,1,0,0,0,66,67,1,0,0,0,67,69,1,0,0,0,
        68,66,1,0,0,0,69,71,5,5,0,0,70,19,1,0,0,0,70,52,1,0,0,0,71,3,1,0,
        0,0,72,73,5,13,0,0,73,74,5,4,0,0,74,75,5,14,0,0,75,76,5,23,0,0,76,
        85,5,15,0,0,77,78,5,16,0,0,78,79,5,4,0,0,79,80,5,14,0,0,80,81,5,
        22,0,0,81,85,5,15,0,0,82,85,3,6,3,0,83,85,3,8,4,0,84,72,1,0,0,0,
        84,77,1,0,0,0,84,82,1,0,0,0,84,83,1,0,0,0,85,5,1,0,0,0,86,87,5,17,
        0,0,87,88,5,4,0,0,88,89,5,14,0,0,89,95,7,0,0,0,90,91,5,12,0,0,91,
        94,7,0,0,0,92,94,7,0,0,0,93,90,1,0,0,0,93,92,1,0,0,0,94,97,1,0,0,
        0,95,93,1,0,0,0,95,96,1,0,0,0,96,98,1,0,0,0,97,95,1,0,0,0,98,99,
        5,15,0,0,99,7,1,0,0,0,100,101,5,17,0,0,101,102,5,4,0,0,102,103,5,
        14,0,0,103,109,3,10,5,0,104,105,5,12,0,0,105,108,3,10,5,0,106,108,
        3,10,5,0,107,104,1,0,0,0,107,106,1,0,0,0,108,111,1,0,0,0,109,107,
        1,0,0,0,109,110,1,0,0,0,110,112,1,0,0,0,111,109,1,0,0,0,112,113,
        5,15,0,0,113,9,1,0,0,0,114,115,5,14,0,0,115,121,7,0,0,0,116,117,
        5,12,0,0,117,120,7,0,0,0,118,120,7,0,0,0,119,116,1,0,0,0,119,118,
        1,0,0,0,120,123,1,0,0,0,121,119,1,0,0,0,121,122,1,0,0,0,122,124,
        1,0,0,0,123,121,1,0,0,0,124,125,5,15,0,0,125,11,1,0,0,0,16,15,30,
        36,42,48,58,60,66,70,84,93,95,107,109,119,121
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'object'", "'{'", "'type'", "':'", "';'", 
                     "'language'", "'framework'", "'mainFile'", "'path'", 
                     "'}'", "'test'", "','", "'serverports'", "'['", "']'", 
                     "'serverApps'", "'args'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "TYPETEST", "FRAMEWORKSERVER", 
                      "LANGUAGES", "TYPES", "ID", "INT", "PATH", "WS" ]

    RULE_document = 0
    RULE_declaration = 1
    RULE_testArguments = 2
    RULE_argsSpec = 3
    RULE_argsBulkSpec = 4
    RULE_argsBulkBody = 5

    ruleNames =  [ "document", "declaration", "testArguments", "argsSpec", 
                   "argsBulkSpec", "argsBulkBody" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    T__16=17
    TYPETEST=18
    FRAMEWORKSERVER=19
    LANGUAGES=20
    TYPES=21
    ID=22
    INT=23
    PATH=24
    WS=25

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class DocumentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._declaration = None # DeclarationContext
            self.decs = list() # of DeclarationContexts

        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def declaration(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.DeclarationContext)
            else:
                return self.getTypedRuleContext(ExprParser.DeclarationContext,i)


        def getRuleIndex(self):
            return ExprParser.RULE_document

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterDocument" ):
                listener.enterDocument(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitDocument" ):
                listener.exitDocument(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitDocument" ):
                return visitor.visitDocument(self)
            else:
                return visitor.visitChildren(self)




    def document(self):

        localctx = ExprParser.DocumentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_document)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 13 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 12
                localctx._declaration = self.declaration()
                localctx.decs.append(localctx._declaration)
                self.state = 15 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==1 or _la==11):
                    break

            self.state = 17
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class DeclarationContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ExprParser.RULE_declaration

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class TestDeclarationContext(DeclarationContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.DeclarationContext
            super().__init__(parser)
            self._ID = None # Token
            self.objectName = list() # of Tokens
            self._testArguments = None # TestArgumentsContext
            self.testargs = list() # of TestArgumentsContexts
            self.copyFrom(ctx)

        def TYPETEST(self):
            return self.getToken(ExprParser.TYPETEST, 0)
        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)
        def testArguments(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.TestArgumentsContext)
            else:
                return self.getTypedRuleContext(ExprParser.TestArgumentsContext,i)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTestDeclaration" ):
                listener.enterTestDeclaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTestDeclaration" ):
                listener.exitTestDeclaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTestDeclaration" ):
                return visitor.visitTestDeclaration(self)
            else:
                return visitor.visitChildren(self)


    class ObjectDeclarationContext(DeclarationContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.DeclarationContext
            super().__init__(parser)
            self.objectName = None # Token
            self.type_ = None # Token
            self.language = None # Token
            self.server = None # Token
            self.mainFile = None # Token
            self.path = None # Token
            self.copyFrom(ctx)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)
        def TYPES(self):
            return self.getToken(ExprParser.TYPES, 0)
        def LANGUAGES(self):
            return self.getToken(ExprParser.LANGUAGES, 0)
        def FRAMEWORKSERVER(self):
            return self.getToken(ExprParser.FRAMEWORKSERVER, 0)
        def PATH(self):
            return self.getToken(ExprParser.PATH, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterObjectDeclaration" ):
                listener.enterObjectDeclaration(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitObjectDeclaration" ):
                listener.exitObjectDeclaration(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitObjectDeclaration" ):
                return visitor.visitObjectDeclaration(self)
            else:
                return visitor.visitChildren(self)



    def declaration(self):

        localctx = ExprParser.DeclarationContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_declaration)
        self._la = 0 # Token type
        try:
            self.state = 70
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1]:
                localctx = ExprParser.ObjectDeclarationContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 19
                self.match(ExprParser.T__0)
                self.state = 20
                localctx.objectName = self.match(ExprParser.ID)
                self.state = 21
                self.match(ExprParser.T__1)
                self.state = 22
                self.match(ExprParser.T__2)
                self.state = 23
                self.match(ExprParser.T__3)
                self.state = 24
                localctx.type_ = self.match(ExprParser.TYPES)
                self.state = 25
                self.match(ExprParser.T__4)
                self.state = 30
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==6:
                    self.state = 26
                    self.match(ExprParser.T__5)
                    self.state = 27
                    self.match(ExprParser.T__3)
                    self.state = 28
                    localctx.language = self.match(ExprParser.LANGUAGES)
                    self.state = 29
                    self.match(ExprParser.T__4)


                self.state = 36
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==7:
                    self.state = 32
                    self.match(ExprParser.T__6)
                    self.state = 33
                    self.match(ExprParser.T__3)
                    self.state = 34
                    localctx.server = self.match(ExprParser.FRAMEWORKSERVER)
                    self.state = 35
                    self.match(ExprParser.T__4)


                self.state = 42
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==8:
                    self.state = 38
                    self.match(ExprParser.T__7)
                    self.state = 39
                    self.match(ExprParser.T__3)
                    self.state = 40
                    localctx.mainFile = self.match(ExprParser.ID)
                    self.state = 41
                    self.match(ExprParser.T__4)


                self.state = 48
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if _la==9:
                    self.state = 44
                    self.match(ExprParser.T__8)
                    self.state = 45
                    self.match(ExprParser.T__3)
                    self.state = 46
                    localctx.path = self.match(ExprParser.PATH)
                    self.state = 47
                    self.match(ExprParser.T__4)


                self.state = 50
                self.match(ExprParser.T__9)
                self.state = 51
                self.match(ExprParser.T__4)
                pass
            elif token in [11]:
                localctx = ExprParser.TestDeclarationContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 52
                self.match(ExprParser.T__10)
                self.state = 53
                self.match(ExprParser.TYPETEST)
                self.state = 54
                localctx._ID = self.match(ExprParser.ID)
                localctx.objectName.append(localctx._ID)

                self.state = 60
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==12 or _la==22:
                    self.state = 58
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [12]:
                        self.state = 55
                        self.match(ExprParser.T__11)
                        self.state = 56
                        localctx._ID = self.match(ExprParser.ID)
                        localctx.objectName.append(localctx._ID)
                        pass
                    elif token in [22]:
                        self.state = 57
                        localctx._ID = self.match(ExprParser.ID)
                        localctx.objectName.append(localctx._ID)
                        pass
                    else:
                        raise NoViableAltException(self)

                    self.state = 62
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 66
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 204800) != 0):
                    self.state = 63
                    localctx._testArguments = self.testArguments()
                    localctx.testargs.append(localctx._testArguments)
                    self.state = 68
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 69
                self.match(ExprParser.T__4)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class TestArgumentsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser


        def getRuleIndex(self):
            return ExprParser.RULE_testArguments

     
        def copyFrom(self, ctx:ParserRuleContext):
            super().copyFrom(ctx)



    class ArgsContext(TestArgumentsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.TestArgumentsContext
            super().__init__(parser)
            self.argsValues = None # ArgsSpecContext
            self.copyFrom(ctx)

        def argsSpec(self):
            return self.getTypedRuleContext(ExprParser.ArgsSpecContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgs" ):
                listener.enterArgs(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgs" ):
                listener.exitArgs(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArgs" ):
                return visitor.visitArgs(self)
            else:
                return visitor.visitChildren(self)


    class ArgsBulkContext(TestArgumentsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.TestArgumentsContext
            super().__init__(parser)
            self.argsValues = None # ArgsBulkSpecContext
            self.copyFrom(ctx)

        def argsBulkSpec(self):
            return self.getTypedRuleContext(ExprParser.ArgsBulkSpecContext,0)


        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgsBulk" ):
                listener.enterArgsBulk(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgsBulk" ):
                listener.exitArgsBulk(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArgsBulk" ):
                return visitor.visitArgsBulk(self)
            else:
                return visitor.visitChildren(self)


    class ServerAppsContext(TestArgumentsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.TestArgumentsContext
            super().__init__(parser)
            self._ID = None # Token
            self.serverapps = list() # of Tokens
            self.copyFrom(ctx)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterServerApps" ):
                listener.enterServerApps(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitServerApps" ):
                listener.exitServerApps(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitServerApps" ):
                return visitor.visitServerApps(self)
            else:
                return visitor.visitChildren(self)


    class ServerPortsContext(TestArgumentsContext):

        def __init__(self, parser, ctx:ParserRuleContext): # actually a ExprParser.TestArgumentsContext
            super().__init__(parser)
            self._INT = None # Token
            self.serverports = list() # of Tokens
            self.copyFrom(ctx)

        def INT(self):
            return self.getToken(ExprParser.INT, 0)

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterServerPorts" ):
                listener.enterServerPorts(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitServerPorts" ):
                listener.exitServerPorts(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitServerPorts" ):
                return visitor.visitServerPorts(self)
            else:
                return visitor.visitChildren(self)



    def testArguments(self):

        localctx = ExprParser.TestArgumentsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_testArguments)
        try:
            self.state = 84
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                localctx = ExprParser.ServerPortsContext(self, localctx)
                self.enterOuterAlt(localctx, 1)
                self.state = 72
                self.match(ExprParser.T__12)
                self.state = 73
                self.match(ExprParser.T__3)
                self.state = 74
                self.match(ExprParser.T__13)
                self.state = 75
                localctx._INT = self.match(ExprParser.INT)
                localctx.serverports.append(localctx._INT)
                self.state = 76
                self.match(ExprParser.T__14)
                pass

            elif la_ == 2:
                localctx = ExprParser.ServerAppsContext(self, localctx)
                self.enterOuterAlt(localctx, 2)
                self.state = 77
                self.match(ExprParser.T__15)
                self.state = 78
                self.match(ExprParser.T__3)
                self.state = 79
                self.match(ExprParser.T__13)
                self.state = 80
                localctx._ID = self.match(ExprParser.ID)
                localctx.serverapps.append(localctx._ID)
                self.state = 81
                self.match(ExprParser.T__14)
                pass

            elif la_ == 3:
                localctx = ExprParser.ArgsContext(self, localctx)
                self.enterOuterAlt(localctx, 3)
                self.state = 82
                localctx.argsValues = self.argsSpec()
                pass

            elif la_ == 4:
                localctx = ExprParser.ArgsBulkContext(self, localctx)
                self.enterOuterAlt(localctx, 4)
                self.state = 83
                localctx.argsValues = self.argsBulkSpec()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgsSpecContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token
            self.args = list() # of Tokens
            self._INT = None # Token
            self._PATH = None # Token
            self._tset213 = None # Token
            self._tset228 = None # Token
            self._tset242 = None # Token

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)

        def INT(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.INT)
            else:
                return self.getToken(ExprParser.INT, i)

        def PATH(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PATH)
            else:
                return self.getToken(ExprParser.PATH, i)

        def getRuleIndex(self):
            return ExprParser.RULE_argsSpec

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgsSpec" ):
                listener.enterArgsSpec(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgsSpec" ):
                listener.exitArgsSpec(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArgsSpec" ):
                return visitor.visitArgsSpec(self)
            else:
                return visitor.visitChildren(self)




    def argsSpec(self):

        localctx = ExprParser.ArgsSpecContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_argsSpec)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 86
            self.match(ExprParser.T__16)
            self.state = 87
            self.match(ExprParser.T__3)
            self.state = 88
            self.match(ExprParser.T__13)
            self.state = 89
            localctx._tset213 = self._input.LT(1)
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 29360128) != 0)):
                localctx._tset213 = self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            localctx.args.append(localctx._tset213)
            self.state = 95
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 29364224) != 0):
                self.state = 93
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [12]:
                    self.state = 90
                    self.match(ExprParser.T__11)
                    self.state = 91
                    localctx._tset228 = self._input.LT(1)
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 29360128) != 0)):
                        localctx._tset228 = self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    localctx.args.append(localctx._tset228)
                    pass
                elif token in [22, 23, 24]:
                    self.state = 92
                    localctx._tset242 = self._input.LT(1)
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 29360128) != 0)):
                        localctx._tset242 = self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    localctx.args.append(localctx._tset242)
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 97
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 98
            self.match(ExprParser.T__14)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgsBulkSpecContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._argsBulkBody = None # ArgsBulkBodyContext
            self.args = list() # of ArgsBulkBodyContexts

        def argsBulkBody(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.ArgsBulkBodyContext)
            else:
                return self.getTypedRuleContext(ExprParser.ArgsBulkBodyContext,i)


        def getRuleIndex(self):
            return ExprParser.RULE_argsBulkSpec

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgsBulkSpec" ):
                listener.enterArgsBulkSpec(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgsBulkSpec" ):
                listener.exitArgsBulkSpec(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArgsBulkSpec" ):
                return visitor.visitArgsBulkSpec(self)
            else:
                return visitor.visitChildren(self)




    def argsBulkSpec(self):

        localctx = ExprParser.ArgsBulkSpecContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_argsBulkSpec)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 100
            self.match(ExprParser.T__16)
            self.state = 101
            self.match(ExprParser.T__3)
            self.state = 102
            self.match(ExprParser.T__13)
            self.state = 103
            localctx._argsBulkBody = self.argsBulkBody()
            localctx.args.append(localctx._argsBulkBody)
            self.state = 109
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==12 or _la==14:
                self.state = 107
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [12]:
                    self.state = 104
                    self.match(ExprParser.T__11)
                    self.state = 105
                    localctx._argsBulkBody = self.argsBulkBody()
                    localctx.args.append(localctx._argsBulkBody)
                    pass
                elif token in [14]:
                    self.state = 106
                    localctx._argsBulkBody = self.argsBulkBody()
                    localctx.args.append(localctx._argsBulkBody)
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 111
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 112
            self.match(ExprParser.T__14)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArgsBulkBodyContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._ID = None # Token
            self.args = list() # of Tokens
            self._INT = None # Token
            self._PATH = None # Token
            self._tset300 = None # Token
            self._tset315 = None # Token
            self._tset329 = None # Token

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)

        def INT(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.INT)
            else:
                return self.getToken(ExprParser.INT, i)

        def PATH(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PATH)
            else:
                return self.getToken(ExprParser.PATH, i)

        def getRuleIndex(self):
            return ExprParser.RULE_argsBulkBody

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArgsBulkBody" ):
                listener.enterArgsBulkBody(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArgsBulkBody" ):
                listener.exitArgsBulkBody(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArgsBulkBody" ):
                return visitor.visitArgsBulkBody(self)
            else:
                return visitor.visitChildren(self)




    def argsBulkBody(self):

        localctx = ExprParser.ArgsBulkBodyContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_argsBulkBody)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 114
            self.match(ExprParser.T__13)
            self.state = 115
            localctx._tset300 = self._input.LT(1)
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 29360128) != 0)):
                localctx._tset300 = self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            localctx.args.append(localctx._tset300)
            self.state = 121
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 29364224) != 0):
                self.state = 119
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [12]:
                    self.state = 116
                    self.match(ExprParser.T__11)
                    self.state = 117
                    localctx._tset315 = self._input.LT(1)
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 29360128) != 0)):
                        localctx._tset315 = self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    localctx.args.append(localctx._tset315)
                    pass
                elif token in [22, 23, 24]:
                    self.state = 118
                    localctx._tset329 = self._input.LT(1)
                    _la = self._input.LA(1)
                    if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 29360128) != 0)):
                        localctx._tset329 = self._errHandler.recoverInline(self)
                    else:
                        self._errHandler.reportMatch(self)
                        self.consume()
                    localctx.args.append(localctx._tset329)
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 123
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 124
            self.match(ExprParser.T__14)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





