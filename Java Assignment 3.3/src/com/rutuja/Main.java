package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = in.nextInt();

         String eligibility = (String) CheckEligibility(age);

        System.out.println(eligibility);
    }

    private static Object CheckEligibility(int age) {
        if(age >= 18){
            return "Eligible to vote.";
        }
        return "Not eligible to vote.";
    }
}
