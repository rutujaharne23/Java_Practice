package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // To find Armstrong Number between two given number.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = in.nextInt();

        int temp = number, r, sum = 0;

        while (number > 0) {
            r = number % 10;
            number = number / 10;
            sum = sum + (r * r * r);
        }

        if(temp == sum){
            System.out.println("It is an Armstrong Number");
        }else {
            System.out.println("Not an Armstrong Number");
        }

    }
}
