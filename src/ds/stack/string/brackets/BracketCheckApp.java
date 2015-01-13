package ds.stack.string.brackets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Jainik on 1/13/2015.
 */
public class BracketCheckApp {
    public static void main(String args[]) throws IOException {
        String input;
        boolean valid;
        while (true) {
            System.out.println("Enter a string: ");
            System.out.flush();
            input = getString();
            if(input.equals("")) {
                break;
            }
            BracketChecker checker = new BracketChecker(input);
            if(checker.verify())
                System.out.println("String is valid");
            else
                System.out.println("String is not valid");
        }
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String input = br.readLine();
        return input;
    }
}
