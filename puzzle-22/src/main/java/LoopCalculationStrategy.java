/**
 * Created by dimkas71 on 30.01.16.
 */
public class LoopCalculationStrategy implements CalculationStrategy {
    @Override
    public long fib(long aNumber) {
        if (aNumber == 0) return 0;
        if (aNumber == 1) return 1;

        long[] fibs = new long[(int) aNumber + 1];
        fibs[0] = 0;
        fibs[1] = 1;

        for (int i = 2; i <= aNumber; i++) {
            fibs[i] = fibs[i - 2] + fibs[i - 1];
        }

        return fibs[(int) aNumber];
    }
}
