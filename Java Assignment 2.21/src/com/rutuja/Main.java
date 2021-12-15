package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Input a number and print all the factors of that number (use loops).
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = in.nextInt();

        for (int i = 1; i <= number; i++){
            if(number % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
