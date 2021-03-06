package com.rutuja;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Quick ck sort
        int[] arr = {5, 4, 3, 2, 1};
//        quick(arr, 0, arr.length-1);
//        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
    }

    static void quick(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e - s) / 2;
        int pivot = arr[m];

        while (s <= e){
            while (arr[s] < pivot){
                s++;
            }
            while (arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quick(arr, low, e);
        quick(arr, s, high);
    }
}
