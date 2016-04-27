// Generated from com\warningrc\test\antlr4\script\Coupon.g4 by ANTLR 4.5.1
package com.warningrc.test.antlr4.script;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CouponParser}.
 */
public interface CouponListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CouponParser#build}.
	 * @param ctx the parse tree
	 */
	void enterBuild(CouponParser.BuildContext ctx);
	/**
	 * Exit a parse tree produced by {@link CouponParser#build}.
	 * @param ctx the parse tree
	 */
	void exitBuild(CouponParser.BuildContext ctx);
	/**
	 * Enter a parse tree produced by {@link CouponParser#matchOrder1}.
	 * @param ctx the parse tree
	 */
	void enterMatchOrder1(CouponParser.MatchOrder1Context ctx);
	/**
	 * Exit a parse tree produced by {@link CouponParser#matchOrder1}.
	 * @param ctx the parse tree
	 */
	void exitMatchOrder1(CouponParser.MatchOrder1Context ctx);
	/**
	 * Enter a parse tree produced by {@link CouponParser#matchOrder}.
	 * @param ctx the parse tree
	 */
	void enterMatchOrder(CouponParser.MatchOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link CouponParser#matchOrder}.
	 * @param ctx the parse tree
	 */
	void exitMatchOrder(CouponParser.MatchOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link CouponParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void enterRangeType(CouponParser.RangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CouponParser#rangeType}.
	 * @param ctx the parse tree
	 */
	void exitRangeType(CouponParser.RangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CouponParser#productLines}.
	 * @param ctx the parse tree
	 */
	void enterProductLines(CouponParser.ProductLinesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CouponParser#productLines}.
	 * @param ctx the parse tree
	 */
	void exitProductLines(CouponParser.ProductLinesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CouponParser#productTypes}.
	 * @param ctx the parse tree
	 */
	void enterProductTypes(CouponParser.ProductTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CouponParser#productTypes}.
	 * @param ctx the parse tree
	 */
	void exitProductTypes(CouponParser.ProductTypesContext ctx);
}