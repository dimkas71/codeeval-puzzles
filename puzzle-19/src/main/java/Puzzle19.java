import java.util.logging.Level;
import java.util.logging.Logger;

public class Puzzle19 {

    private static Logger LOGGER = Logger.getLogger(Puzzle19.class.getSimpleName());

    public static boolean checkIfSameBitsIn(int aNumber, int aPos1, int aPos2) {
        boolean answer = false;

        String s = Integer.toBinaryString(aNumber);

        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        LOGGER.log(Level.INFO, String.format("reversed bytes for a number %d is %s", aNumber, sb.toString()));
        String reversed = sb.toString();

        return reversed.charAt(aPos1 - 1) == reversed.charAt(aPos2 - 1);
    }
}
