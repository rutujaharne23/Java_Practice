package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Subtract the Product and Sum of Digits of an Integer
        Scanner in = new Scanner(System.in);

        int sum = 0, product = 1, output;

        System.out.println("Enter the number: ");
        int number = in.nextInt();

        while (number > 0){
            sum += number % 10;
            product *= number % 10;
            number /= 10;
        }

        System.out.println("Output is " + (product - sum));
    }
}
