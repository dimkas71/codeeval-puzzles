import java.util.HashMap;
import java.util.Map;

public class Puzzle144 {
    public static String digitsOf(int a, int n) {
        int[] sequence = new int[n];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(String.format("%d", i), 0);
        }

        for (int i = 0; i < n ; i++) {
            sequence[i] = (int)Math.pow(a, i + 1);
        }

        for (int i = 0; i < sequence.length; i++) {
            String s = String.valueOf(sequence[i]);
            String key = s.substring(s.length() - 1);
            Integer value = map.getOrDefault(key, 0);
            map.put(key, ++value);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            String key = String.valueOf(i);
            Integer value = map.get(key);

            sb.append(String.format("%s: %d, ",  key, value));

        }


        sb.deleteCharAt(sb.lastIndexOf(","));

        return sb.toString().trim();



    }
}
