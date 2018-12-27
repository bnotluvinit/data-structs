package Misc;

import LinkedLists.LinkedList;

import java.util.HashSet;

public class RemoveDuplicates {
    static void removeDuplicates(LinkedList.Node head){
        HashSet<Integer> hs = new HashSet<>();

        LinkedList.Node current = head;
        LinkedList.Node prev = null;
        while (current != null){
            String curval = current.data();
            if (hs.contains(curval)){
                prev.next = current.next;
            } else {
                hs.add(Integer.valueOf(curval));
                prev = current;
            }
            current = current.next;
        }
            current = current.next;
    }
}
