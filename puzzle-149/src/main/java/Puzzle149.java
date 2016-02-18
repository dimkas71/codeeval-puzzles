import java.util.logging.Logger;

public class Puzzle149 {

    private static final Logger LOG = Logger.getLogger(Puzzle149.class.getSimpleName());

    enum FLAG {
        ZERO,
        TWOZEROES,
        NONE
    }
    public static long convertFrom(String zeroedSequence) {
        String[] splitted = zeroedSequence.split(" ");

        String b = parseAsStringOfBits(splitted);

        LOG.info(String.format("Value [%s] is converted to %s", zeroedSequence, b));

        return  Long.valueOf(b, 2);
    }

    private static String parseAsStringOfBits(String[] splitted) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < splitted.length; i++) {

            FLAG f = FLAG.NONE;

            if ((i % 2) == 0) {
                String value = splitted[i].trim();
                f = value.equals("0") ? FLAG.ZERO : ( (value.equals("00") ? FLAG.TWOZEROES : FLAG.NONE));
                i++;
            }
            switch (f) {
                case ZERO:
                    sb.append(splitted[i].trim());
                    break;
                case TWOZEROES:
                    sb.append(splitted[i].trim().replace("0", "1"));
                    break;
                case NONE:
                    break;
                default:
                    break;

            }



        }

        return sb.toString().trim();
    }
}
