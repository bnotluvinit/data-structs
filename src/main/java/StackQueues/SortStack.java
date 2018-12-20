package StackQueues;

public class SortStack {

    static MyStack sortStack(MyStack stack, int size) {

        MyStack tempStack = new MyStack(size);

        while (!stack.isEmpty()) {

            int value = stack.pop();

            if (value >= tempStack.top()) {
                tempStack.push(value);
            } else {
                while (!tempStack.isEmpty()) {
                    stack.push(tempStack.pop());
                }
                tempStack.push(value);
            } //end of else
        } //end of while

        //Transfer from tempStack => stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        return stack;
    }//end of sor// tStack()
}//end// of class
