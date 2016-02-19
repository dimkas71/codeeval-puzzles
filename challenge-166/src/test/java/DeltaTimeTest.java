import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class DeltaTimeTest {

    DeltaTime deltaTime;

    @Before
    public void setUp() {
        deltaTime = new DeltaTime();
    }


    @Test
    @Parameters
    public void testDeltaTime(String source, String expected) {
        assertThat(deltaTime.intervalAsString(source), is(equalTo(expected)));
    }

    public Object[] parametersForTestDeltaTime() {
        return $(
                $("14:01:57 12:47:11", "01:14:46"),
                $("13:09:42 22:16:15", "09:06:33"),
                $("08:08:06 08:38:28", "00:30:22"),
                $("23:35:07 02:49:59", "20:45:08"),
                $("14:31:45 14:46:56", "00:15:11")
        );
    }

}
