package The500.P100.P80.Q66;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testPlusOne() {
        int[] digits = new int[]{1, 2, 3};
        int[] expected = new int[]{1, 2, 4};

        Assert.assertEquals(new Solution().plusOne(digits), expected);

        digits = new int[] {9,8,7,6,5,4,3,2,1,0};
        expected = new int[]{9,8,7,6,5,4,3,2,1,1};
        Assert.assertEquals(new Solution().plusOne(digits), expected);


    }
}
