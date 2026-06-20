package JAVA_DSA.imporantUtilityCodeNdConcepts;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharCountInAString {
    public static int uniqueCount(String s){
        Set<Character> distinctChars = new HashSet<>();
        for (char ch : s.toCharArray()) {
            distinctChars.add(ch);
        }
        return distinctChars.size();
    }
}
