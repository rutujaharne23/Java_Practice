package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*        *
                 * *
                * * *
               * * * *
              * * * * *
               * * * *
                * * *
                 * *
                  *    */
        pattern28(5);
    }

    static void pattern28(int n) {
        for(int row = 0; row <= 2 * n; row++){
            int totalColInRow = row > n ? 2 * n - row : row;

            int numberOfSpaces = n - totalColInRow;

            for (int space = 0; space < numberOfSpaces; space++){
                System.out.print(" ");
            }

           for(int col = 0; col < totalColInRow; col++){
               System.out.print("* ");
           }
            System.out.println();
        }
    }
}
