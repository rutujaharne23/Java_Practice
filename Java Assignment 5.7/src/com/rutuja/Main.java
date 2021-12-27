package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Split Array Largest SumSplit Array Largest Sum
        int[] arr = {7,2,5,10,8};
        int m = 2;
        System.out.println(splitArray(arr, m));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++){
            start = Math.max(start, nums[i]);// in the end of th loop this will contain the max item of the array
            end += nums[i];
        }

        // binary search
        while (start < end){
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pieces = 1;
            for(int num : nums){
                if(sum + num > mid){
                    // you cannot add this in this subarray, make new one
                    // say you add this sum in new subarray, then sum + num
                    sum = num;
                    pieces++;
                }else {
                    sum += num;
                }
            }

            if(pieces > m){
                start = mid + 1;
            }else {
                end = mid;
            }

        }
        return end; // start == end
    }
}
