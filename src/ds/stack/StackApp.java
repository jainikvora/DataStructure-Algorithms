package ds.stack;

/**
 * Created by Jainik on 1/12/2015.
 */
public class StackApp {
    public static void main(String args[]) {
        Stack stack = new Stack(10);

        stack.push(10);
        stack.push(11);
        stack.push(13);
        stack.push(14);
        stack.push(12);
        stack.push(9);

        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
