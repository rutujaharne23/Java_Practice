package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Write a program to print whether a number is even or odd, also take input.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = in.nextInt();

        int even_number = number % 2;

        if(even_number == 0){
            System.out.println(number + " number is even number");
        }else {
            System.out.println(number + " number is odd number");
        }


    }
}
