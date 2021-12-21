package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Search in Range
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to store: ");
        int[] arr = new int[8];

        for (int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter starting range: ");
        int start = in.nextInt();

        System.out.println("Enter ending range: ");
        int end = in.nextInt();

        System.out.println("Enter target: ");
        int target = in.nextInt();

        System.out.println(searchInRange(arr, target, start, end));

    }

    static boolean searchInRange(int[] arr, int target, int start, int end) {
        if(arr.length == 0){
            return false;
        }

        for (int i = start; i < end; i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
