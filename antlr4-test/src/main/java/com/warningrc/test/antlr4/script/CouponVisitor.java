// Generated from com\warningrc\test\antlr4\script\Coupon.g4 by ANTLR 4.5.1
package com.warningrc.test.antlr4.script;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CouponParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CouponVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CouponParser#build}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuild(CouponParser.BuildContext ctx);
	/**
	 * Visit a parse tree produced by {@link CouponParser#matchOrder1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchOrder1(CouponParser.MatchOrder1Context ctx);
	/**
	 * Visit a parse tree produced by {@link CouponParser#matchOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchOrder(CouponParser.MatchOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link CouponParser#rangeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeType(CouponParser.RangeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CouponParser#productLines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductLines(CouponParser.ProductLinesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CouponParser#productTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProductTypes(CouponParser.ProductTypesContext ctx);
}