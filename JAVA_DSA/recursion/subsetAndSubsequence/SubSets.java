package JAVA_DSA.recursion.subsetAndSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSets {
    public static void main(String... args) {
        int[] arr = { 1, 2, 3 };
        ArrayList<ArrayList<Integer>> subSets = new ArrayList<>();
        subsetArg(new ArrayList<Integer>(), arr, subSets);
        System.out.println(subSets);
    }

    static void subsetArg(ArrayList<Integer> pro, int[] unpro, ArrayList<ArrayList<Integer>> subSets) {
        if (unpro.length == 0) {
            subSets.add(new ArrayList<>(pro));
            return;
        }

        int num = unpro[0];

        subsetArg(new ArrayList<>(pro), subArray(unpro, 1, unpro.length - 1), subSets);
        pro.add(num);
        subsetArg(new ArrayList<>(pro), subArray(unpro, 1, unpro.length - 1), subSets);

        return;
    }

    static int[] subArray(int[] arr, int start, int end) {
        if (end >= arr.length) {
            end = arr.length - 1;
        }

        if (start > end)
            return new int[] {};
        int size = end - start + 1;
        int[] subarr = new int[size];

        for (int i = start, j = 0; i <= end; i++, j++) {
            subarr[j] = arr[i];
        }

        return subarr;
    }
}
