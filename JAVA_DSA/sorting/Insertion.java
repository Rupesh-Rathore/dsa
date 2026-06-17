package JAVA_DSA.sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int nums[] = {};
        System.out.println(Arrays.toString(nums));
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] arr){
        for (int i = 0; i <= arr.length - 2; i++){
            for (int j = i+1; j>0; j--){
                if (arr[j-1] > arr[j]){
                    swap(arr, j, j-1);
                    continue;
                }
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
