package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Input currency in rupees and output in USD.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter currency in rupees: ");
        float currency = in.nextFloat();

        float usd = (float) (currency * 0.013177739);

        System.out.println("Currency in USD: " + usd);
    }
}
