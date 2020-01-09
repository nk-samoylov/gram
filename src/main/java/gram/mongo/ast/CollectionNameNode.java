package gram.mongo.ast;

public class CollectionNameNode extends Node {

    private String identifier;

    public CollectionNameNode(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return identifier;
    }
}