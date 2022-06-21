package programmingForDevelopers.bday2;

public class FactorialFunction {

    int getFactorialRecursive(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * getFactorialRecursive(n - 1);
    }

    int getFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        FactorialFunction obj = new FactorialFunction();

        System.out.println(obj.getFactorialRecursive(4));
        System.out.println(obj.getFactorial(4));
    }

}
