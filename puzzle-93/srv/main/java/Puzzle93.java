
public class Puzzle93 {
    public static String capitalizeWordsIn(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String header = String.valueOf(words[0].charAt(0)).toUpperCase();
            String tail = words[0].substring(1, words[0].length());
            sb.append(header);
            sb.append(tail + " ");
        }


        return sb.toString().trim();
    }
}
