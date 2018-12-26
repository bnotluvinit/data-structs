package Misc;

import org.junit.Assert;
import org.junit.Test;

import static Misc.IsPermuatation.isPerm;

public class PermutationTest {

    @Test
    public void isPermutation() {
        String[][] pairs = {{"apple", "papel"}};
        Assert.assertTrue((isPerm(pairs)));
    }

    @Test
    public void isNotPermutation() {
        String[][] pairs = {{"hello", "llloh"}};
        Assert.assertFalse((isPerm(pairs)));
    }
}
