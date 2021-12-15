package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Area Of Equilateral Triangle
        Scanner in = new Scanner(System.in);

        System.out.println("Enter side of Equilateral Triangle: ");
        float side = in.nextInt();

        double area = 0.433 * side * side;

        System.out.println("Area Of Equilateral Triangle is: " + area);
    }
}
