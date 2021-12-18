package com.rutuja;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Build Array from Permutation
        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] per = Permutation(nums);
        System.out.println(Arrays.toString(per));
    }

    private static int[] Permutation(int[] nums) {
        int size = nums.length; // 5
        int[] a = new int[size];

        for (int i = 0; i < size; i++){ 
            int product = (nums[nums[i]] % size) * size + nums[i];
            a[i] = product;
        }

        for (int i = 0; i < size; i++){
            int temp = a[i];
            a[i] = temp / size;
        }
        return a;
    }
}
