package prac;

public class GCD {
    public static int gcd(int a, int b) {
        // Use euclidean algorith
        // GCD(a,b) = GCD(b,a%b)

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
