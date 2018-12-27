package LinkedLists;

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        this.head = new Node("head");
        tail = head;
    }

    public Node head() {
        return head;
    }

    public void add(Node node) {
        tail.next = node;
        tail = node;
    }


    public int length() {
        int count = 0;
        Node current = this.head;

        while(current !=null){
            count++;
            current = current.next();
        }
        return count;
    }

    public static class Node {
        public Node next;
        public String data;

        public Node(String data) {
            this.data = data;
        }

        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public String toString() {
            return this.data;
        }
    }

    public void appendToTail(Node node) {
        Node current = head;
        while (current.next() != null) {
            current = current.next;
        }
        current.setNext(node);
    }

    public boolean isCyclic(LinkedList linkedList) {
        LinkedList.Node head = null;
        LinkedList.Node fast = head;
        LinkedList.Node slow = head;

        while (fast != null && fast.next() != null) {
            fast = fast.next().next();
            slow = slow.next();

            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public void reverse(){
        Node pointer = head;
        Node previous = null;
        Node current = null;

        while(pointer != null){
            current = pointer;
            pointer = pointer.next;
        }
        current.next = previous;
        previous = current;
        head = current;
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.data() + " ");
            node = node.next();
        }
        System.out.println("");
    }
}