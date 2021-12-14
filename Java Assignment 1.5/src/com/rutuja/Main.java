package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Take 2 numbers as input and print the largest number.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first_number = in.nextInt();

        System.out.println("Enter second number: ");
        int second_number = in.nextInt();

        if(first_number > second_number){
            System.out.println("Largest number is: " + first_number);
        }else {
            System.out.println("Largest number is: " + second_number);
        }

    }
}
