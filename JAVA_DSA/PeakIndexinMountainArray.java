package JAVA_DSA;

public class PeakIndexinMountainArray {
    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println("peak of arr is at -> "+peakIndexInMountainArray(arr));
    }

/*

static int 
*/
    static int peakIndexInMountainArray(int[] arr){

        // ! Brute-force approach - > Traverse the array

        // * optimal approach -> using Binary search approach
        // * Array is a mountain array - https://www.enjoyalgorithms.com/blog/valid-mountain-array
        if (arr.length <=2) {
            // System.err.println("Not a peak array");
            return -1;
        }
        int start = 0, end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(mid-1 >= 0 && mid+1 <= arr.length-1){
                if ( arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1] ){
                    return mid;
                }
                else if(arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }else if(mid-1 >= 0){
                end = mid - 1;
            }
            else{
                start = mid + 1;
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
