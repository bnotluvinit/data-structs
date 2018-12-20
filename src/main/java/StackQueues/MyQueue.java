package StackQueues;

class MyQueue {

    private int size;
    int queueArray[];
    private int front;
    private int back;
    private int numofItems;

    public MyQueue(int s) {
        size = s;
        queueArray = new int[size];
        front = 0;
        back = -1;
        numofItems = 0;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.err.println("Your queue is full!");
            return;
        }
        if (back == size - 1) {
            back = -1;
        }
        queueArray[++back] = value;
        ++numofItems;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.err.println("Your queue is empty!");
            return -1;
        }
        int tmp = queueArray[front++];
        if (front == size) {
            front = 0;
        }
        numofItems--;
        return tmp;
    }

    public int top() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return numofItems == 0;
    }

    public boolean isFull() {
        return numofItems == size;
    }

    public int size() {
        return numofItems;
    }
}