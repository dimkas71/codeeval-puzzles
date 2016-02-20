
public class StringConverter {
    private static final String SUFFIX = "... <Read More>";
    public static final int MAX_STRING_LENGHT = 55;
    public static final int NEW_LENGTH = 40;

    public String convert(String source) {

        StringBuilder sb = new StringBuilder();

        if (source.length() >= MAX_STRING_LENGHT) {
            String newString = source.substring(0, NEW_LENGTH);
            sb.append(normailize(newString));
            sb.append(SUFFIX);
        } else {
            sb.append(source);
        }

        return sb.toString().trim();
    }

    private String normailize(String toNormalizeString) {
        char space = ' ';

        int trimToIndex = toNormalizeString.length() - 1;

        for (int i = toNormalizeString.length() - 1; i >= 0; i--) {
            if (toNormalizeString.charAt(i) == space) {
                trimToIndex = i;
                break;
            }
        }

        return toNormalizeString.substring(0, trimToIndex).trim();
    }
}
