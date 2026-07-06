package JAVA_DSA.recursion.basic;

public class ReverseTheNum {
    public static void main(String[] args) {
        int num = 121221;
        System.out.println(ReverseNum(num));
    }
    static int ReverseNum(int number){
        if( number < 10){
            return number;
        }
        return (
            (
                (number%10) 
                *
                ((int) Math.pow(10 , (double) (digitCount(number) - 1)))
            ) 
            +
            ReverseNum(number / 10)
        );
    }
    static int digitCount(int num){
        return String.valueOf(num).length();
    }
}
