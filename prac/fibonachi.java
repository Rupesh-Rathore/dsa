package prac;

public class fibonachi {
    public static void fibo(int n) {
        // first n fibo series numbers 
        int a = 0, b = 1;
        for (int i = 1; i <=n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}
