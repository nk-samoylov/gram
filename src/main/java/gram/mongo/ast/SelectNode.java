package gram.mongo.ast;

public class SelectNode extends Node {

    private PredicateNode predicateNode;

    private AttrListNode attrListNode;

    private CollectionNameNode collectionNameNode;

    public SelectNode(PredicateNode predicateNode, AttrListNode attrListNode, CollectionNameNode collectionNameNode) {
        this.predicateNode = predicateNode;
        this.attrListNode = attrListNode;
        this.collectionNameNode = collectionNameNode;
    }

    public PredicateNode getPredicateNode() {
        return predicateNode;
    }

    public AttrListNode getAttrListNode() {
        return attrListNode;
    }

    public CollectionNameNode getCollectionNameNode() {
        return collectionNameNode;
    }

    @Override
    public String toString() {
        if (attrListNode != null) {
            return String.format("db.getCollection('%s').find(%s, %s)", collectionNameNode, predicateNode, attrListNode);
        }
        return String.format("db.getCollection('%s').find(%s)", collectionNameNode, predicateNode);
    }
}