import java.util.HashMap;
import java.util.Map;

public class Puzzle12 {
    public static String firstNonRepeatedOf(String input) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            String key = input.substring(i, i + 1);
            Integer count = map.get(key);

            map.put(key, count == null ? 1 : count + 1);
        }

        String symbol = "";

        for (int i = 0; i < input.length(); i++) {
            String key = input.substring(i, i + 1);
            if (map.get(key) == 1) {
                symbol = key;
                break;
            }
        }

        return symbol;
    }
}
