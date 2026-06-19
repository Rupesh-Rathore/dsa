package JAVA_DSA.binarySearch.questionsUsingAlgo;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4,5,6,7};
        int target = 3;
        int pivot =  pivotIndexNoDupli(nums);
        if (pivot == -1){
            // * normal binary search
            int result = binarySearch(nums, target, 0, nums.length - 1);
            System.out.println(result);
        }
        else {
            if ( target < nums[0] ){
                int result = binarySearch(nums, target, pivot + 1, nums.length - 1);
                System.out.println(result);
            }
            else{
                int result = binarySearch(nums, target, 0, pivot);
                System.out.println(result);
            }
        }

    }

    // * when duplicate values in the array are not allowed ->
    static int pivotIndexNoDupli(int nums[]){
        int start = 0, end = nums.length - 1;
        while (start <= end){
            int mid =  start + ( end - start ) / 2;
            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid-1] > nums[mid]){
                return mid - 1;
            }
            if ( nums[mid] <= nums[start]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // ! when duplicates are allowed ->
    static int pivotIndexDupli(int nums[]){
                int start = 0, end = nums.length - 1;
        while (start <= end){
            int mid =  start + ( end - start ) / 2;
            if (mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if (mid > start && nums[mid-1] > nums[mid]){
                return mid - 1;
            }
            if (nums[mid] == nums[start] && nums[mid] == nums[end]){
                if (nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if (nums[end] < nums[end-1]) {
                    return end - 1;
                }
            }
            else if (nums[start] < nums[mid] || (nums[start] == nums[mid] && nums[mid] > nums[end])){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            }
        return -1;
    }
    
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
