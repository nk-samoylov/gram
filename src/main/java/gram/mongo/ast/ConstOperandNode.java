package gram.mongo.ast;

public class ConstOperandNode extends OperandNode {

    private String data;

    public ConstOperandNode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return data;
    }
}