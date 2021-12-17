package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Calculate Commission Percentage
        Scanner in = new Scanner(System.in);

        System.out.println("Enter price: ");
        float price = in.nextFloat();

        System.out.println("Enter commission: ");
        float commission = in.nextFloat();

        float total_price;

        total_price = (price * commission) / 100;

        System.out.println("Commission is " + total_price);
        System.out.println("Price without commission is " + (price - total_price));
    }
}
