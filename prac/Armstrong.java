package prac;

public class Armstrong {
    public static boolean isArmstrong(int n) {
        int temp = n, sum = 0, digit = 0;
        while(n != 0) {
            digit++;
            n /= 10;
        }
        n = temp;
        while(n != 0) {
            int val = (int)Math.pow(n%10,digit);
            sum += val;
            n/=10;
        }
        return temp == sum;
    }
}
