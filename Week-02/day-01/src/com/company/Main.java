package com.company;

public class Main {

    public static void main(String[] args) {
// - Create an integer variable named `ak` and assign the value `123` to it
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - Print the result of `doubling(ak)`
        int num=123;

        System.out.println(doubling(num));

    }
    public static int doubling(int a){
        a=a*=2;


        return a;
    }
}
