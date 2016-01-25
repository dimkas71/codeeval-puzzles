import java.util.List;

public class Puzzle222 {
    public static String chooseWinnerFrom(List<String> players, int blackSpot) {

        if (players == null) {
            return "";
        }

        if (players.size() == 0) {
            return "";
        }

        if (blackSpot <= 0 && players.size() != 1) {
            return "";
        }

        int i = 0, j = 1;

        while (players.size() != 1) {
            if (i > (players.size() - 1)) {
                i = 0;
            }
            if (j == blackSpot) {
                players.remove(i);
                i = 0;
                j = 1;
            }
            i++;
            j++;
        }

        return players.get(0);
    }
}
