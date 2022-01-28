package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Palindrome
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(palindrome(number));
    }

    private static boolean palindrome(int n) {
        return n == reverse(n);
    }

    static int reverse(int n) {
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
