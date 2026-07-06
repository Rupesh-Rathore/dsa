package JAVA_DSA.recursion.basic;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.printf("Factorial of %d is - %d" , n , factorial(n));
    }
    static int factorial(int n){
        if(n == 1 || n == 0){
        System.out.printf("In function call factorial(%d) where we factorial (%d) - 1 ",n,n);
        System.out.println();
            return 1;
        }
        System.out.printf("In function call factorial(%d) where we want to - %d * factorial(%d)",n,n,n-1);
        System.out.println();
        return n * factorial(n-1);
    }
}
