package JAVA_DSA.sorting.algos;

import java.util.Arrays;

public class Quick {
    public static void main(String[] args) {
        int []nums = { 9 , 8 , 7, 6 , 5, 4 , 3 , 2 , 1 , 0 , -1 ,-2 , -3 , -4};
        System.out.println(Arrays.toString(nums));
        quickSort(nums, 0 , nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void quickSort(int[] nums, int low, int high){
        if ( low >= high ) return;

        int s  = low,
            e = high,
            m = s + (e - s) / 2,
            pivot = nums[m];
        
        while (s <= e) {

            while ( nums[s] < pivot ) s++;
            while ( nums[e] > pivot ) e--;

            if ( s <= e ) {
                int temp = nums[e];
                nums[e] = nums[s];
                nums[s] = temp;
                s++;
                e--;
            }
        }
        quickSort(nums, low, e);
        quickSort(nums, s, high);
    }
}
