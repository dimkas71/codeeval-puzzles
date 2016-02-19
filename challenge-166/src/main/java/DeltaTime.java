import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class DeltaTime {
    public String intervalAsString(String source) {
        String[] splitted = source.split(" ");

        LocalTime from = LocalTime.parse(splitted[0].trim());
        LocalTime to = LocalTime.parse(splitted[1].trim());


        int inSeconds = Math.abs(from.toSecondOfDay() - to.toSecondOfDay());


        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendValue(ChronoField.HOUR_OF_DAY, 2)
                .appendLiteral(":")
                .appendValue(ChronoField.MINUTE_OF_HOUR, 2)
                .appendLiteral(":")
                .appendValue(ChronoField.SECOND_OF_MINUTE, 2)
                .toFormatter();

        return LocalTime.ofSecondOfDay(inSeconds).format(formatter);

    }
}
