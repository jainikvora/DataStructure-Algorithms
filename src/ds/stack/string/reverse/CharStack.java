package ds.stack.string.reverse;

/**
 * Created by Jainik on 1/12/2015.
 */
public class CharStack {
    private int maxSize;
    private char[] stackArr;
    private int top;

    public CharStack(int maxSize) {
        this.maxSize = maxSize;
        stackArr = new char[this.maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == this.maxSize - 1);
    }

    public void push(char element) {
        if(!this.isFull()) {
            this.stackArr[++top] = element;
        } else {
            System.out.println("Can't add the element as Stack is full");
        }
    }

    public char pop() {
        return this.stackArr[top--];
    }

    public char peek() {
        return this.stackArr[top];
    }
}
