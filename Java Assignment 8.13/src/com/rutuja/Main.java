package com.rutuja;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Sum Triangle from Array
        int[] arr = {1, 2, 3, 4, 5};
        sumTriangle(arr);
    }

    static void sumTriangle(int[] arr) {
        if(arr.length < 1){
            return;
        }

        int[] temp = new int[arr.length - 1];
        for(int i = 0; i < arr.length-1; i++){
            int x = arr[i] + arr[i+1];
            temp[i] = x;
        }
        sumTriangle(temp);
        System.out.println(Arrays.toString(arr));
    }
}
