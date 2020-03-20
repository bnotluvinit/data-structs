package LinkedLists;

public class DoublyLinkedList<T> {

    //Node inner class fo DLL
    public class Node {
        public T data;
        public Node nextNode;
        public Node previousNode;
    }

    public Node headNode;
    public Node tailNode;
    public int size;

    public DoublyLinkedList() {
        this.headNode = null;
        this.tailNode = null;
    }

    public boolean isEmmpty() {
        if (headNode == null & tailNode == null)
            return true;
        return false;
    }

    public Node getHeadNode() {
        return headNode;
    }

    public Node getTailNode() {
        return tailNode;
    }

    public int getSize() {
        return size;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = this.headNode;
        newNode.previousNode = null;
        if (headNode != null) {
            headNode.previousNode = newNode;
        } else {
            tailNode = newNode;
        }
        this.headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        if (isEmmpty()) {
            insertAtHead(data);
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;
        newNode.previousNode = tailNode;
        tailNode.nextNode = newNode;
        tailNode = newNode;
        size++;
    }

    public void printList() {
        if (isEmmpty()) {
            System.out.println("List is empty");
        }
        Node temp = headNode;
        System.out.println("List : null <-");

        while (temp.nextNode != null) {
            System.out.println(temp.data.toString() + " <->");
            temp = temp.nextNode;
        }

        System.out.println(temp.data.toString() + " -> null");
    }

    public void deleteAtHead() {
        if (isEmmpty()) {
            return;
        }
        headNode = headNode.nextNode; //?
        if (headNode == null) {
            tailNode = null;
        } else {
            headNode.previousNode = null;
        }
        size--;
    }

    public void deleteAtTail() {
        if (isEmmpty()) {
            return;
        }
        tailNode = tailNode.previousNode;
        if (tailNode == null) {
            headNode = null;
        } else {
            tailNode.nextNode = null;
        }
        size--;
    }

}

