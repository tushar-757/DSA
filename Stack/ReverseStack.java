public class ReverseStack {
    public static void reverseStack(Stack numStack) {
        // base case
        if (numStack.isEmpty()) {
            return;
        }

        // pop
        int temp = numStack.pop();

        reverseStack(numStack);

        // back tracking
        InsertAtBottom.insertAtBottom(numStack, numStack.getTop(), temp);
    }

    public static void main(String[] args) {
        Stack numStack = new Stack(20);
        Stacks.loadData(numStack);

        System.out.println(" ------------- Before --------------");
        Stacks.printStackTrace(numStack, numStack.getTop());
        reverseStack(numStack);
        System.out.println(" ------------- After --------------");
        Stacks.printStackTrace(numStack, numStack.getTop());
    }
}
