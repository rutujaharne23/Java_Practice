package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Perimeter Of Parallelogram
        Scanner in = new Scanner(System.in);

        System.out.println("Enter base: ");
        int base = in.nextInt();

        System.out.println("Enter side: ");
        int side = in.nextInt();

        int area = 2 * (base + side);

        System.out.println("Perimeter Of Parallelogram is " + area);
    }
}
