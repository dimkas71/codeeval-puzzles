
public enum Coin {

    PENNY("PENNY", 0.01f),
    NICKEL("NICKEL", 0.05f),
    DIME("DIME", 0.10f),
    QUARTER("QUARTER", 0.25f),
    HALF_DOLLAR("HALF DOLLAR", 0.5f),
    ONE("ONE", 1.00f),
    TWO("TWO", 2.00f),
    FIVE("FIVE", 5.00f),
    TEN("TEN", 10.00f),
    TWENTY("TWENTY", 20.00f),
    FIFTY("FIFTY", 50.00f),
    ONE_HUNDRED("ONE HUNDRED", 100.00f);


    private final String name;
    private final float value;

    Coin(String theName, float theValue) {
        this.name = theName;
        this.value = theValue;
    }
    public float value() {
        return value;
    }

    public int inCents() {
        return (int) (value * 100);
    }


}
