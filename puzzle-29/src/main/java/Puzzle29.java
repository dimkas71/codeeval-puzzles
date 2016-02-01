import java.util.ArrayList;
import java.util.Arrays;

public class Puzzle29 {
    public static int[] sortAndMakeUnique(int[] list) {
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            if (!temp.contains(list[i])) {
                temp.add(list[i]);
            }
        }

        int[] result = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            result[i] = temp.get(i);
        }

        Arrays.sort(result);

        return result;
    }
}
