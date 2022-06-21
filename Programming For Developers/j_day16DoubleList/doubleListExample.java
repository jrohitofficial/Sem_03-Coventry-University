package programmingForDevelopers.jday16DoubleList;

public class doubleListExample {

    public static class Node {
        Node next;
        Node prev;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void append(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {

            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        doubleListExample list = new doubleListExample();
        list.append(20);
        list.append(30);
        list.print();
    }
}
