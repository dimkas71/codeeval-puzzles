import java.util.Arrays;
import java.util.Comparator;

public class Puzzle2 {
    public static String[] process(final String[] input) {

        //get slice of input except the first element
        String[] temp = Arrays.copyOfRange(input, 1, input.length);


        //sort it with descending on sting's length order
        Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });

        //collect the result
        final int linesToOutput = Integer.parseInt(input[0].trim());

        String[] output = new String[linesToOutput];

        for (int i = 0; i < linesToOutput; i++) {
            output[i] = temp[i];
        }

        return output;
    }
}
