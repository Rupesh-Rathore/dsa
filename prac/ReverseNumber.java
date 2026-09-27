package prac;

public class ReverseNumber {

    public static int reverse(int n) {
        int revn = 0;
        while (n != 0) {
            revn = revn * 10 + n % 10;
            n = n/10;
        }
        return revn;
    }
}
