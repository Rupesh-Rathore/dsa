package JAVA_DSA.binarySearch;

public class BinarySearch {
    static int binarySearch(int[] nums, int target, int start , int end){
        while (start <= end) {
            int middle = start + (end-start)/2;
            if (target < nums[middle]){
                end = middle - 1;
            }
            else if (target > nums[middle]){
                start = middle + 1;
            }
            else {
                // nums[middle] = taget ->
                return middle;
            }
        }
    return -1;}
}
