import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class StringMaskTest {

    @Test
    @Parameters(method = "dataProvider")
    public void  convertStringWithUsingMask(String expected, String source, String mask) {

        StringMask converter = new StringMask();
        assertThat(converter.convertOnMask(source, mask), is(equalTo(expected)));

    }

    public Object[] dataProvider() {
        return $(
                $("HEllO", "hello", "11001"),
                $("World", "world", "10000"),
                $("CBA", "cba", "111")
        );
    }


}


class StringMask {
    String convertOnMask(String source, String mask) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < mask.length(); i++) {

            char maskChar = mask.charAt(i);
            char sourceChar = source.charAt(i);

            if (maskChar == '1') {
                sb.append(String.valueOf(sourceChar).toUpperCase());
            } else {
                sb.append(String.valueOf(sourceChar));
            }
        }

        return sb.toString();
    }
}