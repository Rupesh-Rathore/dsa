package JAVA_DSA.patterns.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoSumCollection {
    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        ArrayList<int[]> output = twoSumNonOverlappingIndexPairs(nums, 6);
        for (int[] is : output) {
            System.out.println(Arrays.toString(is));
        }
    }

    // It returns: A set of non-overlapping index pairs whose values sum to target.

    static ArrayList<int[]> twoSumNonOverlappingIndexPairs(int[] arr, int target){
        ArrayList<int[]> result = new ArrayList<int[]>();
        int i = 0, j = arr.length-1, arrLen = arr.length;

        while (i<j) {
            if(arr[i] + arr[j] == target){
                int[] pair = {i,j};
                result.add(pair);
                i++;
                j--;
            }
            else {
                if(arr[i] + arr[j] > target){
                    j--;
                }
                else{
                    i++;
                }
            }
        }

        return result;
    }

    // It returns: A set of unique pairs of values that sums to target.

    static ArrayList<int[]> twoSumUniqueValuePairs(int[] arr, int target){
        ArrayList<int[]> result = new ArrayList<int[]>();
        int i = 0, j = arr.length-1, arrLen = arr.length;

        while (i<j) {
            if(arr[i] + arr[j] == target){
                int[] pair = {arr[i],arr[j]};
                result.add(pair);
                i++;
                j--;
                while(i < arrLen-1 && arr[i] == arr[i-1]){
                    i++;
                }
                while(j > 0 && arr[j] == arr[j+1]){
                    j--;
                }
            }
            else {
                if(arr[i] + arr[j] > target){
                    j--;
                }
                else{
                    i++;
                }
            }
        }

        return result;
    }
}
