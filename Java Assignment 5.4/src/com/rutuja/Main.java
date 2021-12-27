package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Find in Mountain Array
    }

    public int findInMountainArray(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearchASC(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        return binarySearchDES(arr, target, peak+1, arr.length-1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearchASC(int[] arr, int target, int start, int end) {

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    private static int binarySearchDES(int[] arr, int target, int start, int end) {

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(target > arr[mid]){
                end = mid - 1;
            }else if(target < arr[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
