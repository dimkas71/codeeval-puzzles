import java.util.logging.Level;
import java.util.logging.Logger;

public class Puzzle76 {
    private static Logger LOGGER = Logger.getLogger(Puzzle76.class.getName());
    public static boolean matchesByRotation(String original, final String template) {
        int length = original.length();

        boolean isMatch = false;

        for (int i = 0; i < length; i++) {
            String rotated = rotateAsString(original, i);
            LOGGER.log(Level.INFO, rotated);

            if (rotated.equals(template)) {
                isMatch = true;
                break;
            }
        }
        return isMatch;
    }

    private static String rotateAsString(String original, int shift) {

        StringBuilder sb = new StringBuilder();

        int length = original.length();
        for (int i = 0; i < length; i++) {
            sb.append(original.charAt((i + shift) % length));
        }

        return sb.toString().trim();
    }
}
