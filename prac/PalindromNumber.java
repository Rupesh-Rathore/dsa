package prac;

public class PalindromNumber {

    public static void main(String[] args) {
    }
    public static boolean isPalindromNum(int num) {
        int revn = 0;
        int i = num;
        while (i != 0) {
            revn = revn * 10 + i % 10;
            i = i / 10;
        }
        return num == revn;
    }
}
