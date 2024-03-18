package The2000.P1900.P1840.Q1822;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testArraySign() {
        Solution solution = new Solution();
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        Assert.assertEquals(solution.arraySign(nums), 1, "success");

        nums = new int[]{1, 5, 0, 2, -3};
        Assert.assertEquals(solution.arraySign(nums), 0, "success");

        nums = new int[] {-1, 1, -1, 1, -1};
        Assert.assertEquals(solution.arraySign(nums), -1, "success");
    }
}
