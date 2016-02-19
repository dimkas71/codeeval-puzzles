import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(value = BlockJUnit4ClassRunner.class)
public class LocalDateTimeTest {

    @Test
    public void test() {

        LocalTime from = LocalTime.parse("14:01:57");
        LocalTime to = LocalTime.parse("12:47:11");

        assertThat(to.isAfter(from), is(false));
        assertThat(to.isBefore(from), is(true));


        int secondsTo = to.toSecondOfDay();
        int secondsFrom = from.toSecondOfDay();

        LocalTime localTime = LocalTime.ofSecondOfDay(Math.abs(secondsTo - secondsFrom));

        DateTimeFormatter timeFormatter = new DateTimeFormatterBuilder()
                .appendValue(ChronoField.HOUR_OF_DAY, 2)
                .appendLiteral(":")
                .appendValue(ChronoField.MINUTE_OF_HOUR, 2)
                .appendLiteral(":")
                .appendValue(ChronoField.SECOND_OF_MINUTE, 2)
                .toFormatter();

        String actual = localTime.format(timeFormatter);

        assertThat(actual, is(equalTo("01:14:46")));

    }




}
