package JAVA_DSA.sorting.algos;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = {9,6,4,2,1,0,1,-1,-11,-226};
        System.out.println(Arrays.toString(nums));
        bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums){
        boolean swapped;
        for(int i = 0; i < nums.length - 1; i++){
            swapped = false;
            for( int j = 0; j < nums.length - 1 - i; j++){
                if (nums[j] > nums[j+1]){
                    swap(nums, j, j+1);
                    swapped = true;
                }
            }
            if (!swapped){
                // if never swapped it means array has already been sorted -> so no need to perform next steps
                break;
            }
        }
    }
    static void swap(int[] arr, int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
