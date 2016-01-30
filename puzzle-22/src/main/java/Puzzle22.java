public class Puzzle22 {
    private CalculationStrategy strategy;

    public Puzzle22() {
        this.strategy = new DefaultCalculationStrategy();
    }

    public Puzzle22(CalculationStrategy theStrategy) {
        this.strategy = theStrategy;
    }

    public long fib(long aNumber) {
        return strategy.fib(aNumber);
    }
}
