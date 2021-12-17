package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Define a method that returns the product of two numbers entered by user.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        float first = in.nextFloat();

        System.out.println("Enter second number: ");
        float second = in.nextFloat();

        float product = Product(first, second);

        System.out.println("Product of two numbers are " + product);
    }

    private static float Product(float first, float second) {
        float product = 0;
        product = first * second;
        return product;
    }


}
