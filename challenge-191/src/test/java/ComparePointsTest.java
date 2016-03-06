import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(BlockJUnit4ClassRunner.class)
public class ComparePointsTest {

    @Test
    public void testComparePoints1() {

        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 5);

        ComparePoints points = new ComparePoints(p1, p2);

        assertThat(points.getDirection(), is("NE"));


    }

    @Test
    public void testComparePoints2() {

        Point p1 = new Point(12, 13);
        Point p2 = new Point(12, 13);

        ComparePoints points = new ComparePoints(p1, p2);

        assertThat(points.getDirection(), is("here"));


    }

    @Test
    public void testComparePoints3() {

        Point p1 = new Point(0, 1);
        Point p2 = new Point(0, 5);

        ComparePoints points = new ComparePoints(p1, p2);

        assertThat(points.getDirection(), is("N"));


    }

}
