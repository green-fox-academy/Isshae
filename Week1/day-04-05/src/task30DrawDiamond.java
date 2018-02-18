import java.util.Scanner;

public class task30DrawDiamond {
    public static void main(String[] args) {
// Write a program that reads a number from the standard input, then draws a
// diamond like this:
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
// The diamond should have as many lines as the number was
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a number!");
        int num = sc.nextInt();

        for (int i = 0; i < num-1; i+=2) {
            for (int j = 0; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();

        }
        for (int i2 = num; i2 >0; i2-=2) {
            for (int j = 0; j < num - i2; j++) {
                System.out.print(" ");
            }
            for (int k = (i2); k > 0; k--) {
                System.out.print(" *");
            }

            System.out.println();

        }
    }
}




