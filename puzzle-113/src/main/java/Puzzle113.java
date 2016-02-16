import java.util.logging.Logger;

public class Puzzle113 {
    private static Logger LOG = Logger.getLogger(Puzzle113.class.getSimpleName());

    public static String multiplyList(String list1, String list2) {
        LOG.info(String.format("List1 = %s", list1));
        LOG.info(String.format("List2 = %s", list2));

        String[] tmp1 = list1.trim().split(" ");
        String[] tmp2 = list2.trim().split(" ");

        Integer[] listInt1 = new Integer[tmp1.length];
        Integer[] listInt2 = new Integer[tmp2.length];

        for (int i = 0; i < tmp1.length; i++) {
            listInt1[i] = Integer.valueOf(tmp1[i].trim());
        }

        for (int i = 0; i < tmp2.length; i++) {
            listInt2[i] = Integer.valueOf(tmp2[i].trim());
        }


        StringBuilder sb = new StringBuilder();

        if (list1.length() <= list2.length()) {

            for (int i = 0; i < listInt1.length; i++) {
                sb.append(listInt1[i] * listInt2[i] + " ");
            }
        } else {
            for (int i = 0; i < listInt2.length; i++) {
                sb.append(listInt1[i] * listInt2[i] + " ");
            }
        }

        return sb.toString().trim();

    }
}
