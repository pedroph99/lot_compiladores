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
		RULE_document = 0, RULE_declaration = 1, RULE_argsSpec = 2, RULE_argsBulkSpec = 3, 
		RULE_argsBulkBody = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"document", "declaration", "argsSpec", "argsBulkSpec", "argsBulkBody"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'object'", "'{'", "'type'", "':'", "';'", "'language'", "'framework'", 
			"'mainFile'", "'path'", "'}'", "'test'", "','", "'args'", "'='", "'['", 
			"']'"
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
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(10);
				((DocumentContext)_localctx).declaration = declaration();
				((DocumentContext)_localctx).decs.add(((DocumentContext)_localctx).declaration);
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__0 || _la==T__10 );
			}
			setState(15);
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
		public Token serverport;
		public Token serverapp;
		public ArgsSpecContext args;
		public ArgsBulkSpecContext argBulk;
		public TerminalNode TYPETEST() { return getToken(ExprParser.TYPETEST, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public TerminalNode INT() { return getToken(ExprParser.INT, 0); }
		public ArgsSpecContext argsSpec() {
			return getRuleContext(ArgsSpecContext.class,0);
		}
		public ArgsBulkSpecContext argsBulkSpec() {
			return getRuleContext(ArgsBulkSpecContext.class,0);
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
			int _alt;
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new ObjectDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				match(T__0);
				setState(18);
				((ObjectDeclarationContext)_localctx).objectName = match(ID);
				setState(19);
				match(T__1);
				setState(20);
				match(T__2);
				setState(21);
				match(T__3);
				setState(22);
				((ObjectDeclarationContext)_localctx).type = match(TYPES);
				setState(23);
				match(T__4);
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(24);
					match(T__5);
					setState(25);
					match(T__3);
					setState(26);
					((ObjectDeclarationContext)_localctx).language = match(LANGUAGES);
					setState(27);
					match(T__4);
					}
				}

				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(30);
					match(T__6);
					setState(31);
					match(T__3);
					setState(32);
					((ObjectDeclarationContext)_localctx).server = match(FRAMEWORKSERVER);
					setState(33);
					match(T__4);
					}
				}

				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(36);
					match(T__7);
					setState(37);
					match(T__3);
					setState(38);
					((ObjectDeclarationContext)_localctx).mainFile = match(ID);
					setState(39);
					match(T__4);
					}
				}

				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(42);
					match(T__8);
					setState(43);
					match(T__3);
					setState(44);
					((ObjectDeclarationContext)_localctx).path = match(PATH);
					setState(45);
					match(T__4);
					}
				}

				setState(48);
				match(T__9);
				setState(49);
				match(T__4);
				}
				break;
			case T__10:
				_localctx = new TestDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				match(T__10);
				setState(51);
				match(TYPETEST);
				setState(52);
				((TestDeclarationContext)_localctx).ID = match(ID);
				((TestDeclarationContext)_localctx).objectName.add(((TestDeclarationContext)_localctx).ID);
				{
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(56);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case T__11:
							{
							{
							setState(53);
							match(T__11);
							setState(54);
							((TestDeclarationContext)_localctx).ID = match(ID);
							((TestDeclarationContext)_localctx).objectName.add(((TestDeclarationContext)_localctx).ID);
							}
							}
							break;
						case ID:
							{
							{
							setState(55);
							((TestDeclarationContext)_localctx).ID = match(ID);
							((TestDeclarationContext)_localctx).objectName.add(((TestDeclarationContext)_localctx).ID);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(60);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INT) {
					{
					setState(61);
					((TestDeclarationContext)_localctx).serverport = match(INT);
					}
				}

				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(64);
					((TestDeclarationContext)_localctx).serverapp = match(ID);
					}
				}

				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(67);
					((TestDeclarationContext)_localctx).args = argsSpec();
					}
					break;
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(70);
					((TestDeclarationContext)_localctx).argBulk = argsBulkSpec();
					}
				}

				setState(73);
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
		public Token INT;
		public Token _tset178;
		public Token _tset191;
		public Token _tset203;
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
		enterRule(_localctx, 4, RULE_argsSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__12);
			setState(77);
			match(T__13);
			setState(78);
			match(T__14);
			setState(79);
			((ArgsSpecContext)_localctx)._tset178 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
				((ArgsSpecContext)_localctx)._tset178 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			((ArgsSpecContext)_localctx).args.add(((ArgsSpecContext)_localctx)._tset178);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6295552L) != 0)) {
				{
				setState(83);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					{
					setState(80);
					match(T__11);
					setState(81);
					((ArgsSpecContext)_localctx)._tset191 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
						((ArgsSpecContext)_localctx)._tset191 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ArgsSpecContext)_localctx).args.add(((ArgsSpecContext)_localctx)._tset191);
					}
					}
					break;
				case ID:
				case INT:
					{
					{
					setState(82);
					((ArgsSpecContext)_localctx)._tset203 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
						((ArgsSpecContext)_localctx)._tset203 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ArgsSpecContext)_localctx).args.add(((ArgsSpecContext)_localctx)._tset203);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(88);
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
		enterRule(_localctx, 6, RULE_argsBulkSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(T__12);
			setState(91);
			match(T__13);
			setState(92);
			match(T__14);
			setState(93);
			((ArgsBulkSpecContext)_localctx).argsBulkBody = argsBulkBody();
			((ArgsBulkSpecContext)_localctx).args.add(((ArgsBulkSpecContext)_localctx).argsBulkBody);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11 || _la==T__14) {
				{
				setState(97);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					{
					setState(94);
					match(T__11);
					setState(95);
					((ArgsBulkSpecContext)_localctx).argsBulkBody = argsBulkBody();
					((ArgsBulkSpecContext)_localctx).args.add(((ArgsBulkSpecContext)_localctx).argsBulkBody);
					}
					}
					break;
				case T__14:
					{
					{
					setState(96);
					((ArgsBulkSpecContext)_localctx).argsBulkBody = argsBulkBody();
					((ArgsBulkSpecContext)_localctx).args.add(((ArgsBulkSpecContext)_localctx).argsBulkBody);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsBulkBodyContext extends ParserRuleContext {
		public Token ID;
		public List<Token> args = new ArrayList<Token>();
		public Token INT;
		public Token _tset259;
		public Token _tset272;
		public Token _tset284;
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
		enterRule(_localctx, 8, RULE_argsBulkBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(T__14);
			setState(105);
			((ArgsBulkBodyContext)_localctx)._tset259 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==INT) ) {
				((ArgsBulkBodyContext)_localctx)._tset259 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			((ArgsBulkBodyContext)_localctx).args.add(((ArgsBulkBodyContext)_localctx)._tset259);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6295552L) != 0)) {
				{
				setState(109);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__11:
					{
					{
					setState(106);
					match(T__11);
					setState(107);
					((ArgsBulkBodyContext)_localctx)._tset272 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
						((ArgsBulkBodyContext)_localctx)._tset272 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ArgsBulkBodyContext)_localctx).args.add(((ArgsBulkBodyContext)_localctx)._tset272);
					}
					}
					break;
				case ID:
				case INT:
					{
					{
					setState(108);
					((ArgsBulkBodyContext)_localctx)._tset284 = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==INT) ) {
						((ArgsBulkBodyContext)_localctx)._tset284 = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					((ArgsBulkBodyContext)_localctx).args.add(((ArgsBulkBodyContext)_localctx)._tset284);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(114);
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
		"\u0004\u0001\u0018u\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0004\u0000\f\b\u0000\u000b\u0000\f\u0000\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"\u001d\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"#\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		")\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"/\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00019\b\u0001\n\u0001\f\u0001"+
		"<\t\u0001\u0001\u0001\u0003\u0001?\b\u0001\u0001\u0001\u0003\u0001B\b"+
		"\u0001\u0001\u0001\u0003\u0001E\b\u0001\u0001\u0001\u0003\u0001H\b\u0001"+
		"\u0001\u0001\u0003\u0001K\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002T\b\u0002"+
		"\n\u0002\f\u0002W\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"b\b\u0003\n\u0003\f\u0003e\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004n\b\u0004"+
		"\n\u0004\f\u0004q\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0000\u0000"+
		"\u0005\u0000\u0002\u0004\u0006\b\u0000\u0001\u0001\u0000\u0015\u0016\u0081"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004"+
		"L\u0001\u0000\u0000\u0000\u0006Z\u0001\u0000\u0000\u0000\bh\u0001\u0000"+
		"\u0000\u0000\n\f\u0003\u0002\u0001\u0000\u000b\n\u0001\u0000\u0000\u0000"+
		"\f\r\u0001\u0000\u0000\u0000\r\u000b\u0001\u0000\u0000\u0000\r\u000e\u0001"+
		"\u0000\u0000\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0010\u0005"+
		"\u0000\u0000\u0001\u0010\u0001\u0001\u0000\u0000\u0000\u0011\u0012\u0005"+
		"\u0001\u0000\u0000\u0012\u0013\u0005\u0015\u0000\u0000\u0013\u0014\u0005"+
		"\u0002\u0000\u0000\u0014\u0015\u0005\u0003\u0000\u0000\u0015\u0016\u0005"+
		"\u0004\u0000\u0000\u0016\u0017\u0005\u0014\u0000\u0000\u0017\u001c\u0005"+
		"\u0005\u0000\u0000\u0018\u0019\u0005\u0006\u0000\u0000\u0019\u001a\u0005"+
		"\u0004\u0000\u0000\u001a\u001b\u0005\u0013\u0000\u0000\u001b\u001d\u0005"+
		"\u0005\u0000\u0000\u001c\u0018\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\"\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0007"+
		"\u0000\u0000\u001f \u0005\u0004\u0000\u0000 !\u0005\u0012\u0000\u0000"+
		"!#\u0005\u0005\u0000\u0000\"\u001e\u0001\u0000\u0000\u0000\"#\u0001\u0000"+
		"\u0000\u0000#(\u0001\u0000\u0000\u0000$%\u0005\b\u0000\u0000%&\u0005\u0004"+
		"\u0000\u0000&\'\u0005\u0015\u0000\u0000\')\u0005\u0005\u0000\u0000($\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000).\u0001\u0000\u0000\u0000"+
		"*+\u0005\t\u0000\u0000+,\u0005\u0004\u0000\u0000,-\u0005\u0017\u0000\u0000"+
		"-/\u0005\u0005\u0000\u0000.*\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000001\u0005\n\u0000\u00001K\u0005\u0005\u0000"+
		"\u000023\u0005\u000b\u0000\u000034\u0005\u0011\u0000\u00004:\u0005\u0015"+
		"\u0000\u000056\u0005\f\u0000\u000069\u0005\u0015\u0000\u000079\u0005\u0015"+
		"\u0000\u000085\u0001\u0000\u0000\u000087\u0001\u0000\u0000\u00009<\u0001"+
		"\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000"+
		";>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=?\u0005\u0016\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000"+
		"\u0000\u0000@B\u0005\u0015\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000CE\u0003\u0004\u0002\u0000"+
		"DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000\u0000"+
		"\u0000FH\u0003\u0006\u0003\u0000GF\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0005\u0005\u0000\u0000J\u0011"+
		"\u0001\u0000\u0000\u0000J2\u0001\u0000\u0000\u0000K\u0003\u0001\u0000"+
		"\u0000\u0000LM\u0005\r\u0000\u0000MN\u0005\u000e\u0000\u0000NO\u0005\u000f"+
		"\u0000\u0000OU\u0007\u0000\u0000\u0000PQ\u0005\f\u0000\u0000QT\u0007\u0000"+
		"\u0000\u0000RT\u0007\u0000\u0000\u0000SP\u0001\u0000\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VX\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000XY\u0005\u0010\u0000\u0000Y\u0005\u0001\u0000\u0000\u0000Z[\u0005"+
		"\r\u0000\u0000[\\\u0005\u000e\u0000\u0000\\]\u0005\u000f\u0000\u0000]"+
		"c\u0003\b\u0004\u0000^_\u0005\f\u0000\u0000_b\u0003\b\u0004\u0000`b\u0003"+
		"\b\u0004\u0000a^\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000be\u0001"+
		"\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000"+
		"df\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000fg\u0005\u0010\u0000"+
		"\u0000g\u0007\u0001\u0000\u0000\u0000hi\u0005\u000f\u0000\u0000io\u0007"+
		"\u0000\u0000\u0000jk\u0005\f\u0000\u0000kn\u0007\u0000\u0000\u0000ln\u0007"+
		"\u0000\u0000\u0000mj\u0001\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000"+
		"\u0000pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000rs\u0005\u0010"+
		"\u0000\u0000s\t\u0001\u0000\u0000\u0000\u0012\r\u001c\"(.8:>ADGJSUacm"+
		"o";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}