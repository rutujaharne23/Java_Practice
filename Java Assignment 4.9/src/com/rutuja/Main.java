package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Binary search - Descending order array
        Scanner in = new Scanner(System.in);

        int[] arr = {100, 92, 85, 72, 63, 57, 41, 33, 29, 11, 6, 0, -12, -55, -71};

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
            if(target > arr[mid]){
                end = mid - 1;
            }else if(target < arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

}
