package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Find min and max element in the array
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the elements in array: ");
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Minimum number is " + findMinValue(arr));
        System.out.println("Maximum number is " + findMaxValue(arr));

    }

    // Assume arr is not empty
    static int findMaxValue(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int findMinValue(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
