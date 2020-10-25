// Generated from d:\afromana\Documents\UNAL\Lenguajes\interpreterbcc\grammars\BCC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BCCParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BOOL=1, DATATYPE=2, TK_DOSPUNTOS=3, TK_COMA=4, TK_PUNTOYCOMA=5, TK_ASIGNACION=6, 
		TK_PAR_IZQ=7, TK_PAR_DER=8, TK_MENOR=9, TK_MENOR_IGUAL=10, TK_SUM_ASIG=11, 
		TK_RES_ASIG=12, TK_MUL_ASIG=13, TK_DIV_ASIG=14, TK_MOD_ASIG=15, TK_DIFERENTE=16, 
		TK_IGUALDAD=17, TK_MAYOR=18, TK_MAYOR_IGUAL=19, TK_LLAVE_IZQ=20, TK_LLAVE_DER=21, 
		TK_MAS=22, TK_MENOS=23, TK_MUL=24, TK_DIV=25, TK_MOD=26, TK_INCREMENTO=27, 
		TK_DECREMENTO=28, FUNCTION=29, VAR=30, PRINT=31, INPUT=32, WHEN=33, DO=34, 
		IF=35, ELSE=36, UNLESS=37, WHILE=38, RETURN=39, UNTIL=40, LOOP=41, REPEAT=42, 
		FOR=43, END=44, NEXT=45, BREAK=46, AND=47, OR=48, NOT=49, NUM=50, FID=51, 
		ID=52, WS=53, COMMENT=54;
	public static final int
		RULE_prog = 0, RULE_varDecl = 1, RULE_fndeclList = 2, RULE_stmtBlock = 3, 
		RULE_stmt = 4, RULE_lexpr = 5, RULE_nexpr = 6, RULE_rexpr = 7, RULE_simpleExpr = 8, 
		RULE_term = 9, RULE_factor = 10, RULE_mainProg = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "varDecl", "fndeclList", "stmtBlock", "stmt", "lexpr", "nexpr", 
			"rexpr", "simpleExpr", "term", "factor", "mainProg"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "':'", "','", "';'", "':='", "'('", "')'", "'<'", "'<='", 
			"'+='", "'-='", "'*='", "'/='", "'%='", "'!='", "'=='", "'>'", "'>='", 
			"'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", "'function'", 
			"'var'", "'print'", "'input'", "'when'", "'do'", "'if'", "'else'", "'unless'", 
			"'while'", "'return'", "'until'", "'loop'", "'repeat'", "'for'", "'end'", 
			"'next'", "'break'", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BOOL", "DATATYPE", "TK_DOSPUNTOS", "TK_COMA", "TK_PUNTOYCOMA", 
			"TK_ASIGNACION", "TK_PAR_IZQ", "TK_PAR_DER", "TK_MENOR", "TK_MENOR_IGUAL", 
			"TK_SUM_ASIG", "TK_RES_ASIG", "TK_MUL_ASIG", "TK_DIV_ASIG", "TK_MOD_ASIG", 
			"TK_DIFERENTE", "TK_IGUALDAD", "TK_MAYOR", "TK_MAYOR_IGUAL", "TK_LLAVE_IZQ", 
			"TK_LLAVE_DER", "TK_MAS", "TK_MENOS", "TK_MUL", "TK_DIV", "TK_MOD", "TK_INCREMENTO", 
			"TK_DECREMENTO", "FUNCTION", "VAR", "PRINT", "INPUT", "WHEN", "DO", "IF", 
			"ELSE", "UNLESS", "WHILE", "RETURN", "UNTIL", "LOOP", "REPEAT", "FOR", 
			"END", "NEXT", "BREAK", "AND", "OR", "NOT", "NUM", "FID", "ID", "WS", 
			"COMMENT"
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
	public String getGrammarFileName() { return "BCC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BCCParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public MainProgContext mainProg() {
			return getRuleContext(MainProgContext.class,0);
		}
		public List<FndeclListContext> fndeclList() {
			return getRuleContexts(FndeclListContext.class);
		}
		public FndeclListContext fndeclList(int i) {
			return getRuleContext(FndeclListContext.class,i);
		}
		public TerminalNode EOF() { return getToken(BCCParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_INCREMENTO:
			case TK_DECREMENTO:
			case FUNCTION:
			case VAR:
			case PRINT:
			case INPUT:
			case WHEN:
			case DO:
			case IF:
			case UNLESS:
			case WHILE:
			case RETURN:
			case UNTIL:
			case LOOP:
			case REPEAT:
			case FOR:
			case END:
			case NEXT:
			case BREAK:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION) {
					{
					{
					setState(24);
					fndeclList();
					}
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(30);
				mainProg();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				match(EOF);
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

	public static class VarDeclContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(BCCParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(BCCParser.ID, i);
		}
		public List<TerminalNode> TK_DOSPUNTOS() { return getTokens(BCCParser.TK_DOSPUNTOS); }
		public TerminalNode TK_DOSPUNTOS(int i) {
			return getToken(BCCParser.TK_DOSPUNTOS, i);
		}
		public List<TerminalNode> DATATYPE() { return getTokens(BCCParser.DATATYPE); }
		public TerminalNode DATATYPE(int i) {
			return getToken(BCCParser.DATATYPE, i);
		}
		public List<TerminalNode> TK_COMA() { return getTokens(BCCParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(BCCParser.TK_COMA, i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(ID);
			setState(35);
			match(TK_DOSPUNTOS);
			setState(36);
			match(DATATYPE);
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(37);
				match(TK_COMA);
				setState(38);
				match(ID);
				setState(39);
				match(TK_DOSPUNTOS);
				setState(40);
				match(DATATYPE);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FndeclListContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(BCCParser.FUNCTION, 0); }
		public TerminalNode FID() { return getToken(BCCParser.FID, 0); }
		public TerminalNode TK_DOSPUNTOS() { return getToken(BCCParser.TK_DOSPUNTOS, 0); }
		public TerminalNode DATATYPE() { return getToken(BCCParser.DATATYPE, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public StmtBlockContext stmtBlock() {
			return getRuleContext(StmtBlockContext.class,0);
		}
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public TerminalNode VAR() { return getToken(BCCParser.VAR, 0); }
		public TerminalNode TK_PUNTOYCOMA() { return getToken(BCCParser.TK_PUNTOYCOMA, 0); }
		public FndeclListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fndeclList; }
	}

	public final FndeclListContext fndeclList() throws RecognitionException {
		FndeclListContext _localctx = new FndeclListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fndeclList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(FUNCTION);
			setState(47);
			match(FID);
			setState(48);
			match(TK_DOSPUNTOS);
			setState(49);
			match(DATATYPE);
			setState(50);
			match(TK_PAR_IZQ);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(51);
				varDecl();
				}
			}

			setState(54);
			match(TK_PAR_DER);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(55);
				match(VAR);
				setState(56);
				varDecl();
				setState(57);
				match(TK_PUNTOYCOMA);
				}
			}

			setState(61);
			stmtBlock();
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

	public static class StmtBlockContext extends ParserRuleContext {
		public TerminalNode TK_LLAVE_IZQ() { return getToken(BCCParser.TK_LLAVE_IZQ, 0); }
		public TerminalNode TK_LLAVE_DER() { return getToken(BCCParser.TK_LLAVE_DER, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public StmtBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmtBlock; }
	}

	public final StmtBlockContext stmtBlock() throws RecognitionException {
		StmtBlockContext _localctx = new StmtBlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmtBlock);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LLAVE_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(TK_LLAVE_IZQ);
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(64);
					stmt();
					}
					}
					setState(67); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << PRINT) | (1L << INPUT) | (1L << WHEN) | (1L << DO) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << RETURN) | (1L << UNTIL) | (1L << LOOP) | (1L << REPEAT) | (1L << FOR) | (1L << NEXT) | (1L << BREAK) | (1L << ID))) != 0) );
				setState(69);
				match(TK_LLAVE_DER);
				}
				break;
			case TK_INCREMENTO:
			case TK_DECREMENTO:
			case PRINT:
			case INPUT:
			case WHEN:
			case DO:
			case IF:
			case UNLESS:
			case WHILE:
			case RETURN:
			case UNTIL:
			case LOOP:
			case REPEAT:
			case FOR:
			case NEXT:
			case BREAK:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				stmt();
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

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(BCCParser.PRINT, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public List<TerminalNode> TK_PUNTOYCOMA() { return getTokens(BCCParser.TK_PUNTOYCOMA); }
		public TerminalNode TK_PUNTOYCOMA(int i) {
			return getToken(BCCParser.TK_PUNTOYCOMA, i);
		}
		public TerminalNode INPUT() { return getToken(BCCParser.INPUT, 0); }
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode WHEN() { return getToken(BCCParser.WHEN, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public TerminalNode DO() { return getToken(BCCParser.DO, 0); }
		public List<StmtBlockContext> stmtBlock() {
			return getRuleContexts(StmtBlockContext.class);
		}
		public StmtBlockContext stmtBlock(int i) {
			return getRuleContext(StmtBlockContext.class,i);
		}
		public TerminalNode IF() { return getToken(BCCParser.IF, 0); }
		public TerminalNode ELSE() { return getToken(BCCParser.ELSE, 0); }
		public TerminalNode UNLESS() { return getToken(BCCParser.UNLESS, 0); }
		public TerminalNode WHILE() { return getToken(BCCParser.WHILE, 0); }
		public TerminalNode RETURN() { return getToken(BCCParser.RETURN, 0); }
		public TerminalNode UNTIL() { return getToken(BCCParser.UNTIL, 0); }
		public TerminalNode LOOP() { return getToken(BCCParser.LOOP, 0); }
		public TerminalNode REPEAT() { return getToken(BCCParser.REPEAT, 0); }
		public TerminalNode NUM() { return getToken(BCCParser.NUM, 0); }
		public TerminalNode TK_DOSPUNTOS() { return getToken(BCCParser.TK_DOSPUNTOS, 0); }
		public TerminalNode FOR() { return getToken(BCCParser.FOR, 0); }
		public TerminalNode NEXT() { return getToken(BCCParser.NEXT, 0); }
		public TerminalNode BREAK() { return getToken(BCCParser.BREAK, 0); }
		public TerminalNode TK_ASIGNACION() { return getToken(BCCParser.TK_ASIGNACION, 0); }
		public TerminalNode TK_SUM_ASIG() { return getToken(BCCParser.TK_SUM_ASIG, 0); }
		public TerminalNode TK_RES_ASIG() { return getToken(BCCParser.TK_RES_ASIG, 0); }
		public TerminalNode TK_MUL_ASIG() { return getToken(BCCParser.TK_MUL_ASIG, 0); }
		public TerminalNode TK_DIV_ASIG() { return getToken(BCCParser.TK_DIV_ASIG, 0); }
		public TerminalNode TK_MOD_ASIG() { return getToken(BCCParser.TK_MOD_ASIG, 0); }
		public TerminalNode TK_INCREMENTO() { return getToken(BCCParser.TK_INCREMENTO, 0); }
		public TerminalNode TK_DECREMENTO() { return getToken(BCCParser.TK_DECREMENTO, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt);
		try {
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(PRINT);
				setState(75);
				lexpr();
				setState(76);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(INPUT);
				setState(79);
				match(ID);
				setState(80);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(WHEN);
				setState(82);
				match(TK_PAR_IZQ);
				setState(83);
				lexpr();
				setState(84);
				match(TK_PAR_DER);
				setState(85);
				match(DO);
				setState(86);
				stmtBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(88);
				match(IF);
				setState(89);
				match(TK_PAR_IZQ);
				setState(90);
				lexpr();
				setState(91);
				match(TK_PAR_DER);
				setState(92);
				match(DO);
				setState(93);
				stmtBlock();
				setState(94);
				match(ELSE);
				setState(95);
				stmtBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(UNLESS);
				setState(98);
				match(TK_PAR_IZQ);
				setState(99);
				lexpr();
				setState(100);
				match(TK_PAR_DER);
				setState(101);
				match(DO);
				setState(102);
				stmtBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(104);
				match(WHILE);
				setState(105);
				match(TK_PAR_IZQ);
				setState(106);
				lexpr();
				setState(107);
				match(TK_PAR_DER);
				setState(108);
				match(DO);
				setState(109);
				stmtBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(111);
				match(RETURN);
				setState(112);
				lexpr();
				setState(113);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(115);
				match(UNTIL);
				setState(116);
				match(TK_PAR_IZQ);
				setState(117);
				lexpr();
				setState(118);
				match(TK_PAR_DER);
				setState(119);
				match(DO);
				setState(120);
				stmtBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(122);
				match(LOOP);
				setState(123);
				stmtBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(124);
				match(DO);
				setState(125);
				stmtBlock();
				setState(126);
				match(WHILE);
				setState(127);
				match(TK_PAR_IZQ);
				setState(128);
				lexpr();
				setState(129);
				match(TK_PAR_DER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(131);
				match(DO);
				setState(132);
				stmtBlock();
				setState(133);
				match(UNTIL);
				setState(134);
				match(TK_PAR_IZQ);
				setState(135);
				lexpr();
				setState(136);
				match(TK_PAR_DER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(138);
				match(REPEAT);
				setState(139);
				match(NUM);
				setState(140);
				match(TK_DOSPUNTOS);
				setState(141);
				stmtBlock();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(142);
				match(FOR);
				setState(143);
				match(TK_PAR_IZQ);
				setState(144);
				lexpr();
				setState(145);
				match(TK_PUNTOYCOMA);
				setState(146);
				lexpr();
				setState(147);
				match(TK_PUNTOYCOMA);
				setState(148);
				lexpr();
				setState(149);
				match(TK_PAR_DER);
				setState(150);
				match(DO);
				setState(151);
				stmtBlock();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(153);
				match(NEXT);
				setState(154);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(155);
				match(BREAK);
				setState(156);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(157);
				match(ID);
				setState(158);
				match(TK_ASIGNACION);
				setState(159);
				lexpr();
				setState(160);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(162);
				match(ID);
				setState(163);
				match(TK_SUM_ASIG);
				setState(164);
				lexpr();
				setState(165);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(167);
				match(ID);
				setState(168);
				match(TK_RES_ASIG);
				setState(169);
				lexpr();
				setState(170);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(172);
				match(ID);
				setState(173);
				match(TK_MUL_ASIG);
				setState(174);
				lexpr();
				setState(175);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(177);
				match(ID);
				setState(178);
				match(TK_DIV_ASIG);
				setState(179);
				lexpr();
				setState(180);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(182);
				match(ID);
				setState(183);
				match(TK_MOD_ASIG);
				setState(184);
				lexpr();
				setState(185);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(187);
				match(ID);
				setState(188);
				match(TK_INCREMENTO);
				setState(189);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(190);
				match(ID);
				setState(191);
				match(TK_DECREMENTO);
				setState(192);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(193);
				match(TK_DECREMENTO);
				setState(194);
				match(ID);
				setState(195);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(196);
				match(TK_INCREMENTO);
				setState(197);
				match(ID);
				setState(198);
				match(TK_PUNTOYCOMA);
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

	public static class LexprContext extends ParserRuleContext {
		public List<NexprContext> nexpr() {
			return getRuleContexts(NexprContext.class);
		}
		public NexprContext nexpr(int i) {
			return getRuleContext(NexprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(BCCParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(BCCParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(BCCParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(BCCParser.OR, i);
		}
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			nexpr();
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(202);
					match(AND);
					setState(203);
					nexpr();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(209);
					match(OR);
					setState(210);
					nexpr();
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
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

	public static class NexprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(BCCParser.NOT, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public RexprContext rexpr() {
			return getRuleContext(RexprContext.class,0);
		}
		public NexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr; }
	}

	public final NexprContext nexpr() throws RecognitionException {
		NexprContext _localctx = new NexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nexpr);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(218);
				match(NOT);
				setState(219);
				match(TK_PAR_IZQ);
				setState(220);
				lexpr();
				setState(221);
				match(TK_PAR_DER);
				}
				break;
			case BOOL:
			case TK_PAR_IZQ:
			case TK_INCREMENTO:
			case TK_DECREMENTO:
			case NUM:
			case FID:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
				rexpr();
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

	public static class RexprContext extends ParserRuleContext {
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode TK_MENOR() { return getToken(BCCParser.TK_MENOR, 0); }
		public TerminalNode TK_IGUALDAD() { return getToken(BCCParser.TK_IGUALDAD, 0); }
		public TerminalNode TK_MENOR_IGUAL() { return getToken(BCCParser.TK_MENOR_IGUAL, 0); }
		public TerminalNode TK_MAYOR() { return getToken(BCCParser.TK_MAYOR, 0); }
		public TerminalNode TK_MAYOR_IGUAL() { return getToken(BCCParser.TK_MAYOR_IGUAL, 0); }
		public TerminalNode TK_DIFERENTE() { return getToken(BCCParser.TK_DIFERENTE, 0); }
		public RexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexpr; }
	}

	public final RexprContext rexpr() throws RecognitionException {
		RexprContext _localctx = new RexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			simpleExpr();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_DIFERENTE) | (1L << TK_IGUALDAD) | (1L << TK_MAYOR) | (1L << TK_MAYOR_IGUAL))) != 0)) {
				{
				setState(227);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_DIFERENTE) | (1L << TK_IGUALDAD) | (1L << TK_MAYOR) | (1L << TK_MAYOR_IGUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(228);
				simpleExpr();
				}
			}

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

	public static class SimpleExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> TK_MAS() { return getTokens(BCCParser.TK_MAS); }
		public TerminalNode TK_MAS(int i) {
			return getToken(BCCParser.TK_MAS, i);
		}
		public List<TerminalNode> TK_MENOS() { return getTokens(BCCParser.TK_MENOS); }
		public TerminalNode TK_MENOS(int i) {
			return getToken(BCCParser.TK_MENOS, i);
		}
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simpleExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			term();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_MAS || _la==TK_MENOS) {
				{
				{
				setState(232);
				_la = _input.LA(1);
				if ( !(_la==TK_MAS || _la==TK_MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(233);
				term();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> TK_MUL() { return getTokens(BCCParser.TK_MUL); }
		public TerminalNode TK_MUL(int i) {
			return getToken(BCCParser.TK_MUL, i);
		}
		public List<TerminalNode> TK_DIV() { return getTokens(BCCParser.TK_DIV); }
		public TerminalNode TK_DIV(int i) {
			return getToken(BCCParser.TK_DIV, i);
		}
		public List<TerminalNode> TK_MOD() { return getTokens(BCCParser.TK_MOD); }
		public TerminalNode TK_MOD(int i) {
			return getToken(BCCParser.TK_MOD, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			factor();
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) {
				{
				{
				setState(240);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(241);
				factor();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(BCCParser.NUM, 0); }
		public TerminalNode BOOL() { return getToken(BCCParser.BOOL, 0); }
		public TerminalNode ID() { return getToken(BCCParser.ID, 0); }
		public TerminalNode TK_INCREMENTO() { return getToken(BCCParser.TK_INCREMENTO, 0); }
		public TerminalNode TK_DECREMENTO() { return getToken(BCCParser.TK_DECREMENTO, 0); }
		public TerminalNode TK_PAR_IZQ() { return getToken(BCCParser.TK_PAR_IZQ, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public TerminalNode TK_PAR_DER() { return getToken(BCCParser.TK_PAR_DER, 0); }
		public TerminalNode FID() { return getToken(BCCParser.FID, 0); }
		public List<TerminalNode> TK_COMA() { return getTokens(BCCParser.TK_COMA); }
		public TerminalNode TK_COMA(int i) {
			return getToken(BCCParser.TK_COMA, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_factor);
		int _la;
		try {
			setState(271);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(BOOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(ID);
				setState(250);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(252);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(253);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(254);
				match(TK_PAR_IZQ);
				setState(255);
				lexpr();
				setState(256);
				match(TK_PAR_DER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(258);
				match(FID);
				setState(259);
				match(TK_PAR_IZQ);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOL) | (1L << TK_PAR_IZQ) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << NOT) | (1L << NUM) | (1L << FID) | (1L << ID))) != 0)) {
					{
					setState(260);
					lexpr();
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMA) {
						{
						{
						setState(261);
						match(TK_COMA);
						setState(262);
						lexpr();
						}
						}
						setState(267);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(270);
				match(TK_PAR_DER);
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

	public static class MainProgContext extends ParserRuleContext {
		public TerminalNode END() { return getToken(BCCParser.END, 0); }
		public TerminalNode VAR() { return getToken(BCCParser.VAR, 0); }
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public TerminalNode TK_PUNTOYCOMA() { return getToken(BCCParser.TK_PUNTOYCOMA, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public MainProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainProg; }
	}

	public final MainProgContext mainProg() throws RecognitionException {
		MainProgContext _localctx = new MainProgContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mainProg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(273);
				match(VAR);
				setState(274);
				varDecl();
				setState(275);
				match(TK_PUNTOYCOMA);
				}
			}

			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << PRINT) | (1L << INPUT) | (1L << WHEN) | (1L << DO) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << RETURN) | (1L << UNTIL) | (1L << LOOP) | (1L << REPEAT) | (1L << FOR) | (1L << NEXT) | (1L << BREAK) | (1L << ID))) != 0)) {
				{
				{
				setState(279);
				stmt();
				}
				}
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			match(END);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\5\2#\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3,\n\3\f\3\16\3/\13\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\5\4\67\n\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\5\3\5\6\5D\n\5"+
		"\r\5\16\5E\3\5\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ca\n\6\3\7\3\7\3\7\7"+
		"\7\u00cf\n\7\f\7\16\7\u00d2\13\7\3\7\3\7\7\7\u00d6\n\7\f\7\16\7\u00d9"+
		"\13\7\5\7\u00db\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e3\n\b\3\t\3\t\3\t"+
		"\5\t\u00e8\n\t\3\n\3\n\3\n\7\n\u00ed\n\n\f\n\16\n\u00f0\13\n\3\13\3\13"+
		"\3\13\7\13\u00f5\n\13\f\13\16\13\u00f8\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010a\n\f\f\f\16\f\u010d\13"+
		"\f\5\f\u010f\n\f\3\f\5\f\u0112\n\f\3\r\3\r\3\r\3\r\5\r\u0118\n\r\3\r\7"+
		"\r\u011b\n\r\f\r\16\r\u011e\13\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\6\4\2\13\f\22\25\3\2\30\31\3\2\32\34\3\2\35\36\2\u0146"+
		"\2\"\3\2\2\2\4$\3\2\2\2\6\60\3\2\2\2\bJ\3\2\2\2\n\u00c9\3\2\2\2\f\u00cb"+
		"\3\2\2\2\16\u00e2\3\2\2\2\20\u00e4\3\2\2\2\22\u00e9\3\2\2\2\24\u00f1\3"+
		"\2\2\2\26\u0111\3\2\2\2\30\u0117\3\2\2\2\32\34\5\6\4\2\33\32\3\2\2\2\34"+
		"\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 #\5"+
		"\30\r\2!#\7\2\2\3\"\35\3\2\2\2\"!\3\2\2\2#\3\3\2\2\2$%\7\66\2\2%&\7\5"+
		"\2\2&-\7\4\2\2\'(\7\6\2\2()\7\66\2\2)*\7\5\2\2*,\7\4\2\2+\'\3\2\2\2,/"+
		"\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\5\3\2\2\2/-\3\2\2\2\60\61\7\37\2\2\61\62"+
		"\7\65\2\2\62\63\7\5\2\2\63\64\7\4\2\2\64\66\7\t\2\2\65\67\5\4\3\2\66\65"+
		"\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28=\7\n\2\29:\7 \2\2:;\5\4\3\2;<\7\7"+
		"\2\2<>\3\2\2\2=9\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\5\b\5\2@\7\3\2\2\2AC\7"+
		"\26\2\2BD\5\n\6\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH"+
		"\7\27\2\2HK\3\2\2\2IK\5\n\6\2JA\3\2\2\2JI\3\2\2\2K\t\3\2\2\2LM\7!\2\2"+
		"MN\5\f\7\2NO\7\7\2\2O\u00ca\3\2\2\2PQ\7\"\2\2QR\7\66\2\2R\u00ca\7\7\2"+
		"\2ST\7#\2\2TU\7\t\2\2UV\5\f\7\2VW\7\n\2\2WX\7$\2\2XY\5\b\5\2Y\u00ca\3"+
		"\2\2\2Z[\7%\2\2[\\\7\t\2\2\\]\5\f\7\2]^\7\n\2\2^_\7$\2\2_`\5\b\5\2`a\7"+
		"&\2\2ab\5\b\5\2b\u00ca\3\2\2\2cd\7\'\2\2de\7\t\2\2ef\5\f\7\2fg\7\n\2\2"+
		"gh\7$\2\2hi\5\b\5\2i\u00ca\3\2\2\2jk\7(\2\2kl\7\t\2\2lm\5\f\7\2mn\7\n"+
		"\2\2no\7$\2\2op\5\b\5\2p\u00ca\3\2\2\2qr\7)\2\2rs\5\f\7\2st\7\7\2\2t\u00ca"+
		"\3\2\2\2uv\7*\2\2vw\7\t\2\2wx\5\f\7\2xy\7\n\2\2yz\7$\2\2z{\5\b\5\2{\u00ca"+
		"\3\2\2\2|}\7+\2\2}\u00ca\5\b\5\2~\177\7$\2\2\177\u0080\5\b\5\2\u0080\u0081"+
		"\7(\2\2\u0081\u0082\7\t\2\2\u0082\u0083\5\f\7\2\u0083\u0084\7\n\2\2\u0084"+
		"\u00ca\3\2\2\2\u0085\u0086\7$\2\2\u0086\u0087\5\b\5\2\u0087\u0088\7*\2"+
		"\2\u0088\u0089\7\t\2\2\u0089\u008a\5\f\7\2\u008a\u008b\7\n\2\2\u008b\u00ca"+
		"\3\2\2\2\u008c\u008d\7,\2\2\u008d\u008e\7\64\2\2\u008e\u008f\7\5\2\2\u008f"+
		"\u00ca\5\b\5\2\u0090\u0091\7-\2\2\u0091\u0092\7\t\2\2\u0092\u0093\5\f"+
		"\7\2\u0093\u0094\7\7\2\2\u0094\u0095\5\f\7\2\u0095\u0096\7\7\2\2\u0096"+
		"\u0097\5\f\7\2\u0097\u0098\7\n\2\2\u0098\u0099\7$\2\2\u0099\u009a\5\b"+
		"\5\2\u009a\u00ca\3\2\2\2\u009b\u009c\7/\2\2\u009c\u00ca\7\7\2\2\u009d"+
		"\u009e\7\60\2\2\u009e\u00ca\7\7\2\2\u009f\u00a0\7\66\2\2\u00a0\u00a1\7"+
		"\b\2\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7\7\2\2\u00a3\u00ca\3\2\2\2\u00a4"+
		"\u00a5\7\66\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a7\5\f\7\2\u00a7\u00a8\7"+
		"\7\2\2\u00a8\u00ca\3\2\2\2\u00a9\u00aa\7\66\2\2\u00aa\u00ab\7\16\2\2\u00ab"+
		"\u00ac\5\f\7\2\u00ac\u00ad\7\7\2\2\u00ad\u00ca\3\2\2\2\u00ae\u00af\7\66"+
		"\2\2\u00af\u00b0\7\17\2\2\u00b0\u00b1\5\f\7\2\u00b1\u00b2\7\7\2\2\u00b2"+
		"\u00ca\3\2\2\2\u00b3\u00b4\7\66\2\2\u00b4\u00b5\7\20\2\2\u00b5\u00b6\5"+
		"\f\7\2\u00b6\u00b7\7\7\2\2\u00b7\u00ca\3\2\2\2\u00b8\u00b9\7\66\2\2\u00b9"+
		"\u00ba\7\21\2\2\u00ba\u00bb\5\f\7\2\u00bb\u00bc\7\7\2\2\u00bc\u00ca\3"+
		"\2\2\2\u00bd\u00be\7\66\2\2\u00be\u00bf\7\35\2\2\u00bf\u00ca\7\7\2\2\u00c0"+
		"\u00c1\7\66\2\2\u00c1\u00c2\7\36\2\2\u00c2\u00ca\7\7\2\2\u00c3\u00c4\7"+
		"\36\2\2\u00c4\u00c5\7\66\2\2\u00c5\u00ca\7\7\2\2\u00c6\u00c7\7\35\2\2"+
		"\u00c7\u00c8\7\66\2\2\u00c8\u00ca\7\7\2\2\u00c9L\3\2\2\2\u00c9P\3\2\2"+
		"\2\u00c9S\3\2\2\2\u00c9Z\3\2\2\2\u00c9c\3\2\2\2\u00c9j\3\2\2\2\u00c9q"+
		"\3\2\2\2\u00c9u\3\2\2\2\u00c9|\3\2\2\2\u00c9~\3\2\2\2\u00c9\u0085\3\2"+
		"\2\2\u00c9\u008c\3\2\2\2\u00c9\u0090\3\2\2\2\u00c9\u009b\3\2\2\2\u00c9"+
		"\u009d\3\2\2\2\u00c9\u009f\3\2\2\2\u00c9\u00a4\3\2\2\2\u00c9\u00a9\3\2"+
		"\2\2\u00c9\u00ae\3\2\2\2\u00c9\u00b3\3\2\2\2\u00c9\u00b8\3\2\2\2\u00c9"+
		"\u00bd\3\2\2\2\u00c9\u00c0\3\2\2\2\u00c9\u00c3\3\2\2\2\u00c9\u00c6\3\2"+
		"\2\2\u00ca\13\3\2\2\2\u00cb\u00da\5\16\b\2\u00cc\u00cd\7\61\2\2\u00cd"+
		"\u00cf\5\16\b\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00db\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3"+
		"\u00d4\7\62\2\2\u00d4\u00d6\5\16\b\2\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00d0\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\r\3\2\2\2\u00dc\u00dd\7\63\2\2\u00dd\u00de\7\t\2\2\u00de\u00df"+
		"\5\f\7\2\u00df\u00e0\7\n\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00e3\5\20\t\2"+
		"\u00e2\u00dc\3\2\2\2\u00e2\u00e1\3\2\2\2\u00e3\17\3\2\2\2\u00e4\u00e7"+
		"\5\22\n\2\u00e5\u00e6\t\2\2\2\u00e6\u00e8\5\22\n\2\u00e7\u00e5\3\2\2\2"+
		"\u00e7\u00e8\3\2\2\2\u00e8\21\3\2\2\2\u00e9\u00ee\5\24\13\2\u00ea\u00eb"+
		"\t\3\2\2\u00eb\u00ed\5\24\13\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2"+
		"\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\23\3\2\2\2\u00f0\u00ee"+
		"\3\2\2\2\u00f1\u00f6\5\26\f\2\u00f2\u00f3\t\4\2\2\u00f3\u00f5\5\26\f\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7"+
		"\3\2\2\2\u00f7\25\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u0112\7\64\2\2\u00fa"+
		"\u0112\7\3\2\2\u00fb\u00fc\7\66\2\2\u00fc\u0112\t\5\2\2\u00fd\u00fe\t"+
		"\5\2\2\u00fe\u0112\7\66\2\2\u00ff\u0112\7\66\2\2\u0100\u0101\7\t\2\2\u0101"+
		"\u0102\5\f\7\2\u0102\u0103\7\n\2\2\u0103\u0112\3\2\2\2\u0104\u0105\7\65"+
		"\2\2\u0105\u010e\7\t\2\2\u0106\u010b\5\f\7\2\u0107\u0108\7\6\2\2\u0108"+
		"\u010a\5\f\7\2\u0109\u0107\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u0109\3\2"+
		"\2\2\u010b\u010c\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010e"+
		"\u0106\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\7\n"+
		"\2\2\u0111\u00f9\3\2\2\2\u0111\u00fa\3\2\2\2\u0111\u00fb\3\2\2\2\u0111"+
		"\u00fd\3\2\2\2\u0111\u00ff\3\2\2\2\u0111\u0100\3\2\2\2\u0111\u0104\3\2"+
		"\2\2\u0112\27\3\2\2\2\u0113\u0114\7 \2\2\u0114\u0115\5\4\3\2\u0115\u0116"+
		"\7\7\2\2\u0116\u0118\3\2\2\2\u0117\u0113\3\2\2\2\u0117\u0118\3\2\2\2\u0118"+
		"\u011c\3\2\2\2\u0119\u011b\5\n\6\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2"+
		"\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011f\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011f\u0120\7.\2\2\u0120\31\3\2\2\2\26\35\"-\66=EJ\u00c9"+
		"\u00d0\u00d7\u00da\u00e2\u00e7\u00ee\u00f6\u010b\u010e\u0111\u0117\u011c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}