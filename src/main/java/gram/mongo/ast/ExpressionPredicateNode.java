package gram.mongo.ast;

public class ExpressionPredicateNode extends PredicateNode {

    private BaseExpressionNode baseExpressionNode;

    public ExpressionPredicateNode(BaseExpressionNode baseExpressionNode) {
        this.baseExpressionNode = baseExpressionNode;
    }

    public BaseExpressionNode getBaseExpressionNode() {
        return baseExpressionNode;
    }

    @Override
    public String toString() {
        return baseExpressionNode.toString();
    }
}