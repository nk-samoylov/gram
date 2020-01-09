package gram.mongo.ast;

public class ParenthesesPredicateNode extends PredicateNode {

    private PredicateNode predicateNode;

    public ParenthesesPredicateNode(PredicateNode predicateNode) {
        this.predicateNode = predicateNode;
    }

    public PredicateNode getPredicateNode() {
        return predicateNode;
    }

    @Override
    public String toString() {
        return predicateNode.toString();
    }
}