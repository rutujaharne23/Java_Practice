package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Write a function to find if a number is a palindrome or not. Take number as parameter.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = in.nextInt();

        String palindrome = IsPalindromeOrNot(number);

        System.out.println(palindrome);

    }

    private static String IsPalindromeOrNot(int number) {
        int sum = 0, r;
        int temp = number;

        while (number > 0){
           r = number % 10;
           sum = (sum * 10) + r;
           number = number / 10;
        }

        if(temp == sum){
            return "Palindrome";
        }else {
            return "Not Palindrome";
        }
    }
}
