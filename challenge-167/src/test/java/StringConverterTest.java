import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class StringConverterTest {
    private final String source;
    private final String expected;

    public StringConverterTest(String source, String expected) {
        this.source = source;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> dataProvider() {
        return Arrays.asList(new Object[][] {
                {"Tom exhibited.", "Tom exhibited."},
                {"Amy Lawrence was proud and glad, and she tried to make Tom see it in her face - but he wouldn't look.",
                 "Amy Lawrence was proud and glad, and... <Read More>"},
                {"Tom was tugging at a button-hole and looking sheepish.",
                    "Tom was tugging at a button-hole and looking sheepish."},
                {"Two thousand verses is a great many - very, very great many.",
                    "Two thousand verses is a great many -... <Read More>"},
                {"Tom's mouth watered for the apple, but he stuck to his work.",
                    "Tom's mouth watered for the apple, but... <Read More>"}
        });
    }

    @Test
    public void testStringConverter() {
        StringConverter converter = new StringConverter();

        assertThat(converter.convert(source), is(equalTo(expected)));

    }

}
