
public class Puzzle112 {
    public static String swap(String source) {
        String[] tmp = source.split(":");

        String[] numbers = tmp[0].split(" ");
        String[] operations = tmp[1].split(",");

        Integer[] integers = new Integer[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            integers[i] = Integer.valueOf(numbers[i].trim());
        }

        for (int i = 0; i < operations.length; i++) {
            String[] indices = operations[i].split("-");

            int from = Integer.valueOf(indices[0].trim());
            int to = Integer.valueOf(indices[1].trim());

            int tmp2 = integers[from];
            integers[from] = integers[to];
            integers[to] = tmp2;

        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < integers.length; i++) {
            sb.append(integers[i] + " ");
        }

        return sb.toString().trim();


    }
}
