// Generated from c:/Users/torus/Downloads/primerproyecto/src/main/java/primerproyecto/compiladores.g4 by ANTLR 4.13.1

package primerproyecto;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class compiladoresLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, PA=2, PC=3, LLA=4, LLC=5, PYC=6, IGUAL=7, SUMA=8, RESTA=9, MULTIPLICACION=10, 
		DIVISION=11, MODULO=12, INT=13, DOUBLE=14, BOOL=15, NUMERO=16, ID=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "WS", "PA", "PC", "LLA", "LLC", "PYC", "IGUAL", "SUMA", 
			"RESTA", "MULTIPLICACION", "DIVISION", "MODULO", "INT", "DOUBLE", "BOOL", 
			"NUMERO", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "';'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'int'", "'double'", "'boolean'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PA", "PC", "LLA", "LLC", "PYC", "IGUAL", "SUMA", "RESTA", 
			"MULTIPLICACION", "DIVISION", "MODULO", "INT", "DOUBLE", "BOOL", "NUMERO", 
			"ID"
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


	public compiladoresLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "compiladores.g4"; }

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
		"\u0004\u0000\u0011i\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011"+
		"\u0004\u0011Z\b\u0011\u000b\u0011\f\u0011[\u0001\u0012\u0001\u0012\u0003"+
		"\u0012`\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012e\b\u0012"+
		"\n\u0012\f\u0012h\t\u0012\u0000\u0000\u0013\u0001\u0000\u0003\u0000\u0005"+
		"\u0001\u0007\u0002\t\u0003\u000b\u0004\r\u0005\u000f\u0006\u0011\u0007"+
		"\u0013\b\u0015\t\u0017\n\u0019\u000b\u001b\f\u001d\r\u001f\u000e!\u000f"+
		"#\u0010%\u0011\u0001\u0000\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  k\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003)\u0001"+
		"\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007/\u0001\u0000\u0000"+
		"\u0000\t1\u0001\u0000\u0000\u0000\u000b3\u0001\u0000\u0000\u0000\r5\u0001"+
		"\u0000\u0000\u0000\u000f7\u0001\u0000\u0000\u0000\u00119\u0001\u0000\u0000"+
		"\u0000\u0013;\u0001\u0000\u0000\u0000\u0015=\u0001\u0000\u0000\u0000\u0017"+
		"?\u0001\u0000\u0000\u0000\u0019A\u0001\u0000\u0000\u0000\u001bC\u0001"+
		"\u0000\u0000\u0000\u001dE\u0001\u0000\u0000\u0000\u001fI\u0001\u0000\u0000"+
		"\u0000!P\u0001\u0000\u0000\u0000#Y\u0001\u0000\u0000\u0000%_\u0001\u0000"+
		"\u0000\u0000\'(\u0007\u0000\u0000\u0000(\u0002\u0001\u0000\u0000\u0000"+
		")*\u0007\u0001\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0007\u0002"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0006\u0002\u0000\u0000.\u0006"+
		"\u0001\u0000\u0000\u0000/0\u0005(\u0000\u00000\b\u0001\u0000\u0000\u0000"+
		"12\u0005)\u0000\u00002\n\u0001\u0000\u0000\u000034\u0005{\u0000\u0000"+
		"4\f\u0001\u0000\u0000\u000056\u0005}\u0000\u00006\u000e\u0001\u0000\u0000"+
		"\u000078\u0005;\u0000\u00008\u0010\u0001\u0000\u0000\u00009:\u0005=\u0000"+
		"\u0000:\u0012\u0001\u0000\u0000\u0000;<\u0005+\u0000\u0000<\u0014\u0001"+
		"\u0000\u0000\u0000=>\u0005-\u0000\u0000>\u0016\u0001\u0000\u0000\u0000"+
		"?@\u0005*\u0000\u0000@\u0018\u0001\u0000\u0000\u0000AB\u0005/\u0000\u0000"+
		"B\u001a\u0001\u0000\u0000\u0000CD\u0005%\u0000\u0000D\u001c\u0001\u0000"+
		"\u0000\u0000EF\u0005i\u0000\u0000FG\u0005n\u0000\u0000GH\u0005t\u0000"+
		"\u0000H\u001e\u0001\u0000\u0000\u0000IJ\u0005d\u0000\u0000JK\u0005o\u0000"+
		"\u0000KL\u0005u\u0000\u0000LM\u0005b\u0000\u0000MN\u0005l\u0000\u0000"+
		"NO\u0005e\u0000\u0000O \u0001\u0000\u0000\u0000PQ\u0005b\u0000\u0000Q"+
		"R\u0005o\u0000\u0000RS\u0005o\u0000\u0000ST\u0005l\u0000\u0000TU\u0005"+
		"e\u0000\u0000UV\u0005a\u0000\u0000VW\u0005n\u0000\u0000W\"\u0001\u0000"+
		"\u0000\u0000XZ\u0003\u0003\u0001\u0000YX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\$\u0001\u0000\u0000\u0000]`\u0003\u0001\u0000\u0000^`\u0005_\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000_^\u0001\u0000\u0000\u0000`f\u0001\u0000\u0000"+
		"\u0000ae\u0003\u0001\u0000\u0000be\u0003\u0003\u0001\u0000ce\u0005_\u0000"+
		"\u0000da\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000g&\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000"+
		"\u0005\u0000[_df\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}