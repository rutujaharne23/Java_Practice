package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Area Of Rectangle Program
        Scanner in = new Scanner(System.in);

        System.out.println("Enter length: ");
        int length = in.nextInt();

        System.out.println("Enter width: ");
        int width = in.nextInt();

        int area =  width * length;

        System.out.println("Area Of Rectangle Program is: " + area);

    }
}
