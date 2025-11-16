// Generated from c:/Users/pedro/Desktop/testesLinguagem/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		TYPETEST=18, FRAMEWORKSERVER=19, LANGUAGES=20, TYPES=21, ID=22, INT=23, 
		PATH=24, WS=25;
	public static final int
		RULE_document = 0, RULE_declaration = 1, RULE_testArguments = 2, RULE_argsSpec = 3, 
		RULE_argsBulkSpec = 4, RULE_argsBulkBody = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "declaration", "testArguments", "argsSpec", "argsBulkSpec", 
			"argsBulkBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'object'", "'{'", "'type'", "':'", "';'", "'language'", "'framework'", 
			"'mainFile'", "'path'", "'}'", "'test'", "','", "'serveports'", "'['", 
			"']'", "'serverApps'", "'args'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "TYPETEST", "FRAMEWORKSERVER", "LANGUAGES", 
			"TYPES", "ID", "INT", "PATH", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DocumentContext extends ParserRuleContext {
		public DeclarationContext declaration;
		public List<DeclarationContext> decs = new ArrayList<DeclarationContext>();
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				((DocumentContext)_localctx).declaration = declaration();
				((DocumentContext)_localctx).decs.add(((DocumentContext)_localctx).declaration);
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__10 );
			}
			setState(17);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TestDeclarationContext extends DeclarationContext {
		public Token ID;
		public List<Token> objectName = new ArrayList<Token>();
		public TestArgumentsContext testArguments;
		public List<TestArgumentsContext> testargs = new ArrayList<TestArgumentsContext>();
		public TerminalNode TYPETEST() { return getToken(ExprParser.TYPETEST, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TestArgumentsContext> testArguments() {
			return getRuleContexts(TestArgumentsContext.class);
		}
		public TestArgumentsContext testArguments(int i) {
			return getRuleContext(TestArgumentsContext.class,i);
		}
		public TestDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclarationContext extends DeclarationContext {
		public Token objectName;
		public Token type;
		public Token language;
		public Token server;
		public Token mainFile;
		public Token path;
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode TYPES() { return getToken(ExprParser.TYPES, 0); }
		public TerminalNode LANGUAGES() { return getToken(ExprParser.LANGUAGES, 0); }
		public TerminalNode FRAMEWORKSERVER() { return getToken(ExprParser.FRAMEWORKSERVER, 0); }
		public TerminalNode PATH() { return getToken(ExprParser.PATH, 0); }
		public ObjectDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new ObjectDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__0);
				setState(20);
				((ObjectDeclarationContext)_localctx).objectName = match(ID);
				setState(21);
				match(T__1);
				setState(22);
				match(T__2);
				setState(23);
				match(T__3);
				setState(24);
				((ObjectDeclarationContext)_localctx).type = match(TYPES);
				setState(25);
				match(T__4);
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(26);
					match(T__5);
					setState(27);
					match(T__3);
					setState(28);
					((ObjectDeclarationContext)_localctx).language = match(LANGUAGES);
					setState(29);
					match(T__4);
					}
				}

				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(32);
					match(T__6);
					setState(33);
					match(T__3);
					setState(34);
					((ObjectDeclarationContext)_localctx).server = match(FRAMEWORKSERVER);
					setState(35);
					match(T__4);
					}
				}

				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(38);
					match(T__7);
					setState(39);
					match(T__3);
					setState(40);
					((ObjectDeclarationContext)_localctx).mainFile = match(ID);
					setState(41);
					match(T__4);
					}
				}

				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(44);
					match(T__8);
					setState(45);
					match(T__3);
					setState(46);
					((ObjectDeclarationContext)_localctx).path = match(PATH);
					setState(47);
					match(T__4);
					}
				}

				setState(50);
				match(T__9);
				setState(51);
				match(T__4);
				}
				break;
			case T__10:
				_localctx = new TestDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				match(T__10);
				setState(53);
				match(TYPETEST);
				setState(54);
				((TestDeclarationContext)_localctx).ID = match(ID);
				((TestDeclarationContext)_localctx).objectName.add(((TestDeclarationContext)_localctx).ID);
				{
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__11 || _la==ID) {
					{
					setState(58);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__11:
						{
						{
						setState(55);
						match(T__11);
						setState(56);
						((TestDeclarationContext)_localctx).ID = match(ID);
						((TestDeclarationContext)_localctx).objectName.add(((TestDeclarationContext)_localctx).ID);
						}
						}
						break;
					case ID:
						{
						{
						setState(57);
						((TestDeclarationContext)_localctx).ID = match(ID);
						((TestDeclarationContext)_localctx).objectName.add(((TestDeclarationContext)_localctx).ID);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 204800L) != 0)) {
					{
					{
					setState(63);
					((TestDeclarationContext)_localctx).testArguments = testArguments();
					((TestDeclarationContext)_localctx).testargs.add(((TestDeclarationContext)_localctx).testArguments);
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				match(T__4);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TestArgumentsContext extends ParserRuleContext {
		public TestArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_testArguments; }
	 
		public TestArgumentsContext() { }
		public void copyFrom(TestArgumentsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends TestArgumentsContext {
		public ArgsSpecContext argsValues;
		public ArgsSpecContext argsSpec() {
			return getRuleContext(ArgsSpecContext.class,0);
		}
		public ArgsContext(TestArgumentsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArgsBulkContext extends TestArgumentsContext {
		public ArgsBulkSpecContext argsValues;
		public ArgsBulkSpecContext argsBulkSpec() {
			return getRuleContext(ArgsBulkSpecContext.class,0);
		}
		public ArgsBulkContext(TestArgumentsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ServerAppsContext extends TestArgumentsContext {
		public Token ID;
		public List<Token> serverapps = new ArrayList<Token>();
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public ServerAppsContext(TestArgumentsContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ServerPortsContext extends TestArgumentsContext {
		public Token INT;
		public List<Token> serverports = new ArrayList<Token>();
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public ServerPortsContext(TestArgumentsContext ctx) { copyFrom(ctx); }
	}

	public final TestArgumentsContext testArguments() throws RecognitionException {
		TestArgumentsContext _localctx = new TestArgumentsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_testArguments);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ServerPortsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				match(T__12);
				setState(73);
				match(T__3);
				setState(74);
				match(T__13);
				setState(75);
				((ServerPortsContext)_localctx).INT = match(INT);
				((ServerPortsContext)_localctx).serverports.add(((ServerPortsContext)_localctx).INT);
				setState(76);
				match(T__14);
				}
				break;
			case 2:
				_localctx = new ServerAppsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__15);
				setState(78);
				match(T__3);
				setState(79);
				match(T__13);
				setState(80);
				((ServerAppsContext)_localctx).ID = match(ID);
				((ServerAppsContext)_localctx).serverapps.add(((ServerAppsContext)_localctx).ID);
				setState(81);
				match(T__14);
				}
				break;
			case 3:
				_localctx = new ArgsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				((ArgsContext)_localctx).argsValues = argsSpec();
				}
				break;
			case 4:
				_localctx = new ArgsBulkContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				((ArgsBulkContext)_localctx).argsValues = argsBulkSpec();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsSpecContext extends ParserRuleContext {
		public Token ID;
		public List<Token> args = new ArrayList<Token>();
		public Token INT;
		public Token _tset215;
		public Token _tset228;
		public Token _tset240;
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExprParser.INT, i);
		}
		public ArgsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsSpec; }
	}

	public final ArgsSpecContext argsSpec() throws RecognitionException {
		ArgsSpecContext _localctx = new ArgsSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(T__16);
			setState(87);
			match(T__3);
			setState(88);
			match(T__13);
			setState(89);
			((ArgsSpecContext)_localctx)._tset215 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
				((ArgsSpecContext)_localctx)._tset215 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			((ArgsSpecContext)_localctx).args.add(((ArgsSpecContext)_localctx)._tset215);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12587008L) != 0)) {
				{
				setState(93);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					{
					setState(90);
					match(T__11);
					setState(91);
					((ArgsSpecContext)_localctx)._tset228 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
						((ArgsSpecContext)_localctx)._tset228 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ArgsSpecContext)_localctx).args.add(((ArgsSpecContext)_localctx)._tset228);
					}
					}
					break;
				case ID:
				case INT:
					{
					{
					setState(92);
					((ArgsSpecContext)_localctx)._tset240 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
						((ArgsSpecContext)_localctx)._tset240 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ArgsSpecContext)_localctx).args.add(((ArgsSpecContext)_localctx)._tset240);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsBulkSpecContext extends ParserRuleContext {
		public ArgsBulkBodyContext argsBulkBody;
		public List<ArgsBulkBodyContext> args = new ArrayList<ArgsBulkBodyContext>();
		public List<ArgsBulkBodyContext> argsBulkBody() {
			return getRuleContexts(ArgsBulkBodyContext.class);
		}
		public ArgsBulkBodyContext argsBulkBody(int i) {
			return getRuleContext(ArgsBulkBodyContext.class,i);
		}
		public ArgsBulkSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsBulkSpec; }
	}

	public final ArgsBulkSpecContext argsBulkSpec() throws RecognitionException {
		ArgsBulkSpecContext _localctx = new ArgsBulkSpecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argsBulkSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__16);
			setState(101);
			match(T__3);
			setState(102);
			match(T__13);
			setState(103);
			((ArgsBulkSpecContext)_localctx).argsBulkBody = argsBulkBody();
			((ArgsBulkSpecContext)_localctx).args.add(((ArgsBulkSpecContext)_localctx).argsBulkBody);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__13) {
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					{
					setState(104);
					match(T__11);
					setState(105);
					((ArgsBulkSpecContext)_localctx).argsBulkBody = argsBulkBody();
					((ArgsBulkSpecContext)_localctx).args.add(((ArgsBulkSpecContext)_localctx).argsBulkBody);
					}
					}
					break;
				case T__13:
					{
					{
					setState(106);
					((ArgsBulkSpecContext)_localctx).argsBulkBody = argsBulkBody();
					((ArgsBulkSpecContext)_localctx).args.add(((ArgsBulkSpecContext)_localctx).argsBulkBody);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsBulkBodyContext extends ParserRuleContext {
		public Token ID;
		public List<Token> args = new ArrayList<Token>();
		public Token INT;
		public Token _tset296;
		public Token _tset309;
		public Token _tset321;
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExprParser.INT, i);
		}
		public ArgsBulkBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsBulkBody; }
	}

	public final ArgsBulkBodyContext argsBulkBody() throws RecognitionException {
		ArgsBulkBodyContext _localctx = new ArgsBulkBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_argsBulkBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__13);
			setState(115);
			((ArgsBulkBodyContext)_localctx)._tset296 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
				((ArgsBulkBodyContext)_localctx)._tset296 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			((ArgsBulkBodyContext)_localctx).args.add(((ArgsBulkBodyContext)_localctx)._tset296);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 12587008L) != 0)) {
				{
				setState(119);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					{
					setState(116);
					match(T__11);
					setState(117);
					((ArgsBulkBodyContext)_localctx)._tset309 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
						((ArgsBulkBodyContext)_localctx)._tset309 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ArgsBulkBodyContext)_localctx).args.add(((ArgsBulkBodyContext)_localctx)._tset309);
					}
					}
					break;
				case ID:
				case INT:
					{
					{
					setState(118);
					((ArgsBulkBodyContext)_localctx)._tset321 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
						((ArgsBulkBodyContext)_localctx)._tset321 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ArgsBulkBodyContext)_localctx).args.add(((ArgsBulkBodyContext)_localctx)._tset321);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(T__14);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u007f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0001\u0000\u0004\u0000\u000e\b\u0000\u000b\u0000"+
		"\f\u0000\u000f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u00011\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001;\b\u0001\n\u0001\f\u0001>\t\u0001\u0001\u0001\u0005\u0001"+
		"A\b\u0001\n\u0001\f\u0001D\t\u0001\u0001\u0001\u0003\u0001G\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002U\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0005\u0003^\b\u0003\n\u0003\f\u0003a\t"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004l\b\u0004\n\u0004"+
		"\f\u0004o\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005x\b\u0005\n\u0005\f\u0005{\t"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0000\u0000\u0006\u0000\u0002"+
		"\u0004\u0006\b\n\u0000\u0001\u0001\u0000\u0016\u0017\u008a\u0000\r\u0001"+
		"\u0000\u0000\u0000\u0002F\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000"+
		"\u0000\u0006V\u0001\u0000\u0000\u0000\bd\u0001\u0000\u0000\u0000\nr\u0001"+
		"\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001\u0000\u0000"+
		"\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000\u0000\u0000"+
		"\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0005\u0001\u0000\u0000\u0014\u0015\u0005\u0016\u0000\u0000"+
		"\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0017\u0005\u0003\u0000\u0000"+
		"\u0017\u0018\u0005\u0004\u0000\u0000\u0018\u0019\u0005\u0015\u0000\u0000"+
		"\u0019\u001e\u0005\u0005\u0000\u0000\u001a\u001b\u0005\u0006\u0000\u0000"+
		"\u001b\u001c\u0005\u0004\u0000\u0000\u001c\u001d\u0005\u0014\u0000\u0000"+
		"\u001d\u001f\u0005\u0005\u0000\u0000\u001e\u001a\u0001\u0000\u0000\u0000"+
		"\u001e\u001f\u0001\u0000\u0000\u0000\u001f$\u0001\u0000\u0000\u0000 !"+
		"\u0005\u0007\u0000\u0000!\"\u0005\u0004\u0000\u0000\"#\u0005\u0013\u0000"+
		"\u0000#%\u0005\u0005\u0000\u0000$ \u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%*\u0001\u0000\u0000\u0000&\'\u0005\b\u0000\u0000\'(\u0005"+
		"\u0004\u0000\u0000()\u0005\u0016\u0000\u0000)+\u0005\u0005\u0000\u0000"+
		"*&\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+0\u0001\u0000\u0000"+
		"\u0000,-\u0005\t\u0000\u0000-.\u0005\u0004\u0000\u0000./\u0005\u0018\u0000"+
		"\u0000/1\u0005\u0005\u0000\u00000,\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000023\u0005\n\u0000\u00003G\u0005\u0005"+
		"\u0000\u000045\u0005\u000b\u0000\u000056\u0005\u0012\u0000\u00006<\u0005"+
		"\u0016\u0000\u000078\u0005\f\u0000\u00008;\u0005\u0016\u0000\u00009;\u0005"+
		"\u0016\u0000\u0000:7\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000\u0000"+
		";>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000"+
		"\u0000=B\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?A\u0003\u0004"+
		"\u0002\u0000@?\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000EG\u0005\u0005\u0000\u0000F\u0013\u0001\u0000"+
		"\u0000\u0000F4\u0001\u0000\u0000\u0000G\u0003\u0001\u0000\u0000\u0000"+
		"HI\u0005\r\u0000\u0000IJ\u0005\u0004\u0000\u0000JK\u0005\u000e\u0000\u0000"+
		"KL\u0005\u0017\u0000\u0000LU\u0005\u000f\u0000\u0000MN\u0005\u0010\u0000"+
		"\u0000NO\u0005\u0004\u0000\u0000OP\u0005\u000e\u0000\u0000PQ\u0005\u0016"+
		"\u0000\u0000QU\u0005\u000f\u0000\u0000RU\u0003\u0006\u0003\u0000SU\u0003"+
		"\b\u0004\u0000TH\u0001\u0000\u0000\u0000TM\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TS\u0001\u0000\u0000\u0000U\u0005\u0001\u0000\u0000"+
		"\u0000VW\u0005\u0011\u0000\u0000WX\u0005\u0004\u0000\u0000XY\u0005\u000e"+
		"\u0000\u0000Y_\u0007\u0000\u0000\u0000Z[\u0005\f\u0000\u0000[^\u0007\u0000"+
		"\u0000\u0000\\^\u0007\u0000\u0000\u0000]Z\u0001\u0000\u0000\u0000]\\\u0001"+
		"\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000bc\u0005\u000f\u0000\u0000c\u0007\u0001\u0000\u0000\u0000de\u0005"+
		"\u0011\u0000\u0000ef\u0005\u0004\u0000\u0000fg\u0005\u000e\u0000\u0000"+
		"gm\u0003\n\u0005\u0000hi\u0005\f\u0000\u0000il\u0003\n\u0005\u0000jl\u0003"+
		"\n\u0005\u0000kh\u0001\u0000\u0000\u0000kj\u0001\u0000\u0000\u0000lo\u0001"+
		"\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000pq\u0005\u000f\u0000"+
		"\u0000q\t\u0001\u0000\u0000\u0000rs\u0005\u000e\u0000\u0000sy\u0007\u0000"+
		"\u0000\u0000tu\u0005\f\u0000\u0000ux\u0007\u0000\u0000\u0000vx\u0007\u0000"+
		"\u0000\u0000wt\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000\u0000x{\u0001"+
		"\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000"+
		"z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|}\u0005\u000f\u0000"+
		"\u0000}\u000b\u0001\u0000\u0000\u0000\u0010\u000f\u001e$*0:<BFT]_kmwy";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}