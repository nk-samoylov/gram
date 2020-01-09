package gram.mongo.ast;

public abstract class BaseExpressionNode extends Node {

    protected OperandNode leftOperand;

    protected OperandNode rightOperand;

    public BaseExpressionNode(OperandNode leftOperand, OperandNode rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public OperandNode getLeftOperand() {
        return leftOperand;
    }

    public OperandNode getRightOperand() {
        return rightOperand;
    }
}