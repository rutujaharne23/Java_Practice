package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Find whether 14 exist in array or not
        // [18, 12, 9, 14, 77, 50]
        int[] nums = {18, 12, 9, -1, 14, 77, 50, -13, 20, 10};
        int target = 11;

        int ans = linearSearch(nums, target);

        System.out.println(ans);

    }

    // Search in the array: return the index if item found
    // Otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0){
            return  -1;
        }

        for (int i = 0; i < arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }

}
