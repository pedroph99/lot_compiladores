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
		TYPETEST=10, FRAMEWORKSERVER=11, LANGUAGES=12, TYPES=13, ID=14, WS=15;
	public static final int
		RULE_document = 0, RULE_declaration = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "declaration"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'object'", "'{'", "'type'", "':'", "';'", "'language'", "'framework'", 
			"'}'", "'test'", "'run'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "TYPETEST", 
			"FRAMEWORKSERVER", "LANGUAGES", "TYPES", "ID", "WS"
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
			setState(5); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(4);
				((DocumentContext)_localctx).declaration = declaration();
				((DocumentContext)_localctx).decs.add(((DocumentContext)_localctx).declaration);
				}
				}
				setState(7); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__8 );
			}
			setState(9);
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
		public TerminalNode TYPETEST() { return getToken(ExprParser.TYPETEST, 0); }
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TestDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ObjectDeclarationContext extends DeclarationContext {
		public Token type;
		public Token language;
		public Token server;
		public TerminalNode ID() { return getToken(ExprParser.ID, 0); }
		public TerminalNode TYPES() { return getToken(ExprParser.TYPES, 0); }
		public TerminalNode LANGUAGES() { return getToken(ExprParser.LANGUAGES, 0); }
		public TerminalNode FRAMEWORKSERVER() { return getToken(ExprParser.FRAMEWORKSERVER, 0); }
		public ObjectDeclarationContext(DeclarationContext ctx) { copyFrom(ctx); }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		int _la;
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new ObjectDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(T__0);
				setState(12);
				match(ID);
				setState(13);
				match(T__1);
				setState(14);
				match(T__2);
				setState(15);
				match(T__3);
				setState(16);
				((ObjectDeclarationContext)_localctx).type = match(TYPES);
				setState(17);
				match(T__4);
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(18);
					match(T__5);
					setState(19);
					match(T__3);
					setState(20);
					((ObjectDeclarationContext)_localctx).language = match(LANGUAGES);
					setState(21);
					match(T__4);
					}
				}

				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(24);
					match(T__6);
					setState(25);
					match(T__3);
					setState(26);
					((ObjectDeclarationContext)_localctx).server = match(FRAMEWORKSERVER);
					setState(27);
					match(T__4);
					}
				}

				setState(30);
				match(T__7);
				setState(31);
				match(T__4);
				}
				break;
			case T__8:
				_localctx = new TestDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				match(T__8);
				setState(33);
				match(TYPETEST);
				setState(34);
				match(ID);
				setState(35);
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

	public static final String _serializedATN =
		"\u0004\u0001\u000f\'\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0004\u0000\u0006\b\u0000\u000b\u0000\f\u0000\u0007\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u0017\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001\u001d\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001%\b\u0001\u0001\u0001\u0000\u0000"+
		"\u0002\u0000\u0002\u0000\u0000(\u0000\u0005\u0001\u0000\u0000\u0000\u0002"+
		"$\u0001\u0000\u0000\u0000\u0004\u0006\u0003\u0002\u0001\u0000\u0005\u0004"+
		"\u0001\u0000\u0000\u0000\u0006\u0007\u0001\u0000\u0000\u0000\u0007\u0005"+
		"\u0001\u0000\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b\t\u0001\u0000"+
		"\u0000\u0000\t\n\u0005\u0000\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000"+
		"\u000b\f\u0005\u0001\u0000\u0000\f\r\u0005\u000e\u0000\u0000\r\u000e\u0005"+
		"\u0002\u0000\u0000\u000e\u000f\u0005\u0003\u0000\u0000\u000f\u0010\u0005"+
		"\u0004\u0000\u0000\u0010\u0011\u0005\r\u0000\u0000\u0011\u0016\u0005\u0005"+
		"\u0000\u0000\u0012\u0013\u0005\u0006\u0000\u0000\u0013\u0014\u0005\u0004"+
		"\u0000\u0000\u0014\u0015\u0005\f\u0000\u0000\u0015\u0017\u0005\u0005\u0000"+
		"\u0000\u0016\u0012\u0001\u0000\u0000\u0000\u0016\u0017\u0001\u0000\u0000"+
		"\u0000\u0017\u001c\u0001\u0000\u0000\u0000\u0018\u0019\u0005\u0007\u0000"+
		"\u0000\u0019\u001a\u0005\u0004\u0000\u0000\u001a\u001b\u0005\u000b\u0000"+
		"\u0000\u001b\u001d\u0005\u0005\u0000\u0000\u001c\u0018\u0001\u0000\u0000"+
		"\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\b\u0000\u0000\u001f%\u0005\u0005\u0000\u0000"+
		" !\u0005\t\u0000\u0000!\"\u0005\n\u0000\u0000\"#\u0005\u000e\u0000\u0000"+
		"#%\u0005\u0005\u0000\u0000$\u000b\u0001\u0000\u0000\u0000$ \u0001\u0000"+
		"\u0000\u0000%\u0003\u0001\u0000\u0000\u0000\u0004\u0007\u0016\u001c$";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}