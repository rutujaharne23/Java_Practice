package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Fine the floor of a number
        // floor -> greater number smaller or equal to target
        Scanner in = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        System.out.println("Enter target: ");
        int target = in.nextInt();

        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index: greatest number <= target
    private static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length - 1]){
            return -1;
        }

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
        return end;
    }
}
