package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Total Surface Area Of Cube
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length of side: ");
        int cube_side = in.nextInt();

        int area = 6 * cube_side * cube_side;

        System.out.println("Total Surface Area Of Cube is " + area);
    }
}
