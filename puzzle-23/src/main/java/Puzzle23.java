
public class Puzzle23 {
    public static void main(String[] args) {
        int n = 12;

        printMultiplyTableOf(n);

        System.out.println("");
    }

    private static void printMultiplyTableOf(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("");

            for (int j = 1; j <= n; j++) {
                System.out.print(String.format("%4d", i * j));
            }
        }
    }
}
