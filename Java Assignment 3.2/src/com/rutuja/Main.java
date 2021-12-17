package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Define a program to find out whether a given number is even or odd.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = in.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is even.");
        }else {
            System.out.println("The entered number " + number + " is odd.");
        }


    }

}
