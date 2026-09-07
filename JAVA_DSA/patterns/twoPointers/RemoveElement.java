package JAVA_DSA.patterns.twoPointers;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[counter++] = nums[i];
            }
        }
        return counter;
    }
        public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2};
        System.out.println(Arrays.toString(nums));
        System.out.println(removeElement(nums, 2));
        System.out.println(Arrays.toString(nums));
    }
}
