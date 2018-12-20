package StackQueues;

class MyStack{

    private int size;
    int[] stackArray;
    private int top;

    //Stack Constructor
    public MyStack(int s) {
        stackArray = new int[s];
        size = s;
        top = -1;
    }

    //Returns top element
    public int top() {
        if (!isEmpty()) {
            return stackArray[top];
        }
        else{
            System.err.println("Stack is Empty");
            return -1;
        }
    }
    //Returns true if Stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    //Returns true if Stack is full
    public boolean isFull() {
        return top == size - 1;
    }


    //Inserts the element at top
    public void push(int value) {
        if (isFull()) { //there's no more space in your stack
            System.err.println("Your Stack is full");
            return;
        }
        stackArray[++top] = value; //adds value to the stack and updates the top element
    }

    //Removes and returns the element at top
    public int pop() {
        if (!isEmpty()) {
            return stackArray[top--]; //returns the most recent element added, and updates the value of the top element
        } else { //no element present in the stack to return
            System.err.println("Your Stack is empty");
            return -1;
        }
    }

}