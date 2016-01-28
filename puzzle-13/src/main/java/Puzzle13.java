
import java.util.logging.Level;
import java.util.logging.Logger;

public class Puzzle13 {
    private static Logger LOGGER = Logger.getLogger(Puzzle13.class.getName());

    public static String removeAllFrom(String source, String symbolsToRemove) {
        String remained = source;
        for (int i = 0; i < symbolsToRemove.length(); i++) {
            String toRemove = symbolsToRemove.substring(i, i + 1);
            remained = remained.replaceAll(toRemove, "");
        }

        LOGGER.log(Level.INFO, String.format("remained value = %s", remained));
        LOGGER.log(Level.INFO, String.format("remained value length = %d", remained.length()));


        return remained == null ? "" : remained.trim();
    }

}
