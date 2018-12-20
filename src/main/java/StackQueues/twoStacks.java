package StackQueues;

class twoStacks {
    int size;
    int[] arr;
    int top1;
    int top2;

    public twoStacks(int n) {
        size = n;
        arr = new int[size];
        top1 = -1;
        top2 = size;
    }

    public void push1(int value) {
        if (top1 < top2 - 1) {
            arr[++top1] = value;
        }
    }

    public void push2(int value) {
        if (top1 < top2 - 1) {
            arr[--top2] = value;
        }
    }

    public int pop1() {
        if (top1 >= 0) {
            int val = arr[top1--];
            return val;
        }
        return -1;

    }

    public int pop2() {
        if (top2 < size) {
            int val = arr[top2++];
            return val;
        }
        return -1;
    }
}
