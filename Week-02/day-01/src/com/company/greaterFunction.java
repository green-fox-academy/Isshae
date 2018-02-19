package com.company;

public class greaterFunction {
    public static void main(String[] args) {
// - Create a string variable named `al` and assign the value `Greenfox` to it
// - Create a function called `greet` that greets it's input parameter
//     - Greeting is printing e.g. `Greetings dear, Greenfox`
// - Greet `al`

        String al = "Greenfox";
        String ab = "csoki";
        System.out.println(greet(al));
    }

    public static String greet(String a) {
        String b = "Greetings dear, ";
        String c = b + a;

        return c;
    }
}
