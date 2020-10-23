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
		T__0=1, T__1=2, T__2=3, T__3=4, TK_DOSPUNTOS=5, TK_COMA=6, TK_PUNTOYCOMA=7, 
		TK_ASIGNACION=8, TK_PAR_IZQ=9, TK_PAR_DER=10, TK_MENOR=11, TK_MENOR_IGUAL=12, 
		TK_SUM_ASIG=13, TK_RES_ASIG=14, TK_MUL_ASIG=15, TK_DIV_ASIG=16, TK_MOD_ASIG=17, 
		TK_DIFERENTE=18, TK_IGUALDAD=19, TK_MAYOR=20, TK_MAYOR_IGUAL=21, TK_LLAVE_IZQ=22, 
		TK_LLAVE_DER=23, TK_MAS=24, TK_MENOS=25, TK_MUL=26, TK_DIV=27, TK_MOD=28, 
		TK_INCREMENTO=29, TK_DECREMENTO=30, FUNCTION=31, VAR=32, PRINT=33, INPUT=34, 
		WHEN=35, DO=36, IF=37, ELSE=38, UNLESS=39, WHILE=40, RETURN=41, UNTIL=42, 
		LOOP=43, REPEAT=44, FOR=45, END=46, NEXT=47, BREAK=48, AND=49, OR=50, 
		NOT=51, NUM=52, FID=53, ID=54, WS=55, COMMENT=56;
	public static final int
		RULE_prog = 0, RULE_varDecl = 1, RULE_fndeclList = 2, RULE_stmtBlock = 3, 
		RULE_stmt = 4, RULE_lexpr = 5, RULE_nexpr = 6, RULE_rexpr = 7, RULE_simpleExpr = 8, 
		RULE_term = 9, RULE_factor = 10, RULE_mainProg = 11, RULE_bool = 12, RULE_datatype = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "varDecl", "fndeclList", "stmtBlock", "stmt", "lexpr", "nexpr", 
			"rexpr", "simpleExpr", "term", "factor", "mainProg", "bool", "datatype"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'num'", "'bool'", "':'", "','", "';'", "':='", 
			"'('", "')'", "'<'", "'<='", "'+='", "'-='", "'*='", "'/='", "'%='", 
			"'!='", "'=='", "'>'", "'>='", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'++'", "'--'", "'function'", "'var'", "'print'", "'input'", "'when'", 
			"'do'", "'if'", "'else'", "'unless'", "'while'", "'return'", "'until'", 
			"'loop'", "'repeat'", "'for'", "'end'", "'next'", "'break'", "'and'", 
			"'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "TK_DOSPUNTOS", "TK_COMA", "TK_PUNTOYCOMA", 
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
			setState(36);
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
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION) {
					{
					{
					setState(28);
					fndeclList();
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(34);
				mainProg();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
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
		public List<DatatypeContext> datatype() {
			return getRuleContexts(DatatypeContext.class);
		}
		public DatatypeContext datatype(int i) {
			return getRuleContext(DatatypeContext.class,i);
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
			setState(38);
			match(ID);
			setState(39);
			match(TK_DOSPUNTOS);
			setState(40);
			datatype();
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(41);
				match(TK_COMA);
				setState(42);
				match(ID);
				setState(43);
				match(TK_DOSPUNTOS);
				setState(44);
				datatype();
				}
				}
				setState(49);
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
		public DatatypeContext datatype() {
			return getRuleContext(DatatypeContext.class,0);
		}
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
			setState(50);
			match(FUNCTION);
			setState(51);
			match(FID);
			setState(52);
			match(TK_DOSPUNTOS);
			setState(53);
			datatype();
			setState(54);
			match(TK_PAR_IZQ);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(55);
				varDecl();
				}
			}

			setState(58);
			match(TK_PAR_DER);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(59);
				match(VAR);
				setState(60);
				varDecl();
				setState(61);
				match(TK_PUNTOYCOMA);
				}
			}

			setState(65);
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
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LLAVE_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(TK_LLAVE_IZQ);
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68);
					stmt();
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << PRINT) | (1L << INPUT) | (1L << WHEN) | (1L << DO) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << RETURN) | (1L << UNTIL) | (1L << LOOP) | (1L << REPEAT) | (1L << FOR) | (1L << NEXT) | (1L << BREAK) | (1L << ID))) != 0) );
				setState(73);
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
				setState(75);
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
			setState(203);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(PRINT);
				setState(79);
				lexpr();
				setState(80);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(INPUT);
				setState(83);
				match(ID);
				setState(84);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				match(WHEN);
				setState(86);
				match(TK_PAR_IZQ);
				setState(87);
				lexpr();
				setState(88);
				match(TK_PAR_DER);
				setState(89);
				match(DO);
				setState(90);
				stmtBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(IF);
				setState(93);
				match(TK_PAR_IZQ);
				setState(94);
				lexpr();
				setState(95);
				match(TK_PAR_DER);
				setState(96);
				match(DO);
				setState(97);
				stmtBlock();
				setState(98);
				match(ELSE);
				setState(99);
				stmtBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(101);
				match(UNLESS);
				setState(102);
				match(TK_PAR_IZQ);
				setState(103);
				lexpr();
				setState(104);
				match(TK_PAR_DER);
				setState(105);
				match(DO);
				setState(106);
				stmtBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(108);
				match(WHILE);
				setState(109);
				match(TK_PAR_IZQ);
				setState(110);
				lexpr();
				setState(111);
				match(TK_PAR_DER);
				setState(112);
				match(DO);
				setState(113);
				stmtBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(115);
				match(RETURN);
				setState(116);
				lexpr();
				setState(117);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				match(UNTIL);
				setState(120);
				match(TK_PAR_IZQ);
				setState(121);
				lexpr();
				setState(122);
				match(TK_PAR_DER);
				setState(123);
				match(DO);
				setState(124);
				stmtBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(126);
				match(LOOP);
				setState(127);
				stmtBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(128);
				match(DO);
				setState(129);
				stmtBlock();
				setState(130);
				match(WHILE);
				setState(131);
				match(TK_PAR_IZQ);
				setState(132);
				lexpr();
				setState(133);
				match(TK_PAR_DER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(135);
				match(DO);
				setState(136);
				stmtBlock();
				setState(137);
				match(UNTIL);
				setState(138);
				match(TK_PAR_IZQ);
				setState(139);
				lexpr();
				setState(140);
				match(TK_PAR_DER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(142);
				match(REPEAT);
				setState(143);
				match(NUM);
				setState(144);
				match(TK_DOSPUNTOS);
				setState(145);
				stmtBlock();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(146);
				match(FOR);
				setState(147);
				match(TK_PAR_IZQ);
				setState(148);
				lexpr();
				setState(149);
				match(TK_PUNTOYCOMA);
				setState(150);
				lexpr();
				setState(151);
				match(TK_PUNTOYCOMA);
				setState(152);
				lexpr();
				setState(153);
				match(TK_PAR_DER);
				setState(154);
				match(DO);
				setState(155);
				stmtBlock();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(157);
				match(NEXT);
				setState(158);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(159);
				match(BREAK);
				setState(160);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(161);
				match(ID);
				setState(162);
				match(TK_ASIGNACION);
				setState(163);
				lexpr();
				setState(164);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(166);
				match(ID);
				setState(167);
				match(TK_SUM_ASIG);
				setState(168);
				lexpr();
				setState(169);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(171);
				match(ID);
				setState(172);
				match(TK_RES_ASIG);
				setState(173);
				lexpr();
				setState(174);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(176);
				match(ID);
				setState(177);
				match(TK_MUL_ASIG);
				setState(178);
				lexpr();
				setState(179);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(181);
				match(ID);
				setState(182);
				match(TK_DIV_ASIG);
				setState(183);
				lexpr();
				setState(184);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(186);
				match(ID);
				setState(187);
				match(TK_MOD_ASIG);
				setState(188);
				lexpr();
				setState(189);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(191);
				match(ID);
				setState(192);
				match(TK_INCREMENTO);
				setState(193);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(194);
				match(ID);
				setState(195);
				match(TK_DECREMENTO);
				setState(196);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(197);
				match(TK_DECREMENTO);
				setState(198);
				match(ID);
				setState(199);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(200);
				match(TK_INCREMENTO);
				setState(201);
				match(ID);
				setState(202);
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
			setState(205);
			nexpr();
			setState(220);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(206);
					match(AND);
					setState(207);
					nexpr();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(217);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(213);
					match(OR);
					setState(214);
					nexpr();
					}
					}
					setState(219);
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
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(NOT);
				setState(223);
				match(TK_PAR_IZQ);
				setState(224);
				lexpr();
				setState(225);
				match(TK_PAR_DER);
				}
				break;
			case T__0:
			case T__1:
			case TK_PAR_IZQ:
			case TK_INCREMENTO:
			case TK_DECREMENTO:
			case NUM:
			case FID:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
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
			setState(230);
			simpleExpr();
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_DIFERENTE) | (1L << TK_IGUALDAD) | (1L << TK_MAYOR) | (1L << TK_MAYOR_IGUAL))) != 0)) {
				{
				setState(231);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_DIFERENTE) | (1L << TK_IGUALDAD) | (1L << TK_MAYOR) | (1L << TK_MAYOR_IGUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(232);
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
			setState(235);
			term();
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_MAS || _la==TK_MENOS) {
				{
				{
				setState(236);
				_la = _input.LA(1);
				if ( !(_la==TK_MAS || _la==TK_MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(237);
				term();
				}
				}
				setState(242);
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
			setState(243);
			factor();
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) {
				{
				{
				setState(244);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(245);
				factor();
				}
				}
				setState(250);
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
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
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
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(252);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(253);
				match(ID);
				setState(254);
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
				setState(255);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(256);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				match(TK_PAR_IZQ);
				setState(259);
				lexpr();
				setState(260);
				match(TK_PAR_DER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				match(FID);
				setState(263);
				match(TK_PAR_IZQ);
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << TK_PAR_IZQ) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << NOT) | (1L << NUM) | (1L << FID) | (1L << ID))) != 0)) {
					{
					setState(264);
					lexpr();
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMA) {
						{
						{
						setState(265);
						match(TK_COMA);
						setState(266);
						lexpr();
						}
						}
						setState(271);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(274);
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
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(277);
				match(VAR);
				setState(278);
				varDecl();
				setState(279);
				match(TK_PUNTOYCOMA);
				}
			}

			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << PRINT) | (1L << INPUT) | (1L << WHEN) | (1L << DO) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << RETURN) | (1L << UNTIL) | (1L << LOOP) | (1L << REPEAT) | (1L << FOR) | (1L << NEXT) | (1L << BREAK) | (1L << ID))) != 0)) {
				{
				{
				setState(283);
				stmt();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
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

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class DatatypeContext extends ParserRuleContext {
		public DatatypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datatype; }
	}

	public final DatatypeContext datatype() throws RecognitionException {
		DatatypeContext _localctx = new DatatypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_datatype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u012a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\2\3\2\5\2\'\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\60\n\3\f\3\16\3\63\13"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\3\4\3\4\5\4B\n\4\3\4\3"+
		"\4\3\5\3\5\6\5H\n\5\r\5\16\5I\3\5\3\5\3\5\5\5O\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00ce"+
		"\n\6\3\7\3\7\3\7\7\7\u00d3\n\7\f\7\16\7\u00d6\13\7\3\7\3\7\7\7\u00da\n"+
		"\7\f\7\16\7\u00dd\13\7\5\7\u00df\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e7"+
		"\n\b\3\t\3\t\3\t\5\t\u00ec\n\t\3\n\3\n\3\n\7\n\u00f1\n\n\f\n\16\n\u00f4"+
		"\13\n\3\13\3\13\3\13\7\13\u00f9\n\13\f\13\16\13\u00fc\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010e\n\f\f"+
		"\f\16\f\u0111\13\f\5\f\u0113\n\f\3\f\5\f\u0116\n\f\3\r\3\r\3\r\3\r\5\r"+
		"\u011c\n\r\3\r\7\r\u011f\n\r\f\r\16\r\u0122\13\r\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\b\4\2\r\16\24"+
		"\27\3\2\32\33\3\2\34\36\3\2\37 \3\2\3\4\3\2\5\6\2\u014c\2&\3\2\2\2\4("+
		"\3\2\2\2\6\64\3\2\2\2\bN\3\2\2\2\n\u00cd\3\2\2\2\f\u00cf\3\2\2\2\16\u00e6"+
		"\3\2\2\2\20\u00e8\3\2\2\2\22\u00ed\3\2\2\2\24\u00f5\3\2\2\2\26\u0115\3"+
		"\2\2\2\30\u011b\3\2\2\2\32\u0125\3\2\2\2\34\u0127\3\2\2\2\36 \5\6\4\2"+
		"\37\36\3\2\2\2 #\3\2\2\2!\37\3\2\2\2!\"\3\2\2\2\"$\3\2\2\2#!\3\2\2\2$"+
		"\'\5\30\r\2%\'\7\2\2\3&!\3\2\2\2&%\3\2\2\2\'\3\3\2\2\2()\78\2\2)*\7\7"+
		"\2\2*\61\5\34\17\2+,\7\b\2\2,-\78\2\2-.\7\7\2\2.\60\5\34\17\2/+\3\2\2"+
		"\2\60\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\5\3\2\2\2\63\61\3\2\2\2"+
		"\64\65\7!\2\2\65\66\7\67\2\2\66\67\7\7\2\2\678\5\34\17\28:\7\13\2\29;"+
		"\5\4\3\2:9\3\2\2\2:;\3\2\2\2;<\3\2\2\2<A\7\f\2\2=>\7\"\2\2>?\5\4\3\2?"+
		"@\7\t\2\2@B\3\2\2\2A=\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\5\b\5\2D\7\3\2\2\2"+
		"EG\7\30\2\2FH\5\n\6\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2"+
		"\2KL\7\31\2\2LO\3\2\2\2MO\5\n\6\2NE\3\2\2\2NM\3\2\2\2O\t\3\2\2\2PQ\7#"+
		"\2\2QR\5\f\7\2RS\7\t\2\2S\u00ce\3\2\2\2TU\7$\2\2UV\78\2\2V\u00ce\7\t\2"+
		"\2WX\7%\2\2XY\7\13\2\2YZ\5\f\7\2Z[\7\f\2\2[\\\7&\2\2\\]\5\b\5\2]\u00ce"+
		"\3\2\2\2^_\7\'\2\2_`\7\13\2\2`a\5\f\7\2ab\7\f\2\2bc\7&\2\2cd\5\b\5\2d"+
		"e\7(\2\2ef\5\b\5\2f\u00ce\3\2\2\2gh\7)\2\2hi\7\13\2\2ij\5\f\7\2jk\7\f"+
		"\2\2kl\7&\2\2lm\5\b\5\2m\u00ce\3\2\2\2no\7*\2\2op\7\13\2\2pq\5\f\7\2q"+
		"r\7\f\2\2rs\7&\2\2st\5\b\5\2t\u00ce\3\2\2\2uv\7+\2\2vw\5\f\7\2wx\7\t\2"+
		"\2x\u00ce\3\2\2\2yz\7,\2\2z{\7\13\2\2{|\5\f\7\2|}\7\f\2\2}~\7&\2\2~\177"+
		"\5\b\5\2\177\u00ce\3\2\2\2\u0080\u0081\7-\2\2\u0081\u00ce\5\b\5\2\u0082"+
		"\u0083\7&\2\2\u0083\u0084\5\b\5\2\u0084\u0085\7*\2\2\u0085\u0086\7\13"+
		"\2\2\u0086\u0087\5\f\7\2\u0087\u0088\7\f\2\2\u0088\u00ce\3\2\2\2\u0089"+
		"\u008a\7&\2\2\u008a\u008b\5\b\5\2\u008b\u008c\7,\2\2\u008c\u008d\7\13"+
		"\2\2\u008d\u008e\5\f\7\2\u008e\u008f\7\f\2\2\u008f\u00ce\3\2\2\2\u0090"+
		"\u0091\7.\2\2\u0091\u0092\7\66\2\2\u0092\u0093\7\7\2\2\u0093\u00ce\5\b"+
		"\5\2\u0094\u0095\7/\2\2\u0095\u0096\7\13\2\2\u0096\u0097\5\f\7\2\u0097"+
		"\u0098\7\t\2\2\u0098\u0099\5\f\7\2\u0099\u009a\7\t\2\2\u009a\u009b\5\f"+
		"\7\2\u009b\u009c\7\f\2\2\u009c\u009d\7&\2\2\u009d\u009e\5\b\5\2\u009e"+
		"\u00ce\3\2\2\2\u009f\u00a0\7\61\2\2\u00a0\u00ce\7\t\2\2\u00a1\u00a2\7"+
		"\62\2\2\u00a2\u00ce\7\t\2\2\u00a3\u00a4\78\2\2\u00a4\u00a5\7\n\2\2\u00a5"+
		"\u00a6\5\f\7\2\u00a6\u00a7\7\t\2\2\u00a7\u00ce\3\2\2\2\u00a8\u00a9\78"+
		"\2\2\u00a9\u00aa\7\17\2\2\u00aa\u00ab\5\f\7\2\u00ab\u00ac\7\t\2\2\u00ac"+
		"\u00ce\3\2\2\2\u00ad\u00ae\78\2\2\u00ae\u00af\7\20\2\2\u00af\u00b0\5\f"+
		"\7\2\u00b0\u00b1\7\t\2\2\u00b1\u00ce\3\2\2\2\u00b2\u00b3\78\2\2\u00b3"+
		"\u00b4\7\21\2\2\u00b4\u00b5\5\f\7\2\u00b5\u00b6\7\t\2\2\u00b6\u00ce\3"+
		"\2\2\2\u00b7\u00b8\78\2\2\u00b8\u00b9\7\22\2\2\u00b9\u00ba\5\f\7\2\u00ba"+
		"\u00bb\7\t\2\2\u00bb\u00ce\3\2\2\2\u00bc\u00bd\78\2\2\u00bd\u00be\7\23"+
		"\2\2\u00be\u00bf\5\f\7\2\u00bf\u00c0\7\t\2\2\u00c0\u00ce\3\2\2\2\u00c1"+
		"\u00c2\78\2\2\u00c2\u00c3\7\37\2\2\u00c3\u00ce\7\t\2\2\u00c4\u00c5\78"+
		"\2\2\u00c5\u00c6\7 \2\2\u00c6\u00ce\7\t\2\2\u00c7\u00c8\7 \2\2\u00c8\u00c9"+
		"\78\2\2\u00c9\u00ce\7\t\2\2\u00ca\u00cb\7\37\2\2\u00cb\u00cc\78\2\2\u00cc"+
		"\u00ce\7\t\2\2\u00cdP\3\2\2\2\u00cdT\3\2\2\2\u00cdW\3\2\2\2\u00cd^\3\2"+
		"\2\2\u00cdg\3\2\2\2\u00cdn\3\2\2\2\u00cdu\3\2\2\2\u00cdy\3\2\2\2\u00cd"+
		"\u0080\3\2\2\2\u00cd\u0082\3\2\2\2\u00cd\u0089\3\2\2\2\u00cd\u0090\3\2"+
		"\2\2\u00cd\u0094\3\2\2\2\u00cd\u009f\3\2\2\2\u00cd\u00a1\3\2\2\2\u00cd"+
		"\u00a3\3\2\2\2\u00cd\u00a8\3\2\2\2\u00cd\u00ad\3\2\2\2\u00cd\u00b2\3\2"+
		"\2\2\u00cd\u00b7\3\2\2\2\u00cd\u00bc\3\2\2\2\u00cd\u00c1\3\2\2\2\u00cd"+
		"\u00c4\3\2\2\2\u00cd\u00c7\3\2\2\2\u00cd\u00ca\3\2\2\2\u00ce\13\3\2\2"+
		"\2\u00cf\u00de\5\16\b\2\u00d0\u00d1\7\63\2\2\u00d1\u00d3\5\16\b\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00df\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\64\2\2\u00d8"+
		"\u00da\5\16\b\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3"+
		"\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00d4\3\2\2\2\u00de\u00db\3\2\2\2\u00de\u00df\3\2\2\2\u00df\r\3\2\2\2"+
		"\u00e0\u00e1\7\65\2\2\u00e1\u00e2\7\13\2\2\u00e2\u00e3\5\f\7\2\u00e3\u00e4"+
		"\7\f\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e7\5\20\t\2\u00e6\u00e0\3\2\2\2"+
		"\u00e6\u00e5\3\2\2\2\u00e7\17\3\2\2\2\u00e8\u00eb\5\22\n\2\u00e9\u00ea"+
		"\t\2\2\2\u00ea\u00ec\5\22\n\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2"+
		"\u00ec\21\3\2\2\2\u00ed\u00f2\5\24\13\2\u00ee\u00ef\t\3\2\2\u00ef\u00f1"+
		"\5\24\13\2\u00f0\u00ee\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2"+
		"\u00f2\u00f3\3\2\2\2\u00f3\23\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00fa"+
		"\5\26\f\2\u00f6\u00f7\t\4\2\2\u00f7\u00f9\5\26\f\2\u00f8\u00f6\3\2\2\2"+
		"\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\25"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u0116\7\66\2\2\u00fe\u0116\5\32\16"+
		"\2\u00ff\u0100\78\2\2\u0100\u0116\t\5\2\2\u0101\u0102\t\5\2\2\u0102\u0116"+
		"\78\2\2\u0103\u0116\78\2\2\u0104\u0105\7\13\2\2\u0105\u0106\5\f\7\2\u0106"+
		"\u0107\7\f\2\2\u0107\u0116\3\2\2\2\u0108\u0109\7\67\2\2\u0109\u0112\7"+
		"\13\2\2\u010a\u010f\5\f\7\2\u010b\u010c\7\b\2\2\u010c\u010e\5\f\7\2\u010d"+
		"\u010b\3\2\2\2\u010e\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2"+
		"\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u010a\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0116\7\f\2\2\u0115\u00fd\3\2"+
		"\2\2\u0115\u00fe\3\2\2\2\u0115\u00ff\3\2\2\2\u0115\u0101\3\2\2\2\u0115"+
		"\u0103\3\2\2\2\u0115\u0104\3\2\2\2\u0115\u0108\3\2\2\2\u0116\27\3\2\2"+
		"\2\u0117\u0118\7\"\2\2\u0118\u0119\5\4\3\2\u0119\u011a\7\t\2\2\u011a\u011c"+
		"\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0120\3\2\2\2\u011d"+
		"\u011f\5\n\6\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123"+
		"\u0124\7\60\2\2\u0124\31\3\2\2\2\u0125\u0126\t\6\2\2\u0126\33\3\2\2\2"+
		"\u0127\u0128\t\7\2\2\u0128\35\3\2\2\2\26!&\61:AIN\u00cd\u00d4\u00db\u00de"+
		"\u00e6\u00eb\u00f2\u00fa\u010f\u0112\u0115\u011b\u0120";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}