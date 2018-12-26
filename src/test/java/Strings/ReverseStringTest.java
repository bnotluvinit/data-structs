package Strings;

import org.junit.Assert;
import org.junit.Test;

import static Strings.ReverseString.reverseString;

public class ReverseStringTest {
    @Test
    public void reverseStringTest() {
        String test = "abcdefgh";

        Assert.assertEquals(reverseString(test), "hgfedcba");
    }
}
