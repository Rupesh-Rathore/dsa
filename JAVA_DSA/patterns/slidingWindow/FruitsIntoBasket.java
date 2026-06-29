package JAVA_DSA.patterns.slidingWindow;

import java.util.HashMap;

public class FruitsIntoBasket {
    public static void main(String[] args) {
        int fruits[] = {3,3,3,1,2,1,1,2,3,3,4};
        System.out.println(totalFruit(fruits));
    }
    
    static int totalFruit(int[] fruits) {
        int low = 0,
            basketSize = 2,
            high,
            sizeOfFruitsArray = fruits.length,
            maximum_no_of_fruits = 1;

        HashMap<Integer,Integer> basketFruitsFreq = new HashMap<>();

        for( high = 0; high < sizeOfFruitsArray; high++){
            if( basketFruitsFreq.get(fruits[high]) == null) {
                basketFruitsFreq.put(fruits[high], 1);
            }
            else {
                basketFruitsFreq.put(fruits[high], basketFruitsFreq.get(fruits[high]) + 1); 
            }

            while(basketFruitsFreq.size() > basketSize){
                basketFruitsFreq.put(fruits[low] , basketFruitsFreq.get(fruits[low]) - 1);
                if( basketFruitsFreq.get(fruits[low]) == 0){
                    basketFruitsFreq.remove(fruits[low]);
                }
                low++;
            }

            int no_of_fruits = high - low + 1;
            maximum_no_of_fruits = Math.max(no_of_fruits , maximum_no_of_fruits);
        }

        return maximum_no_of_fruits; 
    }
}
