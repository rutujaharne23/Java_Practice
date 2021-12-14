package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // To find out whether the given String is Palindrome or not.
        Scanner in = new Scanner(System.in);

        int r, sum = 0, temp;

        System.out.println("Enter the number: ");
        int n = in.nextInt();

        temp = n;

        while (n > 0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }

        if(temp == sum){
            System.out.println("Palindrome number");
        }else {
            System.out.println("Not Palindrome");
        }

    }
}
