package JAVA_DSA.patterns.slidingWindow;

public class SubarraySumEqK {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1},2));
    }
    public static int subarraySum(int[] nums, int k) {
        int arrLen = nums.length;
        int i = 0, j = 0, count = 0;
        
        return count;
    }
    
    public static int sum(int[] arr , int i , int j){
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum = sum + arr[k];
        }
        return sum;
    }
}
