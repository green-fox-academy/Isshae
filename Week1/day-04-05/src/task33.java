import java.util.Random;
import java.util.Scanner;

public class task33 {
    public static void main(String[] args) {
        // Write a program that stores a number, and the user has to figure it out.
// The user can input guesses, after each guess the program would tell one
// of the following:
//
// The stored number is higher
// The stried number is lower
// You found the number: 8

        Scanner sc = new Scanner(System.in);
        Random rm=new Random();

        int num = 9;
        int guessed = 0;
        while (guessed != num) {
            System.out.println("Guess the Number!");
            guessed = sc.nextInt();
            if (guessed > num) {
                System.out.println("The stored number is lower");
                System.out.println();

            } else if (guessed < num) {
                System.out.println("The stored number is higher");
                System.out.println();

            } else {
                System.out.println("You found the number: 9");
            }
        }
    }
}