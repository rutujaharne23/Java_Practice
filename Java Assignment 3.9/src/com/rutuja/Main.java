package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Write a program to print the factorial of a number by defining a method named 'Factorial'.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = in.nextInt();

        int factorial = findFactorial(number);

        System.out.println("Factorial of " + number + " is " + factorial);
    }

    private static int findFactorial(int number) {
        int fact = 1;

        for (int i = 1; i <= number; i++){
            fact = fact * i;
        }

        return fact;
    }
}
