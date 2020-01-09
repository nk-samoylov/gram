// Generated from /home/nsamoylov/projects/testapp/src/main/resources/gram/mongo/MongoGram.g4 by ANTLR 4.7
package gram.mongo.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MongoGramLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, SELECT=3, FROM=4, WHERE=5, AND=6, OR=7, NOT=8, ALL_ATTRS=9, 
		GT=10, LT=11, EQ=12, NEQ=13, GTE=14, LTE=15, FGT=16, FLT=17, FEQ=18, FNEQ=19, 
		FGTE=20, FLTE=21, LPAREN=22, RPAREN=23, ID=24, LETTER=25, STRING=26, FLOAT_NUMBER=27, 
		INT_NUMBER=28, DIGIT=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "SELECT", "FROM", "WHERE", "AND", "OR", "NOT", "ALL_ATTRS", 
		"GT", "LT", "EQ", "NEQ", "GTE", "LTE", "FGT", "FLT", "FEQ", "FNEQ", "FGTE", 
		"FLTE", "LPAREN", "RPAREN", "ID", "LETTER", "STRING", "FLOAT_NUMBER", 
		"INT_NUMBER", "DIGIT", "WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", 
		"J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", 
		"X", "Y", "Z"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'.'", null, null, null, null, null, null, "'*'", "'>'", 
		"'<'", "'='", "'!='", "'>='", "'<='", "'~>'", "'<~'", "'~='", "'~!='", 
		"'~>='", "'<=~'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "SELECT", "FROM", "WHERE", "AND", "OR", "NOT", "ALL_ATTRS", 
		"GT", "LT", "EQ", "NEQ", "GTE", "LTE", "FGT", "FLT", "FEQ", "FNEQ", "FGTE", 
		"FLTE", "LPAREN", "RPAREN", "ID", "LETTER", "STRING", "FLOAT_NUMBER", 
		"INT_NUMBER", "DIGIT", "WS"
	};
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


	public MongoGramLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MongoGram.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u011c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\7\31\u00c2\n\31\f\31"+
		"\16\31\u00c5\13\31\3\32\3\32\3\33\5\33\u00ca\n\33\3\33\3\33\3\33\3\33"+
		"\7\33\u00d0\n\33\f\33\16\33\u00d3\13\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\6\35\u00dc\n\35\r\35\16\35\u00dd\3\36\3\36\3\37\6\37\u00e3\n\37"+
		"\r\37\16\37\u00e4\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3"+
		"&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3"+
		"\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\67\3\67\3"+
		"8\38\39\39\2\2:\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\2S\2U\2W\2Y\2[\2]\2_\2"+
		"a\2c\2e\2g\2i\2k\2m\2o\2q\2\3\2 \5\2C\\aac|\3\2))\3\2\62;\5\2\13\f\17"+
		"\17\"\"\4\2CCcc\4\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJ"+
		"jj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2"+
		"SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4"+
		"\2\\\\||\2\u0108\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\3s\3\2\2\2\5u\3\2\2\2\7w\3\2\2\2\t~"+
		"\3\2\2\2\13\u0083\3\2\2\2\r\u0089\3\2\2\2\17\u008d\3\2\2\2\21\u0090\3"+
		"\2\2\2\23\u0094\3\2\2\2\25\u0096\3\2\2\2\27\u0098\3\2\2\2\31\u009a\3\2"+
		"\2\2\33\u009c\3\2\2\2\35\u009f\3\2\2\2\37\u00a2\3\2\2\2!\u00a5\3\2\2\2"+
		"#\u00a8\3\2\2\2%\u00ab\3\2\2\2\'\u00ae\3\2\2\2)\u00b2\3\2\2\2+\u00b6\3"+
		"\2\2\2-\u00ba\3\2\2\2/\u00bc\3\2\2\2\61\u00be\3\2\2\2\63\u00c6\3\2\2\2"+
		"\65\u00c9\3\2\2\2\67\u00d6\3\2\2\29\u00db\3\2\2\2;\u00df\3\2\2\2=\u00e2"+
		"\3\2\2\2?\u00e8\3\2\2\2A\u00ea\3\2\2\2C\u00ec\3\2\2\2E\u00ee\3\2\2\2G"+
		"\u00f0\3\2\2\2I\u00f2\3\2\2\2K\u00f4\3\2\2\2M\u00f6\3\2\2\2O\u00f8\3\2"+
		"\2\2Q\u00fa\3\2\2\2S\u00fc\3\2\2\2U\u00fe\3\2\2\2W\u0100\3\2\2\2Y\u0102"+
		"\3\2\2\2[\u0104\3\2\2\2]\u0106\3\2\2\2_\u0108\3\2\2\2a\u010a\3\2\2\2c"+
		"\u010c\3\2\2\2e\u010e\3\2\2\2g\u0110\3\2\2\2i\u0112\3\2\2\2k\u0114\3\2"+
		"\2\2m\u0116\3\2\2\2o\u0118\3\2\2\2q\u011a\3\2\2\2st\7.\2\2t\4\3\2\2\2"+
		"uv\7\60\2\2v\6\3\2\2\2wx\5c\62\2xy\5G$\2yz\5U+\2z{\5G$\2{|\5C\"\2|}\5"+
		"e\63\2}\b\3\2\2\2~\177\5I%\2\177\u0080\5a\61\2\u0080\u0081\5[.\2\u0081"+
		"\u0082\5W,\2\u0082\n\3\2\2\2\u0083\u0084\5k\66\2\u0084\u0085\5M\'\2\u0085"+
		"\u0086\5G$\2\u0086\u0087\5a\61\2\u0087\u0088\5G$\2\u0088\f\3\2\2\2\u0089"+
		"\u008a\5? \2\u008a\u008b\5Y-\2\u008b\u008c\5E#\2\u008c\16\3\2\2\2\u008d"+
		"\u008e\5[.\2\u008e\u008f\5a\61\2\u008f\20\3\2\2\2\u0090\u0091\5Y-\2\u0091"+
		"\u0092\5[.\2\u0092\u0093\5e\63\2\u0093\22\3\2\2\2\u0094\u0095\7,\2\2\u0095"+
		"\24\3\2\2\2\u0096\u0097\7@\2\2\u0097\26\3\2\2\2\u0098\u0099\7>\2\2\u0099"+
		"\30\3\2\2\2\u009a\u009b\7?\2\2\u009b\32\3\2\2\2\u009c\u009d\7#\2\2\u009d"+
		"\u009e\7?\2\2\u009e\34\3\2\2\2\u009f\u00a0\7@\2\2\u00a0\u00a1\7?\2\2\u00a1"+
		"\36\3\2\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a4\7?\2\2\u00a4 \3\2\2\2\u00a5"+
		"\u00a6\7\u0080\2\2\u00a6\u00a7\7@\2\2\u00a7\"\3\2\2\2\u00a8\u00a9\7>\2"+
		"\2\u00a9\u00aa\7\u0080\2\2\u00aa$\3\2\2\2\u00ab\u00ac\7\u0080\2\2\u00ac"+
		"\u00ad\7?\2\2\u00ad&\3\2\2\2\u00ae\u00af\7\u0080\2\2\u00af\u00b0\7#\2"+
		"\2\u00b0\u00b1\7?\2\2\u00b1(\3\2\2\2\u00b2\u00b3\7\u0080\2\2\u00b3\u00b4"+
		"\7@\2\2\u00b4\u00b5\7?\2\2\u00b5*\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b8"+
		"\7?\2\2\u00b8\u00b9\7\u0080\2\2\u00b9,\3\2\2\2\u00ba\u00bb\7*\2\2\u00bb"+
		".\3\2\2\2\u00bc\u00bd\7+\2\2\u00bd\60\3\2\2\2\u00be\u00c3\5\63\32\2\u00bf"+
		"\u00c2\5\63\32\2\u00c0\u00c2\5;\36\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3"+
		"\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\62\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\t\2\2\2\u00c7\64\3\2\2\2\u00c8"+
		"\u00ca\7P\2\2\u00c9\u00c8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00d1\7)\2\2\u00cc\u00d0\n\3\2\2\u00cd\u00ce\7)\2\2\u00ce\u00d0"+
		"\7)\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\u00d5\7)\2\2\u00d5\66\3\2\2\2\u00d6\u00d7\59\35\2\u00d7\u00d8"+
		"\7\60\2\2\u00d8\u00d9\59\35\2\u00d98\3\2\2\2\u00da\u00dc\5;\36\2\u00db"+
		"\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de:\3\2\2\2\u00df\u00e0\t\4\2\2\u00e0<\3\2\2\2\u00e1\u00e3\t\5"+
		"\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4"+
		"\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\37\2\2\u00e7>\3\2\2\2"+
		"\u00e8\u00e9\t\6\2\2\u00e9@\3\2\2\2\u00ea\u00eb\t\7\2\2\u00ebB\3\2\2\2"+
		"\u00ec\u00ed\t\b\2\2\u00edD\3\2\2\2\u00ee\u00ef\t\t\2\2\u00efF\3\2\2\2"+
		"\u00f0\u00f1\t\n\2\2\u00f1H\3\2\2\2\u00f2\u00f3\t\13\2\2\u00f3J\3\2\2"+
		"\2\u00f4\u00f5\t\f\2\2\u00f5L\3\2\2\2\u00f6\u00f7\t\r\2\2\u00f7N\3\2\2"+
		"\2\u00f8\u00f9\t\16\2\2\u00f9P\3\2\2\2\u00fa\u00fb\t\17\2\2\u00fbR\3\2"+
		"\2\2\u00fc\u00fd\t\20\2\2\u00fdT\3\2\2\2\u00fe\u00ff\t\21\2\2\u00ffV\3"+
		"\2\2\2\u0100\u0101\t\22\2\2\u0101X\3\2\2\2\u0102\u0103\t\23\2\2\u0103"+
		"Z\3\2\2\2\u0104\u0105\t\24\2\2\u0105\\\3\2\2\2\u0106\u0107\t\25\2\2\u0107"+
		"^\3\2\2\2\u0108\u0109\t\26\2\2\u0109`\3\2\2\2\u010a\u010b\t\27\2\2\u010b"+
		"b\3\2\2\2\u010c\u010d\t\30\2\2\u010dd\3\2\2\2\u010e\u010f\t\31\2\2\u010f"+
		"f\3\2\2\2\u0110\u0111\t\32\2\2\u0111h\3\2\2\2\u0112\u0113\t\33\2\2\u0113"+
		"j\3\2\2\2\u0114\u0115\t\34\2\2\u0115l\3\2\2\2\u0116\u0117\t\35\2\2\u0117"+
		"n\3\2\2\2\u0118\u0119\t\36\2\2\u0119p\3\2\2\2\u011a\u011b\t\37\2\2\u011b"+
		"r\3\2\2\2\n\2\u00c1\u00c3\u00c9\u00cf\u00d1\u00dd\u00e4\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}