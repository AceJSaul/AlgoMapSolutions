package arraysStrings;

public class MergeStringsAlternately {

    /*
    You are given two strings word1 and word2.
    Merge the strings by adding letters in alternating order,
    starting with word1. If a string is longer than the other,
    append the additional letters onto the end of the merged string.

    Return the merged string.
     */

    public static void main(String[] args){

        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
        System.out.println(mergeAlternately("abcd", "pq"));
        System.out.println(mergeAlternately("acegikmoqsuwy", "bdfhjlnprtvxz"));
    }

    public static String mergeAlternately(String word1, String word2){
        StringBuilder returnString = new StringBuilder();
        int loopLimit = Math.min(word1.length(), word2.length()); // I'll iterate only until I have characters available on both Strings
        for (int i=0; i<loopLimit; i++){
            returnString.append(word1.charAt(i));
            returnString.append(word2.charAt(i));
        }

        if (loopLimit == word1.length()){
            String finalWord2 = word2.substring(loopLimit);
            returnString.append(finalWord2);
        }
        else{
            String finalWord1 = word1.substring(loopLimit);
            returnString.append(finalWord1);
        }
        return returnString.toString();
    }
}
