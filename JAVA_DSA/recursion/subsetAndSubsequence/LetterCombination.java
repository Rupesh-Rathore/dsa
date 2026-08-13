package JAVA_DSA.recursion.subsetAndSubsequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class LetterCombination {

    public static void main(String[] args) {
        String didgits = "23";
        List<String> ltComb = letterCombinations(didgits);
        System.out.println(ltComb);
    }

    public static Map<Character, String[]> map = Map.ofEntries(
            Map.entry('2', new String[] { "a", "b", "c" }),
            Map.entry('3', new String[] { "d", "e", "f" }),
            Map.entry('4', new String[] { "g", "h", "i" }),
            Map.entry('5', new String[] { "j", "k", "l" }),
            Map.entry('6', new String[] { "m", "n", "o" }),
            Map.entry('7', new String[] { "p", "q", "r", "s" }),
            Map.entry('8', new String[] { "t", "u", "v" }),
            Map.entry('9', new String[] { "w", "x", "y", "z" }));

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            List <String> emptyList = new ArrayList<String>();
            emptyList.add("");
            return emptyList;
        }

        List <String> outerList = new ArrayList<String>();
        
            char digit = digits.charAt(0);
            String[] digit_chars = map.get(digit);
            
            for (String string : digit_chars) {
                List <String> innerList = letterCombinations(digits.substring(1));

                innerList.replaceAll(s -> string + s);

                outerList.addAll(innerList);
            }

        return outerList;

    }

    public static List<String> letterCombinations1(String digits) {
        if (digits.length() == 1) {
            List<String> list = new ArrayList<String>(Arrays.asList(map.get(digits.charAt(0))));
            return list;
        }
        List<String> outerList = new ArrayList<>();

        for (int i = 0; i < digits.length(); i++) {

            for (String chr : map.get(digits.charAt(0))) {
                List<String> innerList = letterCombinations(digits.substring(1));
                for (int j = 0; j < innerList.size(); j++) {
                    innerList.set(j, chr + innerList.get(j));
                }
                outerList.addAll(innerList);
            }
        }

        return outerList;
    }
}
