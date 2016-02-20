import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilePattern {

    public String matchAll(String thatPattern, String sentence) {

        String regex = compile(thatPattern);

        Pattern pattern = Pattern.compile(regex);

        String[] words = sentence.split(" ");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (matcher.find()) {
                sb.append(matcher.group())
                        .append(" ");

            }
        }
        if (sb.toString().trim().isEmpty()) {
            sb.append("-");
        }
        return sb.toString().trim();
    }

    private String compile(String pattern) {

        StringBuilder sb = new StringBuilder();

        sb.append("\\b");

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            if (c == '*') {
                sb.append(".{0,}");
            } else if (c == '?') {
                sb.append(".{1}");
            } else if (c == '.') {
                sb.append("\\.");
            } else {
                sb.append(c);
            }
        }

        sb.append("\\b");

        return sb.toString();
    }
}
