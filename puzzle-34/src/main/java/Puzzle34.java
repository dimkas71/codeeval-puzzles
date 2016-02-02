import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Puzzle34 {

    private static final String NULL = "NULL";

    public static String getPairsFor(List<Integer> list, int x) {
        String defaultValue = NULL;

        Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

        for (Integer i : list) {
            int t = x - i;

            if (list.contains(t) && (i <= t)) {
                pairs.put(i, t);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {
            sb.append("" + entry.getKey() + "," + entry.getValue() + ";");
        }

        String result = sb.toString();

        if (!result.isEmpty()) {
            result = result.substring(0, result.length() - 1);
        }


        return result.isEmpty() ? defaultValue : result;
    }
}
