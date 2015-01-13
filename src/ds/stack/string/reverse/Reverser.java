package ds.stack.string.reverse;

/**
 * Created by Jainik on 1/12/2015.
 */
public class Reverser {
    private String input;
    private String output;

    public Reverser(String input) {
        this.input = input;
        this.output = "";
    }

    public String reverseString() {
        int stackSize = input.length();
        CharStack stack = new CharStack(stackSize);

        for(int i = 0; i< stackSize; i++) {
            stack.push(input.charAt(i));
        }
        while (!stack.isEmpty()){
            output += stack.pop();

        }
        return output;
    }
}
