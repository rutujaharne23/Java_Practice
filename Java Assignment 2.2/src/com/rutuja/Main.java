package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Area Of Triangle
        Scanner in = new Scanner(System.in);

        System.out.println("Enter height: ");
        int height = in.nextInt();

        System.out.println("Enter base: ");
        int base = in.nextInt();

        int area = (base * height)/2;

        System.out.println("Area Of Triangle is " + area);
    }
}
