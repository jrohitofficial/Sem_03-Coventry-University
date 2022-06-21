package programmingForDevelopers.zExercises.aArray;

/*

    10.1-5
    Rewrite ENQUEUE and DEQUEUE to detect underflow and overflow
    of a queue.

*/


public class Array5 {

    int quees[];
    int front = -1;
    int rear = -1;
    int size;

    Array5(int size) {
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
        System.out.println("Data enqueued : " + data);
        return true;
    }

    public int dequeue() {
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

    public boolean isFull() {
        return rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }


    public static void main(String[] args) {
        Array5 obj = new Array5(3);

        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4); //Overflow error.

        System.out.println();


        int re = obj.dequeue();
        System.out.println(re);
        int re1 = obj.dequeue();
        System.out.println(re1);
        int re2 = obj.dequeue();
        System.out.println(re2);
        int re3 = obj.dequeue();  //Underflow error.
        System.out.println(re3);
    }

}
