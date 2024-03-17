package P100.P60.Q50;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testMyPow() {
        Assert.assertEquals(new Solution().myPow(2.00000, -2147483648), 0.00000);
    }
}
