
public class Puzzle4 {

    public static long sumOf(int primeNumbersTo) {
        int primeCounter = 0;
        long sum = 0;
        int i = 1;
        while (primeCounter < primeNumbersTo) {
            if (isPrime(i)) {
                sum += i;
                primeCounter++;
            }
            i++;
        }
        return sum;
    }

    private static boolean isPrime(int number) {
        if (number == 1) return false;
        if (number == 2) return true;
        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt((double) number); i++) {
            if ((number % i) == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
