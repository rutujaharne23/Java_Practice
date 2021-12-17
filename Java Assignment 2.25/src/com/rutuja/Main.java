package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Calculate Electricity Bill
        Scanner in = new Scanner(System.in);

        System.out.println("Enter electricity unit: ");
        int unit = in.nextInt();
        int charges = 0;

        if(unit <= 100){
            charges = unit * 10;
        }else if(unit <= 200){
            charges = (100 * 10) + (unit - 100) * 15;
        }else  if(unit <= 300){
            charges = (100 * 10) + (100 * 15) + (unit - 200) * 20;
        }else if(unit > 300){
            charges = (100 * 10) + (100 * 15) + (100 * 20) + (unit - 300) + 25;
        }

        System.out.println("Bill to pay " + charges);
    }
}
