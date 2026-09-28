package prac;

import java.util.Arrays;

public class Anagram {

    public static boolean areAnagrams (String a, String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        return Arrays.equals(x, y);
    }
}