// Generated from com\warningrc\test\antlr4\script\Coupon.g4 by ANTLR 4.5.1
package com.warningrc.test.antlr4.script;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CouponParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		OR=10, AND=11, STRING=12, NUMBER=13, WS=14;
	public static final int
		RULE_build = 0, RULE_matchOrder1 = 1, RULE_matchOrder = 2, RULE_rangeType = 3, 
		RULE_productLines = 4, RULE_productTypes = 5;
	public static final String[] ruleNames = {
		"build", "matchOrder1", "matchOrder", "rangeType", "productLines", "productTypes"
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

	@Override
	public String getGrammarFileName() { return "Coupon.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CouponParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BuildContext extends ParserRuleContext {
		public MatchOrder1Context matchOrder1() {
			return getRuleContext(MatchOrder1Context.class,0);
		}
		public BuildContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_build; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).enterBuild(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).exitBuild(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CouponVisitor ) return ((CouponVisitor<? extends T>)visitor).visitBuild(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BuildContext build() throws RecognitionException {
		BuildContext _localctx = new BuildContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_build);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			matchOrder1();
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

	public static class MatchOrder1Context extends ParserRuleContext {
		public MatchOrderContext matchOrder() {
			return getRuleContext(MatchOrderContext.class,0);
		}
		public MatchOrder1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchOrder1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).enterMatchOrder1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).exitMatchOrder1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CouponVisitor ) return ((CouponVisitor<? extends T>)visitor).visitMatchOrder1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchOrder1Context matchOrder1() throws RecognitionException {
		MatchOrder1Context _localctx = new MatchOrder1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_matchOrder1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(T__0);
			setState(15);
			matchOrder();
			setState(16);
			match(T__1);
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

	public static class MatchOrderContext extends ParserRuleContext {
		public RangeTypeContext rangeType() {
			return getRuleContext(RangeTypeContext.class,0);
		}
		public ProductLinesContext productLines() {
			return getRuleContext(ProductLinesContext.class,0);
		}
		public ProductTypesContext productTypes() {
			return getRuleContext(ProductTypesContext.class,0);
		}
		public MatchOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).enterMatchOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).exitMatchOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CouponVisitor ) return ((CouponVisitor<? extends T>)visitor).visitMatchOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchOrderContext matchOrder() throws RecognitionException {
		MatchOrderContext _localctx = new MatchOrderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_matchOrder);
		try {
			setState(61);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				rangeType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				rangeType();
				setState(21);
				match(T__2);
				setState(22);
				productLines();
				setState(23);
				match(T__2);
				setState(24);
				productTypes();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(27);
				rangeType();
				setState(28);
				match(T__2);
				setState(29);
				productTypes();
				setState(30);
				match(T__2);
				setState(31);
				productLines();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(34);
				productLines();
				setState(35);
				match(T__2);
				setState(36);
				rangeType();
				setState(37);
				match(T__2);
				setState(38);
				productTypes();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(41);
				productLines();
				setState(42);
				match(T__2);
				setState(43);
				productTypes();
				setState(44);
				match(T__2);
				setState(45);
				rangeType();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(48);
				productTypes();
				setState(49);
				match(T__2);
				setState(50);
				rangeType();
				setState(51);
				match(T__2);
				setState(52);
				productLines();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(55);
				productTypes();
				setState(56);
				match(T__2);
				setState(57);
				productLines();
				setState(58);
				match(T__2);
				setState(59);
				rangeType();
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

	public static class RangeTypeContext extends ParserRuleContext {
		public RangeTypeContext rangeType() {
			return getRuleContext(RangeTypeContext.class,0);
		}
		public RangeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rangeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).enterRangeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).exitRangeType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CouponVisitor ) return ((CouponVisitor<? extends T>)visitor).visitRangeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RangeTypeContext rangeType() throws RecognitionException {
		RangeTypeContext _localctx = new RangeTypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rangeType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__3);
			setState(64);
			match(T__4);
			setState(65);
			rangeType();
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

	public static class ProductLinesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CouponParser.STRING, 0); }
		public ProductLinesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productLines; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).enterProductLines(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).exitProductLines(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CouponVisitor ) return ((CouponVisitor<? extends T>)visitor).visitProductLines(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductLinesContext productLines() throws RecognitionException {
		ProductLinesContext _localctx = new ProductLinesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_productLines);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__5);
			setState(68);
			match(T__4);
			setState(69);
			match(T__6);
			setState(71);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(70);
				match(STRING);
				}
			}

			setState(73);
			match(T__7);
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

	public static class ProductTypesContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CouponParser.STRING, 0); }
		public ProductTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_productTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).enterProductTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CouponListener ) ((CouponListener)listener).exitProductTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CouponVisitor ) return ((CouponVisitor<? extends T>)visitor).visitProductTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProductTypesContext productTypes() throws RecognitionException {
		ProductTypesContext _localctx = new ProductTypesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_productTypes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__8);
			setState(76);
			match(T__4);
			setState(77);
			match(T__6);
			setState(79);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(78);
				match(STRING);
				}
			}

			setState(81);
			match(T__7);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20V\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6J\n\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\5\7R\n\7\3\7\3\7\3\7\2\2\b\2\4\6\b\n\f\2\2]\2"+
		"\16\3\2\2\2\4\20\3\2\2\2\6?\3\2\2\2\bA\3\2\2\2\nE\3\2\2\2\fM\3\2\2\2\16"+
		"\17\5\4\3\2\17\3\3\2\2\2\20\21\7\3\2\2\21\22\5\6\4\2\22\23\7\4\2\2\23"+
		"\5\3\2\2\2\24@\5\b\5\2\25@\3\2\2\2\26\27\5\b\5\2\27\30\7\5\2\2\30\31\5"+
		"\n\6\2\31\32\7\5\2\2\32\33\5\f\7\2\33@\3\2\2\2\34@\3\2\2\2\35\36\5\b\5"+
		"\2\36\37\7\5\2\2\37 \5\f\7\2 !\7\5\2\2!\"\5\n\6\2\"@\3\2\2\2#@\3\2\2\2"+
		"$%\5\n\6\2%&\7\5\2\2&\'\5\b\5\2\'(\7\5\2\2()\5\f\7\2)@\3\2\2\2*@\3\2\2"+
		"\2+,\5\n\6\2,-\7\5\2\2-.\5\f\7\2./\7\5\2\2/\60\5\b\5\2\60@\3\2\2\2\61"+
		"@\3\2\2\2\62\63\5\f\7\2\63\64\7\5\2\2\64\65\5\b\5\2\65\66\7\5\2\2\66\67"+
		"\5\n\6\2\67@\3\2\2\28@\3\2\2\29:\5\f\7\2:;\7\5\2\2;<\5\n\6\2<=\7\5\2\2"+
		"=>\5\b\5\2>@\3\2\2\2?\24\3\2\2\2?\25\3\2\2\2?\26\3\2\2\2?\34\3\2\2\2?"+
		"\35\3\2\2\2?#\3\2\2\2?$\3\2\2\2?*\3\2\2\2?+\3\2\2\2?\61\3\2\2\2?\62\3"+
		"\2\2\2?8\3\2\2\2?9\3\2\2\2@\7\3\2\2\2AB\7\6\2\2BC\7\7\2\2CD\5\b\5\2D\t"+
		"\3\2\2\2EF\7\b\2\2FG\7\7\2\2GI\7\t\2\2HJ\7\16\2\2IH\3\2\2\2IJ\3\2\2\2"+
		"JK\3\2\2\2KL\7\n\2\2L\13\3\2\2\2MN\7\13\2\2NO\7\7\2\2OQ\7\t\2\2PR\7\16"+
		"\2\2QP\3\2\2\2QR\3\2\2\2RS\3\2\2\2ST\7\n\2\2T\r\3\2\2\2\5?IQ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}