package JAVA_DSA.patterns.twoPointers;

public class ValidPalindrom {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int front = 0;
        int rear = s.length() - 1;
        s = s.toLowerCase();
        while (front <= rear) {
            char chf = s.charAt(front);
            char chr = s.charAt(rear);
            if (Character.isLetterOrDigit(chf) && Character.isLetterOrDigit(chr)){
                if (chf == chr) {
                    front++;
                    rear--;
                }
                else {
                    return false;
                }
            }
            else if (!Character.isLetterOrDigit(chf)) {
                front++;
            }
            else if (!Character.isLetterOrDigit(chr)) {
                rear--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        
        System.out.println(isPalindrome(s));
    }
}

