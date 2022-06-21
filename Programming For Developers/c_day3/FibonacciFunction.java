package programmingForDevelopers.cday3;

public class FibonacciFunction {

    public int fibFunction(int n) {
        int prev = 0;
        int current = 1;
        int next = 0;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            for (int i = 2; i <= n; i++) {
                next = prev + current;
                prev = current;
                current = next;
            }
        }
        return next;
    }

    public int fibRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibRecursive(n - 1) + fibRecursive(n - 2);
        }
    }

    public static void main(String[] args) {
        FibonacciFunction obj = new FibonacciFunction();
        System.out.println(obj.fibFunction(6));
        System.out.println(obj.fibRecursive(6));

    }

}
