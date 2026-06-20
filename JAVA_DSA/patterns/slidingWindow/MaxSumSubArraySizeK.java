package JAVA_DSA.patterns.slidingWindow;

public class MaxSumSubArraySizeK {

    public static void main(String[] args) {
        int []arr = {9479, 488 ,2374 ,1583 ,5863 ,7811 ,6916 ,1685 ,3960};
        System.out.println("max subarray sum -> "+ maxSubarraySumR(arr,5));
    }

    // * my approach -> i found the first window sum and in the loop I started 'i' from '1'
    public static int maxSubarraySumR(int[] arr, int k) {
        // Code here
        int arrLen = arr.length;
        if(arrLen < k){
            System.err.println("Size of subarray 'k' is greater then size of original array size");
            return -1;
        }
        int sum = subArraySum(arr, 0, k-1);
        int maxSum = sum;
        int i = 1,j = k;
        while(j < arrLen){
            sum = sum - arr[i - 1] + arr[j]; // * IMPORTANT CONCEPT FOR SLIDING WINDOW
            if(sum > maxSum){
                maxSum = sum;
            }
            j++;
            i++;
        }
        return maxSum;
    }

    // * pratiyush's approach - he found the first window sum but in the loop he started 'i' from '0'
    public static int maxSubarraySumP(int[] arr, int k) {
        // Code here
        int arrLen = arr.length;
        if(arrLen < k){
            System.err.println("Size of subarray 'k' is greater then size of original array size");
            return -1;
        }

        int low = 0, high = k-1;
        int sum = subArraySum(arr, low, high);
        int maxSum = sum;
        while(high < arrLen){
            if(sum > maxSum){
                maxSum = sum;
            }
            high++;
            low++;
            if (high >= arrLen){
                break;
            }
            sum = sum - arr[low - 1] + arr[high]; // * IMPORTANT CONCEPT FOR SLIDING WINDOW
        }
        return maxSum;
    }


    static int subArraySum(int[] arr, int start,int end){
        if (end >arr.length-1){
            System.err.println("out of bound index");
            return -1;
        }
        int result = 0;

        // two pointer
        int i = start , j = end;
        while(i<=j){
            if(i == j){
                result = result + arr[i];
                return result;
            }
            result = result + arr[i] + arr[j];
            j--;
            i++;
        }
        return result;
    }
}
