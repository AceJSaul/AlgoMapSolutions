package arraysStrings;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    /*
    Given an m x n matrix, return all elements of the matrix in spiral order.
     */

    public static void main(String[] args){
        int[][] example1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(example1));

        int[][] example2 = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(example2));

        int[][] example3 = new int[][] {{6,9,7}};
        //System.out.println(spiralOrder(example3));
    }

    public static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> outputList = new ArrayList<>();

        int upBorder = 0;
        int rightBorder = matrix[0].length;
        int downBorder = matrix.length;
        int leftBorder = 0;

        while (outputList.size() < matrix[0].length * matrix.length){
            for (int i=leftBorder; i<rightBorder; i++){ // Left to right
                outputList.add(matrix[upBorder][i]);
            }
            upBorder+=1;
            for (int i=upBorder; i<downBorder; i++){ // Top to bottom
                outputList.add(matrix[i][rightBorder-1]);
            }
            rightBorder-=1;
            if (outputList.size() >= matrix[0].length * matrix.length){
                break;
            }
            for (int i=rightBorder-1; i>leftBorder; i--){ // Right to left
                outputList.add(matrix[downBorder-1][i]);
            }
            downBorder-=1;
            for (int i=downBorder; i>=upBorder; i--){ // Bottom to top
                outputList.add(matrix[i][leftBorder]);
            }
            leftBorder+=1;
        }
        return outputList;
    }
}
