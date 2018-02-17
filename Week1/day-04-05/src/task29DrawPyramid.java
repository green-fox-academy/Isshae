import java.util.Scanner;

public class task29DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
//
// The pyramid should have as many lines as the number was
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number!");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

