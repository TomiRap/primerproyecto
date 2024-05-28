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
		DIVISION=11, MODULO=12, INT=13, DOUBLE=14, BOOL=15, IRETURN=16, NUMERO=17, 
		ID=18;
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
			"IRETURN", "NUMERO", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'('", "')'", "'{'", "'}'", "';'", "'='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'int'", "'double'", "'boolean'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "PA", "PC", "LLA", "LLC", "PYC", "IGUAL", "SUMA", "RESTA", 
			"MULTIPLICACION", "DIVISION", "MODULO", "INT", "DOUBLE", "BOOL", "IRETURN", 
			"NUMERO", "ID"
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
		"\u0004\u0000\u0012r\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012c\b\u0012\u000b\u0012"+
		"\f\u0012d\u0001\u0013\u0001\u0013\u0003\u0013i\b\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013n\b\u0013\n\u0013\f\u0013q\t\u0013\u0000"+
		"\u0000\u0014\u0001\u0000\u0003\u0000\u0005\u0001\u0007\u0002\t\u0003\u000b"+
		"\u0004\r\u0005\u000f\u0006\u0011\u0007\u0013\b\u0015\t\u0017\n\u0019\u000b"+
		"\u001b\f\u001d\r\u001f\u000e!\u000f#\u0010%\u0011\'\u0012\u0001\u0000"+
		"\u0003\u0002\u0000AZaz\u0001\u000009\u0003\u0000\t\n\r\r  t\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u0003+\u0001"+
		"\u0000\u0000\u0000\u0005-\u0001\u0000\u0000\u0000\u00071\u0001\u0000\u0000"+
		"\u0000\t3\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000\u0000\r7\u0001"+
		"\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000\u0011;\u0001\u0000\u0000"+
		"\u0000\u0013=\u0001\u0000\u0000\u0000\u0015?\u0001\u0000\u0000\u0000\u0017"+
		"A\u0001\u0000\u0000\u0000\u0019C\u0001\u0000\u0000\u0000\u001bE\u0001"+
		"\u0000\u0000\u0000\u001dG\u0001\u0000\u0000\u0000\u001fK\u0001\u0000\u0000"+
		"\u0000!R\u0001\u0000\u0000\u0000#Z\u0001\u0000\u0000\u0000%b\u0001\u0000"+
		"\u0000\u0000\'h\u0001\u0000\u0000\u0000)*\u0007\u0000\u0000\u0000*\u0002"+
		"\u0001\u0000\u0000\u0000+,\u0007\u0001\u0000\u0000,\u0004\u0001\u0000"+
		"\u0000\u0000-.\u0007\u0002\u0000\u0000./\u0001\u0000\u0000\u0000/0\u0006"+
		"\u0002\u0000\u00000\u0006\u0001\u0000\u0000\u000012\u0005(\u0000\u0000"+
		"2\b\u0001\u0000\u0000\u000034\u0005)\u0000\u00004\n\u0001\u0000\u0000"+
		"\u000056\u0005{\u0000\u00006\f\u0001\u0000\u0000\u000078\u0005}\u0000"+
		"\u00008\u000e\u0001\u0000\u0000\u00009:\u0005;\u0000\u0000:\u0010\u0001"+
		"\u0000\u0000\u0000;<\u0005=\u0000\u0000<\u0012\u0001\u0000\u0000\u0000"+
		"=>\u0005+\u0000\u0000>\u0014\u0001\u0000\u0000\u0000?@\u0005-\u0000\u0000"+
		"@\u0016\u0001\u0000\u0000\u0000AB\u0005*\u0000\u0000B\u0018\u0001\u0000"+
		"\u0000\u0000CD\u0005/\u0000\u0000D\u001a\u0001\u0000\u0000\u0000EF\u0005"+
		"%\u0000\u0000F\u001c\u0001\u0000\u0000\u0000GH\u0005i\u0000\u0000HI\u0005"+
		"n\u0000\u0000IJ\u0005t\u0000\u0000J\u001e\u0001\u0000\u0000\u0000KL\u0005"+
		"d\u0000\u0000LM\u0005o\u0000\u0000MN\u0005u\u0000\u0000NO\u0005b\u0000"+
		"\u0000OP\u0005l\u0000\u0000PQ\u0005e\u0000\u0000Q \u0001\u0000\u0000\u0000"+
		"RS\u0005b\u0000\u0000ST\u0005o\u0000\u0000TU\u0005o\u0000\u0000UV\u0005"+
		"l\u0000\u0000VW\u0005e\u0000\u0000WX\u0005a\u0000\u0000XY\u0005n\u0000"+
		"\u0000Y\"\u0001\u0000\u0000\u0000Z[\u0005r\u0000\u0000[\\\u0005e\u0000"+
		"\u0000\\]\u0005t\u0000\u0000]^\u0005u\u0000\u0000^_\u0005r\u0000\u0000"+
		"_`\u0005n\u0000\u0000`$\u0001\u0000\u0000\u0000ac\u0003\u0003\u0001\u0000"+
		"ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000e&\u0001\u0000\u0000\u0000fi\u0003\u0001"+
		"\u0000\u0000gi\u0005_\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000io\u0001\u0000\u0000\u0000jn\u0003\u0001\u0000\u0000kn\u0003"+
		"\u0003\u0001\u0000ln\u0005_\u0000\u0000mj\u0001\u0000\u0000\u0000mk\u0001"+
		"\u0000\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p(\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000\u0005\u0000dhmo\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}