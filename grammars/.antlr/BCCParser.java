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
		T__0=1, T__1=2, DATATYPE=3, TK_DOSPUNTOS=4, TK_COMA=5, TK_PUNTOYCOMA=6, 
		TK_ASIGNACION=7, TK_PAR_IZQ=8, TK_PAR_DER=9, TK_MENOR=10, TK_MENOR_IGUAL=11, 
		TK_SUM_ASIG=12, TK_RES_ASIG=13, TK_MUL_ASIG=14, TK_DIV_ASIG=15, TK_MOD_ASIG=16, 
		TK_DIFERENTE=17, TK_IGUALDAD=18, TK_MAYOR=19, TK_MAYOR_IGUAL=20, TK_LLAVE_IZQ=21, 
		TK_LLAVE_DER=22, TK_MAS=23, TK_MENOS=24, TK_MUL=25, TK_DIV=26, TK_MOD=27, 
		TK_INCREMENTO=28, TK_DECREMENTO=29, FUNCTION=30, VAR=31, PRINT=32, INPUT=33, 
		WHEN=34, DO=35, IF=36, ELSE=37, UNLESS=38, WHILE=39, RETURN=40, UNTIL=41, 
		LOOP=42, REPEAT=43, FOR=44, END=45, NEXT=46, BREAK=47, AND=48, OR=49, 
		NOT=50, NUM=51, FID=52, ID=53, WS=54, COMMENT=55;
	public static final int
		RULE_prog = 0, RULE_varDecl = 1, RULE_fndeclList = 2, RULE_stmtBlock = 3, 
		RULE_stmt = 4, RULE_lexpr = 5, RULE_nexpr = 6, RULE_rexpr = 7, RULE_simpleExpr = 8, 
		RULE_term = 9, RULE_factor = 10, RULE_mainProg = 11, RULE_bool = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "varDecl", "fndeclList", "stmtBlock", "stmt", "lexpr", "nexpr", 
			"rexpr", "simpleExpr", "term", "factor", "mainProg", "bool"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", null, "':'", "','", "';'", "':='", "'('", 
			"')'", "'<'", "'<='", "'+='", "'-='", "'*='", "'/='", "'%='", "'!='", 
			"'=='", "'>'", "'>='", "'{'", "'}'", "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'++'", "'--'", "'function'", "'var'", "'print'", "'input'", "'when'", 
			"'do'", "'if'", "'else'", "'unless'", "'while'", "'return'", "'until'", 
			"'loop'", "'repeat'", "'for'", "'end'", "'next'", "'break'", "'and'", 
			"'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "DATATYPE", "TK_DOSPUNTOS", "TK_COMA", "TK_PUNTOYCOMA", 
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
			setState(34);
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
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FUNCTION) {
					{
					{
					setState(26);
					fndeclList();
					}
					}
					setState(31);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(32);
				mainProg();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
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
			setState(36);
			match(ID);
			setState(37);
			match(TK_DOSPUNTOS);
			setState(38);
			match(DATATYPE);
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_COMA) {
				{
				{
				setState(39);
				match(TK_COMA);
				setState(40);
				match(ID);
				setState(41);
				match(TK_DOSPUNTOS);
				setState(42);
				match(DATATYPE);
				}
				}
				setState(47);
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
			setState(48);
			match(FUNCTION);
			setState(49);
			match(FID);
			setState(50);
			match(TK_DOSPUNTOS);
			setState(51);
			match(DATATYPE);
			setState(52);
			match(TK_PAR_IZQ);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(53);
				varDecl();
				}
			}

			setState(56);
			match(TK_PAR_DER);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(57);
				match(VAR);
				setState(58);
				varDecl();
				setState(59);
				match(TK_PUNTOYCOMA);
				}
			}

			setState(63);
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
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TK_LLAVE_IZQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(TK_LLAVE_IZQ);
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66);
					stmt();
					}
					}
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << PRINT) | (1L << INPUT) | (1L << WHEN) | (1L << DO) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << RETURN) | (1L << UNTIL) | (1L << LOOP) | (1L << REPEAT) | (1L << FOR) | (1L << NEXT) | (1L << BREAK) | (1L << ID))) != 0) );
				setState(71);
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
				setState(73);
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
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(PRINT);
				setState(77);
				lexpr();
				setState(78);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(INPUT);
				setState(81);
				match(ID);
				setState(82);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				match(WHEN);
				setState(84);
				match(TK_PAR_IZQ);
				setState(85);
				lexpr();
				setState(86);
				match(TK_PAR_DER);
				setState(87);
				match(DO);
				setState(88);
				stmtBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				match(IF);
				setState(91);
				match(TK_PAR_IZQ);
				setState(92);
				lexpr();
				setState(93);
				match(TK_PAR_DER);
				setState(94);
				match(DO);
				setState(95);
				stmtBlock();
				setState(96);
				match(ELSE);
				setState(97);
				stmtBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				match(UNLESS);
				setState(100);
				match(TK_PAR_IZQ);
				setState(101);
				lexpr();
				setState(102);
				match(TK_PAR_DER);
				setState(103);
				match(DO);
				setState(104);
				stmtBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				match(WHILE);
				setState(107);
				match(TK_PAR_IZQ);
				setState(108);
				lexpr();
				setState(109);
				match(TK_PAR_DER);
				setState(110);
				match(DO);
				setState(111);
				stmtBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(113);
				match(RETURN);
				setState(114);
				lexpr();
				setState(115);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				match(UNTIL);
				setState(118);
				match(TK_PAR_IZQ);
				setState(119);
				lexpr();
				setState(120);
				match(TK_PAR_DER);
				setState(121);
				match(DO);
				setState(122);
				stmtBlock();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(124);
				match(LOOP);
				setState(125);
				stmtBlock();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(126);
				match(DO);
				setState(127);
				stmtBlock();
				setState(128);
				match(WHILE);
				setState(129);
				match(TK_PAR_IZQ);
				setState(130);
				lexpr();
				setState(131);
				match(TK_PAR_DER);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(133);
				match(DO);
				setState(134);
				stmtBlock();
				setState(135);
				match(UNTIL);
				setState(136);
				match(TK_PAR_IZQ);
				setState(137);
				lexpr();
				setState(138);
				match(TK_PAR_DER);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(140);
				match(REPEAT);
				setState(141);
				match(NUM);
				setState(142);
				match(TK_DOSPUNTOS);
				setState(143);
				stmtBlock();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(144);
				match(FOR);
				setState(145);
				match(TK_PAR_IZQ);
				setState(146);
				lexpr();
				setState(147);
				match(TK_PUNTOYCOMA);
				setState(148);
				lexpr();
				setState(149);
				match(TK_PUNTOYCOMA);
				setState(150);
				lexpr();
				setState(151);
				match(TK_PAR_DER);
				setState(152);
				match(DO);
				setState(153);
				stmtBlock();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(155);
				match(NEXT);
				setState(156);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(157);
				match(BREAK);
				setState(158);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(159);
				match(ID);
				setState(160);
				match(TK_ASIGNACION);
				setState(161);
				lexpr();
				setState(162);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(164);
				match(ID);
				setState(165);
				match(TK_SUM_ASIG);
				setState(166);
				lexpr();
				setState(167);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(169);
				match(ID);
				setState(170);
				match(TK_RES_ASIG);
				setState(171);
				lexpr();
				setState(172);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(174);
				match(ID);
				setState(175);
				match(TK_MUL_ASIG);
				setState(176);
				lexpr();
				setState(177);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(179);
				match(ID);
				setState(180);
				match(TK_DIV_ASIG);
				setState(181);
				lexpr();
				setState(182);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(184);
				match(ID);
				setState(185);
				match(TK_MOD_ASIG);
				setState(186);
				lexpr();
				setState(187);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(189);
				match(ID);
				setState(190);
				match(TK_INCREMENTO);
				setState(191);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(192);
				match(ID);
				setState(193);
				match(TK_DECREMENTO);
				setState(194);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(195);
				match(TK_DECREMENTO);
				setState(196);
				match(ID);
				setState(197);
				match(TK_PUNTOYCOMA);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(198);
				match(TK_INCREMENTO);
				setState(199);
				match(ID);
				setState(200);
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
			setState(203);
			nexpr();
			setState(218);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(204);
					match(AND);
					setState(205);
					nexpr();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR) {
					{
					{
					setState(211);
					match(OR);
					setState(212);
					nexpr();
					}
					}
					setState(217);
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
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(NOT);
				setState(221);
				match(TK_PAR_IZQ);
				setState(222);
				lexpr();
				setState(223);
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
				setState(225);
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
			setState(228);
			simpleExpr();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_DIFERENTE) | (1L << TK_IGUALDAD) | (1L << TK_MAYOR) | (1L << TK_MAYOR_IGUAL))) != 0)) {
				{
				setState(229);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MENOR) | (1L << TK_MENOR_IGUAL) | (1L << TK_DIFERENTE) | (1L << TK_IGUALDAD) | (1L << TK_MAYOR) | (1L << TK_MAYOR_IGUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(230);
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
			setState(233);
			term();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TK_MAS || _la==TK_MENOS) {
				{
				{
				setState(234);
				_la = _input.LA(1);
				if ( !(_la==TK_MAS || _la==TK_MENOS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(235);
				term();
				}
				}
				setState(240);
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
			setState(241);
			factor();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) {
				{
				{
				setState(242);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_MUL) | (1L << TK_DIV) | (1L << TK_MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(243);
				factor();
				}
				}
				setState(248);
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
			setState(273);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				match(NUM);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				bool();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(ID);
				setState(252);
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
				setState(253);
				_la = _input.LA(1);
				if ( !(_la==TK_INCREMENTO || _la==TK_DECREMENTO) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(254);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(256);
				match(TK_PAR_IZQ);
				setState(257);
				lexpr();
				setState(258);
				match(TK_PAR_DER);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(260);
				match(FID);
				setState(261);
				match(TK_PAR_IZQ);
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << TK_PAR_IZQ) | (1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << NOT) | (1L << NUM) | (1L << FID) | (1L << ID))) != 0)) {
					{
					setState(262);
					lexpr();
					setState(267);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==TK_COMA) {
						{
						{
						setState(263);
						match(TK_COMA);
						setState(264);
						lexpr();
						}
						}
						setState(269);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(272);
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
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(275);
				match(VAR);
				setState(276);
				varDecl();
				setState(277);
				match(TK_PUNTOYCOMA);
				}
			}

			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TK_INCREMENTO) | (1L << TK_DECREMENTO) | (1L << PRINT) | (1L << INPUT) | (1L << WHEN) | (1L << DO) | (1L << IF) | (1L << UNLESS) | (1L << WHILE) | (1L << RETURN) | (1L << UNTIL) | (1L << LOOP) | (1L << REPEAT) | (1L << FOR) | (1L << NEXT) | (1L << BREAK) | (1L << ID))) != 0)) {
				{
				{
				setState(281);
				stmt();
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
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
			setState(289);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\39\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\5"+
		"\2%\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3.\n\3\f\3\16\3\61\13\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\5\3\5"+
		"\6\5F\n\5\r\5\16\5G\3\5\3\5\3\5\5\5M\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u00cc\n\6\3\7\3"+
		"\7\3\7\7\7\u00d1\n\7\f\7\16\7\u00d4\13\7\3\7\3\7\7\7\u00d8\n\7\f\7\16"+
		"\7\u00db\13\7\5\7\u00dd\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e5\n\b\3\t"+
		"\3\t\3\t\5\t\u00ea\n\t\3\n\3\n\3\n\7\n\u00ef\n\n\f\n\16\n\u00f2\13\n\3"+
		"\13\3\13\3\13\7\13\u00f7\n\13\f\13\16\13\u00fa\13\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u010c\n\f\f\f\16\f"+
		"\u010f\13\f\5\f\u0111\n\f\3\f\5\f\u0114\n\f\3\r\3\r\3\r\3\r\5\r\u011a"+
		"\n\r\3\r\7\r\u011d\n\r\f\r\16\r\u0120\13\r\3\r\3\r\3\16\3\16\3\16\2\2"+
		"\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\4\2\f\r\23\26\3\2\31\32\3\2\33"+
		"\35\3\2\36\37\3\2\3\4\2\u0149\2$\3\2\2\2\4&\3\2\2\2\6\62\3\2\2\2\bL\3"+
		"\2\2\2\n\u00cb\3\2\2\2\f\u00cd\3\2\2\2\16\u00e4\3\2\2\2\20\u00e6\3\2\2"+
		"\2\22\u00eb\3\2\2\2\24\u00f3\3\2\2\2\26\u0113\3\2\2\2\30\u0119\3\2\2\2"+
		"\32\u0123\3\2\2\2\34\36\5\6\4\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2"+
		"\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"%\5\30\r\2#%\7\2\2\3$\37\3\2\2"+
		"\2$#\3\2\2\2%\3\3\2\2\2&\'\7\67\2\2\'(\7\6\2\2(/\7\5\2\2)*\7\7\2\2*+\7"+
		"\67\2\2+,\7\6\2\2,.\7\5\2\2-)\3\2\2\2.\61\3\2\2\2/-\3\2\2\2/\60\3\2\2"+
		"\2\60\5\3\2\2\2\61/\3\2\2\2\62\63\7 \2\2\63\64\7\66\2\2\64\65\7\6\2\2"+
		"\65\66\7\5\2\2\668\7\n\2\2\679\5\4\3\28\67\3\2\2\289\3\2\2\29:\3\2\2\2"+
		":?\7\13\2\2;<\7!\2\2<=\5\4\3\2=>\7\b\2\2>@\3\2\2\2?;\3\2\2\2?@\3\2\2\2"+
		"@A\3\2\2\2AB\5\b\5\2B\7\3\2\2\2CE\7\27\2\2DF\5\n\6\2ED\3\2\2\2FG\3\2\2"+
		"\2GE\3\2\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\30\2\2JM\3\2\2\2KM\5\n\6\2LC\3\2"+
		"\2\2LK\3\2\2\2M\t\3\2\2\2NO\7\"\2\2OP\5\f\7\2PQ\7\b\2\2Q\u00cc\3\2\2\2"+
		"RS\7#\2\2ST\7\67\2\2T\u00cc\7\b\2\2UV\7$\2\2VW\7\n\2\2WX\5\f\7\2XY\7\13"+
		"\2\2YZ\7%\2\2Z[\5\b\5\2[\u00cc\3\2\2\2\\]\7&\2\2]^\7\n\2\2^_\5\f\7\2_"+
		"`\7\13\2\2`a\7%\2\2ab\5\b\5\2bc\7\'\2\2cd\5\b\5\2d\u00cc\3\2\2\2ef\7("+
		"\2\2fg\7\n\2\2gh\5\f\7\2hi\7\13\2\2ij\7%\2\2jk\5\b\5\2k\u00cc\3\2\2\2"+
		"lm\7)\2\2mn\7\n\2\2no\5\f\7\2op\7\13\2\2pq\7%\2\2qr\5\b\5\2r\u00cc\3\2"+
		"\2\2st\7*\2\2tu\5\f\7\2uv\7\b\2\2v\u00cc\3\2\2\2wx\7+\2\2xy\7\n\2\2yz"+
		"\5\f\7\2z{\7\13\2\2{|\7%\2\2|}\5\b\5\2}\u00cc\3\2\2\2~\177\7,\2\2\177"+
		"\u00cc\5\b\5\2\u0080\u0081\7%\2\2\u0081\u0082\5\b\5\2\u0082\u0083\7)\2"+
		"\2\u0083\u0084\7\n\2\2\u0084\u0085\5\f\7\2\u0085\u0086\7\13\2\2\u0086"+
		"\u00cc\3\2\2\2\u0087\u0088\7%\2\2\u0088\u0089\5\b\5\2\u0089\u008a\7+\2"+
		"\2\u008a\u008b\7\n\2\2\u008b\u008c\5\f\7\2\u008c\u008d\7\13\2\2\u008d"+
		"\u00cc\3\2\2\2\u008e\u008f\7-\2\2\u008f\u0090\7\65\2\2\u0090\u0091\7\6"+
		"\2\2\u0091\u00cc\5\b\5\2\u0092\u0093\7.\2\2\u0093\u0094\7\n\2\2\u0094"+
		"\u0095\5\f\7\2\u0095\u0096\7\b\2\2\u0096\u0097\5\f\7\2\u0097\u0098\7\b"+
		"\2\2\u0098\u0099\5\f\7\2\u0099\u009a\7\13\2\2\u009a\u009b\7%\2\2\u009b"+
		"\u009c\5\b\5\2\u009c\u00cc\3\2\2\2\u009d\u009e\7\60\2\2\u009e\u00cc\7"+
		"\b\2\2\u009f\u00a0\7\61\2\2\u00a0\u00cc\7\b\2\2\u00a1\u00a2\7\67\2\2\u00a2"+
		"\u00a3\7\t\2\2\u00a3\u00a4\5\f\7\2\u00a4\u00a5\7\b\2\2\u00a5\u00cc\3\2"+
		"\2\2\u00a6\u00a7\7\67\2\2\u00a7\u00a8\7\16\2\2\u00a8\u00a9\5\f\7\2\u00a9"+
		"\u00aa\7\b\2\2\u00aa\u00cc\3\2\2\2\u00ab\u00ac\7\67\2\2\u00ac\u00ad\7"+
		"\17\2\2\u00ad\u00ae\5\f\7\2\u00ae\u00af\7\b\2\2\u00af\u00cc\3\2\2\2\u00b0"+
		"\u00b1\7\67\2\2\u00b1\u00b2\7\20\2\2\u00b2\u00b3\5\f\7\2\u00b3\u00b4\7"+
		"\b\2\2\u00b4\u00cc\3\2\2\2\u00b5\u00b6\7\67\2\2\u00b6\u00b7\7\21\2\2\u00b7"+
		"\u00b8\5\f\7\2\u00b8\u00b9\7\b\2\2\u00b9\u00cc\3\2\2\2\u00ba\u00bb\7\67"+
		"\2\2\u00bb\u00bc\7\22\2\2\u00bc\u00bd\5\f\7\2\u00bd\u00be\7\b\2\2\u00be"+
		"\u00cc\3\2\2\2\u00bf\u00c0\7\67\2\2\u00c0\u00c1\7\36\2\2\u00c1\u00cc\7"+
		"\b\2\2\u00c2\u00c3\7\67\2\2\u00c3\u00c4\7\37\2\2\u00c4\u00cc\7\b\2\2\u00c5"+
		"\u00c6\7\37\2\2\u00c6\u00c7\7\67\2\2\u00c7\u00cc\7\b\2\2\u00c8\u00c9\7"+
		"\36\2\2\u00c9\u00ca\7\67\2\2\u00ca\u00cc\7\b\2\2\u00cbN\3\2\2\2\u00cb"+
		"R\3\2\2\2\u00cbU\3\2\2\2\u00cb\\\3\2\2\2\u00cbe\3\2\2\2\u00cbl\3\2\2\2"+
		"\u00cbs\3\2\2\2\u00cbw\3\2\2\2\u00cb~\3\2\2\2\u00cb\u0080\3\2\2\2\u00cb"+
		"\u0087\3\2\2\2\u00cb\u008e\3\2\2\2\u00cb\u0092\3\2\2\2\u00cb\u009d\3\2"+
		"\2\2\u00cb\u009f\3\2\2\2\u00cb\u00a1\3\2\2\2\u00cb\u00a6\3\2\2\2\u00cb"+
		"\u00ab\3\2\2\2\u00cb\u00b0\3\2\2\2\u00cb\u00b5\3\2\2\2\u00cb\u00ba\3\2"+
		"\2\2\u00cb\u00bf\3\2\2\2\u00cb\u00c2\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb"+
		"\u00c8\3\2\2\2\u00cc\13\3\2\2\2\u00cd\u00dc\5\16\b\2\u00ce\u00cf\7\62"+
		"\2\2\u00cf\u00d1\5\16\b\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00dd\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d5\u00d6\7\63\2\2\u00d6\u00d8\5\16\b\2\u00d7\u00d5\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00d2\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\r\3\2\2\2\u00de\u00df\7\64\2\2\u00df\u00e0\7\n\2"+
		"\2\u00e0\u00e1\5\f\7\2\u00e1\u00e2\7\13\2\2\u00e2\u00e5\3\2\2\2\u00e3"+
		"\u00e5\5\20\t\2\u00e4\u00de\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\17\3\2\2"+
		"\2\u00e6\u00e9\5\22\n\2\u00e7\u00e8\t\2\2\2\u00e8\u00ea\5\22\n\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\21\3\2\2\2\u00eb\u00f0\5\24\13"+
		"\2\u00ec\u00ed\t\3\2\2\u00ed\u00ef\5\24\13\2\u00ee\u00ec\3\2\2\2\u00ef"+
		"\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\23\3\2\2"+
		"\2\u00f2\u00f0\3\2\2\2\u00f3\u00f8\5\26\f\2\u00f4\u00f5\t\4\2\2\u00f5"+
		"\u00f7\5\26\f\2\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3"+
		"\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\25\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb"+
		"\u0114\7\65\2\2\u00fc\u0114\5\32\16\2\u00fd\u00fe\7\67\2\2\u00fe\u0114"+
		"\t\5\2\2\u00ff\u0100\t\5\2\2\u0100\u0114\7\67\2\2\u0101\u0114\7\67\2\2"+
		"\u0102\u0103\7\n\2\2\u0103\u0104\5\f\7\2\u0104\u0105\7\13\2\2\u0105\u0114"+
		"\3\2\2\2\u0106\u0107\7\66\2\2\u0107\u0110\7\n\2\2\u0108\u010d\5\f\7\2"+
		"\u0109\u010a\7\7\2\2\u010a\u010c\5\f\7\2\u010b\u0109\3\2\2\2\u010c\u010f"+
		"\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0108\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2"+
		"\2\2\u0112\u0114\7\13\2\2\u0113\u00fb\3\2\2\2\u0113\u00fc\3\2\2\2\u0113"+
		"\u00fd\3\2\2\2\u0113\u00ff\3\2\2\2\u0113\u0101\3\2\2\2\u0113\u0102\3\2"+
		"\2\2\u0113\u0106\3\2\2\2\u0114\27\3\2\2\2\u0115\u0116\7!\2\2\u0116\u0117"+
		"\5\4\3\2\u0117\u0118\7\b\2\2\u0118\u011a\3\2\2\2\u0119\u0115\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u011a\u011e\3\2\2\2\u011b\u011d\5\n\6\2\u011c\u011b\3\2"+
		"\2\2\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0121\3\2\2\2\u0120\u011e\3\2\2\2\u0121\u0122\7/\2\2\u0122\31\3\2\2\2"+
		"\u0123\u0124\t\6\2\2\u0124\33\3\2\2\2\26\37$/8?GL\u00cb\u00d2\u00d9\u00dc"+
		"\u00e4\u00e9\u00f0\u00f8\u010d\u0110\u0113\u0119\u011e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}