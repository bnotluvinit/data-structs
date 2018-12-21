package LinkedLists;

import org.junit.Test;

public class IsLinkedListCyclic {
    @Test
    public void isCyclic() {
        //creating LinkedList with 5 elements including head
        LinkedList linkedList = new LinkedList();
        linkedList.appendToTail(new LinkedList.Node("101"));
        LinkedList.Node cycle = new LinkedList.Node("201");
        linkedList.appendToTail(cycle);
        linkedList.appendToTail(new LinkedList.Node("301"));
        linkedList.appendToTail(new LinkedList.Node("401"));
        linkedList.appendToTail(cycle);


        if(linkedList.isCyclic(linkedList)){
            System.out.println("Linked List is cyclic as it contains cycles or loop");
        }else{
            System.out.println("LinkedList is not cyclic, no loop or cycle found");
        }

    }
}
