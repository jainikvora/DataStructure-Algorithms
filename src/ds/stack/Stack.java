package ds.stack;

/**
 * Created by Jainik on 1/12/2015.
 */
public class Stack {
    private int maxSize;
    private long[] stackArr;
    private int top;

    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArr = new long[this.maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == this.maxSize - 1);
    }

    public void push(long element) {
        if(!this.isFull()) {
            this.stackArr[++top] = element;
        } else {
            System.out.println("Can't add the element as Stack is full");
        }
    }

    public long pop() {
        return this.stackArr[top--];
    }

    public long peek() {
        return this.stackArr[top];
    }
}
