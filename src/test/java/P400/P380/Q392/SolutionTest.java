package P400.P380.Q392;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SolutionTest {

    @Test
    public void testIsSubsequence() {

        Assert.assertTrue(new Solution().isSubsequence("abc", "ahbgdc"));
        Assert.assertFalse(new Solution().isSubsequence("axc", "ahbgdc"));
    }
}
