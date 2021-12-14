package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Take name as input and print a greeting message for that name.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.next();

        System.out.println("Welcome " + name + "!");
    }
}
