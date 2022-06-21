package programmingForDevelopers.hday13Queue;

public class QueueExample {
    int quees[];
    int front = -1;
    int rear = -1;
    int size;

    QueueExample(int size) {
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

}
