package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Binary search - Ascending order array
        Scanner in = new Scanner(System.in);
        int[] arr = {-56, -20, -4, 0, 7, 13, 25, 33, 49, 53, 60, 77, 82};

        System.out.println("Enter target: ");
        int target = in.nextInt();

        int ans = searchNumber(arr, target);
        System.out.println(ans);
    }

    // return -1 if it does not exist.
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
       return -1;
    }
}
