package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // To calculate Fibonacci Series up to n numbers.
        Scanner in = new Scanner(System.in);

        int n1 = 0, n2 = 1, n3;

        System.out.println("Enter number: ");
        int number = in.nextInt();

        System.out.print(n1 +" "+ n2);

        for (int i = 2; i < number; ++i){
            n3 = n1 + n2;
            System.out.print(" "+ n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
