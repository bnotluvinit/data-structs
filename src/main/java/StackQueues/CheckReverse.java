package StackQueues;

public class CheckReverse {
    public static MyQueue reverseK(MyQueue queue, int k) {

        if (!queue.isEmpty()) {
            MyStack stack = new MyStack(k);
            int count = 0;
            while (count < k) {
                stack.push(queue.dequeue());
                count++;
            }
            while (!stack.isEmpty()) {
                queue.enqueue(stack.pop());
            }
            int size = queue.size();

            for (int i = 0; i < size - k; i++) {
                queue.enqueue(queue.dequeue());


            }
        }
        return queue;
    }
}