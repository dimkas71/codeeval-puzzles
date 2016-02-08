
public class Puzzle63 {
    public static int numberOfPrimesOf(int start, int end) {
        int result = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                result++;
            }
        }
        return result;
    }

    private static boolean isPrime(int i) {
        if (i == 1) return false;
        int end = (int)Math.sqrt(i);
        boolean result = true;
        for (int j = 2; j <= end; j++) {
            if ((i % j) == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
