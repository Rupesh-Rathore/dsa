package prac;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(""));
    }
    public static String removeDuplicates(String str) {
        String result = "";
        for (char ch : str.toCharArray()) {
            if (str.indexOf(ch) == -1) {
                result += ch;
            }
        }
        return result;
    }
}
