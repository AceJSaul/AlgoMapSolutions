package arraysStrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class isSubSequence {

    /*
    Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

    A subsequence of a string is a new string that is formed from the original string by
    deleting some (can be none) of the characters without disturbing the relative positions
    of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     */

    public static void main(String[] args){

        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("ab", "baab"));
    }

    public static boolean isSubsequence(String s, String t) {
        // Using stack to track "s" characters
        List<Character> sStack = new ArrayList<>();
        for (int i=s.length()-1; i>=0; i--){
            sStack.add(s.charAt(i));
        }

        for (int j=0; j<t.length(); j++){
            if (sStack.contains(t.charAt(j)) && sStack.getLast() == t.charAt(j)){
                sStack.removeLast();
            }
        }
        return (sStack.isEmpty()); // If not empty, not substring
    }
}
