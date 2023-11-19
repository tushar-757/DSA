public class Stacks {
    public static void loadData(Stack numStack) {
        numStack.push(1);
        numStack.push(2);
        numStack.push(3);
        numStack.push(4);
        numStack.push(5);
        numStack.push(6);
        numStack.push(7);
        numStack.push(8);
        numStack.push(9);
        numStack.push(10);
    }

    public static void printStackTrace(Stack numStack, Integer top) {

        // base case
        if (top == -1) {
            return;
        }

        int temp = numStack.peek();
        System.out.println(temp);
        numStack.pop();

        printStackTrace(numStack, top - 1);

        // back track
        numStack.push(temp);

    }

}
