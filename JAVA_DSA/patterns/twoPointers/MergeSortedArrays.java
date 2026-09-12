package JAVA_DSA.patterns.twoPointers;

import java.util.Arrays;

public class MergeSortedArrays {
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] newArr = new int[m+n];
        while(i < m && j < n) {
            if (nums1[i] >= nums2[j]) {
                newArr[k++] = nums2[j++];
            } else {
                newArr[k++] = nums1[i++];
            }
        }
        while(i < m) {
            newArr[k++] = nums1[i++];
        }
        while(j < n) {
            newArr[k++] = nums2[j++];
        }
        nums1 = newArr;
        System.out.println(Arrays.toString(nums1));
        System.out.println("------------------");
        return nums1;
    }
    /*
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] newArr = new int[m];
        while(i < m-n && j < n) {
            if (nums1[i] >= nums2[j]) {
                newArr[k++] = nums2[j++];
            } else {
                newArr[k++] = nums1[i++];
            }
        }
        while(i < m-n) {
            newArr[k++] = nums1[i++];
        }
        while(j < n) {
            newArr[k++] = nums2[j++];
        }
        return newArr;
    } */
    public static void main(String[] args) {
        int[] arr1 = {1,1,3,5,5};
        int[] arr2 = {2,2,4,4,8};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(merge(arr1, arr1.length, arr2, arr2.length)));
    }
}
