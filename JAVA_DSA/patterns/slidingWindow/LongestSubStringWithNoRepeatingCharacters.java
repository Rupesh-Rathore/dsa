package JAVA_DSA.patterns.slidingWindow;

import java.util.HashMap;

public class LongestSubStringWithNoRepeatingCharacters {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int low = 0, high, sizeOfStringS = s.length(), maxLen = Integer.MIN_VALUE;
        HashMap<Character,Integer> stringMap = new HashMap<>();
        for( high = 0; high < sizeOfStringS; high++){
            stringMap.put(s.charAt(high), stringMap.getOrDefault(s.charAt(high), 0) + 1);
            while (!uniqueSubstringOrNot(stringMap)){
                stringMap.put(s.charAt(low) , stringMap.get(s.charAt(low)) - 1);
                if(stringMap.get(s.charAt(low)) == 0){
                    stringMap.remove(s.charAt(low));
                }
                low++;
            }
            int len = high - low + 1;
            maxLen = Math.max(maxLen, len);
        }
        return (maxLen == Integer.MIN_VALUE) ? 0 : maxLen;
    }

        public static int lengthOfLongestSubstringBetter(String s) {

    }
    static boolean uniqueSubstringOrNot(HashMap<Character,Integer> stringMap){
        int count = 0;
        for (Integer i : stringMap.values()) {
            count += i;
        }
        return(count == stringMap.size());
    }
}
