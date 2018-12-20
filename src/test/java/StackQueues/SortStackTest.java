package StackQueues;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static StackQueues.SortStack.sortStack;

public class SortStackTest {
    @Ignore
    @Test
    public void sortStackTest() {
        MyStack stack = new MyStack(7);
        stack.push(23);
        stack.push(60);
        stack.push(12);
        stack.push(42);
        stack.push(4);
        stack.push(97);
        stack.push(2);

        sortStack(stack, 5);

        MyStack result = new MyStack(7);

        result.push(97);
        result.push(60);
        result.push(42);
        result.push(23);
        result.push(12);
        result.push(4);
        result.push(2);

        Assert.assertArrayEquals(stack.stackArray, result.stackArray);
    }
}
