package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first = in.nextInt();

        System.out.println("Enter second number: ");
        int second = in.nextInt();

        int number = CheckNumber(first, second);

        System.out.println("Sum of two numbers are " + number);
    }

    private static int CheckNumber(int first, int second) {
        int sum = 0;
        sum = first + second;
        return sum;
    }
}
