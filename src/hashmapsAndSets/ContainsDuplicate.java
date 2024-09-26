package hashmapsAndSets;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {

    /*
    Given an integer array nums,
    return true if any value appears at least twice in the array,
    and return false if every element is distinct.
     */

    public static void main(String[] args){
        int[] example1 = new int[] {1, 2, 3, 1};
        System.out.println(containsDuplicate(example1));

        int[] example2 = new int[] {1,2, 3, 4};
        System.out.println(containsDuplicate(example2));
    }

    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> numbersInArray = new HashSet<>();
        for (int num : nums){
            if (!numbersInArray.contains(num)){
                numbersInArray.add(num);
            }
            else {
                return true;
            }
        }
        return false;
    }
}
