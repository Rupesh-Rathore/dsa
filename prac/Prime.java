package prac;

public class Prime {

    public static boolean isPrime(int n) {
        for (int i = 2; i*i <=n ; i++) {
            System.out.println("i - "+ i);
            if (n % i == 0) return false;
        }
        return true;
    } 
}
