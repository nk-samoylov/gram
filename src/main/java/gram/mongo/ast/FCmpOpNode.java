package gram.mongo.ast;

import java.util.HashMap;
import java.util.Map;

public class FCmpOpNode extends Node {

    private static final Map<String, String> opMap;

    private String data;

    public FCmpOpNode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return opMap.get(data);
    }

    static {
        opMap = new HashMap<>();
        opMap.put("~>", "$fgt");
        opMap.put("<~", "$flt");
        opMap.put("~>=", "$fgte");
        opMap.put("<=~", "$flte");
        opMap.put("~!=", "$fne");
        opMap.put("~=", "$feq");
    }
}