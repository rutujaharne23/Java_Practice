package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Print n to 1
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();
        fun(number);
    }

    static void fun(int n) {
        if(n == 0){
            return;
        }

        System.out.println(n);
        fun(n-1);
    }
}
