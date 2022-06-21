package programmingForDevelopers.iday15LinkedList;

public class LinkedListExample1 {
    int size=0;
    Node head = null;
    Node tail = null;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }


    public void addNode(int data) {
        size++;
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
            System.out.println("Linked list created and data inserted: " + data);
        } else {
            tail.next = newnode;
            tail = newnode;
            System.out.println("Data Inserted: " + data);
        }
    }

    public int getTail() {
        return tail.data;
    }

    public int getHead() {
        return head.data;
    }

    public void getList() {
        Node current = head;
        while (current != null) {
            System.out.print(" , " + current.data);
            current = current.next;
        }
    }

    public int removeNode() {
        size--;
        if (head == null) {
            System.out.println("Error: Empty list");
            return 0;
        }

        int returnValue;

        Node current = head;

        while (true) {
            current = current.next;

            if (current.next == tail) {
                returnValue = tail.data;
                current.next = null;
                tail = current;
                return returnValue;
            }

        }

    }

    public void removeTail() {
        size--;
        Node current = head;

        while (current.next != tail) {
            current = current.next;
        }

        current.next = null;
        tail = current;
    }
    public int getSize(){
        return size;
    }

    public int getDataAtAnyPos(int pos){
        Node current=head;
        for(int i=1;i<pos;i++){
            current=current.next;
        }
        return current.data;
    }

    public void removeHead() {
        size--;
        if (head != tail) {
            head = head.next;
        }
    }

    public static void main(String[] args) {

        LinkedListExample1 obj = new LinkedListExample1();

        obj.addNode(4);
        System.out.println("Head: " + obj.getHead());
        obj.addNode(2);
        obj.addNode(5);
        obj.addNode(8);

        System.out.println("Removing head: ");
        obj.removeHead();
        System.out.println("Head: " + obj.getHead());
        obj.addNode(9);

        System.out.print("List: ");
        obj.getList();
        System.out.println(" ");

        System.out.println("\nTail removed ");
        obj.removeTail();

        System.out.println("Current tail: " + obj.getTail());

        System.out.println("\nTail removed ");
        obj.removeTail();

        System.out.println("Current tail: " + obj.getTail());

        System.out.println("Head: " + obj.getHead());
    }


}
