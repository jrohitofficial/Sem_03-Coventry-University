package programmingForDevelopers.zExercises.aArray;

/*
10.1-6
    Whereas a stack allows insertion and deletion of elements at only one
    end, and a queue allows insertion at one end and deletion at the other
    end, a deque (double-ended queue, pronounced like “deck”) allows
    insertion and deletion at both ends. Write four O(1)-time procedures to
    insert elements into and delete elements from both ends of a deque
    implemented by an array.

*/

public class Array6 {


    int quees[];
    int front = -1;
    int rear = -1;
    int size;

    Array6(int size) {
        this.size = size;
        quees = new int[size];
    }

    public void getQueue(){
        int j = 0;
        while (j < quees.length){
            System.out.print(quees[j] + " , ");
            j++;
        }
    }

    public boolean enqueueRear(int data) {
        if (isFull()) {
            System.out.println("queue overflow");
            return false;
        }
        if (rear == -1 && front == -1) {
            front = 0;
        }
        quees[++rear] = data;
        System.out.println("Data enqueued in rear: " + data);
        return true;
    }

    public boolean enqueueFront(int data) {
        if (isFull()) {
            System.out.println("queue overflow");
            return false;
        }
        if (rear == -1 && front == -1) {
            front = 0;
        }
        for(int i =size-1; i > 0; i--){
            quees[i] = quees[i-1];
        }
        quees[front] = data;
        System.out.println("Data enqueued in front: " + data);
        rear++;
        return true;
    }

    public int dequeueFront() {
        if (isEmpty()) {
            System.out.println("queue underflow");
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

    public int dequeueRear() {
        if (isEmpty()) {
            System.out.println("queue underflow");
            return -9999;
        }
        int x = rear;
        if (front == rear) {
            front = rear = -1;
        }else {
            rear--;
        }
        return quees[x];
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static void main(String[] args) {
        Array6 obj = new Array6(4);

        obj.enqueueRear(1);
        obj.enqueueRear(2);
        obj.enqueueRear(3);

        System.out.println();
        obj.enqueueFront(12);

        System.out.println();
        obj.enqueueRear(4); //Overflow error.


        System.out.println();
        int r = obj.dequeueFront();
        System.out.println("Dequeued front: " + r);
        int re = obj.dequeueFront();
        System.out.println("Dequeued front: " + re);

        int r1 = obj.dequeueRear();
        System.out.println("Dequeued rear: " + r1);
        int r2 = obj.dequeueRear();
        System.out.println("Dequeued rear: " + r2);

        System.out.println();
        int r3 = obj.dequeueRear();  // Underflow error
        System.out.println("Dequeued rear: " + r3);
    }


}
