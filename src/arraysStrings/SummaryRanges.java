package arraysStrings;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {

    /*
    You are given a sorted unique integer array nums.

    A range [a,b] is the set of all integers from a to b (inclusive).

    Return the smallest sorted list of ranges that cover all the numbers in the array exactly. That is, each element of nums is covered by
    exactly one of the ranges, and there is no integer x such that x is in one of the ranges but not in nums.

    Each range [a,b] in the list should be output as:

    "a->b" if a != b
    "a" if a == b
     */

    public static void main(String[] args){
        int[] example0 = new int[] {0, 1, 2, 4, 5, 7};
        System.out.println(summaryRanges(example0));

        int[] example1 = new int[] {0, 2, 3, 4, 6, 8, 9};
        System.out.println(summaryRanges(example1));
    }

    public static List<String> summaryRanges(int[] nums){
        int startOfRange = 0;
        int endOfRange;
        List<String> summary = new ArrayList<>();

        for (int i=0; i<nums.length; i++){
            endOfRange = i;
            if (i == nums.length-1 || nums[i+1] - nums[i] != 1){
                if (startOfRange == endOfRange){
                    summary.add(String.format("%d", nums[i]));
                }
                else{
                    summary.add(String.format("%d->%d", nums[startOfRange], nums[endOfRange]));
                }
                startOfRange = i+1;
            }
        }
        return summary;
    }
}
