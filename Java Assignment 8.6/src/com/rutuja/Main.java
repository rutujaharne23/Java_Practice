package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Sum of digits
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        //System.out.println(sumOfDigits(number));
        System.out.println(productOfDigits(number));
    }

    static int sumOfDigits(int n) {
        if(n == 0){
            return 0;
        }
        return (n%10) + sumOfDigits(n/10);
    }

    static int productOfDigits(int n) {
        if(n%10 == n){
            return n;
        }
        return (n%10) * productOfDigits(n/10);
    }
}
