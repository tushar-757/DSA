public class InsertAtBottom {
    static void insertAtBottom(Stack numStack, int top, int target) {
        // base case
        if (numStack.isEmpty()) {
            numStack.push(target);
            return;
        }

        int temp = numStack.pop();
        insertAtBottom(numStack, top, target);

        // back tracking
        numStack.push(temp);
    }

    public static void main(String[] args) {
        Stack numStack = new Stack(20);
        Stacks.loadData(numStack);

        System.out.println(" ------------- Before --------------");
        Stacks.printStackTrace(numStack, numStack.getTop());
        insertAtBottom(numStack, numStack.getTop(), 42);

        System.out.println(" ------------- After --------------");
        Stacks.printStackTrace(numStack, numStack.getTop());
    }
}
