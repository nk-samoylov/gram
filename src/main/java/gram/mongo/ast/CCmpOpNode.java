package gram.mongo.ast;

import java.util.HashMap;
import java.util.Map;

public class CCmpOpNode extends Node {

    private static final Map<String, String> opMap;

    private String data;

    public CCmpOpNode(String data) {
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
        opMap.put(">", "$gt");
        opMap.put("<", "$lt");
        opMap.put(">=", "$gte");
        opMap.put("<=", "$lte");
        opMap.put("!=", "$ne");
        opMap.put("=", "$eq");
    }
}