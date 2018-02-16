import java.util.Scanner;

public class task28 {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

      Scanner sc= new Scanner(System.in);
        System.out.println("Feed me a number:");

        int num =sc.nextInt();
        for (int i=1;i<=num;i++) {
            for(int j=1; j<=i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        
       
    }
}






