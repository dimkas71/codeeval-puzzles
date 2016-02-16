import java.util.*;

public class Puzzle132 {
    public static int findMajorOf(String list) {
        String[] splitted = list.split(",");
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < splitted.length; i++) {
            String key = splitted[i].trim();

            Integer value = map.getOrDefault(key, 0);
            map.put(key, ++value);
        }

        int maxValue = Integer.MIN_VALUE;
        String key = "-1";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            Integer value = entry.getValue();
            if (value > maxValue) {
                key = entry.getKey();
                maxValue = value;
            }
        }

        int result = -1;

        if (maxValue > splitted.length / 2) {
            result = Integer.valueOf(key.trim());
        }
        return result;
    }
}
