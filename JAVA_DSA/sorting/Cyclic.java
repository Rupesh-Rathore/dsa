package JAVA_DSA.sorting;

import java.util.Arrays;

public class Cyclic {
    public static void main(String[] args) {
        int[] nums = {9,3,4,1,2,7,8,5,6};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    /*
    when we know elements are from range 1 to N
    we will use cyclic sort
    * Main concept to remember ->
            In the sorted array the condition "index = valAtIndex - 1" will always hold true
            indexs -> 0,1,2,3,4,5,..,N-1
            values -> 1,2,3,4,5,6,..,N
    */
    static void cyclicSort(int arr[]){
        int i = 0;
        while (i < arr.length-1) {
            if(i == arr[i] - 1){
                i++;
                continue;
            }
            swap(arr,i,arr[i]-1);
        }
    }
    static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
