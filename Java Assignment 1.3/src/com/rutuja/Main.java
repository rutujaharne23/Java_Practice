package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter principal: ");
        System.out.println("Enter time: ");
        System.out.println("Enter rate: ");

        float principal = in.nextFloat();
        float time = in.nextFloat();
        float rate = in.nextFloat();

        float simple_interest = (principal * rate * time)/100 ;

        System.out.println("Simple Interest is " + simple_interest);

    }
}
