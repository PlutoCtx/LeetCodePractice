package The2000.P1800.P1780.Q1768;

import org.testng.annotations.Test;

public class SolutionTest {

    @Test
    public void testMergeAlternately() {
        Solution solution = new Solution();
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(solution.mergeAlternately(word1, word2));


        word1 = "ab";
        word2 = "pqrs";
        System.out.println(solution.mergeAlternately(word1, word2));


        word1 = "abcd";
        word2 = "pq";
        System.out.println(solution.mergeAlternately(word1, word2));
    }
}
