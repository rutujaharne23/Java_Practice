package com.rutuja;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number: ");
        System.out.println("Enter second number: ");
        float first_number = in.nextFloat();
        float second_number = in.nextFloat();

        System.out.println("Choose an operator: +, -, * or /");
        char operator = in.next().charAt(0);

        float final_value;

        if(operator == '+'){
            final_value = first_number + second_number;
            System.out.println(first_number +" + "+ second_number +" = "+ final_value);
        }else if (operator == '-'){
            final_value = first_number - second_number;
            System.out.println(first_number + " - " + second_number +" = "+ final_value);
        }else if(operator == '*'){
            final_value = first_number * second_number;
            System.out.println(first_number +" * "+ second_number +" = "+final_value);
        }else if(operator == '/'){
            final_value = first_number/second_number;
            System.out.println(first_number +" / "+ second_number +" = "+ final_value);
        }else{
            System.out.println("No operator found.");
        }
    }
}
