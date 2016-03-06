import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(BlockJUnit4ClassRunner.class)
public class MinimumDistanceTest {

    @Test
    public void testMinimumDistance() {
        MinimumDistance distance = new MinimumDistance();

        //The first test case
        List<Integer> houses = Arrays.asList(3, 3, 5, 7);

        assertThat(distance.getMinimumOf(houses), is(6));

        //The second test case
        houses = Arrays.asList(20, 30, 40);

        assertThat(distance.getMinimumOf(houses), is(20));

    }



}
