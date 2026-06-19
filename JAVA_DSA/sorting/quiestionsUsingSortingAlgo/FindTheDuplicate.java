package JAVA_DSA.sorting.quiestionsUsingSortingAlgo;

import java.util.Arrays;

public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] nums = { 8, 7, 7, 7, 5, 4, 3, 7, 1 };
        System.out.println(Arrays.toString(nums));
        System.out.println(findDuplicate(nums));
        System.out.println(Arrays.toString(nums));
    }

    static int findDuplicate(int arr[]) {
        int i = 0, arrLen = arr.length;
        while (i < arrLen) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return(arr[i]);
                }
            }
            else{
                i++;
            }

        }
        return -1;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
