package prac;

public class ReverseString {

    public static String reverseString (String string) {
        char[] revArr = new char[string.length()];
        for (int i = string.length() - 1, j = 0; i >= 0; i--, j++) {
            revArr[j] = string.charAt(i);
            System.out.println(revArr[j] +" "+ string.charAt(j));
        }
        string =  new String(revArr);
        return string;
    }
}
