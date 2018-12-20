package StackQueues;

import org.junit.Assert;
import org.junit.Test;

import static StackQueues.GenerateBinaryNumbers.findBin;

public class GenerateBinaryNumbersTest {
    @Test
    public void gerenerateBinaryNumbersTest() {

        String[] binNum = findBin(3);
        String[] result = {"1", "10", "11"};

        Assert.assertArrayEquals(binNum, result);
    }

    @Test
    public void gerenerateBinaryNumbersTestFor5() {

        String[] binNum = findBin(5);
        String[] result = {"1", "10", "11", "100", "101"};

        Assert.assertArrayEquals(binNum, result);
    }
}

