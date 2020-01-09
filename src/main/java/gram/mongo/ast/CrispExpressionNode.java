package gram.mongo.ast;

public class CrispExpressionNode extends BaseExpressionNode {

    private CCmpOpNode cCmpOpNode;

    public CrispExpressionNode(OperandNode leftOperand, OperandNode rightOperand, CCmpOpNode CCmpOpNode) {
        super(leftOperand, rightOperand);
        this.cCmpOpNode = CCmpOpNode;
    }

    public CCmpOpNode getCCmpOpNode() {
        return cCmpOpNode;
    }

    @Override
    public String toString() {
        if (cCmpOpNode.getData().equals("=")) {
            return String.format("{%s: %s}", leftOperand, rightOperand);
        }
        return String.format("{%s: {%s: %s}}", leftOperand, cCmpOpNode, rightOperand);
    }
}