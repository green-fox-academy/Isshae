package com.company;

public class swap {
    public static void main(String[] args) {
        // - Create an array variable named `abc`
//   with the following content: `["first", "second", "third"]`
// - Swap the first and the third element of `abc`

        String[] abc={"first","second","third"};

       String a=abc[0];
       abc[0]=abc[2];
       abc[2]=a;
        System.out.println(abc[0]);
        System.out.println(abc[1]);
        System.out.println(abc[2]);

    }
}
