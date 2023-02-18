// Generated from c:\MiniPascal\MiniPascalCompiler\MiniPascal\src\main\java\com\minipascalcompiler\minipascal\miniPascal.g4 by ANTLR 4.9.2

    package com.minipascalcompiler.minipascal;
    import com.minipascalcompiler.minipascal.tablaSimbolos;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, IF=4, THEN=5, ELSE=6, WHILE=7, DO=8, BEGIN=9, 
		END=10, REPEAT=11, UNTIL=12, FOR=13, TO=14, VAR=15, PROGRAM=16, ASSIGN=17, 
		BOOL=18, OPREL=19, AND=20, OR=21, READ=22, WRITE=23, MULS=24, SUMS=25, 
		ID=26, NUM=27, CHAR=28, CONSTSTR=29, MULTICOMMENT=30, SINGLECOMMENT=31, 
		SPACE=32, SEMICOLON=33, COLON=34, COMMA=35, DOT=36, LPAREN=37, RPAREN=38;
	public static final int
		RULE_type = 0, RULE_assign = 1, RULE_prog = 2, RULE_header = 3, RULE_sentence = 4, 
		RULE_sentence_t = 5, RULE_sentenceUnica = 6, RULE_read = 7, RULE_write = 8, 
		RULE_op = 9, RULE_op_t = 10, RULE_op_f = 11, RULE_exp = 12, RULE_exp_t = 13, 
		RULE_exp_f = 14, RULE_bwhile = 15, RULE_bif = 16, RULE_bbif = 17, RULE_belse = 18, 
		RULE_repeat = 19, RULE_bfor = 20, RULE_var = 21, RULE_vars = 22, RULE_bid = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"type", "assign", "prog", "header", "sentence", "sentence_t", "sentenceUnica", 
			"read", "write", "op", "op_t", "op_f", "exp", "exp_t", "exp_f", "bwhile", 
			"bif", "bbif", "belse", "repeat", "bfor", "var", "vars", "bid"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'integer'", "'char'", "'boolean'", "'if'", "'then'", "'else'", 
			"'while'", "'do'", "'begin'", "'end'", "'repeat'", "'until'", "'for'", 
			"'to'", "'var'", "'program'", "':='", null, null, "'and'", "'or'", "'read'", 
			"'write'", null, null, null, null, null, null, null, null, null, "';'", 
			"':'", "','", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "IF", "THEN", "ELSE", "WHILE", "DO", "BEGIN", 
			"END", "REPEAT", "UNTIL", "FOR", "TO", "VAR", "PROGRAM", "ASSIGN", "BOOL", 
			"OPREL", "AND", "OR", "READ", "WRITE", "MULS", "SUMS", "ID", "NUM", "CHAR", 
			"CONSTSTR", "MULTICOMMENT", "SINGLECOMMENT", "SPACE", "SEMICOLON", "COLON", 
			"COMMA", "DOT", "LPAREN", "RPAREN"
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
	public String getGrammarFileName() { return "miniPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IntegertypeContext extends TypeContext {
		public IntegertypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class BooleantypeContext extends TypeContext {
		public BooleantypeContext(TypeContext ctx) { copyFrom(ctx); }
	}
	public static class ChartypeContext extends TypeContext {
		public ChartypeContext(TypeContext ctx) { copyFrom(ctx); }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new IntegertypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				match(T__0);
				}
				break;
			case T__1:
				_localctx = new ChartypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				match(T__1);
				}
				break;
			case T__2:
				_localctx = new BooleantypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				match(T__2);
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

	public static class AssignContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miniPascalParser.ASSIGN, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(ID);
			setState(54);
			match(ASSIGN);
			setState(55);
			op(0);
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

	public static class ProgContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TerminalNode EOF() { return getToken(miniPascalParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			header();
			setState(58);
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(miniPascalParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(miniPascalParser.SEMICOLON, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(miniPascalParser.BEGIN, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode END() { return getToken(miniPascalParser.END, 0); }
		public TerminalNode DOT() { return getToken(miniPascalParser.DOT, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(PROGRAM);
			setState(61);
			match(ID);
			setState(62);
			match(SEMICOLON);
			setState(63);
			var();
			setState(64);
			match(BEGIN);
			setState(65);
			sentence();
			setState(66);
			match(END);
			setState(67);
			match(DOT);
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

	public static class SentenceContext extends ParserRuleContext {
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
	 
		public SentenceContext() { }
		public void copyFrom(SentenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Sentence_primeroContext extends SentenceContext {
		public List<Sentence_tContext> sentence_t() {
			return getRuleContexts(Sentence_tContext.class);
		}
		public Sentence_tContext sentence_t(int i) {
			return getRuleContext(Sentence_tContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(miniPascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(miniPascalParser.SEMICOLON, i);
		}
		public Sentence_primeroContext(SentenceContext ctx) { copyFrom(ctx); }
	}
	public static class SentencesincomaContext extends SentenceContext {
		public Sentence_tContext sentence_t() {
			return getRuleContext(Sentence_tContext.class,0);
		}
		public SentencesincomaContext(SentenceContext ctx) { copyFrom(ctx); }
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentence);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Sentence_primeroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << REPEAT) | (1L << FOR) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
					{
					{
					setState(69);
					sentence_t();
					setState(70);
					match(SEMICOLON);
					}
					}
					setState(76);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				_localctx = new SentencesincomaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				sentence_t();
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

	public static class Sentence_tContext extends ParserRuleContext {
		public ReadContext read() {
			return getRuleContext(ReadContext.class,0);
		}
		public WriteContext write() {
			return getRuleContext(WriteContext.class,0);
		}
		public BifContext bif() {
			return getRuleContext(BifContext.class,0);
		}
		public BwhileContext bwhile() {
			return getRuleContext(BwhileContext.class,0);
		}
		public BforContext bfor() {
			return getRuleContext(BforContext.class,0);
		}
		public RepeatContext repeat() {
			return getRuleContext(RepeatContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Sentence_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence_t; }
	}

	public final Sentence_tContext sentence_t() throws RecognitionException {
		Sentence_tContext _localctx = new Sentence_tContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentence_t);
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				read();
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				write();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				bif();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				bwhile();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				bfor();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				repeat();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(86);
				assign();
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

	public static class SentenceUnicaContext extends ParserRuleContext {
		public Sentence_tContext sentence_t() {
			return getRuleContext(Sentence_tContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(miniPascalParser.SEMICOLON, 0); }
		public SentenceUnicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenceUnica; }
	}

	public final SentenceUnicaContext sentenceUnica() throws RecognitionException {
		SentenceUnicaContext _localctx = new SentenceUnicaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentenceUnica);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				sentence_t();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				sentence_t();
				setState(91);
				match(SEMICOLON);
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

	public static class ReadContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(miniPascalParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(miniPascalParser.LPAREN, 0); }
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode RPAREN() { return getToken(miniPascalParser.RPAREN, 0); }
		public ReadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read; }
	}

	public final ReadContext read() throws RecognitionException {
		ReadContext _localctx = new ReadContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_read);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(READ);
			setState(96);
			match(LPAREN);
			setState(97);
			match(ID);
			setState(98);
			match(RPAREN);
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

	public static class WriteContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(miniPascalParser.WRITE, 0); }
		public TerminalNode LPAREN() { return getToken(miniPascalParser.LPAREN, 0); }
		public TerminalNode CONSTSTR() { return getToken(miniPascalParser.CONSTSTR, 0); }
		public TerminalNode COMMA() { return getToken(miniPascalParser.COMMA, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(miniPascalParser.RPAREN, 0); }
		public WriteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write; }
	}

	public final WriteContext write() throws RecognitionException {
		WriteContext _localctx = new WriteContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_write);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(WRITE);
				setState(101);
				match(LPAREN);
				setState(102);
				match(CONSTSTR);
				setState(103);
				match(COMMA);
				setState(104);
				op(0);
				setState(105);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(WRITE);
				setState(108);
				match(LPAREN);
				setState(109);
				match(CONSTSTR);
				setState(110);
				match(RPAREN);
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

	public static class OpContext extends ParserRuleContext {
		public Op_tContext op_t() {
			return getRuleContext(Op_tContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode SUMS() { return getToken(miniPascalParser.SUMS, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	}

	public final OpContext op() throws RecognitionException {
		return op(0);
	}

	private OpContext op(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OpContext _localctx = new OpContext(_ctx, _parentState);
		OpContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_op, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(114);
			op_t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op);
					setState(116);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(117);
					match(SUMS);
					setState(118);
					op_t(0);
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_tContext extends ParserRuleContext {
		public Op_fContext op_f() {
			return getRuleContext(Op_fContext.class,0);
		}
		public Op_tContext op_t() {
			return getRuleContext(Op_tContext.class,0);
		}
		public TerminalNode MULS() { return getToken(miniPascalParser.MULS, 0); }
		public Op_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_t; }
	}

	public final Op_tContext op_t() throws RecognitionException {
		return op_t(0);
	}

	private Op_tContext op_t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Op_tContext _localctx = new Op_tContext(_ctx, _parentState);
		Op_tContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_op_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			op_f();
			}
			_ctx.stop = _input.LT(-1);
			setState(132);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Op_tContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_op_t);
					setState(127);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(128);
					match(MULS);
					setState(129);
					op_f();
					}
					} 
				}
				setState(134);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Op_fContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(miniPascalParser.LPAREN, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(miniPascalParser.RPAREN, 0); }
		public TerminalNode SUMS() { return getToken(miniPascalParser.SUMS, 0); }
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode NUM() { return getToken(miniPascalParser.NUM, 0); }
		public TerminalNode BOOL() { return getToken(miniPascalParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(miniPascalParser.CHAR, 0); }
		public Op_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_f; }
	}

	public final Op_fContext op_f() throws RecognitionException {
		Op_fContext _localctx = new Op_fContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_op_f);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(LPAREN);
				setState(136);
				op(0);
				setState(137);
				match(RPAREN);
				}
				break;
			case SUMS:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(SUMS);
				setState(140);
				op(0);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				match(ID);
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				match(NUM);
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(BOOL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				match(CHAR);
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

	public static class ExpContext extends ParserRuleContext {
		public Exp_tContext exp_t() {
			return getRuleContext(Exp_tContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode OR() { return getToken(miniPascalParser.OR, 0); }
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(148);
			exp_t(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(150);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(151);
					match(OR);
					setState(152);
					exp_t(0);
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp_tContext extends ParserRuleContext {
		public Exp_fContext exp_f() {
			return getRuleContext(Exp_fContext.class,0);
		}
		public Exp_tContext exp_t() {
			return getRuleContext(Exp_tContext.class,0);
		}
		public TerminalNode AND() { return getToken(miniPascalParser.AND, 0); }
		public Exp_tContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_t; }
	}

	public final Exp_tContext exp_t() throws RecognitionException {
		return exp_t(0);
	}

	private Exp_tContext exp_t(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Exp_tContext _localctx = new Exp_tContext(_ctx, _parentState);
		Exp_tContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_exp_t, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(159);
			exp_f();
			}
			_ctx.stop = _input.LT(-1);
			setState(166);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Exp_tContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exp_t);
					setState(161);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(162);
					match(AND);
					setState(163);
					exp_f();
					}
					} 
				}
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Exp_fContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(miniPascalParser.LPAREN, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(miniPascalParser.RPAREN, 0); }
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(miniPascalParser.OPREL, 0); }
		public Exp_fContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_f; }
	}

	public final Exp_fContext exp_f() throws RecognitionException {
		Exp_fContext _localctx = new Exp_fContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exp_f);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(LPAREN);
				setState(170);
				exp(0);
				setState(171);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				op(0);
				setState(174);
				match(OPREL);
				setState(175);
				op(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				op(0);
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

	public static class BwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(miniPascalParser.WHILE, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode THEN() { return getToken(miniPascalParser.THEN, 0); }
		public SentenceUnicaContext sentenceUnica() {
			return getRuleContext(SentenceUnicaContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(miniPascalParser.BEGIN, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode END() { return getToken(miniPascalParser.END, 0); }
		public BwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bwhile; }
	}

	public final BwhileContext bwhile() throws RecognitionException {
		BwhileContext _localctx = new BwhileContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bwhile);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(WHILE);
				setState(181);
				exp(0);
				setState(182);
				match(THEN);
				setState(183);
				sentenceUnica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(WHILE);
				setState(186);
				exp(0);
				setState(187);
				match(THEN);
				setState(188);
				match(BEGIN);
				setState(189);
				sentence();
				setState(190);
				match(END);
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

	public static class BifContext extends ParserRuleContext {
		public BbifContext bbif() {
			return getRuleContext(BbifContext.class,0);
		}
		public BelseContext belse() {
			return getRuleContext(BelseContext.class,0);
		}
		public BifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bif; }
	}

	public final BifContext bif() throws RecognitionException {
		BifContext _localctx = new BifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bif);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				bbif();
				setState(195);
				belse();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				bbif();
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

	public static class BbifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(miniPascalParser.IF, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode THEN() { return getToken(miniPascalParser.THEN, 0); }
		public SentenceUnicaContext sentenceUnica() {
			return getRuleContext(SentenceUnicaContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(miniPascalParser.BEGIN, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode END() { return getToken(miniPascalParser.END, 0); }
		public BbifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bbif; }
	}

	public final BbifContext bbif() throws RecognitionException {
		BbifContext _localctx = new BbifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bbif);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				match(IF);
				setState(201);
				exp(0);
				setState(202);
				match(THEN);
				setState(203);
				sentenceUnica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(IF);
				setState(206);
				exp(0);
				setState(207);
				match(THEN);
				setState(208);
				match(BEGIN);
				setState(209);
				sentence();
				setState(210);
				match(END);
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

	public static class BelseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(miniPascalParser.ELSE, 0); }
		public SentenceUnicaContext sentenceUnica() {
			return getRuleContext(SentenceUnicaContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(miniPascalParser.BEGIN, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode END() { return getToken(miniPascalParser.END, 0); }
		public BelseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_belse; }
	}

	public final BelseContext belse() throws RecognitionException {
		BelseContext _localctx = new BelseContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_belse);
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(ELSE);
				setState(215);
				sentenceUnica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(ELSE);
				setState(217);
				match(BEGIN);
				setState(218);
				sentence();
				setState(219);
				match(END);
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

	public static class RepeatContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(miniPascalParser.REPEAT, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(miniPascalParser.UNTIL, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public RepeatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat; }
	}

	public final RepeatContext repeat() throws RecognitionException {
		RepeatContext _localctx = new RepeatContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_repeat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(REPEAT);
			setState(224);
			sentence();
			setState(225);
			match(UNTIL);
			setState(226);
			exp(0);
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

	public static class BforContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(miniPascalParser.FOR, 0); }
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(miniPascalParser.ASSIGN, 0); }
		public List<TerminalNode> NUM() { return getTokens(miniPascalParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(miniPascalParser.NUM, i);
		}
		public TerminalNode TO() { return getToken(miniPascalParser.TO, 0); }
		public TerminalNode DO() { return getToken(miniPascalParser.DO, 0); }
		public SentenceUnicaContext sentenceUnica() {
			return getRuleContext(SentenceUnicaContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(miniPascalParser.BEGIN, 0); }
		public SentenceContext sentence() {
			return getRuleContext(SentenceContext.class,0);
		}
		public TerminalNode END() { return getToken(miniPascalParser.END, 0); }
		public BforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfor; }
	}

	public final BforContext bfor() throws RecognitionException {
		BforContext _localctx = new BforContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bfor);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(FOR);
				setState(229);
				match(ID);
				setState(230);
				match(ASSIGN);
				setState(231);
				match(NUM);
				setState(232);
				match(TO);
				setState(233);
				match(NUM);
				setState(234);
				match(DO);
				setState(235);
				sentenceUnica();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(FOR);
				setState(237);
				match(ID);
				setState(238);
				match(ASSIGN);
				setState(239);
				match(NUM);
				setState(240);
				match(TO);
				setState(241);
				match(NUM);
				setState(242);
				match(DO);
				setState(243);
				match(BEGIN);
				setState(244);
				sentence();
				setState(245);
				match(END);
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

	public static class VarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(miniPascalParser.VAR, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(VAR);
			setState(250);
			vars();
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

	public static class VarsContext extends ParserRuleContext {
		public BidContext bid() {
			return getRuleContext(BidContext.class,0);
		}
		public TerminalNode COLON() { return getToken(miniPascalParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(miniPascalParser.SEMICOLON, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_vars);
		try {
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(252);
				bid();
				setState(253);
				match(COLON);
				setState(254);
				type();
				setState(255);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(257);
				bid();
				setState(258);
				match(COLON);
				setState(259);
				type();
				setState(260);
				match(SEMICOLON);
				setState(261);
				vars();
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

	public static class BidContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(miniPascalParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(miniPascalParser.COMMA, 0); }
		public BidContext bid() {
			return getRuleContext(BidContext.class,0);
		}
		public BidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bid; }
	}

	public final BidContext bid() throws RecognitionException {
		BidContext _localctx = new BidContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bid);
		try {
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(ID);
				setState(266);
				match(COMMA);
				setState(267);
				bid();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(ID);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return op_sempred((OpContext)_localctx, predIndex);
		case 10:
			return op_t_sempred((Op_tContext)_localctx, predIndex);
		case 12:
			return exp_sempred((ExpContext)_localctx, predIndex);
		case 13:
			return exp_t_sempred((Exp_tContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean op_sempred(OpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean op_t_sempred(Op_tContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean exp_t_sempred(Exp_tContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0112\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\5\2\66\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\5\6Q\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7Z\n\7\3\b\3\b\3\b\3\b\5\b`\n\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nr\n\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\7\13z\n\13\f\13\16\13}\13\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u0085\n\f\f\f\16\f\u0088\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0094\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u009c\n\16"+
		"\f\16\16\16\u009f\13\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00a7\n\17"+
		"\f\17\16\17\u00aa\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5"+
		"\20\u00b5\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00c3\n\21\3\22\3\22\3\22\3\22\5\22\u00c9\n\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d7\n\23\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e0\n\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00fa\n\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u010a\n\30\3\31\3\31\3\31"+
		"\3\31\5\31\u0110\n\31\3\31\2\6\24\26\32\34\32\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\2\2\2\u0117\2\65\3\2\2\2\4\67\3\2\2\2\6;\3"+
		"\2\2\2\b>\3\2\2\2\nP\3\2\2\2\fY\3\2\2\2\16_\3\2\2\2\20a\3\2\2\2\22q\3"+
		"\2\2\2\24s\3\2\2\2\26~\3\2\2\2\30\u0093\3\2\2\2\32\u0095\3\2\2\2\34\u00a0"+
		"\3\2\2\2\36\u00b4\3\2\2\2 \u00c2\3\2\2\2\"\u00c8\3\2\2\2$\u00d6\3\2\2"+
		"\2&\u00df\3\2\2\2(\u00e1\3\2\2\2*\u00f9\3\2\2\2,\u00fb\3\2\2\2.\u0109"+
		"\3\2\2\2\60\u010f\3\2\2\2\62\66\7\3\2\2\63\66\7\4\2\2\64\66\7\5\2\2\65"+
		"\62\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\3\3\2\2\2\678\7\34\2\289\7"+
		"\23\2\29:\5\24\13\2:\5\3\2\2\2;<\5\b\5\2<=\7\2\2\3=\7\3\2\2\2>?\7\22\2"+
		"\2?@\7\34\2\2@A\7#\2\2AB\5,\27\2BC\7\13\2\2CD\5\n\6\2DE\7\f\2\2EF\7&\2"+
		"\2F\t\3\2\2\2GH\5\f\7\2HI\7#\2\2IK\3\2\2\2JG\3\2\2\2KN\3\2\2\2LJ\3\2\2"+
		"\2LM\3\2\2\2MQ\3\2\2\2NL\3\2\2\2OQ\5\f\7\2PL\3\2\2\2PO\3\2\2\2Q\13\3\2"+
		"\2\2RZ\5\20\t\2SZ\5\22\n\2TZ\5\"\22\2UZ\5 \21\2VZ\5*\26\2WZ\5(\25\2XZ"+
		"\5\4\3\2YR\3\2\2\2YS\3\2\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2Y"+
		"X\3\2\2\2Z\r\3\2\2\2[`\5\f\7\2\\]\5\f\7\2]^\7#\2\2^`\3\2\2\2_[\3\2\2\2"+
		"_\\\3\2\2\2`\17\3\2\2\2ab\7\30\2\2bc\7\'\2\2cd\7\34\2\2de\7(\2\2e\21\3"+
		"\2\2\2fg\7\31\2\2gh\7\'\2\2hi\7\37\2\2ij\7%\2\2jk\5\24\13\2kl\7(\2\2l"+
		"r\3\2\2\2mn\7\31\2\2no\7\'\2\2op\7\37\2\2pr\7(\2\2qf\3\2\2\2qm\3\2\2\2"+
		"r\23\3\2\2\2st\b\13\1\2tu\5\26\f\2u{\3\2\2\2vw\f\4\2\2wx\7\33\2\2xz\5"+
		"\26\f\2yv\3\2\2\2z}\3\2\2\2{y\3\2\2\2{|\3\2\2\2|\25\3\2\2\2}{\3\2\2\2"+
		"~\177\b\f\1\2\177\u0080\5\30\r\2\u0080\u0086\3\2\2\2\u0081\u0082\f\4\2"+
		"\2\u0082\u0083\7\32\2\2\u0083\u0085\5\30\r\2\u0084\u0081\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\27\3\2\2"+
		"\2\u0088\u0086\3\2\2\2\u0089\u008a\7\'\2\2\u008a\u008b\5\24\13\2\u008b"+
		"\u008c\7(\2\2\u008c\u0094\3\2\2\2\u008d\u008e\7\33\2\2\u008e\u0094\5\24"+
		"\13\2\u008f\u0094\7\34\2\2\u0090\u0094\7\35\2\2\u0091\u0094\7\24\2\2\u0092"+
		"\u0094\7\36\2\2\u0093\u0089\3\2\2\2\u0093\u008d\3\2\2\2\u0093\u008f\3"+
		"\2\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094"+
		"\31\3\2\2\2\u0095\u0096\b\16\1\2\u0096\u0097\5\34\17\2\u0097\u009d\3\2"+
		"\2\2\u0098\u0099\f\4\2\2\u0099\u009a\7\27\2\2\u009a\u009c\5\34\17\2\u009b"+
		"\u0098\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2"+
		"\2\2\u009e\33\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a1\b\17\1\2\u00a1\u00a2"+
		"\5\36\20\2\u00a2\u00a8\3\2\2\2\u00a3\u00a4\f\4\2\2\u00a4\u00a5\7\26\2"+
		"\2\u00a5\u00a7\5\36\20\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\35\3\2\2\2\u00aa\u00a8\3\2\2"+
		"\2\u00ab\u00ac\7\'\2\2\u00ac\u00ad\5\32\16\2\u00ad\u00ae\7(\2\2\u00ae"+
		"\u00b5\3\2\2\2\u00af\u00b0\5\24\13\2\u00b0\u00b1\7\25\2\2\u00b1\u00b2"+
		"\5\24\13\2\u00b2\u00b5\3\2\2\2\u00b3\u00b5\5\24\13\2\u00b4\u00ab\3\2\2"+
		"\2\u00b4\u00af\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\37\3\2\2\2\u00b6\u00b7"+
		"\7\t\2\2\u00b7\u00b8\5\32\16\2\u00b8\u00b9\7\7\2\2\u00b9\u00ba\5\16\b"+
		"\2\u00ba\u00c3\3\2\2\2\u00bb\u00bc\7\t\2\2\u00bc\u00bd\5\32\16\2\u00bd"+
		"\u00be\7\7\2\2\u00be\u00bf\7\13\2\2\u00bf\u00c0\5\n\6\2\u00c0\u00c1\7"+
		"\f\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00bb\3\2\2\2\u00c3"+
		"!\3\2\2\2\u00c4\u00c5\5$\23\2\u00c5\u00c6\5&\24\2\u00c6\u00c9\3\2\2\2"+
		"\u00c7\u00c9\5$\23\2\u00c8\u00c4\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9#\3"+
		"\2\2\2\u00ca\u00cb\7\6\2\2\u00cb\u00cc\5\32\16\2\u00cc\u00cd\7\7\2\2\u00cd"+
		"\u00ce\5\16\b\2\u00ce\u00d7\3\2\2\2\u00cf\u00d0\7\6\2\2\u00d0\u00d1\5"+
		"\32\16\2\u00d1\u00d2\7\7\2\2\u00d2\u00d3\7\13\2\2\u00d3\u00d4\5\n\6\2"+
		"\u00d4\u00d5\7\f\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00cf"+
		"\3\2\2\2\u00d7%\3\2\2\2\u00d8\u00d9\7\b\2\2\u00d9\u00e0\5\16\b\2\u00da"+
		"\u00db\7\b\2\2\u00db\u00dc\7\13\2\2\u00dc\u00dd\5\n\6\2\u00dd\u00de\7"+
		"\f\2\2\u00de\u00e0\3\2\2\2\u00df\u00d8\3\2\2\2\u00df\u00da\3\2\2\2\u00e0"+
		"\'\3\2\2\2\u00e1\u00e2\7\r\2\2\u00e2\u00e3\5\n\6\2\u00e3\u00e4\7\16\2"+
		"\2\u00e4\u00e5\5\32\16\2\u00e5)\3\2\2\2\u00e6\u00e7\7\17\2\2\u00e7\u00e8"+
		"\7\34\2\2\u00e8\u00e9\7\23\2\2\u00e9\u00ea\7\35\2\2\u00ea\u00eb\7\20\2"+
		"\2\u00eb\u00ec\7\35\2\2\u00ec\u00ed\7\n\2\2\u00ed\u00fa\5\16\b\2\u00ee"+
		"\u00ef\7\17\2\2\u00ef\u00f0\7\34\2\2\u00f0\u00f1\7\23\2\2\u00f1\u00f2"+
		"\7\35\2\2\u00f2\u00f3\7\20\2\2\u00f3\u00f4\7\35\2\2\u00f4\u00f5\7\n\2"+
		"\2\u00f5\u00f6\7\13\2\2\u00f6\u00f7\5\n\6\2\u00f7\u00f8\7\f\2\2\u00f8"+
		"\u00fa\3\2\2\2\u00f9\u00e6\3\2\2\2\u00f9\u00ee\3\2\2\2\u00fa+\3\2\2\2"+
		"\u00fb\u00fc\7\21\2\2\u00fc\u00fd\5.\30\2\u00fd-\3\2\2\2\u00fe\u00ff\5"+
		"\60\31\2\u00ff\u0100\7$\2\2\u0100\u0101\5\2\2\2\u0101\u0102\7#\2\2\u0102"+
		"\u010a\3\2\2\2\u0103\u0104\5\60\31\2\u0104\u0105\7$\2\2\u0105\u0106\5"+
		"\2\2\2\u0106\u0107\7#\2\2\u0107\u0108\5.\30\2\u0108\u010a\3\2\2\2\u0109"+
		"\u00fe\3\2\2\2\u0109\u0103\3\2\2\2\u010a/\3\2\2\2\u010b\u010c\7\34\2\2"+
		"\u010c\u010d\7%\2\2\u010d\u0110\5\60\31\2\u010e\u0110\7\34\2\2\u010f\u010b"+
		"\3\2\2\2\u010f\u010e\3\2\2\2\u0110\61\3\2\2\2\25\65LPY_q{\u0086\u0093"+
		"\u009d\u00a8\u00b4\u00c2\u00c8\u00d6\u00df\u00f9\u0109\u010f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}