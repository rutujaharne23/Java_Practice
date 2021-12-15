package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Perimeter Of Circle
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius: ");
        float radius = in.nextFloat();

        double area = 2 * 3.14 * radius;

        System.out.println("Perimeter Of Circle is " + area);
    }
}
