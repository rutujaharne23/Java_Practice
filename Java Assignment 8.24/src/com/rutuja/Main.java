package com.rutuja;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        // Dice
        //dice("", 4);
        //System.out.println(diceRet("", 4));
        System.out.println(diceCount("", 4));
    }

    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= 6 && i <= target; i++){
            dice(p + i, target - i);
        }
    }

    static ArrayList<String> diceRet(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i <= 6 && i <= target; i++){
            list.addAll(diceRet(p + i, target - i));
        }
        return list;
    }

    static int diceCount(String p, int target){
        if(target == 0){
            return 1;
        }

        int count = 0;

        for(int i = 1; i <= 6 && i <= target; i++){
            count = count + diceCount(p + i, target - i);
        }
        return count;
    }

    static void diceFace(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i = 1; i <= face && i <= target; i++){
            diceFace(p + i, target - i, face);
        }
    }
}
