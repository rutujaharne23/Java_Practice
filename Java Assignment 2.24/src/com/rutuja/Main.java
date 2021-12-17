package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Factorial Program In Java
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = in.nextInt();
        int temp = 1;

        for (int i = 1; i <= number; i++){
            temp = temp * i;
        }

        System.out.println("Factorial of "+ number +" is " + temp);
    }
}
