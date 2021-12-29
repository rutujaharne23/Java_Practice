package com.rutuja;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // String palindrome or not
        String str = "";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if(str == null || str.length() == 0){
            return true;
        }
        str = str.toLowerCase();

        for(int i = 0; i <= str.length() / 2; i++){
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }
}
