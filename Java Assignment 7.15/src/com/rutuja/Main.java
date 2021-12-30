package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Binary search using Recursion
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        int ans = search(arr, target, 0, arr.length - 1) ;
        System.out.println(ans);
    }

    static int search(int[] arr, int target, int s, int e) {
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2;

        if(arr[m] == target){
            return m;
        }

        if(target < arr[m]){
            return search(arr, target, s, m - 1);
        }else {
            return search(arr, target, s + 1, e);
        }
    }
}
