package JAVA_DSA.binarySearch.questionsUsingAlgo;

public class BinarySearchForInfiniteSizedArray {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,8,8,8,8,11,11,33,33,33,45,65,65,90,91,92,93,94,95,100,100};
        System.out.println(binarySearchInfinity(nums, 8));
    }
    /*
    * Important Concept - find the size of an Array/subArray based on the indices (starting index and ending index) -
    * size = end - start + 1
    */
    static int binarySearchInfinity(int[] nums, int target){

        // not allowed to use arr.lenght
        int start = 0 , end = 1 , exponent = 1;
        while(true){
            if (target <= nums[end]){
                break;
            }
            else{
                exponent++;
                
                // * First approach
                /*
                int temp = end + 1;
                end = end + ( end - start + 1 ) * 2
                start = temp;
                */
                // * Second approach
                start = end + 1;
                end = start + (int)Math.pow(2,exponent)-1;
                if(end>nums.length-1){
                    end = nums.length-1;
                    System.err.println("Array is not infinity (-_-)!");
                }
            }
        }
        return binarySearch(nums, target, start, end);
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