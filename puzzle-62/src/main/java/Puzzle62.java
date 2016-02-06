
public class Puzzle62 {
    public static int mod(int n, int m) {
        int div = n / m;
        int result = n - div * m;

        return result;
    }
}
