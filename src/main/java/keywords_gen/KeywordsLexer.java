// Generated from D:/sbt_code_base/antlr4_case/src/main/antlr4\Keywords.g4 by ANTLR 4.8
 // 只在词法分析器中放置这个header,在语法分析器中不放置它
package keywords_gen;
import java.util.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class KeywordsLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, ID=3, CHAR=4, INT=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "ID", "CHAR", "INT", "DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "ID", "CHAR", "INT", "WS"
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


	    Map<String, Integer> keywords = new HashMap<String, Integer>(){
	        {
	            // 中文测试
	            put("begin", KeywordsParser.BEGIN);
	            put("end", KeywordsParser.END);
	            put("if", KeywordsParser.IF);
	            put("then", KeywordsParser.THEN);
	            put("while", KeywordsParser.WHILE);
	        }
	    };



	public KeywordsLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Keywords.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 2:
			ID_action((RuleContext)_localctx, actionIndex);
			break;
		case 3:
			CHAR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void ID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    if (keywords.containsKey(getText())) {
			        setType(keywords.get(getText())); // 重置词法符号类型
			    }

			break;
		}
	}
	private void CHAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    setText(String.valueOf(getText().charAt(1)));

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b\62\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\3\3\3\3\4\6"+
		"\4\27\n\4\r\4\16\4\30\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\6\6$\n\6\r\6"+
		"\16\6%\5\6(\n\6\3\7\3\7\3\b\6\b-\n\b\r\b\16\b.\3\b\3\b\2\2\t\3\3\5\4\7"+
		"\5\t\6\13\7\r\2\17\b\3\2\5\5\2C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\64"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2"+
		"\2\2\3\21\3\2\2\2\5\23\3\2\2\2\7\26\3\2\2\2\t\34\3\2\2\2\13\'\3\2\2\2"+
		"\r)\3\2\2\2\17,\3\2\2\2\21\22\7?\2\2\22\4\3\2\2\2\23\24\7=\2\2\24\6\3"+
		"\2\2\2\25\27\t\2\2\2\26\25\3\2\2\2\27\30\3\2\2\2\30\26\3\2\2\2\30\31\3"+
		"\2\2\2\31\32\3\2\2\2\32\33\b\4\2\2\33\b\3\2\2\2\34\35\7)\2\2\35\36\13"+
		"\2\2\2\36\37\7)\2\2\37 \b\5\3\2 \n\3\2\2\2!(\7\62\2\2\"$\5\r\7\2#\"\3"+
		"\2\2\2$%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'!\3\2\2\2\'#\3\2\2\2("+
		"\f\3\2\2\2)*\t\3\2\2*\16\3\2\2\2+-\t\4\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2"+
		"\2./\3\2\2\2/\60\3\2\2\2\60\61\b\b\4\2\61\20\3\2\2\2\7\2\30%\'.\5\3\4"+
		"\2\3\5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}