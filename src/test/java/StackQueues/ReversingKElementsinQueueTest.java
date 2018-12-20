package StackQueues;

import org.junit.Assert;
import org.junit.Test;

import static StackQueues.CheckReverse.reverseK;

public class ReversingKElementsinQueueTest {
    @Test
    public void reversingKElements() {
        MyQueue queue = new MyQueue(10);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);

        reverseK(queue, 5);

        MyQueue result = new MyQueue(10);
        result.enqueue(5);
        result.enqueue(4);
        result.enqueue(3);
        result.enqueue(2);
        result.enqueue(1);
        result.enqueue(6);
        result.enqueue(7);
        result.enqueue(8);
        result.enqueue(9);
        result.enqueue(10);

        Assert.assertArrayEquals(queue.queueArray, result.queueArray);

    }
}
