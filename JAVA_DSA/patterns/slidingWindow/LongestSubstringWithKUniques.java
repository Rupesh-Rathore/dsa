package JAVA_DSA.patterns.slidingWindow;

import java.util.HashMap;

public class LongestSubstringWithKUniques {

    public static void main(String[] args) {
        String s = "aabacbebebe";
        System.out.println(longestKSubstr(s, 3));
    }
    
    public static int longestKSubstr(String s, int k) {
        // code here
        int low = 0, high, sizeOfStringS = s.length(), maxLen = Integer.MIN_VALUE;
        HashMap<Character, Integer> frequency = new HashMap<>();

        for(high = 0; high < sizeOfStringS; high++){
            if( frequency.get(s.charAt(high)) == null ) frequency.put(s.charAt(high),1);
            else frequency.put(s.charAt(high),frequency.get(s.charAt(high)) + 1);
            while( frequency.size() > k){
                frequency.put(s.charAt(low),frequency.get(s.charAt(low)) - 1);
                if(frequency.get(s.charAt(low)) == 0){
                    frequency.remove(s.charAt(low));
                }
                low++;
            }
            if(frequency.size() == k){
                int len = high - low + 1;
                maxLen = max(maxLen, len);
            }
        }

        return (maxLen == Integer.MIN_VALUE) ? -1 : maxLen;
    }
    
    public static int max(int a,int b){
        if(a > b) return a;
        else return b;
    }
}
