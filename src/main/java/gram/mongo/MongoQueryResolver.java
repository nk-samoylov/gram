package gram.mongo;

import gram.mongo.MongoASTBuilder;
import gram.mongo.ast.Node;
import gram.mongo.generated.MongoGramLexer;
import gram.mongo.generated.MongoGramParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MongoQueryResolver {

    public static String buildQuery(String relationalExp) throws IOException {
        // Defining the input stream with the relational algebra expression
        InputStream is = new ByteArrayInputStream(relationalExp.getBytes());
        // tokenizing of the input
        CharStream chs = CharStreams.fromStream(is);
        // Tokenizing the input using RelAlgebraLexer object
        MongoGramLexer lexer = new MongoGramLexer(chs);
        // Creating a buffer of tokens from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Creating a parser that feeds off the token buffer
        MongoGramParser parser = new MongoGramParser(tokens);
        // Beginning the parsing at the expression rule
        ParseTree tree = parser.select();

        MongoASTBuilder treeBuilder = new MongoASTBuilder();
        Node root = treeBuilder.visit(tree);
        System.out.println(root.toString());
        //Creating RelAlgebraInterpreter object to visit the parsed tree
        //RelAlgebraTranslator translator = new RelAlgebraTranslator();

        //Creating the final query from the string returned by the visit function
        //of the RelAlgebraInterpreter object
        //String query = translator.visit(tree) + ";";

        //System.out.println(tree.toStringTree(parser));

        //System.out.println(relationalExp + " ----> " + query);

        //Return the SQL query built to be executed
        //System.out.println(tree.toStringTree(parser));
        //System.out.println(relationalExp + " -----------> " + root.toString());
        //return root.toString();
        return null;
    }
}