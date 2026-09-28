package prac;

import java.sql.Array;
import java.util.Arrays;

public class WordCountInString {

    public static void main(String[] args) {
        System.out.println(countWordSplit(" Rupesh  rathore is here   "));
    }

    public static int countWordsNoSplit(String str) {
        str = str.strip().toLowerCase();
        if (str.length() == 0) return 0;
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i >0 && str.charAt(i-1) != ' ' && str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }
    public static int countWordSplit(String str) {
        return str.strip().split("\\s+").length;
    }
}
