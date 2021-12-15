package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Volume Of Cylinder
        Scanner in = new Scanner(System.in);

        System.out.println("Enter height: ");
        float height = in.nextFloat();

        System.out.println("Enter radius: ");
        float radius = in.nextFloat();

        double area = 3.14 * radius * radius * height;

        System.out.println("Volume Of Cylinder is " + area);
    }
}
