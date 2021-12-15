package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Volume Of Sphere
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius: ");
        float radius = in.nextFloat();

        double area =  (3.14 * radius * radius * radius) * 4 / 3;

        System.out.println("Volume Of Sphere is " + area);
    }
}
