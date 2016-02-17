
public class Puzzle147 {
    public static String writeLetterCaseRatio(final String expression) {
        int lowerCount = 0;
        int upperCount = 0;

        for (int i = 0; i < expression.length(); i++) {
            if (Character.isLowerCase(expression.charAt(i))) {
                lowerCount++;
            } else if (Character.isUpperCase(expression.charAt(i))) {
                upperCount++;
            }
        }


        int total = lowerCount + upperCount;

        return String.format("lowercase: %.2f uppercase: %.2f", (float)lowerCount / total * 100,
                (float)upperCount / total * 100);


    }
}
