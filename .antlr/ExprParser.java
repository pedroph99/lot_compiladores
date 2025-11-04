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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, TYPETEST=17, 
		FRAMEWORKSERVER=18, LANGUAGES=19, TYPES=20, ID=21, INT=22, PATH=23, WS=24;
	public static final int
		RULE_document = 0, RULE_declaration = 1, RULE_argsSpec = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "declaration", "argsSpec"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'object'", "'{'", "'type'", "':'", "';'", "'language'", "'framework'", 
			"'mainFile'", "'path'", "'}'", "'test'", "'args'", "'='", "'['", "','", 
			"']'", "'run'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "TYPETEST", "FRAMEWORKSERVER", "LANGUAGES", 
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6);
				((DocumentContext)_localctx).declaration = declaration();
				((DocumentContext)_localctx).decs.add(((DocumentContext)_localctx).declaration);
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__10 );
			}
			setState(11);
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
		public Token objectName;
		public Token serverport;
		public Token serverapp;
		public ArgsSpecContext args;
		public TerminalNode TYPETEST() { return getToken(ExprParser.TYPETEST, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public ArgsSpecContext argsSpec() {
			return getRuleContext(ArgsSpecContext.class,0);
		}
		public TestDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterTestDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitTestDeclaration(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterObjectDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitObjectDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new ObjectDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(T__0);
				setState(14);
				((ObjectDeclarationContext)_localctx).objectName = match(ID);
				setState(15);
				match(T__1);
				setState(16);
				match(T__2);
				setState(17);
				match(T__3);
				setState(18);
				((ObjectDeclarationContext)_localctx).type = match(TYPES);
				setState(19);
				match(T__4);
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(20);
					match(T__5);
					setState(21);
					match(T__3);
					setState(22);
					((ObjectDeclarationContext)_localctx).language = match(LANGUAGES);
					setState(23);
					match(T__4);
					}
				}

				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(26);
					match(T__6);
					setState(27);
					match(T__3);
					setState(28);
					((ObjectDeclarationContext)_localctx).server = match(FRAMEWORKSERVER);
					setState(29);
					match(T__4);
					}
				}

				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(32);
					match(T__7);
					setState(33);
					match(T__3);
					setState(34);
					((ObjectDeclarationContext)_localctx).mainFile = match(ID);
					setState(35);
					match(T__4);
					}
				}

				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(38);
					match(T__8);
					setState(39);
					match(T__3);
					setState(40);
					((ObjectDeclarationContext)_localctx).path = match(PATH);
					setState(41);
					match(T__4);
					}
				}

				setState(44);
				match(T__9);
				setState(45);
				match(T__4);
				}
				break;
			case T__10:
				_localctx = new TestDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(T__10);
				setState(47);
				match(TYPETEST);
				setState(48);
				((TestDeclarationContext)_localctx).objectName = match(ID);
				setState(50);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(49);
					((TestDeclarationContext)_localctx).serverport = match(INT);
					}
				}

				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(52);
					((TestDeclarationContext)_localctx).serverapp = match(ID);
					}
				}

				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(55);
					((TestDeclarationContext)_localctx).args = argsSpec();
					}
				}

				setState(58);
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
	public static class ArgsSpecContext extends ParserRuleContext {
		public Token ID;
		public List<Token> args = new ArrayList<Token>();
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public ArgsSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argsSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).enterArgsSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExprListener ) ((ExprListener)listener).exitArgsSpec(this);
		}
	}

	public final ArgsSpecContext argsSpec() throws RecognitionException {
		ArgsSpecContext _localctx = new ArgsSpecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_argsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__11);
			setState(62);
			match(T__12);
			setState(63);
			match(T__13);
			setState(64);
			((ArgsSpecContext)_localctx).ID = match(ID);
			((ArgsSpecContext)_localctx).args.add(((ArgsSpecContext)_localctx).ID);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==ID) {
				{
				setState(68);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
					{
					{
					setState(65);
					match(T__14);
					setState(66);
					((ArgsSpecContext)_localctx).ID = match(ID);
					((ArgsSpecContext)_localctx).args.add(((ArgsSpecContext)_localctx).ID);
					}
					}
					break;
				case ID:
					{
					{
					setState(67);
					((ArgsSpecContext)_localctx).ID = match(ID);
					((ArgsSpecContext)_localctx).args.add(((ArgsSpecContext)_localctx).ID);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(T__15);
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
		"\u0004\u0001\u0018L\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0001\u0000\u0004\u0000\b\b\u0000\u000b\u0000\f\u0000"+
		"\t\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001\u001f\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001+\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00013\b\u0001\u0001\u0001"+
		"\u0003\u00016\b\u0001\u0001\u0001\u0003\u00019\b\u0001\u0001\u0001\u0003"+
		"\u0001<\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002E\b\u0002\n\u0002\f\u0002H\t"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002"+
		"\u0004\u0000\u0000S\u0000\u0007\u0001\u0000\u0000\u0000\u0002;\u0001\u0000"+
		"\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006\b\u0003\u0002\u0001"+
		"\u0000\u0007\u0006\u0001\u0000\u0000\u0000\b\t\u0001\u0000\u0000\u0000"+
		"\t\u0007\u0001\u0000\u0000\u0000\t\n\u0001\u0000\u0000\u0000\n\u000b\u0001"+
		"\u0000\u0000\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001\u0001\u0000"+
		"\u0000\u0000\r\u000e\u0005\u0001\u0000\u0000\u000e\u000f\u0005\u0015\u0000"+
		"\u0000\u000f\u0010\u0005\u0002\u0000\u0000\u0010\u0011\u0005\u0003\u0000"+
		"\u0000\u0011\u0012\u0005\u0004\u0000\u0000\u0012\u0013\u0005\u0014\u0000"+
		"\u0000\u0013\u0018\u0005\u0005\u0000\u0000\u0014\u0015\u0005\u0006\u0000"+
		"\u0000\u0015\u0016\u0005\u0004\u0000\u0000\u0016\u0017\u0005\u0013\u0000"+
		"\u0000\u0017\u0019\u0005\u0005\u0000\u0000\u0018\u0014\u0001\u0000\u0000"+
		"\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001e\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005\u0007\u0000\u0000\u001b\u001c\u0005\u0004\u0000"+
		"\u0000\u001c\u001d\u0005\u0012\u0000\u0000\u001d\u001f\u0005\u0005\u0000"+
		"\u0000\u001e\u001a\u0001\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000"+
		"\u0000\u001f$\u0001\u0000\u0000\u0000 !\u0005\b\u0000\u0000!\"\u0005\u0004"+
		"\u0000\u0000\"#\u0005\u0015\u0000\u0000#%\u0005\u0005\u0000\u0000$ \u0001"+
		"\u0000\u0000\u0000$%\u0001\u0000\u0000\u0000%*\u0001\u0000\u0000\u0000"+
		"&\'\u0005\t\u0000\u0000\'(\u0005\u0004\u0000\u0000()\u0005\u0017\u0000"+
		"\u0000)+\u0005\u0005\u0000\u0000*&\u0001\u0000\u0000\u0000*+\u0001\u0000"+
		"\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0005\n\u0000\u0000-<\u0005\u0005"+
		"\u0000\u0000./\u0005\u000b\u0000\u0000/0\u0005\u0011\u0000\u000002\u0005"+
		"\u0015\u0000\u000013\u0005\u0016\u0000\u000021\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000035\u0001\u0000\u0000\u000046\u0005\u0015\u0000"+
		"\u000054\u0001\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000"+
		"\u0000\u000079\u0003\u0004\u0002\u000087\u0001\u0000\u0000\u000089\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0005\u0005\u0000\u0000"+
		";\r\u0001\u0000\u0000\u0000;.\u0001\u0000\u0000\u0000<\u0003\u0001\u0000"+
		"\u0000\u0000=>\u0005\f\u0000\u0000>?\u0005\r\u0000\u0000?@\u0005\u000e"+
		"\u0000\u0000@F\u0005\u0015\u0000\u0000AB\u0005\u000f\u0000\u0000BE\u0005"+
		"\u0015\u0000\u0000CE\u0005\u0015\u0000\u0000DA\u0001\u0000\u0000\u0000"+
		"DC\u0001\u0000\u0000\u0000EH\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GI\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000IJ\u0005\u0010\u0000\u0000J\u0005\u0001\u0000\u0000\u0000"+
		"\u000b\t\u0018\u001e$*258;DF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}