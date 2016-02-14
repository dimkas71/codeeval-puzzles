import java.util.HashMap;
import java.util.Map;

public class Puzzle104 {
    private static Map<String, Integer> sDictionary = new HashMap<>();

    static {

        sDictionary.put("zero", 0);
        sDictionary.put("one", 1);
        sDictionary.put("two", 2);
        sDictionary.put("three", 3);
        sDictionary.put("four", 4);
        sDictionary.put("five", 5);
        sDictionary.put("six", 6);
        sDictionary.put("seven", 7);
        sDictionary.put("eight", 8);
        sDictionary.put("nine", 9);

    }

    public static String convertToNumbersAsString(String source) {
        StringBuilder sb = new StringBuilder();
        String[] words = source.split(";");
        for (int i = 0; i < words.length; i++) {
            sb.append(sDictionary.get(words[i]));
        }

        return sb.toString();
    }
}
