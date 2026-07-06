package JAVA_DSA.recursion.drawPatterns;

public class UnderstandingRecursionForPatterns {
    /*
    
    ****
    ***
    **
    *
    *

    */

    public static void main(String[] args) {
        patternInvertedStartTriangle(5, 0);
    }
    static void patternInvertedStartTriangle(int row, int col){
        if (row == 0) return;
        if ( col < row) {
            patternInvertedStartTriangle(row, col + 1);
            System.out.print("@ ");
        } else {
            patternInvertedStartTriangle(row - 1, 0);
            System.out.println();
        }
    }
}
