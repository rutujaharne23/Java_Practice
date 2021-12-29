package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*  1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5  */
        pattern4(5);
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col);
            }
            System.out.println();

        }
    }
}
