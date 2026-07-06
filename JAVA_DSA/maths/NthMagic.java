package JAVA_DSA.maths;



public class NthMagic {

    public static void main(String[] args) {
        System.out.println(nthMagicNumber(1));
        System.out.println(nthMagicNumber(2));
        System.out.println(nthMagicNumber(3));
        System.out.println(nthMagicNumber(4));
        System.out.println(nthMagicNumber(5));
        System.out.println(nthMagicNumber(6));
        System.out.println(nthMagicNumber(7));
    }
    static int nthMagicNumber(int n){
        /*
        n = 1 -> ... 0 0 1 -> 5^1 = 5
        n = 2 -> ... 0 1 0 -> 5^2 = 25
        n = 3 -> ... 0 1 1 -> 5^2 + 5^1 = 25 + 5 = 30
        n = 7 -> ... 1 1 1 -> 155
        */
        double res = 0;
        double count = 1;
        while( n > 0){
            res = res + Math.pow(5*(n & 1) , count);
            count++;
            n = n >> 1;
        }

    return (int)res;
    }
}
