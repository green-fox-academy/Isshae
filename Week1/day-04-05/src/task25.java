import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {
        // Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150


        Scanner sc = new Scanner(System.in);
        System.out.println("Feed me a number:");
       int num= sc.nextInt();
        int multiplier=1;
        for (int i = 0; i < 10; i++) {
            int newNum;
            newNum=num*multiplier;

            System.out.println(multiplier+" * "+num+" = "+newNum);
            multiplier++;
        }

    }
}




