/*
 * Copyright (c) 2022 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2022 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
// Generated from com/sap/xsk/parser/hdbtable/core/Hdbtable.g4 by ANTLR 4.3
package com.sap.xsk.parser.hdbtable.core;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HdbtableLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__26=1, T__25=2, T__24=3, T__23=4, T__22=5, T__21=6, T__20=7, T__19=8, 
		T__18=9, T__17=10, T__16=11, T__15=12, T__14=13, T__13=14, T__12=15, T__11=16, 
		T__10=17, T__9=18, T__8=19, T__7=20, T__6=21, T__5=22, T__4=23, T__3=24, 
		T__2=25, T__1=26, T__0=27, STRING=28, WS=29, TABLE=30, DOT=31, EQ=32, 
		SEMICOLON=33, SQLTYPES=34, BOOLEAN=35, ORDER=36, INDEXTYPE=37, INT=38, 
		TABLETYPE=39, TABLELOGGINGTYPE=40, DATETIMEDEFAULTVALUES=41, LINE_COMMENT=42, 
		COMMENT=43;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'", "'\\u001D'", "'\\u001E'", 
		"'\\u001F'", "' '", "'!'", "'\"'", "'#'", "'$'", "'%'", "'&'", "'''", 
		"'('", "')'", "'*'", "'+'"
	};
	public static final String[] ruleNames = {
		"T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", "T__19", 
		"T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", "T__11", 
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "ESCAPED_QUOTE", "STRING", "WS", "TABLE", "DOT", "EQ", 
		"SEMICOLON", "SQLTYPES", "BOOLEAN", "ORDER", "INDEXTYPE", "INT", "TABLETYPE", 
		"TABLELOGGINGTYPE", "DATETIMEDEFAULTVALUES", "LINE_COMMENT", "COMMENT"
	};


	public HdbtableLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hdbtable.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2-\u02ad\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\7\36\u0135\n\36\f\36\16\36\u0138"+
		"\13\36\3\36\3\36\3\37\6\37\u013d\n\37\r\37\16\37\u013e\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u01e2"+
		"\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01ed\n%\3&\3&\3&\3&\3&\3&\5&\u01f5"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u0205"+
		"\n\'\3(\6(\u0208\n(\r(\16(\u0209\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\5)\u021f\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3"+
		"*\3*\3*\3*\5*\u0231\n*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3"+
		"+\3+\3+\3+\3+\3+\3+\5+\u028e\n+\3,\3,\3,\3,\7,\u0294\n,\f,\16,\u0297\13"+
		",\3,\5,\u029a\n,\3,\3,\3,\3,\3-\3-\3-\3-\7-\u02a4\n-\f-\16-\u02a7\13-"+
		"\3-\3-\3-\3-\3-\5\u0136\u0295\u02a5\2.\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\2;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-"+
		"\3\2\5\4\2\f\f\17\17\5\2\13\f\17\17\"\"\3\2\62;\u02d1\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\3[\3\2\2\2\5g\3\2\2\2\7o\3\2\2\2\tt\3\2\2\2\13{\3\2\2\2\r\u0081\3"+
		"\2\2\2\17\u008b\3\2\2\2\21\u008d\3\2\2\2\23\u0093\3\2\2\2\25\u0095\3\2"+
		"\2\2\27\u009d\3\2\2\2\31\u00a6\3\2\2\2\33\u00b0\3\2\2\2\35\u00ba\3\2\2"+
		"\2\37\u00c7\3\2\2\2!\u00d3\3\2\2\2#\u00d5\3\2\2\2%\u00dc\3\2\2\2\'\u00e7"+
		"\3\2\2\2)\u00ef\3\2\2\2+\u00f9\3\2\2\2-\u0106\3\2\2\2/\u0108\3\2\2\2\61"+
		"\u010a\3\2\2\2\63\u0111\3\2\2\2\65\u0119\3\2\2\2\67\u0123\3\2\2\29\u012e"+
		"\3\2\2\2;\u0131\3\2\2\2=\u013c\3\2\2\2?\u0142\3\2\2\2A\u0148\3\2\2\2C"+
		"\u014a\3\2\2\2E\u014c\3\2\2\2G\u01e1\3\2\2\2I\u01ec\3\2\2\2K\u01f4\3\2"+
		"\2\2M\u0204\3\2\2\2O\u0207\3\2\2\2Q\u021e\3\2\2\2S\u0230\3\2\2\2U\u028d"+
		"\3\2\2\2W\u028f\3\2\2\2Y\u029f\3\2\2\2[\\\7n\2\2\\]\7q\2\2]^\7i\2\2^_"+
		"\7i\2\2_`\7k\2\2`a\7p\2\2ab\7i\2\2bc\7V\2\2cd\7{\2\2de\7r\2\2ef\7g\2\2"+
		"f\4\3\2\2\2gh\7u\2\2hi\7s\2\2ij\7n\2\2jk\7V\2\2kl\7{\2\2lm\7r\2\2mn\7"+
		"g\2\2n\6\3\2\2\2op\7p\2\2pq\7c\2\2qr\7o\2\2rs\7g\2\2s\b\3\2\2\2tu\7n\2"+
		"\2uv\7g\2\2vw\7p\2\2wx\7i\2\2xy\7v\2\2yz\7j\2\2z\n\3\2\2\2{|\7u\2\2|}"+
		"\7e\2\2}~\7c\2\2~\177\7n\2\2\177\u0080\7g\2\2\u0080\f\3\2\2\2\u0081\u0082"+
		"\7v\2\2\u0082\u0083\7c\2\2\u0083\u0084\7d\2\2\u0084\u0085\7n\2\2\u0085"+
		"\u0086\7g\2\2\u0086\u0087\7V\2\2\u0087\u0088\7{\2\2\u0088\u0089\7r\2\2"+
		"\u0089\u008a\7g\2\2\u008a\16\3\2\2\2\u008b\u008c\7}\2\2\u008c\20\3\2\2"+
		"\2\u008d\u008e\7q\2\2\u008e\u008f\7t\2\2\u008f\u0090\7f\2\2\u0090\u0091"+
		"\7g\2\2\u0091\u0092\7t\2\2\u0092\22\3\2\2\2\u0093\u0094\7\177\2\2\u0094"+
		"\24\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098\7f\2\2\u0098"+
		"\u0099\7g\2\2\u0099\u009a\7z\2\2\u009a\u009b\7g\2\2\u009b\u009c\7u\2\2"+
		"\u009c\26\3\2\2\2\u009d\u009e\7p\2\2\u009e\u009f\7w\2\2\u009f\u00a0\7"+
		"n\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7d\2\2\u00a3\u00a4"+
		"\7n\2\2\u00a4\u00a5\7g\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\7r\2\2\u00a7\u00a8"+
		"\7m\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab\7n\2\2\u00ab"+
		"\u00ac\7w\2\2\u00ac\u00ad\7o\2\2\u00ad\u00ae\7p\2\2\u00ae\u00af\7u\2\2"+
		"\u00af\32\3\2\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7"+
		"f\2\2\u00b3\u00b4\7g\2\2\u00b4\u00b5\7z\2\2\u00b5\u00b6\7V\2\2\u00b6\u00b7"+
		"\7{\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7g\2\2\u00b9\34\3\2\2\2\u00ba\u00bb"+
		"\7k\2\2\u00bb\u00bc\7p\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be\7g\2\2\u00be"+
		"\u00bf\7z\2\2\u00bf\u00c0\7E\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7n\2\2"+
		"\u00c2\u00c3\7w\2\2\u00c3\u00c4\7o\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6"+
		"\7u\2\2\u00c6\36\3\2\2\2\u00c7\u00c8\7f\2\2\u00c8\u00c9\7g\2\2\u00c9\u00ca"+
		"\7u\2\2\u00ca\u00cb\7e\2\2\u00cb\u00cc\7t\2\2\u00cc\u00cd\7k\2\2\u00cd"+
		"\u00ce\7r\2\2\u00ce\u00cf\7v\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7q\2\2"+
		"\u00d1\u00d2\7p\2\2\u00d2 \3\2\2\2\u00d3\u00d4\7.\2\2\u00d4\"\3\2\2\2"+
		"\u00d5\u00d6\7w\2\2\u00d6\u00d7\7p\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9"+
		"\7s\2\2\u00d9\u00da\7w\2\2\u00da\u00db\7g\2\2\u00db$\3\2\2\2\u00dc\u00dd"+
		"\7r\2\2\u00dd\u00de\7t\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7o\2\2\u00e0"+
		"\u00e1\7c\2\2\u00e1\u00e2\7t\2\2\u00e2\u00e3\7{\2\2\u00e3\u00e4\7M\2\2"+
		"\u00e4\u00e5\7g\2\2\u00e5\u00e6\7{\2\2\u00e6&\3\2\2\2\u00e7\u00e8\7e\2"+
		"\2\u00e8\u00e9\7q\2\2\u00e9\u00ea\7n\2\2\u00ea\u00eb\7w\2\2\u00eb\u00ec"+
		"\7o\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7u\2\2\u00ee(\3\2\2\2\u00ef\u00f0"+
		"\7r\2\2\u00f0\u00f1\7t\2\2\u00f1\u00f2\7g\2\2\u00f2\u00f3\7e\2\2\u00f3"+
		"\u00f4\7k\2\2\u00f4\u00f5\7u\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7q\2\2"+
		"\u00f7\u00f8\7p\2\2\u00f8*\3\2\2\2\u00f9\u00fa\7f\2\2\u00fa\u00fb\7g\2"+
		"\2\u00fb\u00fc\7h\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7w\2\2\u00fe\u00ff"+
		"\7n\2\2\u00ff\u0100\7v\2\2\u0100\u0101\7X\2\2\u0101\u0102\7c\2\2\u0102"+
		"\u0103\7n\2\2\u0103\u0104\7w\2\2\u0104\u0105\7g\2\2\u0105,\3\2\2\2\u0106"+
		"\u0107\7]\2\2\u0107.\3\2\2\2\u0108\u0109\7_\2\2\u0109\60\3\2\2\2\u010a"+
		"\u010b\7r\2\2\u010b\u010c\7w\2\2\u010c\u010d\7d\2\2\u010d\u010e\7n\2\2"+
		"\u010e\u010f\7k\2\2\u010f\u0110\7e\2\2\u0110\62\3\2\2\2\u0111\u0112\7"+
		"e\2\2\u0112\u0113\7q\2\2\u0113\u0114\7o\2\2\u0114\u0115\7o\2\2\u0115\u0116"+
		"\7g\2\2\u0116\u0117\7p\2\2\u0117\u0118\7v\2\2\u0118\64\3\2\2\2\u0119\u011a"+
		"\7v\2\2\u011a\u011b\7g\2\2\u011b\u011c\7o\2\2\u011c\u011d\7r\2\2\u011d"+
		"\u011e\7q\2\2\u011e\u011f\7t\2\2\u011f\u0120\7c\2\2\u0120\u0121\7t\2\2"+
		"\u0121\u0122\7{\2\2\u0122\66\3\2\2\2\u0123\u0124\7u\2\2\u0124\u0125\7"+
		"e\2\2\u0125\u0126\7j\2\2\u0126\u0127\7g\2\2\u0127\u0128\7o\2\2\u0128\u0129"+
		"\7c\2\2\u0129\u012a\7P\2\2\u012a\u012b\7c\2\2\u012b\u012c\7o\2\2\u012c"+
		"\u012d\7g\2\2\u012d8\3\2\2\2\u012e\u012f\7^\2\2\u012f\u0130\7$\2\2\u0130"+
		":\3\2\2\2\u0131\u0136\7$\2\2\u0132\u0135\59\35\2\u0133\u0135\n\2\2\2\u0134"+
		"\u0132\3\2\2\2\u0134\u0133\3\2\2\2\u0135\u0138\3\2\2\2\u0136\u0137\3\2"+
		"\2\2\u0136\u0134\3\2\2\2\u0137\u0139\3\2\2\2\u0138\u0136\3\2\2\2\u0139"+
		"\u013a\7$\2\2\u013a<\3\2\2\2\u013b\u013d\t\3\2\2\u013c\u013b\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\b\37\2\2\u0141>\3\2\2\2\u0142\u0143\7v\2\2\u0143\u0144"+
		"\7c\2\2\u0144\u0145\7d\2\2\u0145\u0146\7n\2\2\u0146\u0147\7g\2\2\u0147"+
		"@\3\2\2\2\u0148\u0149\7\60\2\2\u0149B\3\2\2\2\u014a\u014b\7?\2\2\u014b"+
		"D\3\2\2\2\u014c\u014d\7=\2\2\u014dF\3\2\2\2\u014e\u014f\7X\2\2\u014f\u0150"+
		"\7C\2\2\u0150\u0151\7T\2\2\u0151\u0152\7E\2\2\u0152\u0153\7J\2\2\u0153"+
		"\u0154\7C\2\2\u0154\u01e2\7T\2\2\u0155\u0156\7K\2\2\u0156\u0157\7P\2\2"+
		"\u0157\u0158\7V\2\2\u0158\u0159\7G\2\2\u0159\u015a\7I\2\2\u015a\u015b"+
		"\7G\2\2\u015b\u01e2\7T\2\2\u015c\u015d\7P\2\2\u015d\u015e\7X\2\2\u015e"+
		"\u015f\7C\2\2\u015f\u0160\7T\2\2\u0160\u0161\7E\2\2\u0161\u0162\7J\2\2"+
		"\u0162\u0163\7C\2\2\u0163\u01e2\7T\2\2\u0164\u0165\7F\2\2\u0165\u0166"+
		"\7G\2\2\u0166\u0167\7E\2\2\u0167\u0168\7K\2\2\u0168\u0169\7O\2\2\u0169"+
		"\u016a\7C\2\2\u016a\u01e2\7N\2\2\u016b\u016c\7F\2\2\u016c\u016d\7C\2\2"+
		"\u016d\u016e\7V\2\2\u016e\u01e2\7G\2\2\u016f\u0170\7V\2\2\u0170\u0171"+
		"\7K\2\2\u0171\u0172\7O\2\2\u0172\u01e2\7G\2\2\u0173\u0174\7V\2\2\u0174"+
		"\u0175\7K\2\2\u0175\u0176\7O\2\2\u0176\u0177\7G\2\2\u0177\u0178\7U\2\2"+
		"\u0178\u0179\7V\2\2\u0179\u017a\7C\2\2\u017a\u017b\7O\2\2\u017b\u01e2"+
		"\7R\2\2\u017c\u017d\7U\2\2\u017d\u017e\7G\2\2\u017e\u017f\7E\2\2\u017f"+
		"\u0180\7Q\2\2\u0180\u0181\7P\2\2\u0181\u0182\7F\2\2\u0182\u0183\7F\2\2"+
		"\u0183\u0184\7C\2\2\u0184\u0185\7V\2\2\u0185\u01e2\7G\2\2\u0186\u0187"+
		"\7V\2\2\u0187\u0188\7K\2\2\u0188\u0189\7P\2\2\u0189\u018a\7[\2\2\u018a"+
		"\u018b\7K\2\2\u018b\u018c\7P\2\2\u018c\u01e2\7V\2\2\u018d\u018e\7U\2\2"+
		"\u018e\u018f\7O\2\2\u018f\u0190\7C\2\2\u0190\u0191\7N\2\2\u0191\u0192"+
		"\7N\2\2\u0192\u0193\7K\2\2\u0193\u0194\7P\2\2\u0194\u01e2\7V\2\2\u0195"+
		"\u0196\7D\2\2\u0196\u0197\7K\2\2\u0197\u0198\7I\2\2\u0198\u0199\7K\2\2"+
		"\u0199\u019a\7P\2\2\u019a\u01e2\7V\2\2\u019b\u019c\7T\2\2\u019c\u019d"+
		"\7G\2\2\u019d\u019e\7C\2\2\u019e\u01e2\7N\2\2\u019f\u01a0\7F\2\2\u01a0"+
		"\u01a1\7Q\2\2\u01a1\u01a2\7W\2\2\u01a2\u01a3\7D\2\2\u01a3\u01a4\7N\2\2"+
		"\u01a4\u01e2\7G\2\2\u01a5\u01a6\7H\2\2\u01a6\u01a7\7N\2\2\u01a7\u01a8"+
		"\7Q\2\2\u01a8\u01a9\7C\2\2\u01a9\u01e2\7V\2\2\u01aa\u01ab\7U\2\2\u01ab"+
		"\u01ac\7O\2\2\u01ac\u01ad\7C\2\2\u01ad\u01ae\7N\2\2\u01ae\u01af\7N\2\2"+
		"\u01af\u01b0\7F\2\2\u01b0\u01b1\7G\2\2\u01b1\u01b2\7E\2\2\u01b2\u01b3"+
		"\7K\2\2\u01b3\u01b4\7O\2\2\u01b4\u01b5\7C\2\2\u01b5\u01e2\7N\2\2\u01b6"+
		"\u01b7\7E\2\2\u01b7\u01b8\7N\2\2\u01b8\u01b9\7Q\2\2\u01b9\u01e2\7D\2\2"+
		"\u01ba\u01bb\7P\2\2\u01bb\u01bc\7E\2\2\u01bc\u01bd\7N\2\2\u01bd\u01be"+
		"\7Q\2\2\u01be\u01e2\7D\2\2\u01bf\u01c0\7C\2\2\u01c0\u01c1\7N\2\2\u01c1"+
		"\u01c2\7R\2\2\u01c2\u01c3\7J\2\2\u01c3\u01c4\7C\2\2\u01c4\u01c5\7P\2\2"+
		"\u01c5\u01c6\7W\2\2\u01c6\u01e2\7O\2\2\u01c7\u01c8\7V\2\2\u01c8\u01c9"+
		"\7G\2\2\u01c9\u01ca\7Z\2\2\u01ca\u01e2\7V\2\2\u01cb\u01cc\7U\2\2\u01cc"+
		"\u01cd\7J\2\2\u01cd\u01ce\7Q\2\2\u01ce\u01cf\7T\2\2\u01cf\u01d0\7V\2\2"+
		"\u01d0\u01d1\7V\2\2\u01d1\u01d2\7G\2\2\u01d2\u01d3\7Z\2\2\u01d3\u01e2"+
		"\7V\2\2\u01d4\u01d5\7D\2\2\u01d5\u01d6\7N\2\2\u01d6\u01d7\7Q\2\2\u01d7"+
		"\u01e2\7D\2\2\u01d8\u01d9\7X\2\2\u01d9\u01da\7C\2\2\u01da\u01db\7T\2\2"+
		"\u01db\u01dc\7D\2\2\u01dc\u01dd\7K\2\2\u01dd\u01de\7P\2\2\u01de\u01df"+
		"\7C\2\2\u01df\u01e0\7T\2\2\u01e0\u01e2\7[\2\2\u01e1\u014e\3\2\2\2\u01e1"+
		"\u0155\3\2\2\2\u01e1\u015c\3\2\2\2\u01e1\u0164\3\2\2\2\u01e1\u016b\3\2"+
		"\2\2\u01e1\u016f\3\2\2\2\u01e1\u0173\3\2\2\2\u01e1\u017c\3\2\2\2\u01e1"+
		"\u0186\3\2\2\2\u01e1\u018d\3\2\2\2\u01e1\u0195\3\2\2\2\u01e1\u019b\3\2"+
		"\2\2\u01e1\u019f\3\2\2\2\u01e1\u01a5\3\2\2\2\u01e1\u01aa\3\2\2\2\u01e1"+
		"\u01b6\3\2\2\2\u01e1\u01ba\3\2\2\2\u01e1\u01bf\3\2\2\2\u01e1\u01c7\3\2"+
		"\2\2\u01e1\u01cb\3\2\2\2\u01e1\u01d4\3\2\2\2\u01e1\u01d8\3\2\2\2\u01e2"+
		"H\3\2\2\2\u01e3\u01e4\7v\2\2\u01e4\u01e5\7t\2\2\u01e5\u01e6\7w\2\2\u01e6"+
		"\u01ed\7g\2\2\u01e7\u01e8\7h\2\2\u01e8\u01e9\7c\2\2\u01e9\u01ea\7n\2\2"+
		"\u01ea\u01eb\7u\2\2\u01eb\u01ed\7g\2\2\u01ec\u01e3\3\2\2\2\u01ec\u01e7"+
		"\3\2\2\2\u01edJ\3\2\2\2\u01ee\u01ef\7C\2\2\u01ef\u01f0\7U\2\2\u01f0\u01f5"+
		"\7E\2\2\u01f1\u01f2\7F\2\2\u01f2\u01f3\7U\2\2\u01f3\u01f5\7E\2\2\u01f4"+
		"\u01ee\3\2\2\2\u01f4\u01f1\3\2\2\2\u01f5L\3\2\2\2\u01f6\u01f7\7D\2\2\u01f7"+
		"\u01f8\7a\2\2\u01f8\u01f9\7V\2\2\u01f9\u01fa\7T\2\2\u01fa\u01fb\7G\2\2"+
		"\u01fb\u0205\7G\2\2\u01fc\u01fd\7E\2\2\u01fd\u01fe\7R\2\2\u01fe\u01ff"+
		"\7D\2\2\u01ff\u0200\7a\2\2\u0200\u0201\7V\2\2\u0201\u0202\7T\2\2\u0202"+
		"\u0203\7G\2\2\u0203\u0205\7G\2\2\u0204\u01f6\3\2\2\2\u0204\u01fc\3\2\2"+
		"\2\u0205N\3\2\2\2\u0206\u0208\t\4\2\2\u0207\u0206\3\2\2\2\u0208\u0209"+
		"\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020aP\3\2\2\2\u020b"+
		"\u020c\7E\2\2\u020c\u020d\7Q\2\2\u020d\u020e\7N\2\2\u020e\u020f\7W\2\2"+
		"\u020f\u0210\7O\2\2\u0210\u0211\7P\2\2\u0211\u0212\7U\2\2\u0212\u0213"+
		"\7V\2\2\u0213\u0214\7Q\2\2\u0214\u0215\7T\2\2\u0215\u021f\7G\2\2\u0216"+
		"\u0217\7T\2\2\u0217\u0218\7Q\2\2\u0218\u0219\7Y\2\2\u0219\u021a\7U\2\2"+
		"\u021a\u021b\7V\2\2\u021b\u021c\7Q\2\2\u021c\u021d\7T\2\2\u021d\u021f"+
		"\7G\2\2\u021e\u020b\3\2\2\2\u021e\u0216\3\2\2\2\u021fR\3\2\2\2\u0220\u0221"+
		"\7N\2\2\u0221\u0222\7Q\2\2\u0222\u0223\7I\2\2\u0223\u0224\7I\2\2\u0224"+
		"\u0225\7K\2\2\u0225\u0226\7P\2\2\u0226\u0231\7I\2\2\u0227\u0228\7P\2\2"+
		"\u0228\u0229\7Q\2\2\u0229\u022a\7N\2\2\u022a\u022b\7Q\2\2\u022b\u022c"+
		"\7I\2\2\u022c\u022d\7I\2\2\u022d\u022e\7K\2\2\u022e\u022f\7P\2\2\u022f"+
		"\u0231\7I\2\2\u0230\u0220\3\2\2\2\u0230\u0227\3\2\2\2\u0231T\3\2\2\2\u0232"+
		"\u0233\7E\2\2\u0233\u0234\7W\2\2\u0234\u0235\7T\2\2\u0235\u0236\7T\2\2"+
		"\u0236\u0237\7G\2\2\u0237\u0238\7P\2\2\u0238\u0239\7V\2\2\u0239\u023a"+
		"\7a\2\2\u023a\u023b\7F\2\2\u023b\u023c\7C\2\2\u023c\u023d\7V\2\2\u023d"+
		"\u028e\7G\2\2\u023e\u023f\7E\2\2\u023f\u0240\7W\2\2\u0240\u0241\7T\2\2"+
		"\u0241\u0242\7T\2\2\u0242\u0243\7G\2\2\u0243\u0244\7P\2\2\u0244\u0245"+
		"\7V\2\2\u0245\u0246\7a\2\2\u0246\u0247\7V\2\2\u0247\u0248\7K\2\2\u0248"+
		"\u0249\7O\2\2\u0249\u028e\7G\2\2\u024a\u024b\7E\2\2\u024b\u024c\7W\2\2"+
		"\u024c\u024d\7T\2\2\u024d\u024e\7T\2\2\u024e\u024f\7G\2\2\u024f\u0250"+
		"\7P\2\2\u0250\u0251\7V\2\2\u0251\u0252\7a\2\2\u0252\u0253\7V\2\2\u0253"+
		"\u0254\7K\2\2\u0254\u0255\7O\2\2\u0255\u0256\7G\2\2\u0256\u0257\7U\2\2"+
		"\u0257\u0258\7V\2\2\u0258\u0259\7C\2\2\u0259\u025a\7O\2\2\u025a\u028e"+
		"\7R\2\2\u025b\u025c\7E\2\2\u025c\u025d\7W\2\2\u025d\u025e\7T\2\2\u025e"+
		"\u025f\7T\2\2\u025f\u0260\7G\2\2\u0260\u0261\7P\2\2\u0261\u0262\7V\2\2"+
		"\u0262\u0263\7a\2\2\u0263\u0264\7W\2\2\u0264\u0265\7V\2\2\u0265\u0266"+
		"\7E\2\2\u0266\u0267\7F\2\2\u0267\u0268\7C\2\2\u0268\u0269\7V\2\2\u0269"+
		"\u028e\7G\2\2\u026a\u026b\7E\2\2\u026b\u026c\7W\2\2\u026c\u026d\7T\2\2"+
		"\u026d\u026e\7T\2\2\u026e\u026f\7G\2\2\u026f\u0270\7P\2\2\u0270\u0271"+
		"\7V\2\2\u0271\u0272\7a\2\2\u0272\u0273\7W\2\2\u0273\u0274\7V\2\2\u0274"+
		"\u0275\7E\2\2\u0275\u0276\7V\2\2\u0276\u0277\7K\2\2\u0277\u0278\7O\2\2"+
		"\u0278\u028e\7G\2\2\u0279\u027a\7E\2\2\u027a\u027b\7W\2\2\u027b\u027c"+
		"\7T\2\2\u027c\u027d\7T\2\2\u027d\u027e\7G\2\2\u027e\u027f\7P\2\2\u027f"+
		"\u0280\7V\2\2\u0280\u0281\7a\2\2\u0281\u0282\7W\2\2\u0282\u0283\7V\2\2"+
		"\u0283\u0284\7E\2\2\u0284\u0285\7V\2\2\u0285\u0286\7K\2\2\u0286\u0287"+
		"\7O\2\2\u0287\u0288\7G\2\2\u0288\u0289\7U\2\2\u0289\u028a\7V\2\2\u028a"+
		"\u028b\7C\2\2\u028b\u028c\7O\2\2\u028c\u028e\7R\2\2\u028d\u0232\3\2\2"+
		"\2\u028d\u023e\3\2\2\2\u028d\u024a\3\2\2\2\u028d\u025b\3\2\2\2\u028d\u026a"+
		"\3\2\2\2\u028d\u0279\3\2\2\2\u028eV\3\2\2\2\u028f\u0290\7\61\2\2\u0290"+
		"\u0291\7\61\2\2\u0291\u0295\3\2\2\2\u0292\u0294\13\2\2\2\u0293\u0292\3"+
		"\2\2\2\u0294\u0297\3\2\2\2\u0295\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296"+
		"\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u029a\7\17\2\2\u0299\u0298\3"+
		"\2\2\2\u0299\u029a\3\2\2\2\u029a\u029b\3\2\2\2\u029b\u029c\7\f\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029e\b,\2\2\u029eX\3\2\2\2\u029f\u02a0\7\61\2\2"+
		"\u02a0\u02a1\7,\2\2\u02a1\u02a5\3\2\2\2\u02a2\u02a4\13\2\2\2\u02a3\u02a2"+
		"\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6"+
		"\u02a8\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\7,\2\2\u02a9\u02aa\7\61"+
		"\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ac\b-\2\2\u02acZ\3\2\2\2\21\2\u0134"+
		"\u0136\u013e\u01e1\u01ec\u01f4\u0204\u0209\u021e\u0230\u028d\u0295\u0299"+
		"\u02a5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}