public class SwapNumbers {
    public String swap(String actual) {

        int length = actual.length();

        String firstDigit = actual.substring(0, 1);
        String lastDigit = actual.substring(length - 1);

        StringBuilder sb = new StringBuilder();

        sb.append(lastDigit)
                .append(actual.substring(1, length - 1))
                .append(firstDigit);
        return sb.toString();
    }
}
