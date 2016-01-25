public class Puzzle227 {

    private ChecksumStrategy strategy;

    public Puzzle227() {
        strategy = new ChecksumStrategyImpl();
    }

    public Puzzle227(ChecksumStrategy theStrategy) {
        this.strategy = theStrategy;
    }

    public enum CardType {
        REAL,
        FAKE
    }

    public CardType cardTypeOf(String cardNumber) {

        Integer[] arrayOfDigits = parse(cardNumber);

        int checksum = strategy.calculate(arrayOfDigits);

        CardType cardType = CardType.FAKE;

        if ((checksum % 10) == 0) {
            cardType = CardType.REAL;
        }

        return cardType;
    }

    private Integer[] parse(String cardNumber) {
        String trimmedNumber = cardNumber.replace(" ", "");

        Integer[] arrayOfDigits = new Integer[trimmedNumber.length()];

        for(int i = 0; i < trimmedNumber.length(); i++) {
            arrayOfDigits[i] = Integer.parseInt(trimmedNumber.substring(i, i + 1).trim());
        }

        return arrayOfDigits;
    }

}
