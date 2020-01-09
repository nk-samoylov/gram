package gram.mongo.ast;

public class AndOpPredicateNode extends PredicateNode {

    private PredicateNode leftPredicateNode;

    private PredicateNode rightPredicateNode;

    private AndOpNode andOpNode;

    public AndOpPredicateNode(PredicateNode leftPredicateNode, PredicateNode rightPredicateNode, AndOpNode andOpNode) {
        this.leftPredicateNode = leftPredicateNode;
        this.rightPredicateNode = rightPredicateNode;
        this.andOpNode = andOpNode;
    }

    public PredicateNode getLeftPredicateNode() {
        return leftPredicateNode;
    }

    public PredicateNode getRightPredicateNode() {
        return rightPredicateNode;
    }

    public AndOpNode getAndOpNode() {
        return andOpNode;
    }

    @Override
    public String toString() {
        return String.format("{%s: [%s, %s]}", andOpNode, leftPredicateNode, rightPredicateNode);
    }
}