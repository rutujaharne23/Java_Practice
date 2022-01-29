package com.rutuja;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Bubble and Selection sort

        int[] arr = {4, 3, 2, 1};

        //triangleWithBubble( arr, arr.length-1, 0);

        triangleWithSelection( arr, arr.length, 0, 0);

        System.out.println(Arrays.toString(arr));
    }

    // Bubble sort
    static void triangleWithBubble(int[] arr, int r, int c){
        if(r == 0){
            return;
        }

        if(c < r){

            if(arr[c] > arr[c+1]){
                // Swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }

            triangleWithBubble(arr, r, c+1);
        }else {
            triangleWithBubble(arr,r-1, 0);
        }
    }

    // Selection sort
    static void triangleWithSelection(int[] arr, int r, int c, int max){
        if(r == 0){
            return;
        }

        if(c < r){

            if(arr[c] > arr[max]){
                triangleWithSelection(arr, r,c+1, c);
            }else {
                triangleWithSelection(arr, r,c+1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            triangleWithSelection(arr,r-1, 0, 0);
        }
    }
}
