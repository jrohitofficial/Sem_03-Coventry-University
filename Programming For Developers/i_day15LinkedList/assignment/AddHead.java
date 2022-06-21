package programmingForDevelopers.iday15LinkedList.assignment;

public class AddHead {


    AddHead.Node head = null;
    AddHead.Node tail = null;


    public static class Node {
        int data;
        AddHead.Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void addHead(int data) {
        Node newnode = new Node(data);
        if (tail == null) {
            head = tail = newnode;
            System.out.println("Linked list created and data inserted: " + data);
        } else {
            head.next = newnode;
            head = newnode;
            System.out.println("Data Inserted: " + data);
        }
    }

    public Node insertRecursive(Node head1, int data) {
        if (head1 == null) {
            head1 = new Node(data);
            return head1;
        }

        head1.next = insertRecursive(head1.next, data);
        return head1;

    }


    public void getList(Node current) {
        if (current == null) {
            return;
        }
        System.out.print(" , " + current.data);
        getList(current.next);
    }

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

    public void removeNode(Node node) {
        Node current = head;
        while (current.next != null) {
            if (current.next == node) {
                current.next = node.next;
                return;
            } else {
                current = current.next;
            }
        }
    }

    public void removeIndex(int pos) {
        Node current = head;

        for (int i = 2; i < pos; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void removeIndexRecursive(int pos, int count, Node current) {
        if (count == 1) {
            current = head;
        }
        // count must be passed as 1 in first iteration.

        if (count == pos - 1) {
            current.next = current.next.next;
            return;
        }
        current = current.next;
        removeIndexRecursive(pos, ++count, current);
    }


    public void insertIndex(int pos, int data) {
        Node current = head;
        Node newNode = new Node(data);

        for (int i = 2; i < pos; i++) {
            current = current.next;
        }
        newNode.next = current.next.next;
        current.next = newNode;
    }


    public void insertIndexRecursive(Node node, int pos, int data, int count) {
        Node current = head;
        if (pos == count) {
            Node newNode = new Node(data);
            newNode.next = current.next.next;
            current.next = newNode;
            return;
        }
        current = current.next;
        insertIndexRecursive(current, pos, data, ++count);
    }


    public static void main(String[] args) {
        AddHead obj = new AddHead();

        obj.addHead(2);
        obj.addHead(223);
        obj.addHead(1);
        obj.addHead(23);
        obj.addHead(5);

        System.out.println("List: ");
        obj.getList(obj.tail);

    }


}
