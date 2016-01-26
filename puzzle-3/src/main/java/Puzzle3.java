
public class Puzzle3 {
    public static int largestPrimePalindromeOf(int n) {

        int primePalindrome = 1;

        for (int i = 1; i < n; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                primePalindrome = i;
            }
        }
        return primePalindrome;
    }

    private static boolean isPalindrome(int k) {
        String original = ((Integer)k).toString();

        StringBuilder sb = new StringBuilder();

        for (int i = original.length() - 1; i >=0 ; i--) {
            sb.append(original.substring(i, i + 1));
        }

        String reverse = sb.toString();


        return original.equals(reverse);
    }

    private static boolean isPrime(int i) {
        boolean isPrime = true;

        if (i <= 2) return isPrime;

        for (int j = 2; j <= Math.sqrt((double) i); j++) {
            if ((i % j) == 0) {
                isPrime = false;
                break;
            }

        }
        return isPrime;
    }
}
