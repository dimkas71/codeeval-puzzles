import java.util.logging.Logger;

public class Puzzle96 {
    private static Logger LOG = Logger.getLogger(Puzzle96.class.getSimpleName());
    public static String swap(final String source) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            char ch = source.charAt(i);

            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }


        }
        LOG.info(sb.toString());

        return sb.toString();
    }

}
