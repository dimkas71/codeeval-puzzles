
public class Puzzle111 {
    public static String findLongestOf(final String sentence) {
        String[] words = sentence.trim().split(" ");
        if (words.length == 0) return "";

        String longestWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (longestWord.length() < words[i].length()) {
                longestWord = words[i];
            }
        }

        return longestWord;
    }
}
