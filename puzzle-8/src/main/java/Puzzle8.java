
public class Puzzle8 {
    public static String reverseWordsOf(String input) {

        String[] words = input.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >=0 ; i--) {
            sb.append(words[i].trim() + " ");
        }

        return sb.toString().trim();
    }
}
