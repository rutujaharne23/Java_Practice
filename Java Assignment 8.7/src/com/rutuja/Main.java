package com.rutuja;

import java.util.Scanner;

public class Main {
    static  int sum = 0;
    public static void main(String[] args) {
	    // write your code here
        // Reverse a number
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
//        reverse(number);
//        System.out.println(sum);
        System.out.println(reverse2(number));
    }

    static void reverse1(int n) {
        if(n == 0){
            return;
        }
        int temp = n % 10;
        sum = sum * 10 + temp;
        reverse1(n/10);
    }

    static int reverse2(int n) {
        // sometime yuo might need some additional variables in the argument
        // in that case, make another function

        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)Math.pow(10, digits-1) + helper(n/10, digits-1);
    }
}