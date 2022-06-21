package programmingForDevelopers.zExercises.aArray;

/*
    10.1-8
    Show how to implement a stack using two queues. Analyze the running
    time of the stack operations.

    Answer: Let there be two queues: queueA and queueB

            Push: Enqueue data in queueA.
            Pop: a) Dequeue all data from queueA to queueB except last element.  (Time: n)
                 b) Dequeue last element from queueA (i.e. actual pop). (Time: constant)
                 c) Enqueue all remaining element from queueB to queueA. (Time: n)

 */

public class Array8 {

    int stackSize;
    QueueExample queueA;
    QueueExample queueB;

    Array8(int stackSize) {
        this.stackSize = stackSize;
        queueA = new QueueExample(stackSize);
        queueB = new QueueExample(stackSize);
    }

    public void push(int data) {
        queueA.enqueue(data);
    }

    public int pop() {
        int result = 0;

        int cap = queueA.getCapacity() ;
        for (int i = 0; i < cap; i++) {
            queueB.enqueue(queueA.dequeue());
        }

        result = queueA.dequeue();
        queueA.resetParam();

        int cap2 = queueB.getCapacity();
        for (int i = 0; i <= cap2; i++) {
            queueA.enqueue(queueB.dequeue());
        }
        queueB.resetParam();
        return result;
    }


    public static class QueueExample {
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
                System.out.println("queue underflow");
                return -999999;
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

        public int getCapacity() {
            return rear - front;
        }

        public void resetParam() {
            front = -1;
            rear = -1;
        }

        public void printQueue() {
            for (int i = front; i <= rear; i++) {
                System.out.print(quees[i] + " ");
            }
        }
    }


    public static void main(String[] args) {
        Array8 obj = new Array8(4);

        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);


        System.out.println();
        obj.push(5); // Overflow error.
        System.out.println();


        int res = obj.pop();
        System.out.println(res);
        System.out.println();
        int res1 = obj.pop();
        System.out.println(res1);
        int res2 = obj.pop();
        System.out.println(res2);
        int res3 = obj.pop();
        System.out.println(res3);

        int res4 = obj.pop();
        System.out.println(res4); //Underflow error
    }


}
