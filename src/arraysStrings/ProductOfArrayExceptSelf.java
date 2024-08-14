package arraysStrings;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    /*
    Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

    You must write an algorithm that runs in O(n) time and without using the division operation.
     */

    public static void main(String[] args){
        int[] example1 = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(example1)));

        int[] example2 = new int[] {-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(example2)));
    }

    public static int[] productExceptSelf(int[] nums){
        int[] resultArray = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        int multiplication = 1;
        for (int i=0; i< nums.length; i++){
            left[i] = multiplication;
            multiplication *= nums[i];
        }

        multiplication = 1;
        for (int i=nums.length-1; i >= 0; i--){
            right[i] = multiplication;
            multiplication *= nums[i];
        }

        for (int i=0; i< left.length; i++){
            resultArray[i] = left[i] * right[i];
        }

        return resultArray;
    }
}
