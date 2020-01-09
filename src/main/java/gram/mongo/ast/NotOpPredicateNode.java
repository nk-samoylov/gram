package gram.mongo.ast;

public class NotOpPredicateNode extends PredicateNode {

    private NotOpNode notOpNode;

    private PredicateNode predicateNode;

    public NotOpPredicateNode(NotOpNode notOpNode, PredicateNode predicateNode) {
        this.notOpNode = notOpNode;
        this.predicateNode = predicateNode;
    }

    public NotOpNode getNotOpNode() {
        return notOpNode;
    }

    public PredicateNode getPredicateNode() {
        return predicateNode;
    }

    @Override
    public String toString() {
        return String.format("{%s: %s}", notOpNode, predicateNode);
    }
}