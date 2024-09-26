package hashmapsAndSets;

import java.util.HashMap;

public class RansomNote {
    /*
    Given two strings ransomNote and magazine,
    return true if ransomNote can be constructed by
    using the letters from magazine and false otherwise.
    Each letter in magazine can only be used once in ransomNote.
     */

    public static void main(String[] args){
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine){
        HashMap<Character, Integer> magazineCounter = new HashMap<>();
        // Counting chars in magazine
        for (int i=0; i<magazine.length(); i++){
            Character magazineCharAtI = magazine.charAt(i);
            if (magazineCounter.containsKey(magazineCharAtI)){
                Integer quantityOfMagazineChar = magazineCounter.get(magazineCharAtI);
                magazineCounter.put(magazineCharAtI, quantityOfMagazineChar+=1);
            }
            else {
                magazineCounter.put(magazineCharAtI, 1);
            }
        }
        // Counting chars in ransomNote
        for (int j=0; j<ransomNote.length(); j++){
            // Checking if char in ransomNote is present in magazine
            if(!magazineCounter.containsKey(ransomNote.charAt(j))) return false;
            // If all of those characters have been already used
            if(magazineCounter.get(ransomNote.charAt(j)) <= 0) return false;

            Integer quantityOfChar = magazineCounter.get(ransomNote.charAt(j));
            magazineCounter.put(ransomNote.charAt(j), quantityOfChar-=1);
        }
        return true;
    }
}
