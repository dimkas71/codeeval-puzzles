
public class Puzzle21 {
    public static int getSumOfDigits(int aNumber) {
        String stringifiedNumber = String.valueOf(Math.abs(aNumber));

        int sum = 0;

        for (int i = 0; i < stringifiedNumber.length(); i++) {
            sum += Integer.parseInt(stringifiedNumber.substring(i, i + 1));
        }

        return sum;
    }
}
