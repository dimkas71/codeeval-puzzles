
public class Puzzle25 {
    public static String oddNumbersInRangeAsString(int start, int end) {
        StringBuilder sb = new StringBuilder();

        for (int i = start; i <= end; i++) {
            if ((i % 2) != 0) {
                sb.append(String.valueOf(i) + "\n");
            }
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(oddNumbersInRangeAsString(1, 99));
    }
}
