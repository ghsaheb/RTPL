// Generated from /home/vahid/IdeaProjects/RTPL/RTPL.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RTPLParser}.
 */
public interface RTPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RTPLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(RTPLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(RTPLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void enterFuncdef(RTPLParser.FuncdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#funcdef}.
	 * @param ctx the parse tree
	 */
	void exitFuncdef(RTPLParser.FuncdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#vardef}.
	 * @param ctx the parse tree
	 */
	void enterVardef(RTPLParser.VardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#vardef}.
	 * @param ctx the parse tree
	 */
	void exitVardef(RTPLParser.VardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#annotationdef}.
	 * @param ctx the parse tree
	 */
	void enterAnnotationdef(RTPLParser.AnnotationdefContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#annotationdef}.
	 * @param ctx the parse tree
	 */
	void exitAnnotationdef(RTPLParser.AnnotationdefContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(RTPLParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(RTPLParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(RTPLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(RTPLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(RTPLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(RTPLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#other_stm}.
	 * @param ctx the parse tree
	 */
	void enterOther_stm(RTPLParser.Other_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#other_stm}.
	 * @param ctx the parse tree
	 */
	void exitOther_stm(RTPLParser.Other_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#if_stm}.
	 * @param ctx the parse tree
	 */
	void enterIf_stm(RTPLParser.If_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#if_stm}.
	 * @param ctx the parse tree
	 */
	void exitIf_stm(RTPLParser.If_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#if_stm_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_stm_else(RTPLParser.If_stm_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#if_stm_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_stm_else(RTPLParser.If_stm_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(RTPLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(RTPLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void enterExpr_assign(RTPLParser.Expr_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_assign}.
	 * @param ctx the parse tree
	 */
	void exitExpr_assign(RTPLParser.Expr_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or(RTPLParser.Expr_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_or}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or(RTPLParser.Expr_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_or_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_tmp(RTPLParser.Expr_or_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_or_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_tmp(RTPLParser.Expr_or_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and(RTPLParser.Expr_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_and}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and(RTPLParser.Expr_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_and_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_and_tmp(RTPLParser.Expr_and_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_and_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_and_tmp(RTPLParser.Expr_and_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq(RTPLParser.Expr_eqContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_eq}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq(RTPLParser.Expr_eqContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_eq_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_eq_tmp(RTPLParser.Expr_eq_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_eq_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_eq_tmp(RTPLParser.Expr_eq_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp(RTPLParser.Expr_cmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_cmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp(RTPLParser.Expr_cmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_cmp_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_cmp_tmp(RTPLParser.Expr_cmp_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_cmp_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_cmp_tmp(RTPLParser.Expr_cmp_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add(RTPLParser.Expr_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_add}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add(RTPLParser.Expr_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_add_tmp(RTPLParser.Expr_add_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_add_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_add_tmp(RTPLParser.Expr_add_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult(RTPLParser.Expr_multContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_mult}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult(RTPLParser.Expr_multContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_mult_tmp(RTPLParser.Expr_mult_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_mult_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_mult_tmp(RTPLParser.Expr_mult_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_un}.
	 * @param ctx the parse tree
	 */
	void enterExpr_un(RTPLParser.Expr_unContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_un}.
	 * @param ctx the parse tree
	 */
	void exitExpr_un(RTPLParser.Expr_unContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func(RTPLParser.Expr_funcContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_func}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func(RTPLParser.Expr_funcContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_func_tmp}.
	 * @param ctx the parse tree
	 */
	void enterExpr_func_tmp(RTPLParser.Expr_func_tmpContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_func_tmp}.
	 * @param ctx the parse tree
	 */
	void exitExpr_func_tmp(RTPLParser.Expr_func_tmpContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void enterExpr_other(RTPLParser.Expr_otherContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#expr_other}.
	 * @param ctx the parse tree
	 */
	void exitExpr_other(RTPLParser.Expr_otherContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#while_stm}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stm(RTPLParser.While_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#while_stm}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stm(RTPLParser.While_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#return_stm}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stm(RTPLParser.Return_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#return_stm}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stm(RTPLParser.Return_stmContext ctx);
	/**
	 * Enter a parse tree produced by {@link RTPLParser#break_stm}.
	 * @param ctx the parse tree
	 */
	void enterBreak_stm(RTPLParser.Break_stmContext ctx);
	/**
	 * Exit a parse tree produced by {@link RTPLParser#break_stm}.
	 * @param ctx the parse tree
	 */
	void exitBreak_stm(RTPLParser.Break_stmContext ctx);
}