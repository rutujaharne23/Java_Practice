package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = in.nextInt();

        System.out.println("Enter b: ");
        int b = in.nextInt();

        System.out.println("Enter c: ");
        int c = in.nextInt();

        String triplet = checkPythagoreanTriplet(a,b,c);

        System.out.println(triplet);
    }

    private static String checkPythagoreanTriplet(int a, int b, int c) {
        int sum;
        sum = (a * a) + (b * b);
        if(sum == (c * c)){
            return "Yes";
        }else {
            return "No";
        }
    }
}
