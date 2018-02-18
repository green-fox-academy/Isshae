import java.util.Scanner;

public class task31DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// square like this:
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
// The square should have as many lines as the number was

        Scanner sc = new Scanner(System.in);
        System.out.println("number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j == 1 || j == num) {
                    System.out.print("%");
                } else if (i == 1||i==num) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }


    }
}
