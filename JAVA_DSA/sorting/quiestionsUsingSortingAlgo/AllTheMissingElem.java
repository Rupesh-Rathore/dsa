package JAVA_DSA.sorting.quiestionsUsingSortingAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllTheMissingElem {
    public static void main(String[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }
    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] - 1 != j){
                result.add(j+1);
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
