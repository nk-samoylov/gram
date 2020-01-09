package gram.mongo;

import gram.mongo.ast.AndOpNode;
import gram.mongo.ast.AndOpPredicateNode;
import gram.mongo.ast.AttrListNode;
import gram.mongo.ast.AttrNode;
import gram.mongo.ast.CCmpOpNode;
import gram.mongo.ast.CollectionNameNode;
import gram.mongo.ast.ConstOperandNode;
import gram.mongo.ast.CrispExpressionNode;
import gram.mongo.ast.EmptyPredicateNode;
import gram.mongo.ast.BaseExpressionNode;
import gram.mongo.ast.ExpressionPredicateNode;
import gram.mongo.ast.FCmpOpNode;
import gram.mongo.ast.FuzzyExpressionNode;
import gram.mongo.ast.IdentifierNode;
import gram.mongo.ast.Node;
import gram.mongo.ast.NotOpNode;
import gram.mongo.ast.NotOpPredicateNode;
import gram.mongo.ast.OperandNode;
import gram.mongo.ast.OrOpNode;
import gram.mongo.ast.OrOpPredicateNode;
import gram.mongo.ast.PredicateNode;
import gram.mongo.ast.SelectNode;
import gram.mongo.generated.MongoGramBaseVisitor;
import gram.mongo.generated.MongoGramParser;

import java.util.stream.Collectors;

public class MongoASTBuilder extends MongoGramBaseVisitor<Node> {

    @Override
    public Node visitSelect(MongoGramParser.SelectContext ctx) {
        MongoGramParser.CollectionNameContext collectionNameContext = ctx.collectionName();
        CollectionNameNode collectionNameNode = (CollectionNameNode)visitCollectionName(collectionNameContext);
        AttrListNode attrListNode = (AttrListNode) visitAttrList(ctx.attrList());
        PredicateNode predicateNode = new EmptyPredicateNode();
        if (ctx.whereClause() != null) {
            predicateNode = (PredicateNode) visitWhereClause(ctx.whereClause());
        }
        return new SelectNode(predicateNode, attrListNode, collectionNameNode);
    }

    @Override
    public Node visitAttrList(MongoGramParser.AttrListContext ctx) {
        if (ctx.allAttrsClause() != null) {
            return null;
        }
        return new AttrListNode(ctx.attr().stream().map(a -> (AttrNode)visitAttr(a)).collect(Collectors.toList()));
    }

    @Override
    public Node visitWhereClause(MongoGramParser.WhereClauseContext ctx) {
        return visitPredicate(ctx.predicate());
    }

    @Override
    public PredicateNode visitPredicate(MongoGramParser.PredicateContext ctx) {
        if (ctx.expression() != null) {
            MongoGramParser.ExpressionContext exprCtx = ctx.expression();
            OperandNode leftOp = visitOperand(exprCtx.operand(0));
            OperandNode rightOp = visitOperand(exprCtx.operand(1));
            BaseExpressionNode expressionNode;
            if (exprCtx.cCmpOp() != null) {
                CCmpOpNode cCmpOpNode = visitCCmpOp(exprCtx.cCmpOp());
                expressionNode = new CrispExpressionNode(leftOp, rightOp, cCmpOpNode);
            } else {
                FCmpOpNode fCmpOpNode = visitFCmpOp(exprCtx.fCmpOp());
                expressionNode = new FuzzyExpressionNode(leftOp, rightOp, fCmpOpNode);
            }
            return new ExpressionPredicateNode(expressionNode);
        } else if (ctx.notOp() != null) {
            NotOpNode notOpNode = visitNotOp(ctx.notOp());
            PredicateNode predicateNode = visitPredicate(ctx.predicate(0));
            return new NotOpPredicateNode(notOpNode, predicateNode);
        } else if (ctx.andOp() != null) {
            AndOpNode andOpNode = visitAndOp(ctx.andOp());
            PredicateNode leftPredicateNode = visitPredicate(ctx.predicate(0));
            PredicateNode rightPredicateNode = visitPredicate(ctx.predicate(1));
            return new AndOpPredicateNode(leftPredicateNode, rightPredicateNode, andOpNode);
        } else if (ctx.orOp() != null) {
            OrOpNode orOpNode = visitOrOp(ctx.orOp());
            PredicateNode leftPredicateNode = visitPredicate(ctx.predicate(0));
            PredicateNode rightPredicateNode = visitPredicate(ctx.predicate(1));
            return new OrOpPredicateNode(leftPredicateNode, rightPredicateNode, orOpNode);
        } else if (ctx.LPAREN() != null){
            return visitPredicate(ctx.predicate(0));
        }
        return null;
    }

    @Override
    public AndOpNode visitAndOp(MongoGramParser.AndOpContext ctx) {
        return new AndOpNode();
    }

    @Override
    public OrOpNode visitOrOp(MongoGramParser.OrOpContext ctx) {
        return new OrOpNode();
    }

    @Override
    public NotOpNode visitNotOp(MongoGramParser.NotOpContext ctx) {
        return new NotOpNode();
    }

    @Override
    public CCmpOpNode visitCCmpOp(MongoGramParser.CCmpOpContext ctx) {
        return new CCmpOpNode(ctx.getText());
    }

    @Override
    public FCmpOpNode visitFCmpOp(MongoGramParser.FCmpOpContext ctx) {
        return new FCmpOpNode(ctx.getText());
    }

    @Override
    public CollectionNameNode visitCollectionName(MongoGramParser.CollectionNameContext ctx) {
        return new CollectionNameNode(ctx.ID().toString());
    }

    @Override
    public OperandNode visitOperand(MongoGramParser.OperandContext ctx) {
        if (ctx.attr() != null) {
            return visitAttr(ctx.attr());
        }

        return visitConstOperand(ctx.constOperand());
    }

    @Override
    public AttrNode visitAttr(MongoGramParser.AttrContext ctx) {
        if (ctx.collectionName() == null) {
            return new AttrNode(new IdentifierNode(ctx.ID().toString()));
        }

        return new AttrNode(new CollectionNameNode(ctx.collectionName().ID().toString()),
                new IdentifierNode(ctx.ID().toString()));
    }

    @Override
    public ConstOperandNode visitConstOperand(MongoGramParser.ConstOperandContext ctx) {
        return new ConstOperandNode(ctx.getText());
    }
}