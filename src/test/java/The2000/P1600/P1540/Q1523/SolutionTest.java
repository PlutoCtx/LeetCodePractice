package The2000.P1600.P1540.Q1523;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testCountOdds() {
        Solution solution = new Solution();
        int low = 3;
        int high = 7;
        Assert.assertEquals(solution.countOdds(low, high), 3);

        low = 8;
        high = 10;
        Assert.assertEquals(solution.countOdds(low, high), 1);
    }
}
