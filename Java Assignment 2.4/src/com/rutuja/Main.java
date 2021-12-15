package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Area Of Isosceles Triangle
        Scanner in = new Scanner(System.in);

        System.out.println("Enter base: ");
        float base = in.nextFloat();

        System.out.println("Enter height: ");
        float height = in.nextFloat();

        double area = (base * height)/2;

        System.out.println("Area Of Isosceles Triangle is: " + area);
    }
}
