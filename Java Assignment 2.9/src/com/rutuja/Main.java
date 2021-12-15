package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Perimeter Of Equilateral Triangle
        Scanner in = new Scanner(System.in);

        System.out.println("Enter side of equilateral triangle: ");
        float side = in.nextInt();

        float area = 3 * side;

        System.out.println("Perimeter Of Equilateral Triangle is " + area);
    }
}
