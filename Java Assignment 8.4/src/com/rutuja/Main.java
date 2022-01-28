package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Print 1 to n
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        //func(number);
        func1(number);
    }

    static void func(int n) {
        if(n == 0){
            return;
        }

        func(n - 1);
        System.out.print(n);
    }

    static void func1(int n) {
        if(n == 0){
            return;
        }

        System.out.print(n);
        func1(n - 1);
        System.out.print(n);
    }
}
