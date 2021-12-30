package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*      *
               * *
              * * *
             * * * *
            * * * * *  */
        pattern8(5);
    }

    static void pattern8(int n) {
        for(int row = 1; row <= n; row++){
            //int totalColInRwo = row > n ? 2 * n - row : row;
            int noOfSpace = n - row;

            for (int space = 0; space <= noOfSpace; space++){
                System.out.print(" ");
            }

            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
