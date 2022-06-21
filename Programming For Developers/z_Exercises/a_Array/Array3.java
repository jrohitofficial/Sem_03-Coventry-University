package programmingForDevelopers.zExercises.aArray;

/*
    10.1-3
    Explain how to implement two stacks in one array A[1 : n] in such a way
    that neither stack overflows unless the total number of elements in both
    stacks together is n. The PUSH and POP operations should run in O(1)
    time.


    Answer: Divide the array into two equal part
            i.e. arr[0] to arr[mid] for one stack,
                 arr[mid +1] to arr[n] for the other stack.

 */

public class Array3 {
    int arraySize;
    int[] arrayA;
    int top1 = -1;
    int top2 = 0;

    Array3(int arraySize) {
        this.arraySize = arraySize;
        arrayA = new int[arraySize];
        top2 = arraySize / 2 -1;
    }

    public boolean pushStack1(int data) {
        if (top1 == ((arraySize / 2) -1)) {
            System.out.println("Stack 1 Overflow!" );
            return false;
        }
        arrayA[++top1] = data;
        System.out.println("Pushed into Stack1: " + data);
        return true;
    }

    public int popStack1() {
        if (top1 == -1) {
            System.out.println("Stack1 Underflow!");
            return -999;
        }
        return arrayA[top1--];
    }

    public boolean pushStack2(int data) {
        if (top2 == (arraySize-1)) {
            System.out.println("Stack 2 Overflow!");
            return false;
        }
        arrayA[++top2] = data;
        System.out.println("Pushed into Stack2: " + data);
        return true;
    }

    public int popStack2() {
        if (top2 == ((arraySize / 2) -1)) {
            System.out.println("Stack2 Underflow!");
            return -999;
        }
        return arrayA[top2--];
    }


    public static void main(String[] args) {
        Array3 obj = new Array3(6);

        obj.pushStack1(1);
        obj.pushStack1(2);
        obj.pushStack1(3);
        obj.pushStack1(4); //   Overflow error.

        System.out.println();

        int res = obj.popStack1();
        System.out.println(res);
        int res1 = obj.popStack1();
        System.out.println(res1);
        int res2 = obj.popStack1();
        System.out.println(res2);
        int res3 = obj.popStack1();
        System.out.println(res3); // Underflow error.


        System.out.println();

        obj.pushStack2(5);
        obj.pushStack2(6);
        obj.pushStack2(7);
        obj.pushStack2(8); //   Overflow error.

        System.out.println();

        int re = obj.popStack2();
        System.out.println(re);
        int re1 = obj.popStack2();
        System.out.println(re1);
        int re2 = obj.popStack2();
        System.out.println(re2);
        int re3 = obj.popStack2();
        System.out.println(re3); // Underflow error.

    }


}
