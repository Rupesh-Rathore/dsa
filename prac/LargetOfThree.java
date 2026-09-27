package prac;

public class LargetOfThree {
    public static int largestOfThree(int a, int b, int c){
        return a > b ? ( a > c ? a : c) : (b > c ? b : c); 
    }
}
