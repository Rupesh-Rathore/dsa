package JAVA_DSA.sorting.algos;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] nums = { 8 , 7 , 7 , 7 , 4 , 3 , 3 , 1 };
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*
     * when we know elements are from range 1 to N or a continuous range like ( 0 to N-1 | 2 to N+1)
     * we will use cyclic sort
     * Main concept to remember ->
     * In the sorted array the condition "index = valAtIndex - 1" will always hold
     * true
     * indexs -> 0,1,2,3,4,5,..,N-1
     * values -> 1,2,3,4,5,6,..,N
     */
    static void cyclicSort(int arr[]) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
