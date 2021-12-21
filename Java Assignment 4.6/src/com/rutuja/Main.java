package com.rutuja;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Search in 2D array
        Scanner in = new Scanner(System.in);

        int[][] arr = {
                {10, 42, -9, 6},
                {12, 66, 90},
                {21, 90, 102, -33, 48},
                {34, 3}
        };

        System.out.println("Enter target value: ");
        int target = in.nextInt();
        int[] ans = searchIn2DArray(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIn2DArray(int[][] arr, int target) {

        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
