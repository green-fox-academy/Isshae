import java.util.Scanner;

public class task34ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
// It would ask this many times to enter an integer,
// if all the integers are entered, it should print the sum and average of these
// integers like:
//
// Sum: 22, Average: 4.4
        Scanner sc = new Scanner(System.in);
        System.out.println("Number:");
        int num = sc.nextInt();
        int sum = 0;
        int avg = 0;
        int[] array = new int[num];
        System.out.println("Now enter " + num + " numbers!");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum = sum + array[i];
            avg = sum / num;
        }
        System.out.println("sum: "+sum);
        System.out.println("avg: "+avg);
    }
}
