package programmingForDevelopers.oday20Graph.adjacencyList;

public class StackExample {
    int stk[];
    int top = -1;
    int size;

    StackExample(int size) {
        this.size = size;
        stk = new int[size];
    }

    public boolean push(int data) {
        if (isFull()) {
            System.out.println("stack overflow");
            return false;
        }
        stk[++top] = data;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack underflow");
            return '0';
        }
        return stk[top--];

    }

    public boolean isFull() {
        return top == size - 1;

    }

    public boolean isEmpty() {
        return top == -1;
    }
}
