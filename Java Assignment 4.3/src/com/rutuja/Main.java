package com.rutuja;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Search in String
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any string: ");
        String string = in.next();

        System.out.println("Enter char to search: ");
        char target = in.next().charAt(0);

        System.out.println(searchString(string, target));
    }

    static boolean searchString(String string, char target) {
        if(string.length() == 0){
            return false;
        }

        for (int i = 0; i < string.length(); i++){
            if(target == string.charAt(i)){
                return true;
            }
        }
        return false;
    }


}
