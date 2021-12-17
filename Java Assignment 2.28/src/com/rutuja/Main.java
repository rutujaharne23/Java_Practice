package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Calculate Distance Between Two Points
        Scanner in = new Scanner(System.in);

        System.out.println("Enter x1 co-ordinate : ");
        int x1 = in.nextInt();

        System.out.println("Enter y1 co-ordinate : ");
        int y1 = in.nextInt();

        System.out.println("Enter x2 co-ordinate : ");
        int x2 = in.nextInt();

        System.out.println("Enter y2 co-ordinate : ");
        int y2 = in.nextInt();

        double total_distance;

        total_distance = (double) Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

        System.out.println("Distance Between Two Points is " + total_distance);
    }
}
