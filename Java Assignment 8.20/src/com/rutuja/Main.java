package com.rutuja;

import java.util.ArrayList;

public class Main {

     public static void main(String[] args) {
	    // write your code here
        // Subset
        //subset("", "abc");
        //System.out.println(subset1("", "abc"));
        //subsetAscii("", "abc");
        System.out.println(subsetAsciiRet("", "abc"));
    }

    static void subset(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subset(p + ch, up.substring(1));
        subset(p, up.substring(1));
    }

    static ArrayList<String> subset1(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = subset1(p + ch, up.substring(1));
        ArrayList<String> right = subset1(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subsetAscii(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subsetAscii(p + ch, up.substring(1));
        subsetAscii(p, up.substring(1));
        subsetAscii(p + (ch+0), up.substring(1));
    }

    static ArrayList<String> subsetAsciiRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> first = subsetAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subsetAsciiRet(p, up.substring(1));
        ArrayList<String> third = subsetAsciiRet(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
