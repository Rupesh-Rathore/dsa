package JAVA_DSA.sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int nums[] = {9,6,4,2,1,0,1,1,1,1,1,0,2,2,567,-1,-3,-23,-5};
        System.out.println(Arrays.toString(nums));
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSort(int[] nums){
        for(int i = 0; i < nums.length - 1; i++){
            int maxValIndex = 0;
            for (int j = 0 ; j <= nums.length - 1 - i;j++){
                if( nums[j] > nums[maxValIndex]){
                    maxValIndex = j;
                }
            }
            swap(nums, maxValIndex, nums.length - 1 - i);
        }
    }

    static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
