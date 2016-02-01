public class Puzzle32 {
    public static boolean checkIfContainsAtTheEnd(String first, String second) {

        if (second.length() > first.length()) {
            return false;
        }

        int p1 = first.length() - 1;
        int p2 = second.length() - 1;

        while (p2 >= 0) {

            if (second.charAt(p2) != first.charAt(p1)) {
                return false;
            }

            p1--;
            p2--;
        }


        return true;
    }
}
