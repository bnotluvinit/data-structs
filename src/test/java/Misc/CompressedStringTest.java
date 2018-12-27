package Misc;

import org.junit.Assert;
import org.junit.Test;

import static Misc.CompressString.compress;

public class CompressedStringTest {
    @Test
    public void compressedStringTest() {
        String string = "aabcccccaaa";
        String compressed = "a2b1c5a3";

        Assert.assertEquals(compress(string), compressed);
    }
}
