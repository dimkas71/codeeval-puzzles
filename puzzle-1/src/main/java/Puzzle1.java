/**
 * Created by dimkas71 on 26.01.16.
 */
public class Puzzle1 {
    public static String process(String input) {
        Integer[] parsed = parse(input);

        int x = parsed[0];
        int y = parsed[1];
        int count = parsed[2];

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            if ((i % x) == 0) {
                sb.append('F');
            }
            if ((i % y) == 0) {
                sb.append('B');
            }
            if (((i % x) != 0) && ((i % y) != 0)) {
                sb.append(i);
            }

            sb.append(" ");
        }

        return sb.toString().trim();
    }

    private static Integer[] parse(String input) {
        String[] array = input.split("\\s+");

        Integer[] parsed = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            parsed[i] = Integer.parseInt(array[i].trim());
        }

        return parsed;

    }

}
