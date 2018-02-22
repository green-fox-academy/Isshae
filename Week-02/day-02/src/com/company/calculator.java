package com.company;

import java.util.Scanner;

public class calculator {


    public static void main(String[] args) {
        // Create a simple calculator application which reads the parameters from the prompt
        // and prints the result to the prompt.
        // It should support the following operations,
        // create a method named "calculate()":
        // +, -, *, /, % and it should support two operands.
        // The format of the expressions must be: {operation} {operand} {operand}.
        // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

        // You can use the Scanner class
        // It should work like this:

        // Start the program
        // It prints: "Please type in the expression:"
        // Waits for the user input
        // Print the result to the prompt
        // Exit

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me + or - and two numbers to add or subtract!");
        String operationMark = scanner.nextLine();
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();


        input(operationMark, num1, num2);
        System.out.println(calculate(operationMark, num1, num2));
    }

    private static void input(String operationMark, int num1, int num2) {
        Scanner scanner = new Scanner(System.in);

        while (!(operationMark.contains("+")||operationMark.contains("-"))) {

                System.out.println("Wrong imput, + or-");
                operationMark = scanner.next();
        }
        calculate(operationMark, num1, num2);
    }

    private static int calculate(String operationMark, int num1, int num2) {
        int result = 0;
        if (operationMark.contains("+")) {
            result = num1 + num2;
        } else if (operationMark.contains("-")) {
            result = num1 + num2;
        }
        return result;
    }
}
