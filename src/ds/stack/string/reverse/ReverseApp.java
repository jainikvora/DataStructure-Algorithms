package ds.stack.string.reverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Jainik on 1/12/2015.
 */
public class ReverseApp {
    public static void main(String args[]) throws IOException {
        String input, output;
        while (true) {
            System.out.println("Enter a string: ");
            System.out.flush();
            input = getString();
            if(input.equals("")) {
                break;
            }
            Reverser reverser = new Reverser(input);
            output = reverser.reverseString();
            System.out.println("Reversed String: " + output);
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input = br.readLine();
        return input;
    }
}
