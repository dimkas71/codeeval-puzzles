
public class DefaultCalculationStrategy implements CalculationStrategy{

    @Override
    public long fib(long aNumber) {
        if (aNumber <= 0) return 0;
        if (aNumber == 1) return 1;

        return fib(aNumber - 2) + fib(aNumber - 1);
    }
}
