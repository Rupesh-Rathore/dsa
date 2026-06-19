package JAVA_DSA.sorting.quiestionsUsingSortingAlgo;

import java.util.Arrays;

public class MissingElement {
    public static void main(String[] args) {
        int[] nums = { 0,3, 4, 1, 2, 7, 8, 5, 6, 12, 13, 10, 11};
        cyclicSortForOneMissingElem(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(missingElement(nums));
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
    static void cyclicSortForOneMissingElem(int arr[]) {
        int i = 0,arrLen = arr.length;
        while (i < arrLen) {
            int correct = arr[i];
            if (arr[i] < arrLen && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static int missingElement(int[] sortedArr){
            int arrLen = sortedArr.length;
        for (int i = 0; i < arrLen; i++) {
            if( sortedArr[i] != i) return i;
        }
        return arrLen;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

