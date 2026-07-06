package JAVA_DSA.recursion.sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        int nums[] = { 9, 6, 4, 2,2, 1,1, 0, 1, -1, -11, -226 };
        System.out.println(Arrays.toString(nums));
        selectionSortRecursive(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void selectionSortRecursive(int[] nums, int start, int end){
        if (start >= end) return;
        int indexWithMaxVAlue = selectionPass(nums, start, end, start);
        swap(nums, indexWithMaxVAlue, end);
        selectionSortRecursive(nums, start, end - 1);
    }

    static int selectionPass(int[] nums, int start, int end, int indexWithMaxVAlue){
        if (start > end) return indexWithMaxVAlue;
        if (nums[start] >= nums[indexWithMaxVAlue]) indexWithMaxVAlue = start;
        return selectionPass(nums, start + 1, end, indexWithMaxVAlue);
    }

    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
