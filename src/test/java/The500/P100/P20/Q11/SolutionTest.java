package The500.P100.P20.Q11;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testMaxArea() {
        Assert.assertEquals(new Solution().maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}),49);
        Assert.assertEquals(new Solution().maxArea(new int[]{1, 1}),1);




    }
}
