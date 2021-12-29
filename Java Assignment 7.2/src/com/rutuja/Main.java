package com.rutuja;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        /*   * * * * *
             * * * * *
             * * * * *
             * * * * *
             * * * * *  */
        pattern2(5);
    }

    static void pattern2(int n) {
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
