// problem statement

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

public class ValidParentheses {

    public static boolean isValid(Stack1<Character> bracketsStack, String input) {

        for (char ch : input.toCharArray()) {
            // if its opening bracket add it to stack
            if (ch == '(' || ch == '[' || ch == '{') {
                bracketsStack.push(ch);
            }
            // if its not opening then it must be closing brackets
            else {

                if (!bracketsStack.isEmpty()) {
                    if (ch == ')' && bracketsStack.peek() == '(') {
                        bracketsStack.pop();
                    } else if (ch == '}' && bracketsStack.peek() == '{') {
                        bracketsStack.pop();
                    } else if (ch == ']' && bracketsStack.peek() == '[') {
                        bracketsStack.pop();
                    } else {
                        // if no case matches means order of
                        // Open brackets is not matching with closed brackets.
                        return false;
                    }
                }
                // if stack is empty,edge case includes --> "]","}"
                // if there is only closing bracket then stack would be empty
                // in that case return false
                else {
                    return false;
                }
            }
        }

        // if after all iterations stack is empty means every bracket has a
        // corresponding pair
        if (bracketsStack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String[] inputArr = { "(){}[]()", "(){()}", "]", "[)" };
        String[] resultArr = new String[inputArr.length];
        Stack1<Character> bracketsStack = new Stack1<>(100);

        for (int i = 0; i < inputArr.length; i++) {

            boolean result = isValid(bracketsStack, inputArr[i]);
            if (result) {
                resultArr[i] = "TRUE";
            } else {
                resultArr[i] = "FALSE";
            }
        }

        for (String string : resultArr) {
            System.out.print(string + " ");
        }

    }
}
