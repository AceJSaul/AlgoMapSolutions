package arraysStrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    /*
    Given an array of intervals where intervals[i] = [start, end], merge all overlapping intervals, and return an array of the non-overlapping
    intervals that cover all the intervals in the input.
     */

    public static void main(String[] args){ // Tests
        int[][] example1 = new int[][] {{1,3}, {2,6}, {8,10}, {15,18}};
        System.out.println(Arrays.deepToString(merge(example1)));

        int[][] example2 = new int[][] {{1,4}, {4,5}};
        System.out.println(Arrays.deepToString(merge(example2)));

        int[][] example3 = new int[][] {{1,4}, {0,4}};
        System.out.println(Arrays.deepToString(merge(example3)));

        int[][] example4 = new int[][] {{1,4}, {0,1}};
        System.out.println(Arrays.deepToString(merge(example4)));

        int[][] example5 = new int[][] {{4,5}, {1,4}, {0,1}};
        System.out.println(Arrays.deepToString(merge(example5)));

        int[][] example6 = new int[][] {{2,3}, {4,5}, {6,7}, {8,9}, {1,10}};
        System.out.println(Arrays.deepToString(merge(example6)));
    }

    public static int[][] merge(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // List used because we do not know how many arrays overlap, so it must not be a fixed value
        List<int[]> intervalList = new ArrayList<>();
        // intervals[i+1][0] is the next start, and intervals[i+1][1] is the next end
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i=0; i<intervals.length; i++){
            if (i == intervals.length-1){
                if (intervals[i][0] > end){
                    intervalList.add(new int[] {intervals[i][0], intervals[i][1]});
                }
                else{
                    intervalList.add(new int[] {Math.min(start, intervals[i][0]), Math.max(end,intervals[i][1])});
                }
            }
            else if(start > intervals[i+1][1] || end < intervals[i+1][0]){
                intervalList.add(new int[] {start, end});
                start = intervals[i+1][0];
                end = intervals[i+1][1];
            }
            else{
                start = Math.min(start, intervals[i+1][0]);
                end = Math.max(end, intervals[i+1][1]);
            }
        }

        return intervalList.toArray(new int[0][]);
    }
}
