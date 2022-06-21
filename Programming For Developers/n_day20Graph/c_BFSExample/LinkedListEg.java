package programmingForDevelopers.oday20Graph.BFSExample;

public class LinkedListEg {
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
        Node newnode = new Node(data);
        if (head == null) {
            head = tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    public void getList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
            System.out.print( " , ");
        }
    }

    public int getSize(){
        int size = 0;
        Node current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

}
