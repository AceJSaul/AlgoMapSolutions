package arraysStrings;

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args){

        /*
        You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

        You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix
        and do the rotation.
         */

        int[][] example1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(example1));
        rotate(example1);
        System.out.println(Arrays.deepToString(example1));

        System.out.println("=== ===");
        int[][] example2 = new int[][] {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        System.out.println(Arrays.deepToString(example2));
        rotate(example2);
        System.out.println(Arrays.deepToString(example2));
    }

    public static void rotate(int[][] matrix){
        // Transpose
        for (int i=0; i<matrix.length; i++){
            for (int j = i; j<matrix[i].length; j++){
                int startIndex = matrix[i][j];
                int endIndex = matrix[j][i];
                matrix[i][j] = endIndex;
                matrix[j][i] = startIndex;
            }
        }
        // Rotate horizontally
        for (int i=0; i< matrix.length;i++){
            for (int j=0; j< matrix[i].length/2; j++){
                int startIndex = matrix[i][j];
                int endIndex = matrix[i][matrix[i].length-1-j]; // matrix[i].length-1-j is the last element of the row
                matrix[i][j] = endIndex;
                matrix[i][matrix[i].length-1-j] = startIndex;
            }
        }
    }
}
