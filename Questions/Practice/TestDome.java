package Questions.Practice;

import java.util.stream.Stream;

public class TestDome {
        public static String[] uniqueNames(String[] names1, String[] names2) {
            return Stream.concat(Stream.of(names1), Stream.of(names2)).distinct().toArray(String[]::new);
        }


}
