package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Area Of Rhombus
        Scanner in = new Scanner(System.in);

        System.out.println("Enter diagonal one: ");
        int diagonal_1 = in.nextInt();

        System.out.println("Enter diagonal two: ");
        int diagonal_2 = in.nextInt();

        int area = (diagonal_1 * diagonal_2)/2;

        System.out.println("Area Of Rhombus is: " + area);
    }
}
