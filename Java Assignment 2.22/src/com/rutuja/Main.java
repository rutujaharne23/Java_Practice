package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        Scanner in = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter the number: ");
        int number = in.nextInt();

        while (number > 0){
            sum = number + sum;
            number++;
            number = in.nextInt();
        }

        System.out.println("Sum is " + sum);
    }
}
