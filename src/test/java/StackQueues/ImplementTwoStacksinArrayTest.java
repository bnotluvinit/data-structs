package StackQueues;

import org.junit.Assert;
import org.junit.Test;

public class ImplementTwoStacksinArrayTest {

    @Test
    public void implementTwoStacksinArray() {

        int[] result = {6,3,2,5,4};

        twoStacks stackArray = new twoStacks(5);
        stackArray.push1(6);
        stackArray.push1(3);
        stackArray.push1(2);
        stackArray.push2(5);
        stackArray.push2(4);
        Assert.assertEquals(stackArray.arr.length, 5);
    }
}
