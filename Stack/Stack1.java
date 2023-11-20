import java.util.ArrayList;

class Stack1<T> {
    private ArrayList<T> arr;
    private int size;
    private int top;
    private int capacity;

    Stack1() {
        this.arr = null;
        this.size = 5;
        this.top = -1;
    }

    Stack1(int size) {
        this.size = size;
        this.arr = new ArrayList<T>(size);
        this.top = -1;
    }

    // method to add element in stack

    public void push(T value) {

        if (!isFull()) { // check to prevent overflow condition
            // do top++
            this.top++;
            this.capacity++;
            // then add it in arr
            this.arr.add(top, value);
        } else {
            System.out.println("stack overflow on pushing element:" + value);
        }

    }

    // method to remove element from stack

    public T pop() {

        // here we are logically removing by decreasing index by 1
        // that top would get override on push

        if (!isEmpty()) { // check to prevent underflow condition
            this.capacity--;
            return this.arr.remove(top--);
        }
        return null;

        // returning a mark value for underflow

        // return Integer.MIN_VALUE;
    }

    // method to peek element from stack

    public T peek() {

        if (!isEmpty()) {
            return arr.get(this.top);
        }
        // return Integer.MIN_VALUE;
        return null;
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