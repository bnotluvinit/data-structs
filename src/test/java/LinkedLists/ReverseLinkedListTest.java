package LinkedLists;

import org.junit.Test;

public class ReverseLinkedListTest {
    @Test
    public void reverseLinkedList() {

        LinkedList linkedList = new LinkedList();
        linkedList.head();
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));

        linkedList.print();

        linkedList.reverse();

        linkedList.print();
    }
}
