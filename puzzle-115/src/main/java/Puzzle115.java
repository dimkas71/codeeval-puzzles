import java.util.ArrayList;
import java.util.List;

public class Puzzle115 {
    public static String splitAndJoin(String list) {
        String[] splitted = list.split(",");

        List<String> numbers = new ArrayList<String>();
        List<String> words = new ArrayList<String>();

        for (int i = 0; i < splitted.length; i++) {
            String elemTrimmed = splitted[i].trim();
            if (Character.isDigit(elemTrimmed.charAt(0))) {
                numbers.add(elemTrimmed);
            } else {
                words.add(elemTrimmed);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(word.trim() + ",");
        }

        if (sb.length() > 0) {
            sb.deleteCharAt(sb.lastIndexOf(","));
            sb.append("|");
        }


        for (String number : numbers) {
            sb.append(number.trim() + ",");
        }

        sb.deleteCharAt(sb.lastIndexOf(","));

        return sb.toString().trim();

    }
}
