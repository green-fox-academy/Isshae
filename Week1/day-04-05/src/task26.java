import com.sun.org.apache.xml.internal.serializer.utils.SerializerMessages_zh_CN;

import java.util.Scanner;

public class task26 {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5

        Scanner sc = new Scanner(System.in);
        System.out.println("Feed me the first number:");
        int first = sc.nextInt();
        System.out.println("Feed me the second number:");
        int second = sc.nextInt();

        if (first > second) {
            System.out.println("Seccond should be bigger!!!");
            System.out.println("Feed me the first number:");
            first = sc.nextInt();
            System.out.println("Feed me the second number:");
            second = sc.nextInt();

        } else {
            System.out.println();
            while (first < second-1) {
                first++;

                System.out.println(first);
            }
        }

    }
}