import java.util.List;

public class MinimumDistance {
    public int getMinimumOf(final List<Integer> houses) {

        int distance = Integer.MAX_VALUE;

        for (Integer house : houses) {
            int sum = 0;
            for (Integer otherHouse : houses) {
                sum += Math.abs(otherHouse - house);
            }

            if (sum < distance) {
                distance = sum;
            }
        }

        return distance;
    }
}
