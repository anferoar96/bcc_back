// Generated from d:\afromana\Documents\UNAL\Lenguajes\interpreterbcc\grammars\BCC.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BCCLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "TK_DOSPUNTOS", "TK_COMA", "TK_PUNTOYCOMA", 
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


	public BCCLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "BCC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u0161\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3"+
		"\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3/\3/"+
		"\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\6\65\u0136\n\65\r\65"+
		"\16\65\u0137\3\65\5\65\u013b\n\65\3\65\7\65\u013e\n\65\f\65\16\65\u0141"+
		"\13\65\3\66\3\66\3\66\7\66\u0146\n\66\f\66\16\66\u0149\13\66\3\67\3\67"+
		"\7\67\u014d\n\67\f\67\16\67\u0150\13\67\38\68\u0153\n8\r8\168\u0154\3"+
		"8\38\39\39\79\u015b\n9\f9\169\u015e\139\39\39\2\2:\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:\3\2\7\3\2\62;\5"+
		"\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\4\2\f\f\16\17\2\u0167\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\3s\3\2\2\2\5x\3\2\2\2\7~\3\2\2\2\t\u0082\3\2\2\2"+
		"\13\u0087\3\2\2\2\r\u0089\3\2\2\2\17\u008b\3\2\2\2\21\u008d\3\2\2\2\23"+
		"\u0090\3\2\2\2\25\u0092\3\2\2\2\27\u0094\3\2\2\2\31\u0096\3\2\2\2\33\u0099"+
		"\3\2\2\2\35\u009c\3\2\2\2\37\u009f\3\2\2\2!\u00a2\3\2\2\2#\u00a5\3\2\2"+
		"\2%\u00a8\3\2\2\2\'\u00ab\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2-\u00b3"+
		"\3\2\2\2/\u00b5\3\2\2\2\61\u00b7\3\2\2\2\63\u00b9\3\2\2\2\65\u00bb\3\2"+
		"\2\2\67\u00bd\3\2\2\29\u00bf\3\2\2\2;\u00c1\3\2\2\2=\u00c4\3\2\2\2?\u00c7"+
		"\3\2\2\2A\u00d0\3\2\2\2C\u00d4\3\2\2\2E\u00da\3\2\2\2G\u00e0\3\2\2\2I"+
		"\u00e5\3\2\2\2K\u00e8\3\2\2\2M\u00eb\3\2\2\2O\u00f0\3\2\2\2Q\u00f7\3\2"+
		"\2\2S\u00fd\3\2\2\2U\u0104\3\2\2\2W\u010a\3\2\2\2Y\u010f\3\2\2\2[\u0116"+
		"\3\2\2\2]\u011a\3\2\2\2_\u011e\3\2\2\2a\u0123\3\2\2\2c\u0129\3\2\2\2e"+
		"\u012d\3\2\2\2g\u0130\3\2\2\2i\u0135\3\2\2\2k\u0142\3\2\2\2m\u014a\3\2"+
		"\2\2o\u0152\3\2\2\2q\u0158\3\2\2\2st\7v\2\2tu\7t\2\2uv\7w\2\2vw\7g\2\2"+
		"w\4\3\2\2\2xy\7h\2\2yz\7c\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2}\6\3\2\2\2~\177"+
		"\7p\2\2\177\u0080\7w\2\2\u0080\u0081\7o\2\2\u0081\b\3\2\2\2\u0082\u0083"+
		"\7d\2\2\u0083\u0084\7q\2\2\u0084\u0085\7q\2\2\u0085\u0086\7n\2\2\u0086"+
		"\n\3\2\2\2\u0087\u0088\7<\2\2\u0088\f\3\2\2\2\u0089\u008a\7.\2\2\u008a"+
		"\16\3\2\2\2\u008b\u008c\7=\2\2\u008c\20\3\2\2\2\u008d\u008e\7<\2\2\u008e"+
		"\u008f\7?\2\2\u008f\22\3\2\2\2\u0090\u0091\7*\2\2\u0091\24\3\2\2\2\u0092"+
		"\u0093\7+\2\2\u0093\26\3\2\2\2\u0094\u0095\7>\2\2\u0095\30\3\2\2\2\u0096"+
		"\u0097\7>\2\2\u0097\u0098\7?\2\2\u0098\32\3\2\2\2\u0099\u009a\7-\2\2\u009a"+
		"\u009b\7?\2\2\u009b\34\3\2\2\2\u009c\u009d\7/\2\2\u009d\u009e\7?\2\2\u009e"+
		"\36\3\2\2\2\u009f\u00a0\7,\2\2\u00a0\u00a1\7?\2\2\u00a1 \3\2\2\2\u00a2"+
		"\u00a3\7\61\2\2\u00a3\u00a4\7?\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7\'\2\2"+
		"\u00a6\u00a7\7?\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7#\2\2\u00a9\u00aa\7?\2"+
		"\2\u00aa&\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ad\7?\2\2\u00ad(\3\2\2\2"+
		"\u00ae\u00af\7@\2\2\u00af*\3\2\2\2\u00b0\u00b1\7@\2\2\u00b1\u00b2\7?\2"+
		"\2\u00b2,\3\2\2\2\u00b3\u00b4\7}\2\2\u00b4.\3\2\2\2\u00b5\u00b6\7\177"+
		"\2\2\u00b6\60\3\2\2\2\u00b7\u00b8\7-\2\2\u00b8\62\3\2\2\2\u00b9\u00ba"+
		"\7/\2\2\u00ba\64\3\2\2\2\u00bb\u00bc\7,\2\2\u00bc\66\3\2\2\2\u00bd\u00be"+
		"\7\61\2\2\u00be8\3\2\2\2\u00bf\u00c0\7\'\2\2\u00c0:\3\2\2\2\u00c1\u00c2"+
		"\7-\2\2\u00c2\u00c3\7-\2\2\u00c3<\3\2\2\2\u00c4\u00c5\7/\2\2\u00c5\u00c6"+
		"\7/\2\2\u00c6>\3\2\2\2\u00c7\u00c8\7h\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca"+
		"\7p\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cf@\3\2\2\2\u00d0\u00d1\7x\2\2\u00d1"+
		"\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3B\3\2\2\2\u00d4\u00d5\7r\2\2\u00d5"+
		"\u00d6\7t\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7v\2\2"+
		"\u00d9D\3\2\2\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7r\2"+
		"\2\u00dd\u00de\7w\2\2\u00de\u00df\7v\2\2\u00dfF\3\2\2\2\u00e0\u00e1\7"+
		"y\2\2\u00e1\u00e2\7j\2\2\u00e2\u00e3\7g\2\2\u00e3\u00e4\7p\2\2\u00e4H"+
		"\3\2\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7q\2\2\u00e7J\3\2\2\2\u00e8\u00e9"+
		"\7k\2\2\u00e9\u00ea\7h\2\2\u00eaL\3\2\2\2\u00eb\u00ec\7g\2\2\u00ec\u00ed"+
		"\7n\2\2\u00ed\u00ee\7u\2\2\u00ee\u00ef\7g\2\2\u00efN\3\2\2\2\u00f0\u00f1"+
		"\7w\2\2\u00f1\u00f2\7p\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7g\2\2\u00f4"+
		"\u00f5\7u\2\2\u00f5\u00f6\7u\2\2\u00f6P\3\2\2\2\u00f7\u00f8\7y\2\2\u00f8"+
		"\u00f9\7j\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7g\2\2"+
		"\u00fcR\3\2\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7g\2\2\u00ff\u0100\7v\2"+
		"\2\u0100\u0101\7w\2\2\u0101\u0102\7t\2\2\u0102\u0103\7p\2\2\u0103T\3\2"+
		"\2\2\u0104\u0105\7w\2\2\u0105\u0106\7p\2\2\u0106\u0107\7v\2\2\u0107\u0108"+
		"\7k\2\2\u0108\u0109\7n\2\2\u0109V\3\2\2\2\u010a\u010b\7n\2\2\u010b\u010c"+
		"\7q\2\2\u010c\u010d\7q\2\2\u010d\u010e\7r\2\2\u010eX\3\2\2\2\u010f\u0110"+
		"\7t\2\2\u0110\u0111\7g\2\2\u0111\u0112\7r\2\2\u0112\u0113\7g\2\2\u0113"+
		"\u0114\7c\2\2\u0114\u0115\7v\2\2\u0115Z\3\2\2\2\u0116\u0117\7h\2\2\u0117"+
		"\u0118\7q\2\2\u0118\u0119\7t\2\2\u0119\\\3\2\2\2\u011a\u011b\7g\2\2\u011b"+
		"\u011c\7p\2\2\u011c\u011d\7f\2\2\u011d^\3\2\2\2\u011e\u011f\7p\2\2\u011f"+
		"\u0120\7g\2\2\u0120\u0121\7z\2\2\u0121\u0122\7v\2\2\u0122`\3\2\2\2\u0123"+
		"\u0124\7d\2\2\u0124\u0125\7t\2\2\u0125\u0126\7g\2\2\u0126\u0127\7c\2\2"+
		"\u0127\u0128\7m\2\2\u0128b\3\2\2\2\u0129\u012a\7c\2\2\u012a\u012b\7p\2"+
		"\2\u012b\u012c\7f\2\2\u012cd\3\2\2\2\u012d\u012e\7q\2\2\u012e\u012f\7"+
		"t\2\2\u012ff\3\2\2\2\u0130\u0131\7p\2\2\u0131\u0132\7q\2\2\u0132\u0133"+
		"\7v\2\2\u0133h\3\2\2\2\u0134\u0136\t\2\2\2\u0135\u0134\3\2\2\2\u0136\u0137"+
		"\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139"+
		"\u013b\7\60\2\2\u013a\u0139\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013f\3"+
		"\2\2\2\u013c\u013e\t\2\2\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140j\3\2\2\2\u0141\u013f\3\2\2\2"+
		"\u0142\u0143\7B\2\2\u0143\u0147\t\3\2\2\u0144\u0146\t\4\2\2\u0145\u0144"+
		"\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"l\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014e\t\3\2\2\u014b\u014d\t\4\2\2"+
		"\u014c\u014b\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f"+
		"\3\2\2\2\u014fn\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0153\t\5\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b8\2\2\u0157p\3\2\2\2\u0158\u015c"+
		"\7%\2\2\u0159\u015b\n\6\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c"+
		"\u015a\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2"+
		"\2\2\u015f\u0160\b9\2\2\u0160r\3\2\2\2\n\2\u0137\u013a\u013f\u0147\u014e"+
		"\u0154\u015c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}