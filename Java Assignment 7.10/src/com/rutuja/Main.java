package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*   * * * * *
               * * * *
                 * * *
                   * *
                     *   */
        pattern7(5);
    }

    static void pattern7(int n) {
        for(int row = 1; row <= n; row++){

            for(int space = 1; space < row; space++){
                System.out.print(" ");
            }

            for(int col = n; col >= row; col--){
                System.out.print("*");
                //col <= n - row + 1
            }
            System.out.println();
        }
    }
}
