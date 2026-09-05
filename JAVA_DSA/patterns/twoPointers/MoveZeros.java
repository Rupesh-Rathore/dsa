package JAVA_DSA.patterns.twoPointers;

// import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        /*
        APPROACH 1
        int end = nums.length-1;
        boolean allZero = true;
        for (int i = 0; i <= end; i++) {
            if(nums[i] != 0) {
                allZero = false;
                break;
            }
        }
        if(allZero) return;
        int fst = 0;
        int sec = 0;
        while (fst <= end) {
            if (nums[fst] != 0) {
                fst++;
                sec++;
                continue;
            }
            while (sec < end) {
                nums[sec] = nums[sec+1];
                nums[sec+1] = 0;
                sec++;
            }
            if(end-1 >= 0)
            {end--;}
            sec = fst;
            
        }
            */
        /*
        Approach 2
        int end = nums.length-1;
        boolean allZero = true;
        for (int i = 0; i <= end; i++) {
            if(nums[i] != 0) {
                allZero = false;
                break;
            }
        }
        if(allZero) return;

        int mover = end;

        while (mover >= 0) {
            if (nums[mover] != 0) {
                mover--;
            }
            else {
                for (int i = mover + 1; i <= end ; i++) {
                    int temp = nums[i-1];
                    nums[i-1] = nums[i];
                    nums[i] = temp;
                }
                mover--;
                end--;
            }
        }*/

        /*
        Approach 3
        int[] aux = new int[nums.length];
        int i = 0,j=0;
        while (i < nums.length) {
            if (nums[i] != 0){
                aux[j] = nums[i];
                j++;
            }
            i++;
        }
        j++;
        while (j < nums.length){
            aux[j] = 0;
            j++;
        }
        
        for (int j2 = 0; j2 < aux.length; j2++) {
            nums[j2] = aux[j2];
        }
        */

        /*
        Approach 4
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                nums[count++] = nums[i];
            }
        }
        
        while(count < nums.length) {
            nums[count] = 0;
            count++;
        }
        */

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }

        }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
