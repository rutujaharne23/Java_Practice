package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Calculate Discount Of Product
        Scanner in = new Scanner(System.in);

        System.out.println("Enter discount: ");
        double discount = in.nextDouble();

        System.out.println("Enter price: ");
        double price = in.nextDouble();

        double amount;

        amount = (double) (price * discount) / 100;

        System.out.println("Discount Of Product is " + amount);
        System.out.println("Amount after discount is " + (price - amount));
    }
}
