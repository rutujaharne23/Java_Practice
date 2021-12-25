package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Binary Search - Ceiling number
        // ceiling -> greater number greater or equal to target.
        Scanner in = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        System.out.println("Enter target: ");
        int target = in.nextInt();

        int ans = searchNumber(arr, target);
        System.out.println(ans);
    }

    private static int searchNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return start;
    }
}
