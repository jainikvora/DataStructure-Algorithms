package ds.stack.string.brackets;

/**
 * Created by Jainik on 1/13/2015.
 */
public class BracketChecker {
    private String input;

    public BracketChecker(String input) {
        this.input = input;
    }

    public boolean verify() {
        boolean valid = true;
        int length = input.length();
        CharStack stack = new CharStack(length);

        for(int i=0; i<length; i++) {
            char ch = input.charAt(i);

            switch (ch) {
                case '(':
                case '{':
                case '[':
                {
                    stack.push(ch);
                    break;
                }
                case ')':
                case '}':
                case ']':
                {
                    if(!stack.isEmpty()) {
                        char chTop = stack.pop();

                        if((chTop == '(' && ch == ')') ||
                                (chTop == '{' && ch == '}') ||
                                (chTop == '[' && ch == ']')) {
                            continue;
                        } else {
                            valid = false;
                        }

                    } else {
                        valid = false;
                    }
                    break;
                }
            }
        }

        if(!stack.isEmpty())
            valid = false;

        return valid;
    }
}