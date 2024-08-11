package arraysStrings;

public class LongestCommonPrefix {

    /*
    Write a function to find the longest common prefix string amongst an array of strings.

    If there is no common prefix, return an empty string "".
     */

    public static void main(String[] args){
        String[] example1 = new String[] {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(example1));

        String[] example2 = new String[] {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(example2));

        String[] example3 = new String[] {""};
        System.out.println(longestCommonPrefix(example3));
    }

    public static String longestCommonPrefix(String[] strs){
        int minStrLength = Integer.MAX_VALUE;
        for (String str : strs){
            if (str.length() < minStrLength) minStrLength = str.length();
        }
        int i=0;
        while (i < minStrLength){
            for (String s : strs){
                if (s.charAt(i) != strs[0].charAt(i)){
                    return s.substring(0, i);
                }
            }
            i++;
        }
        return strs[0].substring(0, i);
    }
}
