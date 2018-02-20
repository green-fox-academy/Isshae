package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class matchmaking {
    public static void main(String... args) {
        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Bözsi", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Béla", "Todd", "Neef", "Jeff", "Bob"));


        System.out.println(makingMatches(girls, boys));
    }

    private static ArrayList makingMatches(ArrayList<String> girls, ArrayList<String> boys) {
        ArrayList<String> together = new ArrayList<String>();
        int counter = 0;
        for (int i = 0; i < boys.size(); i++) {
            if (girls.size() <= counter) {
                girls.add(null);

            }
            together.add(boys.get(i) + " " + girls.get(i));


            counter++;
        }


        return together;
    }
}
