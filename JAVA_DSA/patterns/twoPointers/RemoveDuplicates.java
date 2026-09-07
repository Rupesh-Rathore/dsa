package JAVA_DSA.patterns.twoPointers;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int rearPointer = 0;
        int size = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[rearPointer]) {
                rearPointer++;
                nums[rearPointer] = nums[i];
                size++;
            }
        }
        return size;
    }
}
