package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Given a number n, find if it is odd or even.
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(isOdd(number));
    }

    private static boolean isOdd(int number) {
        return (number & 1) == 1;
    }
}
