package gram.mongo.ast;

public class OrOpPredicateNode extends PredicateNode {

    private PredicateNode leftPredicateNode;

    private PredicateNode rightPredicateNode;

    private OrOpNode orOpNode;

    public OrOpPredicateNode(PredicateNode leftPredicateNode, PredicateNode rightPredicateNode, OrOpNode orOpNode) {
        this.leftPredicateNode = leftPredicateNode;
        this.rightPredicateNode = rightPredicateNode;
        this.orOpNode = orOpNode;
    }

    public PredicateNode getLeftPredicateNode() {
        return leftPredicateNode;
    }

    public PredicateNode getRightPredicateNode() {
        return rightPredicateNode;
    }

    public OrOpNode getOrOpNode() {
        return orOpNode;
    }

    @Override
    public String toString() {
        return String.format("{%s: [%s, %s]}", orOpNode, leftPredicateNode, rightPredicateNode);
    }
}