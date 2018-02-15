import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        // Write a program that asks for an integer that is a distance in kilometers,
        // then it converts that value to miles and prints it

        Scanner scanner= new Scanner(System.in);

        System.out.println("Give me your KM distance and I'll convert to Miles");
        int km= scanner.nextInt();

        System.out.println(km*.626);

    }
}
