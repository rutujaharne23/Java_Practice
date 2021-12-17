package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int first_number = in.nextInt();

        System.out.println("Enter second number: ");
        int second_number = in.nextInt();

        System.out.println("Enter third number: ");
        int third_number = in.nextInt();

        int max = MaximumNum(first_number, second_number, third_number);
        int min = MinimumNum(first_number, second_number, third_number);

        System.out.println("Maximum number is " + max + "and Minimum number is " + min);
    }

    private static int MinimumNum(int first, int second, int third) {
        int min = first;

        if(second < min){
            min = second;
        }

        if(third < min){
            min = third;
        }

        return min;
    }

    private static int MaximumNum(int first, int second, int third) {
        int max = first;

        if(second > max){
            max = second;
        }

        if(third > max){
            max = third;
        }

        return max;
    }
}
