package The500.P400.P400.Q392;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testIsSubsequence() {
        Assert.assertTrue(new Solution().isSubsequence("abc", "ahbgdc"));
        Assert.assertFalse(new Solution().isSubsequence("axc", "ahbgdc"));
    }
}
