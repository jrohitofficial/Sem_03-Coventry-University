package programmingForDevelopers.gday11Stack;

public class MaxParenthesis {


    public int isBalanced(String exp) {
        int count = 0;

        String openbraces = "[{(";
        String closingbraces = "]})";
        StackExample stk = new StackExample(exp.length());
        if (exp.length() == 1) {
            return 0;
        }
        for (int i = 0; i < exp.length(); i++) {
            char bracket = exp.charAt(i);
            if (bracket == '[' || bracket == '{' || bracket == '(') {
                stk.push(bracket);
                count++;
            } else {
                int indx = closingbraces.indexOf(bracket);
                char crossopenbraces = openbraces.charAt(indx);
                if (stk.pop() == crossopenbraces) {
                    count++;
                }
            }
        }
        if (!stk.isEmpty()) {
            count--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new MaxParenthesis().isBalanced("{}"));
    }
}
