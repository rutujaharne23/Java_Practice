package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Binary search with recursion
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};

        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    static int search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s) / 2;
        if(arr[m] == target){
            return m;
        }

        if(arr[s] <= arr[m]){
            if(target >= arr[s] && target <= arr[m]){
                return search(arr, target, s, m-1);
            } else {
                return search(arr, target, m+ 1, e);
            }
        }

        if(target >= arr[m] && target <= arr[e]){
            return search(arr, target, m+1, e);
        }
        return search(arr, target, s, m-1);
    }
}
