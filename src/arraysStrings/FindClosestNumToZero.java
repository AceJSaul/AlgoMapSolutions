package arraysStrings;

public class FindClosestNumToZero {

    /*
    Given an integer array nums of size n,
    return the number with the value closest to 0 in nums.
    If there are multiple answers, return the number with the largest value.
     */

    public static void main(String[] args){

        int[] example1 = {-4,-2,1,4,8};
        int[] example2 = {-2, -1, 1};
        System.out.println(findClosestNumber(example1));
        System.out.println(findClosestNumber(example2));
    }

    public static int findClosestNumber(int[] nums){
        int closestNum = Integer.MAX_VALUE;

        for (int number : nums){
            if ((Math.abs(number)) < (Math.abs(closestNum))){
                closestNum = number;
            }
            else if((Math.abs(number)) == (Math.abs(closestNum)) && number > closestNum){
                closestNum = number;
            }
        }
        return closestNum;
    }
}
