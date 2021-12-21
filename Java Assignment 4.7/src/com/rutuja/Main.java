package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Search maximum and minimum in 2D Array
        int[][] arr = {
                {20, 56, -1, 10},
                {91, 4, 75, 100, -56},
                {5, 11, 19},
                {7, 436}
        };
        System.out.println("Maximum value is " + searchMax(arr));
        System.out.println("Minimum value is " + searchMin(arr));
    }

    private static int searchMin(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }

    private static int searchMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
