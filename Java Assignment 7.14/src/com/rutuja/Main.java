package com.rutuja;

public class Main {

    public static void main(String[] args) {
	     // write your code here
        // Fibonacci
        System.out.println(fibo(6));
    }

    static int fibo(int n) {
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
