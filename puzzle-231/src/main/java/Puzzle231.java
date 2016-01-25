import java.util.Arrays;

/**
 * Created by dimkas71 on 24.01.16.
 */
public class Puzzle231 {
    public static Integer[] process(final Integer[] source, int iterations) {
        if (source == null) {
            throw new NullPointerException("Source should not be null");
        }

        Integer[] dest = Arrays.copyOf(source, source.length);

        int i = 0;
        int begin = 0; //points to the start of the dest array
        int end = dest.length - 1; //points to the end of the dest array
        int curIter = 0; //number of iterations,
        int direction = 1;

        boolean isTheFirstIteration = true;

        while (true) {

            if (i == end) {
                end--;
                direction = -1;
                i = i + direction;
            }

            if (i == begin) {
                if (!isTheFirstIteration) {

                    begin++;
                    direction = 1;
                    i = i + direction;

                    curIter += 1;
                } else {
                    isTheFirstIteration = false;
                }
            }
            if (begin >= end) break;
            if (curIter >= iterations) break;

            compareAndSwapIfNextGreater(dest, i, direction);
            i = i + direction;
        }





        return dest;
    }

    private static void compareAndSwapIfNextGreater(Integer[] dest, int currentIndex, Integer direction) {
        if (direction > 0) {

            if (dest[currentIndex] > dest[currentIndex + direction]) {
                int tmp = dest[currentIndex];
                dest[currentIndex] = dest[currentIndex + direction];
                dest[currentIndex + direction] = tmp;
            }
        } else {

            if (dest[currentIndex] < dest[currentIndex + direction]) {
                int tmp = dest[currentIndex];
                dest[currentIndex] = dest[currentIndex + direction];
                dest[currentIndex + direction] = tmp;
            }
        }
    }
}
