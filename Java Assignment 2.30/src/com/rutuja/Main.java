package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Power In Java
        Scanner in = new Scanner(System.in);

        System.out.print("a = ");
        float a = in.nextFloat();

        System.out.println("b = ");
        float b = in.nextFloat();

        double power = Math.pow(a, b);

        System.out.println("Power is " + power);
    }
}
