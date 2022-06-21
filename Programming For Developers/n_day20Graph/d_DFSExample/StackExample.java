package programmingForDevelopers.oday20Graph.DFSExample;

public class StackExample {
    char stk[];
    int top = -1;
    int size;

    StackExample(int size) {
        this.size = size;
        stk = new char[size];
    }

    public boolean push(char data) {
        if (isFull()) {
            System.out.println("stack overflow");
            return false;
        }
        stk[++top] = data;
        return true;
    }

    public char pop() {
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
