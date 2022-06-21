package programmingForDevelopers.gday11Stack;

public class BalancedParenthesis {

    public boolean isBalanced(String exp) {
        String openbraces = "[{(";
        String closingbraces = "]})";
        StackExample stk = new StackExample(exp.length());
        for (int i = 0; i < exp.length(); i++) {
            char bracket = exp.charAt(i);
            if (bracket == '[' || bracket == '{' || bracket == '(') {
                stk.push(bracket);
            } else {
                int indx = closingbraces.indexOf(bracket);
                char crossopenbraces = openbraces.charAt(indx);
                if (stk.isEmpty()) {
                    return false;
                }
                if (stk.pop() != crossopenbraces) {
                    return false;
                }
            }
        }
        if (!stk.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new BalancedParenthesis().isBalanced("{(}"));
    }


}
