// Generated from com\warningrc\test\antlr4\script\Coupon.g4 by ANTLR 4.5.1
package com.warningrc.test.antlr4.script;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CouponLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		OR=10, AND=11, STRING=12, NUMBER=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"OR", "AND", "STRING", "NUMBER", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "','", "'\"rangeType\"'", "':'", "'\"productLines\"'", 
		"'['", "']'", "'\"productTypes\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "OR", "AND", 
		"STRING", "NUMBER", "WS"
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


	public CouponLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Coupon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20x\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13\\\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\ff\n\f\3\r\6\ri\n"+
		"\r\r\r\16\rj\3\16\6\16n\n\16\r\16\16\16o\3\17\6\17s\n\17\r\17\16\17t\3"+
		"\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\3\2\4\7\2\13\13\"\"*+<<^^\5\2\13\f\17\17\"\"~\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3"+
		"\2\2\2\13\61\3\2\2\2\r\63\3\2\2\2\17B\3\2\2\2\21D\3\2\2\2\23F\3\2\2\2"+
		"\25[\3\2\2\2\27e\3\2\2\2\31h\3\2\2\2\33m\3\2\2\2\35r\3\2\2\2\37 \7}\2"+
		"\2 \4\3\2\2\2!\"\7\177\2\2\"\6\3\2\2\2#$\7.\2\2$\b\3\2\2\2%&\7$\2\2&\'"+
		"\7t\2\2\'(\7c\2\2()\7p\2\2)*\7i\2\2*+\7g\2\2+,\7V\2\2,-\7{\2\2-.\7r\2"+
		"\2./\7g\2\2/\60\7$\2\2\60\n\3\2\2\2\61\62\7<\2\2\62\f\3\2\2\2\63\64\7"+
		"$\2\2\64\65\7r\2\2\65\66\7t\2\2\66\67\7q\2\2\678\7f\2\289\7w\2\29:\7e"+
		"\2\2:;\7v\2\2;<\7N\2\2<=\7k\2\2=>\7p\2\2>?\7g\2\2?@\7u\2\2@A\7$\2\2A\16"+
		"\3\2\2\2BC\7]\2\2C\20\3\2\2\2DE\7_\2\2E\22\3\2\2\2FG\7$\2\2GH\7r\2\2H"+
		"I\7t\2\2IJ\7q\2\2JK\7f\2\2KL\7w\2\2LM\7e\2\2MN\7v\2\2NO\7V\2\2OP\7{\2"+
		"\2PQ\7r\2\2QR\7g\2\2RS\7u\2\2ST\7$\2\2T\24\3\2\2\2UV\7q\2\2V\\\7t\2\2"+
		"WX\7Q\2\2X\\\7T\2\2YZ\7~\2\2Z\\\7~\2\2[U\3\2\2\2[W\3\2\2\2[Y\3\2\2\2\\"+
		"\26\3\2\2\2]^\7c\2\2^_\7p\2\2_f\7f\2\2`a\7C\2\2ab\7P\2\2bf\7F\2\2cd\7"+
		"(\2\2df\7(\2\2e]\3\2\2\2e`\3\2\2\2ec\3\2\2\2f\30\3\2\2\2gi\n\2\2\2hg\3"+
		"\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2k\32\3\2\2\2ln\n\2\2\2ml\3\2\2\2n"+
		"o\3\2\2\2om\3\2\2\2op\3\2\2\2p\34\3\2\2\2qs\t\3\2\2rq\3\2\2\2st\3\2\2"+
		"\2tr\3\2\2\2tu\3\2\2\2uv\3\2\2\2vw\b\17\2\2w\36\3\2\2\2\b\2[ejot\3\b\2"+
		"\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}