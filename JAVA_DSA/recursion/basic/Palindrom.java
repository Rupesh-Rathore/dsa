package JAVA_DSA.recursion.basic;

public class Palindrom {
    public static void main(String[] args) {
        int n = 10201;
        String s =  String.valueOf(n);
        System.out.println(isPalindrom(s));
    }

    static boolean isPalindrom(String s){

        int strLen = s.length();

        if(strLen - 1 == 0) return true;
        if(strLen - 1 == 1) return (s.charAt(0) == s.charAt(1) ? true : false);

        if(s.charAt(0) != s.charAt(strLen-1))return false;
        else return isPalindrom(s.substring(1,strLen - 1));
    }
}
