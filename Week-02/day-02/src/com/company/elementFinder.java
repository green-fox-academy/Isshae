package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class elementFinder {
    public static void main(String... args){
        ArrayList list = new ArrayList(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        System.out.println(containsSeven(list));
        // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
        // The output should be: "Noooooo"
        // Do this again with a different solution using different list methods!

    }

    private static String containsSeven(ArrayList<Integer> arrayList) {
       boolean isContains=true;
       String reply=" ";
        for (int i = 0; i <arrayList.size() ; i++) {
            if (arrayList.get(i).equals(7)){
                isContains=true;
            }else{
                isContains=false;
            }
        }
        if (isContains){
            reply="Hoorray";
        }else{
            reply="Noooooo";
        }
        return reply;
        }
    }

