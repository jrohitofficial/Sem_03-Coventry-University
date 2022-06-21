package programmingForDevelopers.hday13Queue;

public class CircularQueueExample {
    int front = -1;
    int rear = -1;
    int[] queeue;
    int size;

    CircularQueueExample(int size) {
        this.size = size;
        queeue = new int[size];
    }

    public boolean enqueue(int data) {
        if (isFull()) {
            System.out.println("queue overflow");
            return false;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        queeue[rear] = data;
        return true;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("queue underflow");
            return -999999;
        }
        int x = front;
        if (front == rear) {
            front = rear = -1;
        }
        if (front != rear) {
            front = (front + 1) % size;
        }
        return queeue[x];
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public static void main(String[] args) {
        CircularQueueExample c = new CircularQueueExample(5);
        c.enqueue(100);
        c.enqueue(200);
        c.enqueue(300);
        c.enqueue(400);
        c.enqueue(500);
        System.out.println(c.dequeue());
        c.enqueue(600);
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
        System.out.println(c.dequeue());
    }
}
