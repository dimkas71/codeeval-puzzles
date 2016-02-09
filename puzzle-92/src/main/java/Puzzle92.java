
public class Puzzle92 {
    public static String findNextToLastOf(String sentence) {
        String[] words = sentence.split(" ");

        String word = "";

        if (words.length > 1) {
            word = words[words.length - 2];
        }

        return word;
    }
}
