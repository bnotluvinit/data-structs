package LinkedLists;

import org.junit.Assert;
import org.junit.Test;

public class FindLengthOfLinkedList {
    @Test
    public void findLengthofList() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(new LinkedList.Node("1"));
        linkedList.add(new LinkedList.Node("2"));
        linkedList.add(new LinkedList.Node("3"));
        linkedList.add(new LinkedList.Node("4"));

       int length = linkedList.length();
        Assert.assertEquals(length, 5);
    }
}
