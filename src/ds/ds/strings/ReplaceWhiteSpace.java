package ds.ds.strings;

/**
 * Created by Jainik on 1/18/2015.
 */
public class ReplaceWhiteSpace {

    public static void main(String args[]) {
        System.out.println(replaceString("Hello, how are you?"));
    }

    public static String replaceString(String str) {
        char[] strCharArray = new char[100];
        int i;
        for (i = 0; i < str.length(); i++) {
            strCharArray[i] = str.charAt(i);
        }

        int length = str.length();
        int spaceLength = 0;
        int newLength = 0;

        for (i = 0; i < length; i++) {
            if (strCharArray[i] == ' ')
                spaceLength++;
        }

        newLength = length + spaceLength * 2;

        strCharArray[newLength] = '\0';

        for (i = length - 1; i >= 0; i--) {
            if (strCharArray[i] == ' ') {
                strCharArray[newLength - 1] = '0';
                strCharArray[newLength - 2] = '2';
                strCharArray[newLength - 3] = '%';
                newLength = newLength - 3;
            } else {
                strCharArray[newLength - 1] = strCharArray[i];
                newLength -= 1;
            }
        }

        return new String(strCharArray);
    }
}
