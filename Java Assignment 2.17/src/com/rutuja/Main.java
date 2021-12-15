package com.rutuja;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Volume Of Pyramid
        Scanner in = new Scanner(System.in);

        System.out.println("Enter base length: ");
        float base_length = in.nextFloat();

        System.out.println("Enter base width: ");
        float base_width = in.nextFloat();

        System.out.println("Enter height: ");
        float height = in.nextFloat();

        double area = (base_length * base_width * height) / 3;

        System.out.println("Volume Of Pyramid is " + area);
    }
}
