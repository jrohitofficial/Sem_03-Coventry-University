package programmingForDevelopers.iday15LinkedList;

public class LinkedListExample {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node head = null;
    Node tail = null;

    public void addNode(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;

//            Node current = head;
//            while (current.next != null) {
//                current = current.next;
//            }
//            current.next = newnode;
        }
    }
}
