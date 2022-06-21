package programmingForDevelopers.oday20Graph.linkedListReference;


public class LinkedListReference {
    Node head = null;
    Node tail = null;

    //region Node Class

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    //endregion


    //region addNode Function

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            System.out.println("Linked list created and data inserted: " + data);
        } else {
            tail.next = newNode;
            tail = newNode;
            System.out.println("Data Inserted: " + data);
        }
    }

    //endregion


    //region addHead Function


    public void addHead(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = tail = newNode;
            System.out.println("Linked list created and data inserted: " + data);
        } else {
            head.next = newNode;
            head = newNode;
            System.out.println("Data Inserted: " + data);
        }
        System.out.println();
    }

    //endregion


    //region getSize Function

    public int getSize(){
        int size = 0;
        Node current = head;
        while (current != null){
            size++;
            current = current.next;
        }
        return size;
    }

    //endregion


    //region printList Function


    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(" , " + current.data);
            current = current.next;
        }
    }

    //endregion


    //region getDataAtAnyPos Function

    public int getDataAtAnyPos(int pos){
        Node current=head;
        for(int i=1;i<pos;i++){
            current=current.next;
        }
        return current.data;
    }

    //endregion


    //region removeTail Function

    public void removeTail() {
        Node current = head;

        while (current.next != tail) {
            current = current.next;
        }

        current.next = null;
        tail = current;
    }

    //endregion


    //region removeHead

    public void removeHead() {
        if (head != tail) {
            head = head.next;
        }
    }

    //endregion


    //region removeAtAnyPosition Function

    public void removePos(int pos) {
        Node current = head;

        for (int i = 2; i < pos; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    //endregion


    //region insertAtAnyPosition Function

    public void insertIndex(int pos, int data) {
        Node current = head;
        Node newNode = new Node(data);

        for (int i = 2; i < pos; i++) {
            current = current.next;
        }
        newNode.next = current.next.next;
        current.next = newNode;
    }

    //endregion


    //region detectCycle Function


    public boolean detectCycle() {

        Node varOne = head;
        Node varTwo = head;

        while (varOne != varTwo) {
            if (varOne == varTwo) {
                return true;
            }
            varOne = varOne.next;
            varTwo = varTwo.next.next;
        }
        return false;
    }

    //endregion



}
