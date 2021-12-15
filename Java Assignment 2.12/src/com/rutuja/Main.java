package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Perimeter Of Square
        // Perimeter Of Rhombus
        Scanner in = new Scanner(System.in);

        System.out.println("Enter side: ");
        int side = in.nextInt();

        int area = 4 * side;

        System.out.println("Perimeter Of Square is " + area);
    }
}
