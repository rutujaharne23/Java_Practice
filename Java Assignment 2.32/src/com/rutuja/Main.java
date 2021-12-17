package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Calculate Batting Average
        Scanner in = new Scanner(System.in);

        System.out.println("Enter runs: ");
        int runs = in.nextInt();

        System.out.println("Enter matches: ");
        int matches = in.nextInt();

        System.out.println("Enter not outs: ");
        int not_out = in.nextInt();

        int number_of_times_batsman_was_dismissed = matches - not_out;
        int batting_average = runs / number_of_times_batsman_was_dismissed;

        System.out.println("Batting Average is " + batting_average);
    }
}
