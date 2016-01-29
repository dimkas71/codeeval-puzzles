
public class Puzzle18 {
    public static int smallestOf(int x, int n) {
        int result = n;

        while (result < x) {
            result = 2 * result;
        }

        return result;
    }
}
