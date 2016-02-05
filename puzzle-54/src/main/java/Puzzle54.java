import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Puzzle54 {

    public static final String ERROR = "ERROR";
    public static final String ZERO = "ZERO";

    public static String getChangeAsString(double price, double cash) {
        double change = cash - price;

        if (change < 0) return ERROR;
        if (change == 0) return ZERO;

        List<Coin> coins = Arrays.asList(Coin.ONE_HUNDRED,
                Coin.FIFTY,
                Coin.TWENTY,
                Coin.TEN,
                Coin.FIVE,
                Coin.TWO,
                Coin.ONE,
                Coin.HALF_DOLLAR,
                Coin.QUARTER,
                Coin.DIME,
                Coin.NICKEL,
                Coin.PENNY);


        int changeInCents = (int) (change * 100);

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < coins.size(); i++) {
            Coin coin = coins.get(i);
            int value = coin.inCents();

            int times = changeInCents / value;

            for (int j = 0; j < times; j++) {
                sb.append(coin.toString() + ",");
            }

            changeInCents = changeInCents - times * value;

            if (changeInCents == 0) {
                break;
            }
        }

        String res = "";

        String temp = sb.toString().trim();
        if (!temp.isEmpty()) {
            res = sb.toString().substring(0, temp.length() - 1);
        }

        return res;

    }

}
