import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class SwapNumbersTest {

    @Test
    public void shouldSwapNumbersInStringCorrectly() {
        String actual = "4Always0";
        String expected = "0Always4";

        SwapNumbers swapper = new SwapNumbers();

        assertThat(swapper.swap(actual), is(equalTo(expected)));


    }

    @Test
    @Parameters({
            "4Always0, 0Always4",
            "5look8, 8look5"
    })
    public void testSwapNumbersSwapMethod(String actual, String expected) {
        SwapNumbers swapper = new SwapNumbers();

        assertThat(swapper.swap(actual), is(equalTo(expected)));

    }

    @Test
    @Parameters(method = "dataProvider")
    public void testSwapNumbersSwapMethod2(String actual, String expected) {
        String[] words = actual.split(" ");

        SwapNumbers swapper = new SwapNumbers();

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(swapper.swap(word)).append(" ");
        }

        assertThat(sb.toString().trim(), is(equalTo(expected)));

    }

    private Object[] dataProvider() {
        return $(
                $("4Always0 5look8 4on9 7the2 4bright8 9side7 3of8 5life5", "0Always4 8look5 9on4 2the7 8bright4 7side9 8of3 5life5"),
                $("5Nobody5 7expects3 5the4 6Spanish4 9inquisition0", "5Nobody5 3expects7 4the5 4Spanish6 0inquisition9")
        );
    }

}

