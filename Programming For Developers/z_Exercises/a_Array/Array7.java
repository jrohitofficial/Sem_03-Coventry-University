package programmingForDevelopers.zExercises.aArray;

/*
    10.1-7
    Show how to implement a queue using two stacks. Analyze the running
    time of the queue operations.

    Answer: Let there be 2 stack  Stack1 and Stack2

            Enqueue: Push to Stack1.
            Dequeue: a) Pop all element from Stack1 to  Stack 2. (Time: n)
                     b) Pop from Stack2 i.e. the actual dequeue. (Time: constant)
                     c) Push all remaining elements from Stack 2 to Stack1. (Time: n - 1)
                                (n - 1 because a value is already popped)
*/

public class Array7 {
    int queueSize;
    int top = -1;
    int rear = -1;
    public makeStack stackA;
    public makeStack stackB;

    Array7(int queueSize) {
        this.queueSize = queueSize;
        stackA = new makeStack(queueSize);
        stackB = new makeStack(queueSize);
    }

    public void enqueue(int data) {
        stackA.push(data);
    }

    public int dequeue() {
        for (int i =0; i < queueSize; i++){
            stackB.push(stackA.pop());
        }

        int result = stackB.pop();

        for (int i =0; i < queueSize; i++){
            stackA.push(stackB.pop());
        }
        return result;
    }

    public static class makeStack {
        int queueSize;
        int top = -1;
        int[] stackA;

        makeStack(int queueSize) {
            this.queueSize = queueSize;
            stackA = new int[queueSize];
        }

        public boolean push(int data) {
            if (top == queueSize - 1) {
                System.out.println("Stack Overflow!");
                return false;
            } else {
                stackA[++top] = data;
                //System.out.println("Pushed: " + data);
                return true;
            }
        }

        public int pop() {
            if (top == -1) {
                System.out.println("Stack Underflow!");
                return -999;
            }
            return stackA[top--];
        }
    }


    public static void main(String[] args) {
        Array7 obj = new Array7(4);

        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);

        System.out.println();
        obj.enqueue(5);  // Overflow Error.
        System.out.println();


        int res = obj.dequeue();
        System.out.println(res);
        int res1 = obj.dequeue();
        System.out.println(res1);
        int res2 = obj.dequeue();
        System.out.println(res2);
        System.out.println();
        int res3 = obj.dequeue();
        System.out.println(res3);

        System.out.println();
        int res4 = obj.dequeue();  // Underflow Error.
        System.out.println(res4);

    }


}
