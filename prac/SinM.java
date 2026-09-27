package prac;

import java.util.Arrays;

public class SinM {
    public static void main (String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        System.out.println(Arrays.toString(searchInRCsorted(matrix, 11)));
        
    }

    public static int[] searchInRCsorted(int[][] matrix , int target) {
        int lb = 0;
        int ub = matrix[0].length - 1;

        while (ub >= 0 && lb <= matrix.length - 1) {
            int elem = matrix[lb][ub];
            if (elem == target) {
                return new int[] {lb,ub};
            }
            else if(elem > target) {
                ub--;
            }
            else {
                lb++;
            }
        }

        return new int[]{-1,-1};
    }
}
