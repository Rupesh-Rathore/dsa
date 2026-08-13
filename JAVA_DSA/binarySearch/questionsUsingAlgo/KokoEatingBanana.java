package JAVA_DSA.binarySearch.questionsUsingAlgo;

import java.util.Arrays;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        System.out.println(minEatingSpeed(piles,8));
    }
    public static int minEatingSpeed(int[] piles, int h){
        int maxPile = maxEle(piles);
        int right = maxPile;
        int left = 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int hours = hoursRequired(mid, piles);

            if (hours <= h) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }

        return left;
    }

    static int maxEle(int[] arr){
        int maxEl = Integer.MIN_VALUE;
        for (int i : arr) {
            maxEl = Math.max(i, maxEl);
        }
        return maxEl;
    }
    static int hoursRequired(int speed, int[] piles) {
        int hours = 0;
        for (int pile : piles) {
            int hrPerPile = (pile + speed - 1) / speed;
            hours+=hrPerPile;
        }
        return hours;
    }
}
