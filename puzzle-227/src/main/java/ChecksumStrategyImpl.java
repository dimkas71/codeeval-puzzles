public class ChecksumStrategyImpl implements ChecksumStrategy {

    @Override
    public int calculate(Integer[] arrayOfDigits) {

        int sum = 0;

        for (int i = 0; i < arrayOfDigits.length; i++) {
            if ((i % 2) == 0) {
                sum += arrayOfDigits[i] * 2;
            } else {
                sum += arrayOfDigits[i];
            }
        }

        return sum;
    }
}
