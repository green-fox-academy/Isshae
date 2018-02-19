package com.company;

import java.util.Scanner;

public class factorio {
    public static void main(String[]args){
        // - Create a function called `factorio`
//   that returns it's input's factorial
        Scanner sc=new Scanner(System.in);
        System.out.println("Give me a number: ");
        int givenNum=sc.nextInt();

        System.out.println(factorio(givenNum));

    }
    public static int factorio(int a){
        int factorio=1;
        for (int i = 1; i <=a ; i++) {
            factorio*=i;
        }
        return factorio;
    }
}
