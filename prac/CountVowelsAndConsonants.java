package prac;

import java.util.Arrays;

public class CountVowelsAndConsonants {
    public static String vowels = "aeiou";
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countOfVowelsNConsonants("Rupesh Rathore")));
    }
    public static int[] countOfVowelsNConsonants (String string) {
        char[] charArr = string.toLowerCase().toCharArray();
        int[] count = {0,0}; // {vowel count, consonant count}
        for (char chr : charArr) {
            if (chr == ' ') continue;
            if (vowels.indexOf(chr) == -1) {
                count[1]++;
            }
            else count[0]++;
        }
        return count;
    }
}
