package prac;

public class Factorial {
    public static int factorial(int n) {
        for (int i = n-1; i>=1;i--) {
            n *=i;
        }
        return n;
    }
}
