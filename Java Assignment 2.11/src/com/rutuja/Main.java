package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Perimeter Of Rectangle
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length: ");
        int length = in.nextInt();

        System.out.println("Enter width: ");
        int width =  in.nextInt();

        int area = 2 * (length + width);

        System.out.println("Perimeter Of Rectangle is " + area);
    }
}
