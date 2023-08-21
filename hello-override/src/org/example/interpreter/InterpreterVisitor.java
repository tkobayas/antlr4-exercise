// Generated from /home/tkobayas/usr/git/tkobayas/antlr4-exercise/hello-override/src/Interpreter.g4 by ANTLR 4.10.1
package org.example.interpreter;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link InterpreterParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface InterpreterVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(InterpreterParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link InterpreterParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(InterpreterParser.ExpressionContext ctx);
}