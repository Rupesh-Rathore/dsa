package JAVA_DSA.recursion.basic;

public class DigitSum {
    public static void main(String[] args) {
        System.out.println(SumOfDigitsOfANum(7352));
    }
    static int SumOfDigitsOfANum(int num){
        if( num < 10){
            return num;
        }
        return (num % 10) + SumOfDigitsOfANum(num / 10);
    }
}