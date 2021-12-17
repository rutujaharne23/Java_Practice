package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Calculate Depreciation of Value
        Scanner in = new Scanner(System.in);

        System.out.println("Enter initial value: ");
        double initial_value = in.nextFloat();

        System.out.println("Enter rate of depreciation: ");
        double rate_of_depreciation = in.nextFloat();

        System.out.println("Enter time in years: ");
        double time_in_years = in.nextFloat();

        double depreciation = (double) (initial_value  * Math.pow(1 - rate_of_depreciation / 100, time_in_years));

        System.out.println("Depreciation of Value is " + depreciation);
    }
}
