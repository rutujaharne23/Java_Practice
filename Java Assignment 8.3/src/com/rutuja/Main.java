package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Find unique
        int[] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(ans(arr));
    }

    public static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }

        return unique;
    }
}
