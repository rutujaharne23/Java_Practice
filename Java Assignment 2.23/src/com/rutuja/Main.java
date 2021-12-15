package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = in.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        if(number != 0){
            for(int i = 0; i < number; i++){
                int current = in.nextInt();
                if (current > max) {
                    max = current;
                }
            }
        }

        System.out.println("Largest number is: " + max);
    }
}
