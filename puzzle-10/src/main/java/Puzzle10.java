
public class Puzzle10 {
    public static Character getCharacterOf(String input) {
        String[] strings = input.split("\\s+");

        int m = Integer.parseInt(strings[strings.length - 1]);


        int j = 1;
        Character result = null;
        for (int i = strings.length - 2; i >= 0; i--) {
            if (j == m) {
                String elem = strings[i];
                result = elem.toCharArray()[0];
            }
            j++;
        }
        return result;
    }
}
