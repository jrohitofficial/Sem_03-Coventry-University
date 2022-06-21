package programmingForDevelopers.oday20Graph.adjacencyList;

public class LinkedListExample1 {
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
            System.out.println("Linked list created and data inserted: " + data);
        } else {
            tail.next = newnode;
            tail = newnode;
            System.out.println("Data Inserted: " + data);
        }
        System.out.println();
    }

    public void getList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
            System.out.print( " , ");
        }
    }

    public Node returnAdjacentNode(){
        return head;
    }

    public void removeTail() {
        Node current = head;

        while (current.next != tail) {
            current = current.next;
        }

        current.next = null;
        tail = current;
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

    public int getDataAtAnyPos(int pos){
        Node current=head;
        for(int i=1;i<pos;i++){
            current=current.next;
        }
        return current.data;
    }


}
