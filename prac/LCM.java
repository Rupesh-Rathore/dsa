package prac;

public class LCM {
    // use euclidean algo to find GCD
    // use algorithm LCM(a,b)*GCD(a,b) = a*b;
    public static int lcm(int a, int b){
        int prod = a * b;
        while (b!=0) {
            int temp = b;
            b = a%b;
            a = temp;
        }
        // a is GCD

        return prod / a;
    }
}
