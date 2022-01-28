package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Factorial of n
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(factFunc(number));
        System.out.println(factSum(number));
    }

    static int factFunc(int n) {
        if(n <= 1){
            return 1;
        }
        return n * factFunc(n-1);
    }

    static int factSum(int n) {
        if(n <= 1){
            return 1;
        }
        return n + factSum(n-1);
    }
}
