package The500.P300.P220.Q215;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testFindKthLargest() {

        Solution solution = new Solution();

        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;
        Assert.assertEquals(solution.findKthLargest(nums, k), 5);

        nums = new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6};
        k = 4;
        Assert.assertEquals(solution.findKthLargest(nums, k), 4);

        nums = new int[]{2, 1};
        k = 2;
        Assert.assertEquals(solution.findKthLargest(nums, k), 1);


    }
}
