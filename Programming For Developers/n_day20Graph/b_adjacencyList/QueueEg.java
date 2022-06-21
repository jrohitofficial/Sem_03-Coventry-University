package programmingForDevelopers.oday20Graph.adjacencyList;

public class QueueEg {
    int quees[];
    int front = -1;
    int rear = -1;
    int size;

    QueueEg(int size) {
        this.size = size;
        quees = new int[size];
    }

    public boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("queue overflow");
            return false;
        }
        if (rear == -1 && front == -1) {
            front = 0;

        }
        quees[++rear] = data;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue undeflow");
            return -9999;
        }
        int x = front;
        if (front == rear) {
            front = rear = -1;
        }
        if (front < rear) {
            front++;
        }
        return quees[x];
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public void printQueue(){
        System.out.println();
        for (int i =front; i < size; i++){
            System.out.print(quees[i] + " , ");
        }
        System.out.println();
    }

    /*
    public static void main(String[] args) {
        QueueEg obj = new QueueEg(4);

        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);

        System.out.println();
        obj.printQueue();

        System.out.println();
        System.out.println("\nDequeued: " + obj.dequeue());

        System.out.println();
        obj.printQueue();

    }
     */

}
