// Generated from C:/Users/Enrique/Desktop/PL/src\Analex.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Analex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BLANCO=1, TABULADOR=2, FIN_LINEA=3, VARIABLES=4, PROGRAMA=5, SUBPROGRAMAS=6, 
		INSTRUCCIONES=7, FUNCION=8, FFUNCION=9, RETURN=10, PROCEDIMIENTO=11, FPROCEDIMIENTO=12, 
		NOMBREFUNC=13, EVAL=14, DEF=15, NUMERO=16, BOOL=17, SEQUEN=18, VAR=19, 
		TIPO=20, NUM=21, DOSPTOS=22, PA=23, PC=24, CA=25, CC=26, LLAVEA=27, LLAVEC=28, 
		PyC=29, COMA=30, SUMA=31, RESTA=32, POR=33, IGUAL=34, IGUALL=35, DISTINTO=36, 
		MENORIGUAL=37, MAYORIGUAL=38, MENOR=39, MAYOR=40, NO=41, AND=42, OR=43, 
		T=44, F=45, BREAK=46, IF=47, THEN=48, ENDIF=49, ELSE=50, WHILE=51, DO=52, 
		ENDWHILE=53, FORALL=54, EXIST=55, AVANZA=56, COMENTARIO_BLOQUE=57, COMENTARIO_LINEA=58;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BLANCO", "TABULADOR", "FIN_LINEA", "DIGITO", "LETRA", "VARIABLES", "PROGRAMA", 
			"SUBPROGRAMAS", "INSTRUCCIONES", "FUNCION", "FFUNCION", "RETURN", "PROCEDIMIENTO", 
			"FPROCEDIMIENTO", "NOMBREFUNC", "EVAL", "DEF", "NUMERO", "BOOL", "SEQUEN", 
			"VAR", "TIPO", "NUM", "DOSPTOS", "PA", "PC", "CA", "CC", "LLAVEA", "LLAVEC", 
			"PyC", "COMA", "SUMA", "RESTA", "POR", "IGUAL", "IGUALL", "DISTINTO", 
			"MENORIGUAL", "MAYORIGUAL", "MENOR", "MAYOR", "NO", "AND", "OR", "T", 
			"F", "BREAK", "IF", "THEN", "ENDIF", "ELSE", "WHILE", "DO", "ENDWHILE", 
			"FORALL", "EXIST", "AVANZA", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'\t'", null, "'VARIABLES'", "'PROGRAMA'", "'SUBPROGRAMAS'", 
			"'INSTRUCCIONES'", "'FUNCION'", "'FFUNCION'", "'dev'", "'PROCEDIMIENTO'", 
			"'FPROCEDIMIENTO'", null, "'EVAL'", "'DEF'", "'NUM'", "'LOG'", null, 
			null, null, null, "':'", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", 
			"','", "'+'", "'-'", "'*'", "'='", "'=='", "'!='", "'<='", "'>='", "'<'", 
			"'>'", "'!'", "'&&'", "'||'", null, null, "'ruptura'", "'si'", "'entonces'", 
			"'fsi'", "'sino'", "'mientras'", "'hacer'", "'fmientras'", "'PARATODO'", 
			"'EXISTE'", "'avance'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BLANCO", "TABULADOR", "FIN_LINEA", "VARIABLES", "PROGRAMA", "SUBPROGRAMAS", 
			"INSTRUCCIONES", "FUNCION", "FFUNCION", "RETURN", "PROCEDIMIENTO", "FPROCEDIMIENTO", 
			"NOMBREFUNC", "EVAL", "DEF", "NUMERO", "BOOL", "SEQUEN", "VAR", "TIPO", 
			"NUM", "DOSPTOS", "PA", "PC", "CA", "CC", "LLAVEA", "LLAVEC", "PyC", 
			"COMA", "SUMA", "RESTA", "POR", "IGUAL", "IGUALL", "DISTINTO", "MENORIGUAL", 
			"MAYORIGUAL", "MENOR", "MAYOR", "NO", "AND", "OR", "T", "F", "BREAK", 
			"IF", "THEN", "ENDIF", "ELSE", "WHILE", "DO", "ENDWHILE", "FORALL", "EXIST", 
			"AVANZA", "COMENTARIO_BLOQUE", "COMENTARIO_LINEA"
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


	public Analex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Analex.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2<\u01d7\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\5\4\u0085\n\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\20\3\20\3\20\6\20\u00f2\n\20\r\20\16\20\u00f3\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u0117\n\25\3\26\3\26\3\26\7\26\u011c\n\26\f\26\16"+
		"\26\u011f\13\26\3\27\3\27\3\27\3\27\3\27\5\27\u0126\n\27\3\30\6\30\u0129"+
		"\n\30\r\30\16\30\u012a\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3"+
		"\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3"+
		"&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3-\3.\3.\3.\3"+
		"/\3/\3/\3/\3/\3/\3/\5/\u0166\n/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u016e"+
		"\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\39\39\39\39\39\39\39\39"+
		"\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\7<\u01c1\n<"+
		"\f<\16<\u01c4\13<\3<\3<\3<\3<\3<\3=\3=\3=\3=\7=\u01cf\n=\f=\16=\u01d2"+
		"\13=\3=\3=\3=\3=\4\u01c2\u01d0\2>\3\3\5\4\7\5\t\2\13\2\r\6\17\7\21\b\23"+
		"\t\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61"+
		"\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"G#I$K%M&O\'Q(S)U*W+Y,[-]."+
		"_/a\60c\61e\62g\63i\64k\65m\66o\67q8s9u:w;y<\3\2\4\3\2\62;\4\2C\\c|\2"+
		"\u01e2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\3{\3\2\2\2\5\177\3"+
		"\2\2\2\7\u0084\3\2\2\2\t\u008a\3\2\2\2\13\u008c\3\2\2\2\r\u008e\3\2\2"+
		"\2\17\u0098\3\2\2\2\21\u00a1\3\2\2\2\23\u00ae\3\2\2\2\25\u00bc\3\2\2\2"+
		"\27\u00c4\3\2\2\2\31\u00cd\3\2\2\2\33\u00d1\3\2\2\2\35\u00df\3\2\2\2\37"+
		"\u00f1\3\2\2\2!\u00f5\3\2\2\2#\u00fa\3\2\2\2%\u00fe\3\2\2\2\'\u0102\3"+
		"\2\2\2)\u0116\3\2\2\2+\u0118\3\2\2\2-\u0125\3\2\2\2/\u0128\3\2\2\2\61"+
		"\u012c\3\2\2\2\63\u012e\3\2\2\2\65\u0130\3\2\2\2\67\u0132\3\2\2\29\u0134"+
		"\3\2\2\2;\u0136\3\2\2\2=\u0138\3\2\2\2?\u013a\3\2\2\2A\u013c\3\2\2\2C"+
		"\u013e\3\2\2\2E\u0140\3\2\2\2G\u0142\3\2\2\2I\u0144\3\2\2\2K\u0146\3\2"+
		"\2\2M\u0149\3\2\2\2O\u014c\3\2\2\2Q\u014f\3\2\2\2S\u0152\3\2\2\2U\u0154"+
		"\3\2\2\2W\u0156\3\2\2\2Y\u0158\3\2\2\2[\u015b\3\2\2\2]\u0165\3\2\2\2_"+
		"\u016d\3\2\2\2a\u016f\3\2\2\2c\u0177\3\2\2\2e\u017a\3\2\2\2g\u0183\3\2"+
		"\2\2i\u0187\3\2\2\2k\u018c\3\2\2\2m\u0195\3\2\2\2o\u019b\3\2\2\2q\u01a5"+
		"\3\2\2\2s\u01ae\3\2\2\2u\u01b5\3\2\2\2w\u01bc\3\2\2\2y\u01ca\3\2\2\2{"+
		"|\7\"\2\2|}\3\2\2\2}~\b\2\2\2~\4\3\2\2\2\177\u0080\7\13\2\2\u0080\u0081"+
		"\3\2\2\2\u0081\u0082\b\3\2\2\u0082\6\3\2\2\2\u0083\u0085\7\17\2\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\7\f"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\b\4\2\2\u0089\b\3\2\2\2\u008a\u008b"+
		"\t\2\2\2\u008b\n\3\2\2\2\u008c\u008d\t\3\2\2\u008d\f\3\2\2\2\u008e\u008f"+
		"\7X\2\2\u008f\u0090\7C\2\2\u0090\u0091\7T\2\2\u0091\u0092\7K\2\2\u0092"+
		"\u0093\7C\2\2\u0093\u0094\7D\2\2\u0094\u0095\7N\2\2\u0095\u0096\7G\2\2"+
		"\u0096\u0097\7U\2\2\u0097\16\3\2\2\2\u0098\u0099\7R\2\2\u0099\u009a\7"+
		"T\2\2\u009a\u009b\7Q\2\2\u009b\u009c\7I\2\2\u009c\u009d\7T\2\2\u009d\u009e"+
		"\7C\2\2\u009e\u009f\7O\2\2\u009f\u00a0\7C\2\2\u00a0\20\3\2\2\2\u00a1\u00a2"+
		"\7U\2\2\u00a2\u00a3\7W\2\2\u00a3\u00a4\7D\2\2\u00a4\u00a5\7R\2\2\u00a5"+
		"\u00a6\7T\2\2\u00a6\u00a7\7Q\2\2\u00a7\u00a8\7I\2\2\u00a8\u00a9\7T\2\2"+
		"\u00a9\u00aa\7C\2\2\u00aa\u00ab\7O\2\2\u00ab\u00ac\7C\2\2\u00ac\u00ad"+
		"\7U\2\2\u00ad\22\3\2\2\2\u00ae\u00af\7K\2\2\u00af\u00b0\7P\2\2\u00b0\u00b1"+
		"\7U\2\2\u00b1\u00b2\7V\2\2\u00b2\u00b3\7T\2\2\u00b3\u00b4\7W\2\2\u00b4"+
		"\u00b5\7E\2\2\u00b5\u00b6\7E\2\2\u00b6\u00b7\7K\2\2\u00b7\u00b8\7Q\2\2"+
		"\u00b8\u00b9\7P\2\2\u00b9\u00ba\7G\2\2\u00ba\u00bb\7U\2\2\u00bb\24\3\2"+
		"\2\2\u00bc\u00bd\7H\2\2\u00bd\u00be\7W\2\2\u00be\u00bf\7P\2\2\u00bf\u00c0"+
		"\7E\2\2\u00c0\u00c1\7K\2\2\u00c1\u00c2\7Q\2\2\u00c2\u00c3\7P\2\2\u00c3"+
		"\26\3\2\2\2\u00c4\u00c5\7H\2\2\u00c5\u00c6\7H\2\2\u00c6\u00c7\7W\2\2\u00c7"+
		"\u00c8\7P\2\2\u00c8\u00c9\7E\2\2\u00c9\u00ca\7K\2\2\u00ca\u00cb\7Q\2\2"+
		"\u00cb\u00cc\7P\2\2\u00cc\30\3\2\2\2\u00cd\u00ce\7f\2\2\u00ce\u00cf\7"+
		"g\2\2\u00cf\u00d0\7x\2\2\u00d0\32\3\2\2\2\u00d1\u00d2\7R\2\2\u00d2\u00d3"+
		"\7T\2\2\u00d3\u00d4\7Q\2\2\u00d4\u00d5\7E\2\2\u00d5\u00d6\7G\2\2\u00d6"+
		"\u00d7\7F\2\2\u00d7\u00d8\7K\2\2\u00d8\u00d9\7O\2\2\u00d9\u00da\7K\2\2"+
		"\u00da\u00db\7G\2\2\u00db\u00dc\7P\2\2\u00dc\u00dd\7V\2\2\u00dd\u00de"+
		"\7Q\2\2\u00de\34\3\2\2\2\u00df\u00e0\7H\2\2\u00e0\u00e1\7R\2\2\u00e1\u00e2"+
		"\7T\2\2\u00e2\u00e3\7Q\2\2\u00e3\u00e4\7E\2\2\u00e4\u00e5\7G\2\2\u00e5"+
		"\u00e6\7F\2\2\u00e6\u00e7\7K\2\2\u00e7\u00e8\7O\2\2\u00e8\u00e9\7K\2\2"+
		"\u00e9\u00ea\7G\2\2\u00ea\u00eb\7P\2\2\u00eb\u00ec\7V\2\2\u00ec\u00ed"+
		"\7Q\2\2\u00ed\36\3\2\2\2\u00ee\u00f2\5\13\6\2\u00ef\u00f2\5\t\5\2\u00f0"+
		"\u00f2\7a\2\2\u00f1\u00ee\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		" \3\2\2\2\u00f5\u00f6\7G\2\2\u00f6\u00f7\7X\2\2\u00f7\u00f8\7C\2\2\u00f8"+
		"\u00f9\7N\2\2\u00f9\"\3\2\2\2\u00fa\u00fb\7F\2\2\u00fb\u00fc\7G\2\2\u00fc"+
		"\u00fd\7H\2\2\u00fd$\3\2\2\2\u00fe\u00ff\7P\2\2\u00ff\u0100\7W\2\2\u0100"+
		"\u0101\7O\2\2\u0101&\3\2\2\2\u0102\u0103\7N\2\2\u0103\u0104\7Q\2\2\u0104"+
		"\u0105\7I\2\2\u0105(\3\2\2\2\u0106\u0107\7U\2\2\u0107\u0108\7G\2\2\u0108"+
		"\u0109\7S\2\2\u0109\u010a\7*\2\2\u010a\u010b\7P\2\2\u010b\u010c\7W\2\2"+
		"\u010c\u010d\7O\2\2\u010d\u0117\7+\2\2\u010e\u010f\7U\2\2\u010f\u0110"+
		"\7G\2\2\u0110\u0111\7S\2\2\u0111\u0112\7*\2\2\u0112\u0113\7N\2\2\u0113"+
		"\u0114\7Q\2\2\u0114\u0115\7I\2\2\u0115\u0117\7+\2\2\u0116\u0106\3\2\2"+
		"\2\u0116\u010e\3\2\2\2\u0117*\3\2\2\2\u0118\u011d\5\13\6\2\u0119\u011c"+
		"\5\13\6\2\u011a\u011c\5\t\5\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2"+
		"\u011c\u011f\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011e\3\2\2\2\u011e,\3"+
		"\2\2\2\u011f\u011d\3\2\2\2\u0120\u0121\7U\2\2\u0121\u0122\7G\2\2\u0122"+
		"\u0126\7S\2\2\u0123\u0126\5%\23\2\u0124\u0126\5\'\24\2\u0125\u0120\3\2"+
		"\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126.\3\2\2\2\u0127\u0129"+
		"\5\t\5\2\u0128\u0127\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u0128\3\2\2\2\u012a"+
		"\u012b\3\2\2\2\u012b\60\3\2\2\2\u012c\u012d\7<\2\2\u012d\62\3\2\2\2\u012e"+
		"\u012f\7*\2\2\u012f\64\3\2\2\2\u0130\u0131\7+\2\2\u0131\66\3\2\2\2\u0132"+
		"\u0133\7]\2\2\u01338\3\2\2\2\u0134\u0135\7_\2\2\u0135:\3\2\2\2\u0136\u0137"+
		"\7}\2\2\u0137<\3\2\2\2\u0138\u0139\7\177\2\2\u0139>\3\2\2\2\u013a\u013b"+
		"\7=\2\2\u013b@\3\2\2\2\u013c\u013d\7.\2\2\u013dB\3\2\2\2\u013e\u013f\7"+
		"-\2\2\u013fD\3\2\2\2\u0140\u0141\7/\2\2\u0141F\3\2\2\2\u0142\u0143\7,"+
		"\2\2\u0143H\3\2\2\2\u0144\u0145\7?\2\2\u0145J\3\2\2\2\u0146\u0147\7?\2"+
		"\2\u0147\u0148\7?\2\2\u0148L\3\2\2\2\u0149\u014a\7#\2\2\u014a\u014b\7"+
		"?\2\2\u014bN\3\2\2\2\u014c\u014d\7>\2\2\u014d\u014e\7?\2\2\u014eP\3\2"+
		"\2\2\u014f\u0150\7@\2\2\u0150\u0151\7?\2\2\u0151R\3\2\2\2\u0152\u0153"+
		"\7>\2\2\u0153T\3\2\2\2\u0154\u0155\7@\2\2\u0155V\3\2\2\2\u0156\u0157\7"+
		"#\2\2\u0157X\3\2\2\2\u0158\u0159\7(\2\2\u0159\u015a\7(\2\2\u015aZ\3\2"+
		"\2\2\u015b\u015c\7~\2\2\u015c\u015d\7~\2\2\u015d\\\3\2\2\2\u015e\u0166"+
		"\7V\2\2\u015f\u0160\7e\2\2\u0160\u0161\7k\2\2\u0161\u0162\7g\2\2\u0162"+
		"\u0163\7t\2\2\u0163\u0164\7v\2\2\u0164\u0166\7q\2\2\u0165\u015e\3\2\2"+
		"\2\u0165\u015f\3\2\2\2\u0166^\3\2\2\2\u0167\u016e\7H\2\2\u0168\u0169\7"+
		"h\2\2\u0169\u016a\7c\2\2\u016a\u016b\7n\2\2\u016b\u016c\7u\2\2\u016c\u016e"+
		"\7q\2\2\u016d\u0167\3\2\2\2\u016d\u0168\3\2\2\2\u016e`\3\2\2\2\u016f\u0170"+
		"\7t\2\2\u0170\u0171\7w\2\2\u0171\u0172\7r\2\2\u0172\u0173\7v\2\2\u0173"+
		"\u0174\7w\2\2\u0174\u0175\7t\2\2\u0175\u0176\7c\2\2\u0176b\3\2\2\2\u0177"+
		"\u0178\7u\2\2\u0178\u0179\7k\2\2\u0179d\3\2\2\2\u017a\u017b\7g\2\2\u017b"+
		"\u017c\7p\2\2\u017c\u017d\7v\2\2\u017d\u017e\7q\2\2\u017e\u017f\7p\2\2"+
		"\u017f\u0180\7e\2\2\u0180\u0181\7g\2\2\u0181\u0182\7u\2\2\u0182f\3\2\2"+
		"\2\u0183\u0184\7h\2\2\u0184\u0185\7u\2\2\u0185\u0186\7k\2\2\u0186h\3\2"+
		"\2\2\u0187\u0188\7u\2\2\u0188\u0189\7k\2\2\u0189\u018a\7p\2\2\u018a\u018b"+
		"\7q\2\2\u018bj\3\2\2\2\u018c\u018d\7o\2\2\u018d\u018e\7k\2\2\u018e\u018f"+
		"\7g\2\2\u018f\u0190\7p\2\2\u0190\u0191\7v\2\2\u0191\u0192\7t\2\2\u0192"+
		"\u0193\7c\2\2\u0193\u0194\7u\2\2\u0194l\3\2\2\2\u0195\u0196\7j\2\2\u0196"+
		"\u0197\7c\2\2\u0197\u0198\7e\2\2\u0198\u0199\7g\2\2\u0199\u019a\7t\2\2"+
		"\u019an\3\2\2\2\u019b\u019c\7h\2\2\u019c\u019d\7o\2\2\u019d\u019e\7k\2"+
		"\2\u019e\u019f\7g\2\2\u019f\u01a0\7p\2\2\u01a0\u01a1\7v\2\2\u01a1\u01a2"+
		"\7t\2\2\u01a2\u01a3\7c\2\2\u01a3\u01a4\7u\2\2\u01a4p\3\2\2\2\u01a5\u01a6"+
		"\7R\2\2\u01a6\u01a7\7C\2\2\u01a7\u01a8\7T\2\2\u01a8\u01a9\7C\2\2\u01a9"+
		"\u01aa\7V\2\2\u01aa\u01ab\7Q\2\2\u01ab\u01ac\7F\2\2\u01ac\u01ad\7Q\2\2"+
		"\u01adr\3\2\2\2\u01ae\u01af\7G\2\2\u01af\u01b0\7Z\2\2\u01b0\u01b1\7K\2"+
		"\2\u01b1\u01b2\7U\2\2\u01b2\u01b3\7V\2\2\u01b3\u01b4\7G\2\2\u01b4t\3\2"+
		"\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7\7x\2\2\u01b7\u01b8\7c\2\2\u01b8\u01b9"+
		"\7p\2\2\u01b9\u01ba\7e\2\2\u01ba\u01bb\7g\2\2\u01bbv\3\2\2\2\u01bc\u01bd"+
		"\7\61\2\2\u01bd\u01be\7,\2\2\u01be\u01c2\3\2\2\2\u01bf\u01c1\13\2\2\2"+
		"\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c2\u01c0"+
		"\3\2\2\2\u01c3\u01c5\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c6\7,\2\2\u01c6"+
		"\u01c7\7\61\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01c9\b<\2\2\u01c9x\3\2\2\2"+
		"\u01ca\u01cb\7\61\2\2\u01cb\u01cc\7\61\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01cf"+
		"\13\2\2\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01d1\3\2\2\2"+
		"\u01d0\u01ce\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4"+
		"\5\7\4\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\b=\2\2\u01d6z\3\2\2\2\17\2\u0084"+
		"\u00f1\u00f3\u0116\u011b\u011d\u0125\u012a\u0165\u016d\u01c2\u01d0\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}