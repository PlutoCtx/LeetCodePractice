package The500.P200.P140.Q121;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testMaxProfit() {
        int[] prices = new int[]{7,1,5,3,6,4};
        Assert.assertEquals(new Solution().maxProfit(prices), 5);

        prices = new int[]{7,6,4,3,1};
        Assert.assertEquals(new Solution().maxProfit(prices), 0);
    }
}
