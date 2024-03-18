package The1000.P800.P740.Q724;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testPivotIndex() {
        int[] nums = new int[]{-1,-1,-1,-1,-1,-1};
        Assert.assertEquals(new Solution().pivotIndex(nums), -1);
    }
}
