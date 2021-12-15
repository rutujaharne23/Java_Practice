package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Curved Surface Area Of Cylinder
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius: ");
        int radius = in.nextInt();

        System.out.println("Enter height: ");
        int height = in.nextInt();

        double area = 2 * 3.14 * radius * height;

        System.out.println("Curved Surface Area Of Cylinder is " + area);
    }
}
