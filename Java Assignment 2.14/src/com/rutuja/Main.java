package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Volume Of Prism
        Scanner in = new Scanner(System.in);

        System.out.println("Enter base: ");
        int base = in.nextInt();

        System.out.println("Enter height: ");
        int height = in.nextInt();

        int area = base * height;

        System.out.println("Volume Of Prism is " + area);
    }
}
