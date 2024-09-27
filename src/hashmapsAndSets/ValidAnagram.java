package hashmapsAndSets;

import java.util.HashMap;

public class ValidAnagram {
    /*
    Given two strings s and t, return true if t is an anagram
 of s, and false otherwise.
     */

    public static void main(String[] args){
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car")); // false
        System.out.println(isAnagram("parenda", "aprenda")); // true
        System.out.println(isAnagram("par", "rap")); // true
        System.out.println(isAnagram("abc", "dbc")); // false
        System.out.println(isAnagram("ninja", "ninja")); // true
        System.out.println(isAnagram("world", "word")); // false
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> sWordCharCounter = new HashMap<>();

        for (int i=0; i<s.length(); i++){
            if(sWordCharCounter.containsKey(s.charAt(i))){
                sWordCharCounter.put(s.charAt(i), sWordCharCounter.get(s.charAt(i))+1);
            }
            else{
                sWordCharCounter.put(s.charAt(i), 1);
            }
        }
        for (int j=0; j<t.length(); j++){
            if(!sWordCharCounter.containsKey(t.charAt(j))) return false;
            if(sWordCharCounter.get(t.charAt(j)) <= 0) return false;
            sWordCharCounter.put(t.charAt(j), sWordCharCounter.get(t.charAt(j)) -1);
        }
        // Did not check sWordCharCounter keys as it was not necessary
        // If the string has the same length and no character got bellow 0, it must return true
        return true;
    }
}
