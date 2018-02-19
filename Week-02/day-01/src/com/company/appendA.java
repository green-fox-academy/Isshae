package com.company;

public class appendA {
    public static void main(String[] args){
        // - Create a string variable named `am` and assign the value `kuty` to it
// - Write a function called `appendA` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
//
// - Print the result of `appendAFunc(am)`

        String am="kuty";

        System.out.println(appendA(am));



    }
    public static String appendA (String a){
        String b="a";
        String c=a+b;

        return c;
    }

}

