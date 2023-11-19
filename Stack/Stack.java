class Stack {
    private int[] arr;
    private int size;
    private int top;
    private int capacity;

    Stack() {
        this.arr = null;
        this.size = 5;
        this.top = -1;
    }

    Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    // method to add element in stack

    public void push(int value) {

        if (!isFull()) { // check to prevent overflow condition
            // do top++
            this.top++;
            this.capacity++;
            // then add it in arr
            this.arr[top] = value;
        } else {
            System.out.println("stack overflow on pushing element:" + value);
        }

    }

    // method to remove element from stack

    public int pop() {

        // here we are logically removing by decreasing index by 1
        // that top would get override on push

        if (!isEmpty()) { // check to prevent underflow condition
            this.capacity--;
            return this.arr[top--];
        }

        // returning a mark value for underflow

        return Integer.MIN_VALUE;
    }

    // method to peek element from stack

    public int peek() {

        if (!isEmpty()) {
            return arr[this.top];
        }
        return Integer.MIN_VALUE;

    }

    public boolean isEmpty() {
        return (top > -1) ? false : true;
    }

    public boolean isFull() {
        return (top == size - 1) ? true : false;
    }

    public int getTop() {
        return top;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}