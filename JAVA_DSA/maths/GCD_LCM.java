package JAVA_DSA.maths;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(15,90));
        System.out.println(lcm(15,90));
    }
    static int gcd(int a, int b){
        if( a == 0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm(int a, int b){
        return (a*b) / gcd(a,b);
    }
}
