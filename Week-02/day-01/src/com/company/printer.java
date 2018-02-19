package com.company;

public class printer {
    public static void main(String[] args) {
        // - Create a function called `printer`
//   which prints the input String parameters
// - It can have any number of parameters

// Examples
// printer("first")
// printer("first", "second")
// printer("first", "second", "third", "fourh")
// ...

       String parameter1 = "dog";
        String parameter2 = "cat";
        String parameter3 = "bird";

        printer(parameter1, parameter2, parameter3);

    }

    public static void printer(String... args) {
        for (String arg : args) {

            System.out.println(arg);
        }


    String[] param={"cat","dog", "bird"};

    printer(param[1]);


    }
    public static void print(String[] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+", ");
        }
    }
}
