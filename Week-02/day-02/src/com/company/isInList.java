package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class isInList {
    public static void main(String... args){
        ArrayList list = new ArrayList(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
        checkNums(list);


        // Check if list contains all of the following elements: 4,8,12,16
        // Create a method that accepts list as an input
        // it should return "true" if it contains all, otherwise "false"

    }

    private static void checkNums(ArrayList<Integer> list) {
      ArrayList<Integer> chackNumbers= new ArrayList<Integer>(Arrays.asList(4,8,12,16));
        if (list.containsAll(chackNumbers)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
