package JAVA_DSA.recursion.subsetAndSubsequence;

import java.util.ArrayList;

public class Four_on_dice {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> allCombinationsFor4 = new ArrayList<>();
        dice_4(new ArrayList<>() , 4, new int[]{1,2,3,4} , allCombinationsFor4);
        System.out.println(allCombinationsFor4);
    }

    static void dice_4( ArrayList<Integer> pro, int unpro, int[] pool, ArrayList<ArrayList<Integer>> allCombinationsFor4 )
    {
        if ( unpro == 0 ) {
            allCombinationsFor4.add(new ArrayList<>(pro));
            return;
        }

        if (unpro < 0){
            return;
        }

        for (int i = 0; i < pool.length; i++) {
            ArrayList <Integer> proUlt = new ArrayList<>(pro);
            proUlt.add(pool[i]);
            dice_4(proUlt, unpro - pool[i], pool, allCombinationsFor4);
        }

        return;
    }

    static int subArraySum(ArrayList<Integer> arr, int start, int end){
        if (end >arr.size()-1){
            System.err.println("out of bound index");
            return -1;
        }
        int result = 0;

        // two pointer
        int i = start , j = end;
        while(i<=j){
            if(i == j){
                result = result + arr.get(i);
                return result;
            }
            result = result + arr.get(i) + arr.get(j);
            j--;
            i++;
        }
        return result;
    }
}
