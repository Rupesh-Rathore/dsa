package JAVA_DSA.recursion.sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int nums[] = { 9, 6, 4, 2, 1, 0, 1, -1, -11, -226 };
        System.out.println(Arrays.toString(nums));
        outerBubble(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

    static void outerBubble(int[] nums, int start, int end) {
        if (start >= end) return;
        innerBubble(nums, start, end);
        outerBubble(nums, start, end - 1);
    }

    static void innerBubble(int[] nums, int start, int end) {
        if (start >= end)
            return;
        if (nums[start] > nums[start + 1]) {
            int temp = nums[start];
            nums[start] = nums[start + 1];
            nums[start + 1] = temp;
        }
        innerBubble(nums, start + 1, end);
    }
}
