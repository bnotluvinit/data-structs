package Misc;

import org.junit.Assert;
import org.junit.Test;

public class OneEditAwayTest {
    @Test
    public void oneEditAway() {
        String word1 = "pale";
        String word2 = "pake";

        Assert.assertTrue(OneEditAway.oneEditAway(word1, word2));
    }

    @Test
    public void moreThanOneEditAway() {
        String word1 = "pale";
        String word2 = "bae";

        Assert.assertFalse(OneEditAway.oneEditAway(word1, word2));
    }
}
