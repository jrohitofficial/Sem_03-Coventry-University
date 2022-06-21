package programmingForDevelopers.gday11Stack;

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
        //top=top+1;
        stk[++top] = data;
        return true;
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("stack underflow");
            return '0';
        }
//        int x=top;
//        top--;
        return stk[top--];

    }

    public boolean isFull() {
//        if(top==size-1){
//            return true;
//        }
//        return false;
        return top == size - 1;

    }

    public boolean isEmpty() {
        return top == -1;
    }
}
