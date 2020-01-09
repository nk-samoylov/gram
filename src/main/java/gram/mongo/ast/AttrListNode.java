package gram.mongo.ast;

import java.util.List;
import java.util.stream.Collectors;

public class AttrListNode extends Node {

    private List<AttrNode> attrNodes;

    public AttrListNode(List<AttrNode> attrNodes) {
        this.attrNodes = attrNodes;
    }

    public List<AttrNode> getAttrNodes() {
        return attrNodes;
    }

    @Override
    public String toString() {
        return String.format("{%s}",
                String.join(",", attrNodes.stream()
                        .map(x -> String.format("%s: 1", x.toString()))
                        .collect(Collectors.toList())));
    }
}