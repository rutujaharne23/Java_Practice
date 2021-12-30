package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*      1
               212
              32123
             4321234
              32123
               212
                1   */
        pattern17(4);
    }

    static void pattern17(int n) {
        for(int row = 1; row <= 2 * n; row++){
            int x = row > n ? 2 * n - row : row;
            for(int space = 0; space < n - x; space++){
                System.out.print("  ");
            }

            for(int col = x; col >= 1; col--){
                System.out.print(col + " ");
            }

            for(int col = 2; col <= x; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
