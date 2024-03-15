package P300.P300.Q283;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testMoveZeroes() {
        Solution solution = new Solution();

        int[] nums = new int[]{0 ,1, 0, 3, 12};
        int[] expected = new int[]{1, 3, 12, 0, 0};
//        Assert.assertEquals(Collections.singleton(solution.moveZeroes(nums)), expected);
//        Assert.assertEquals(solution.moveZeroes(nums), {1, 3, 12, 0, 0});


    }
}
