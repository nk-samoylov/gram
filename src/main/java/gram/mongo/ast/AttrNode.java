package gram.mongo.ast;

public class AttrNode extends OperandNode {

    private CollectionNameNode collectionNameNode;

    private IdentifierNode identifierNode;

    public AttrNode(IdentifierNode identifierNode) {
        this.identifierNode = identifierNode;
    }

    public AttrNode(CollectionNameNode collectionNameNode, IdentifierNode identifierNode) {
        this.collectionNameNode = collectionNameNode;
        this.identifierNode = identifierNode;
    }

    public CollectionNameNode getCollectionNameNode() {
        return collectionNameNode;
    }

    public IdentifierNode getIdentifierNode() {
        return identifierNode;
    }

    @Override
    public String toString() {
        return identifierNode.toString();
    }
}