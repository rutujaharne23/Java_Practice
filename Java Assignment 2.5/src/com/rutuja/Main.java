package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Area Of Parallelogram
        Scanner in = new Scanner(System.in);

        System.out.println("Enter base: ");
        int base = in.nextInt();

        System.out.println("Enter height: ");
        int height = in.nextInt();

        int area = base * height;

        System.out.println("Area Of Parallelogram is: " + area);
    }
}
