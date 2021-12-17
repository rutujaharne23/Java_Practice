package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Define a method to find out if a number is prime or not.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = in.nextInt();

        if(isPrime(number)){
            System.out.println(number + " is Prime.");
        }else {
            System.out.println(number + " is not Prime.");
        }

    }

    private static boolean isPrime(int number) {
        if(number <= 1){
            return false;
        }

        for (int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
