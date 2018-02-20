package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class appendLetter {
    public static void main(String... args) {
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.

        List<String> far = Arrays.asList("kuty", "macsk", "kacs", "rók", "halacsk");


        System.out.println(appendA(far));


    }

    private static List appendA(List<String> far) {
        String a = "a";
        List<String> copy = new ArrayList<String>();
        for (int i = 0; i < far.size(); i++) {
           copy.add(far.get(i)+a);

        }
return copy;
    }
}
