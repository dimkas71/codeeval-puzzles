
public class RollerCoaster {
    public String change(final String source) {

        int letterCount = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);

            boolean up = letterCount % 2 == 0;

            if (Character.isLetter(c)) {
                if (up) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                letterCount++;
            } else {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }
}
