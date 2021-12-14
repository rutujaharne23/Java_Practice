package com.rutuja;

import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Area Of Circle Java Program
        // Formula -> A = 3.14 * r * r
        Scanner in = new Scanner(System.in);

        System.out.println("Enter circle radius: ");
        float radius = in.nextFloat();

        double area = 3.14 * radius * radius;

        System.out.println("Area Of Circle is: " + area);
    }
}
