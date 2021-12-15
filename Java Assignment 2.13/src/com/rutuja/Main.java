package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Volume Of Cone Java Program
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius: ");
        float radius = in.nextFloat();

        System.out.println("Enter height: ");
        float height = in.nextFloat();

        double area = 3.14 * radius * radius * (height / 3);

        System.out.println("Volume Of Cone Java Program is " + area);
    }
}
