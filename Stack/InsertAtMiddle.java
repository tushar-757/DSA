public class InsertAtMiddle {
    public static void InsertAtMiddleMethod(Stack numStack, int capacity, int top, int target) {

        // base case --> mid element
        if (capacity / 2 - 1 == top) {
            // add element
            numStack.push(target);
            return;
        }

        // processing stage of recursion
        int temp = numStack.pop();
        InsertAtMiddleMethod(numStack, capacity, top - 1, target);

        // backtracking stage -- add again
        numStack.push(temp);

    }

    public static void main(String[] args) {

        Stack numStack = new Stack(20);

        // loading stored data from 1 to 10
        Stacks.loadData(numStack);

        Stacks.printStackTrace(numStack, numStack.getTop());

        System.out.println("----------------------------");

        InsertAtMiddleMethod(numStack, numStack.getCapacity(), numStack.getTop(), 12);
        // numStack.push(12);
        Stacks.printStackTrace(numStack, numStack.getTop());

        // insert at middle
    }

}