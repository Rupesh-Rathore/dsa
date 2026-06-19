package JAVA_DSA.sorting.quiestionsUsingSortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllTheDuplicate {
    public static void main(String[] args) {
        int[] nums = { 8, 7, 7, 7, 5, 4, 3, 7, 1 };
        System.out.println(findDuplicates(nums));
    }

    static List<Integer> findDuplicates(int arr[]) {
        int i = 0, arrLen = arr.length;
        List<Integer> result = new ArrayList<>();
        while (i < arrLen) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    result.add(arr[i]);
                }
            }
            else{
                i++;
            }

        }
        return result;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
