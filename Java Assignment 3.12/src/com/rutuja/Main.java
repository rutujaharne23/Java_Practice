package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Write a function that returns the sum of first n natural numbers.
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = in.nextInt();

        System.out.println("Sum of natural numbers: " + findSum(number));
    }

    private static int findSum(int number) {
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum = sum + i;
        }
        return sum;
    }
}
