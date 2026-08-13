package JAVA_DSA.recursion.subsetAndSubsequence;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<Character> strArrList = new ArrayList<>();
        for (char character : str.toCharArray()) {
            strArrList.add(character);
        }
        ArrayList<String> permutations = new ArrayList<>();
        permuteKunal("", str , permutations);
        System.out.println(permutations);
    }


    static void permute(String str, ArrayList<Character> remainingChar, ArrayList<String> permutations){
        if (remainingChar.size() == 0){
            String permutated = new String(str);
            permutations.add(permutated);
        }

        for (Character selectedCharacter : remainingChar) {
            ArrayList<Character> newRemains = new ArrayList<>(remainingChar);
            newRemains.remove(selectedCharacter);
            permute(str + selectedCharacter, newRemains, permutations);
        }
    }
    
    
    static void permuteKunal(String str, String remainingChar, ArrayList<String> permutations){
        if (remainingChar.isEmpty()){
            String permutated = new String(str);
            permutations.add(permutated);
            return;
        }

        char ch = remainingChar.charAt(0);
        for (int i = 0; i <= str.length(); i++) {
            String f = str.substring(0,i);
            String s = str.substring(i,str.length());
            System.out.println(f +"-"+ ch +"-"+ s);
            permuteKunal(f + ch + s , remainingChar.substring(1), permutations);
        }
        return;
    }
}
