package gram.mongo.ast;

public class FuzzyExpressionNode extends BaseExpressionNode {

    private FCmpOpNode fCmpOpNode;

    public FuzzyExpressionNode(OperandNode leftOperand, OperandNode rightOperand, FCmpOpNode fCmpOpNode) {
        super(leftOperand, rightOperand);
        this.fCmpOpNode = fCmpOpNode;
    }

    public FCmpOpNode getFCmpOpNode() {
        return fCmpOpNode;
    }

    @Override
    public String toString() {
        if (fCmpOpNode.getData().equals("=")) {
            return String.format("{%s: %s}", leftOperand, rightOperand);
        }
        return String.format("{%s: {%s: %s}}", leftOperand, fCmpOpNode, rightOperand);
    }
}