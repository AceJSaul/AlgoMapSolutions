package hashmapsAndSets;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    /*
    You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have.
    You want to know how many of the stones you have are also jewels,
    letters are case-sensitive, so "a" is considered a different type of stone from "A".
     */

    public static void main(String[] args){
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> setOfJewels = new HashSet<>();
        // Adding jewels in set
        for (int i=0; i<jewels.length(); i++){
            setOfJewels.add(jewels.charAt(i));
        }

        // Counting jewels in stones
        int numberOfJewelsInStones = 0;
        for (int j=0; j<stones.length(); j++){
            if (setOfJewels.contains(stones.charAt(j))){
                numberOfJewelsInStones += 1;
            }
        }
        return numberOfJewelsInStones;
    }
}
