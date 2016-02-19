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
public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster();
    }

    @Test
    @Parameters
    public void testChangeSourceText(String source, String expected) {
        assertThat(expected, is(equalTo(rollerCoaster.change(source))));
    }


    public Object[] parametersForTestChangeSourceText() {
        return $(
                $("To be, or not to be: that is the question.", "To Be, Or NoT tO bE: tHaT iS tHe QuEsTiOn."),
                $("Whether 'tis nobler in the mind to suffer.", "WhEtHeR 'tIs NoBlEr In ThE mInD tO sUfFeR."),
                $("The slings and arrows of outrageous fortune.", "ThE sLiNgS aNd ArRoWs Of OuTrAgEoUs FoRtUnE."),
                $("Or to take arms against a sea of troubles.", "Or To TaKe ArMs AgAiNsT a SeA oF tRoUbLeS."),
                $("And by opposing end them, to die: to sleep.", "AnD bY oPpOsInG eNd ThEm, To DiE: tO sLeEp.")
        );
    }

}
