package com.company;

import java.util.Scanner;

public class summing {
    public static void main(String[] args) {
        // - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer

        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int num = sc.nextInt();
        System.out.println(sum(num));


    }

    public static int sum(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum+=i;

        }
        return sum;
    }

}
