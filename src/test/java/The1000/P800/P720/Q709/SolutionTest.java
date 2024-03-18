package The1000.P800.P720.Q709;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testToLowerCase() {
        Assert.assertEquals(new Solution().toLowerCase("AFDEFW"), "afdefw");
    }
}
