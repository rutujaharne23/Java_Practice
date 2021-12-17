package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Calculate Average Of N Numbers
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers?: ");
        int number = in.nextInt();
        int count = 0, sum = 0;
        float x, average;

        while (count < number){
            x = in.nextInt();
            sum += x;
            ++count;
        }
        average = (float) sum / number;

        System.out.println("Average is " + average);
    }
}
