public class DuplicateBracket {
    // if "(" , push
    // if ")"
    // pop until we reach open bracket
    // if while poping we reach directly to closing bracket means it's
    // a duplicate

    public static boolean duplicateBracket(Stack1<Character> st, String exp) {
        char[] charArr = exp.toCharArray();

        for (int i = 0; i < charArr.length; i++) {

            if (charArr[i] == '(' || Character.isLetter(charArr[i])) {

                st.push(charArr[i]);

            } else {

                if (charArr[i] == ')') {
                    int popcount = 0;
                    while (st.peek() != '(') {
                        popcount++;
                        st.pop();
                    }
                    // pop the remaining '(' opening bracket that got skipped by loop
                    st.pop();

                    if (popcount == 0) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    public static void main(String[] args) {
        Stack1<Character> st = new Stack1<>(10);
        String expression1 = "((a+b))";
        String expression2 = "(a+b+(c+d))";

        // st.push('(');
        boolean val1 = duplicateBracket(st, expression1);
        boolean val2 = duplicateBracket(st, expression2);
        System.out.println(val1);
        System.out.println(val2);
        // if (val1 || val2) {
        // String val = (val1) ? "expression (a+b)+(c+d) is valid" : "expression
        // (a+b)+((c+d)) is valid";
        // System.out.println(val);
        // } else {
        // // String val = (val2) ? "expression (a+b)+(c+d) is valid" : "expression
        // // (a+b)+((c+d)) is valid";
        // System.out.println("expression is not valid");
        // }

    }
}
