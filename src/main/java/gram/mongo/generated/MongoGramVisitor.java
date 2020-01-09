// Generated from /home/nsamoylov/projects/testapp/src/main/resources/gram/mongo/MongoGram.g4 by ANTLR 4.7
package gram.mongo.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MongoGramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MongoGramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(MongoGramParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#attrList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrList(MongoGramParser.AttrListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#allAttrsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllAttrsClause(MongoGramParser.AllAttrsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(MongoGramParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(MongoGramParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MongoGramParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(MongoGramParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#constOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstOperand(MongoGramParser.ConstOperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#attr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr(MongoGramParser.AttrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#collectionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionName(MongoGramParser.CollectionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#notOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOp(MongoGramParser.NotOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#andOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOp(MongoGramParser.AndOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#orOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOp(MongoGramParser.OrOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#cCmpOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCCmpOp(MongoGramParser.CCmpOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link MongoGramParser#fCmpOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFCmpOp(MongoGramParser.FCmpOpContext ctx);
}