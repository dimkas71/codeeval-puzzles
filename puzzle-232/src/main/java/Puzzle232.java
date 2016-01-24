import java.util.Arrays;

/**
 * Created by dimkas71 on 23.01.16.
 */
public class Puzzle232 {

    public static Integer[] process(final Integer[] source, final int iterations) {
        int index = 0;
        int curIter = 0;
        Integer[] dest = Arrays.copyOf(source, source.length);
        while ((index < source.length - 1) && (curIter < iterations)) {
            if (dest[index] > dest[index + 1]) {
                //just swap two neighbors
                int temp = dest[index];
                dest[index] = dest[index + 1];
                dest[index + 1] = temp;

                curIter++;
                index = 0;
            } else {
                index++;
            }
        }

        return dest;
    }
}
