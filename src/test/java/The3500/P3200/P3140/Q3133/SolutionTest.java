package The3500.P3200.P3140.Q3133;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testMinEnd() {

        Solution solution = new Solution();
        Assert.assertEquals(solution.minEnd(3, 4), 6);
        Assert.assertEquals(solution.minEnd(2, 7), 15);
        Assert.assertEquals(solution.minEnd(6715154, 7193485), 15);


    }
}
