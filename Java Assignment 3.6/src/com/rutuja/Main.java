package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        float radius = in.nextFloat();

        double circumference = FindCircumference(radius);
        double area = FindArea(radius);

        System.out.println("Circumference of circle is " + circumference);
        System.out.println("Area of circle is " + area);
    }

    private static double FindArea(float radius) {
        double area = 3.14 * radius * radius;
        return area;
    }

    private static double FindCircumference(float radius) {
        double circumference = 2 * 3.14 * radius;
        return circumference;
    }

}
