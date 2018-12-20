package StackQueues;

public class GenerateBinaryNumbers {

    public static String[] findBin(int number){
        String[] result = new String[number];
        MyQueue queue = new MyQueue(number +1);

        queue.enqueue(1);

        for (int i = 0; i < number; i++){
            result[i] = String.valueOf(queue.dequeue());
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            queue.enqueue(Integer.parseInt(s1));
            queue.enqueue(Integer.parseInt(s2));
        }
        return result;
    }
}
