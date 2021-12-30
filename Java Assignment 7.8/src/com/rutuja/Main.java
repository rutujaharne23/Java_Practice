package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*       *
                **
               ***
              ****
             *****   */
        pattern6(5);
    }

    static void pattern6(int n) {
        for(int row = 0; row < n; row++){

            for (int space = 2 * (n - row); space >= 0; space--)
                System.out.print(" ");

            for (int col = 0; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
