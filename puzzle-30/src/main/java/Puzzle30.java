import java.util.*;

public class Puzzle30 {
    public static String getIntersectionOfAsString(List<Integer> list1, List<Integer> list2) {
        Set<Integer> result = new HashSet<>();

        for (Integer elem : list1) {
            if (list2.contains(elem)) {
                result.add(elem);
            }
        }

        Integer[] toSort = result.toArray(new Integer[0]);
        Arrays.sort(toSort);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < toSort.length; i++) {
            sb.append(toSort[i] + ",");
        }

        if (sb.toString().isEmpty()) {
            sb.append("\n");
        } else {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
