package com.rutuja;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Search in a sorted matrix
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(search(arr, 14)));
    }

    // Search in the row provided between the columns provided
    static int[] binarySearch(int[][] matrix, int row, int colStart, int colEnd, int target){
        while (colStart <= colEnd){
            int mid = colStart + (colEnd - colStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }

            if(matrix[row][mid] < target){
                colStart = mid + 1;
            }else {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length; // matrix may be empty

        if(rows == 1){
            return binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rstart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rstart < (rEnd - 1)){
            int mid = rstart + (rEnd - rstart) / 2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }

            if(matrix[mid][cMid] < target){
                rstart = mid;
            }else {
                rEnd = mid;
            }
        }
        // now we have two rows
        // check whether the target is in the column of 2 rows
        if(matrix[rstart][cMid] == target){
            return new int[]{rstart, cMid};
        }

        if(matrix[rstart + 1][cMid] == target){
            return new int[]{rstart + 1, cMid};
        }

        // search in 1st half
        if(target <= matrix[rstart][cMid - 1]){
            return binarySearch(matrix, rstart, 0, cMid - 1, target);
        }

        // search in 2nd half
        if(target >= matrix[rstart][cMid + 1] && target <= matrix[rstart][cols - 1]){
            return binarySearch(matrix, rstart, cMid + 1, cols - 1, target);
        }

        // search in 3rd half
        if(target <= matrix[rstart + 1][cMid - 1]){
            return binarySearch(matrix, rstart + 1, 0, cMid-1, target);
        }else {
            return binarySearch(matrix, rstart + 1, cMid + 1, cMid-1, target);
        }
    }


}
