package JAVA_DSA.sorting.algos;

import java.util.Arrays;

public class Merge {
    /*
    ▢ Theory ->

    ▹ Based on Recursion (Back-bone).
    ▹ Merge sort basicalyy works on the principle ->
        ▹ Split the array in two halves.
        ▹ Sort each half (Recursivelly).
        ▹ Merge two halves (basically re-arange the elements of both the sorted halves such that the whole merged array is sorted).
    ▹ In-Order sorting means -> re-arranging the original Array.
    ▹ Non-In-Order sorting means -> Creating a new array and returning it which will furthur replace the original array.

    ▢ Steps ->

    In each Recursion call->

    ▹ Check weather the array have only one element -> if YES -> return (base condition)
    ▹ Find the middle index.
        ▹ If In-orfer sorting approach use -> start + ( end - start ) / 2.
        ▹ If Non-In-Order sorting approach use -> arr.length / 2.
    ▹ split the array in two halves
        ▹ Left -> 
            ▹ If in-order (using start and end pointer) -> start to mid-1.
            ▹ If non-in-order -> 0 to mid-1.
        ▹ Right ->
            ▹ If in-order (using start and end pointer) -> mid to end.
            ▹ If non-in-order -> mid to arr.length-1.
    ▹ Sort both the halves recursivelly.
    ▹ Merge both the sorted halves.
        ▹ Steps to merge both the halves.
            ▹ Create an array of size equals to sum of both halves size ->(newArray's = Left.lenght + Right.Length).
            ▹ create three pointerVariables i,j,k
                left  ->   [l1, l2, l3, l4, ... , ln]
                            0   1   2   3         n
                            ↑
                            i
                Right ->   [R1, R2, R3, R4, ... , Rm]
                            0   1   3   4         m-1
                            ↑
                            j
                merged->   [_ , _ , _ , _ , ... , M(n+m)]
                            0   1   2   3         n+m-1
                            ↑
                            k
            ▹ Using these three pointers merge left and right halves.
        ▹ Return the merged array.

    ▢ Time complexity of the merge sort is O( NlogN )
    ▢ Space complexity of the merge4 sort is O( N )
    */
    public static void main(String[] args) {
        int []nums = { 9 , 8 , 7, 6 , 5, 4 , 3 , 2 , 1 , 0 , -1 ,-2 , -3 , -4};
        System.out.println(Arrays.toString(nums));
        nums = mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static int[] mergeSort(int[] nums){
        if (nums.length == 1) return nums;

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left , right);
    }

    static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0, j = 0, k = 0;
        while(i <= (first.length - 1) && j <= (second.length - 1)){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i <= first.length - 1){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j <= second.length - 1){
            mix[k] = second[j];
            k++;
            j++;
        }

        return mix;
    }
}
