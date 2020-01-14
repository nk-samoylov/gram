import gram.mongo.MongoQueryResolver;

public class TestGram {

    public static void test() throws Exception {
        //MongoQueryResolver.buildQuery("select [age~>'youth'] (movie)");
        //MongoQueryResolver.buildQuery("select [age~>'youth' ~and salary~>'big'] (movie)");
        //MongoQueryResolver.buildQuery("select [age~>'youth' ~and salary~>'big' and ss=34] (movie)");
        //MongoQueryResolver.buildQuery("select [age~>'youth' and salary~>'big' and ss=34] (movie)");

        //MongoQueryResolver.buildQuery("select [] (movie)");
        //MongoQueryResolver.buildQuery("select [] (movie) UNION select [] (movie)");
        //MongoQueryResolver.buildQuery("select [age > 30] (movie)");

        //MongoQueryResolver.buildQuery("select * from movie where ((a > b or c = d) and x = y) or pr = zx");

        //MongoQueryResolver.buildQuery("select * from movie where a > b or c = d or x = y");
        //MongoQueryResolver.buildQuery("select * from movie where a = b");
        MongoQueryResolver.buildQuery("select * from card where _id = 111681 and companyLineOfBusiness = 'Энергетика' and companyLineOfBusiness != 'IT'");

        //MongoQueryResolver.buildQuery("select * from movie where not a > b");

        //Map<String, String> map = null;
        /*OffsetDateTime eventDateTime = OffsetDateTime.now().plusDays(1).truncatedTo(ChronoUnit.DAYS).plusHours(3);
        Date eventDate = Date.from(eventDateTime.toInstant());
        System.out.println(eventDateTime);
        System.out.println(eventDateTime.toInstant());
        System.out.println(eventDate);
        Optional<String> x = null;
        System.out.println(x.isPresent());*/
        //MongoQueryResolver.buildQuery("select [age > 30] (movie) UNION select [] (movie) UNION select [] (movie) MINUS select [] (movie) INTERSECT select [] (movie)");
    }

}
