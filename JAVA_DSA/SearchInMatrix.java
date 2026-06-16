package JAVA_DSA;

import java.util.Arrays;

public class SearchInMatrix {
    public static void main(String[] args) {
        // int[][] matrix = {
        //     {1,2,4,8,16},
        //     {2,4,8,16,32},
        //     {4,8,16,32,64},
        //     {8,16,32,64,128},
        //     {16,32,64,128,256}
        // };
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
        };
        System.out.println(Arrays.toString(searchInStrictlySortedMatrix(matrix, 17)));
    }
    

    static int[] rowColumnWiseSortedSearch(int[][] matrix, int target){
    /*
    * if the 'Matrix' is row wise and column wize sorted ->
    _   _   _   _   _ >
    |   1   2   4   8   16
    |   2   4   8   16  32
    |   4   8   16  32  64
    |   8   16  32  64  128
    |   16  32  64  128 256
    v
    * each row and column is sorted , which means the m,atrix does not follow strict sorted pattern where( including the current properties ) a new property which implies each row's first element is >= previous row' last element.
    */
        int lowerBound = 0;
        int upperBound = matrix[0].length-1;

        while(upperBound >= 0 && lowerBound <= matrix.length-1){
            int elem = matrix[lowerBound][upperBound];
            if (target == elem){
                return new int[]{lowerBound,upperBound};
            }
            else if(target < elem){
                upperBound--;
            }
            else{
                lowerBound++;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] searchInStrictlySortedMatrix(int[][] matrix , int target){
    /*
    * if the 'Matrix' is strictly sorted ->
        1 ,2 ,3 ,4,
        5, 6, 7, 8,
        9, 10 ,11 ,12
    * strict sorted pattern which implies each row's first element is >= previous row' last element.
    */
        int rows = matrix.length - 1;
        int cols = matrix[0].length - 1;
        if (rows == 0){
            // apply simple binary search on matrix[0]
            return( simpleBinarySearch(matrix, target, 0, 0, matrix[0].length - 1));
        }
        int rowStart = 0, midCol = cols/2;
        while(rowStart < rows - 1){
            int mid = rowStart + (rows - rowStart) / 2;
            if (matrix[mid][midCol] == target){
                return new int[]{mid , midCol};
            }
            else if(matrix[mid][midCol] > target){
                rows = mid;
            }
            else{
                rowStart = mid;
            }
        }
        if (target == matrix[rowStart][midCol]){
            return new int[]{rowStart , midCol};
        }
        if (target == matrix[rowStart + 1][midCol]){
            return new int[]{rowStart + 1 , midCol};
        }


        if ( target < matrix[rowStart][midCol]){
            return simpleBinarySearch(matrix, target, rowStart, 0 , midCol - 1);
        }
        if ( target > matrix[rowStart][midCol] && target <= matrix[rowStart][cols]){
            return simpleBinarySearch(matrix, target, rowStart, midCol + 1 , cols);
        }
        if ( target < matrix[rowStart + 1][midCol] && target >= matrix[rowStart + 1][0]){
            return simpleBinarySearch(matrix, target, rowStart + 1, 0 , midCol - 1);
        }
        return simpleBinarySearch(matrix, target, rowStart + 1, midCol + 1 , cols);
    }

    //utility functions for 'searchInStrictlySortedMatrix()'
    static int[] simpleBinarySearch(int[][] matrix, int target,int row, int colStart, int colEnd){
        while (colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;
            if ( matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            else if(target < matrix[row][mid]){
                colEnd = mid - 1;
            }
            else{
                colStart = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}