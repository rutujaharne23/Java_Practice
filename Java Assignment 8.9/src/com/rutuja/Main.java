package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Count number of zeros
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(count(number));
    }

    static int count(int n){
        return helper(n, 0);
    }

    private static int helper(int n, int i) {
        if(n == 0){
            return i;
        }

        int rem = n % 10;
        if(rem == 0){
            return helper(n/10, i+1);
        }
        return helper(n/10, i);
    }
}
