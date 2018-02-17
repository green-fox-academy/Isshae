import java.util.Scanner;

public class task17AverageOfInputTask20 {
    public static void main(String[] args) {
//        // Write a program that asks for 5 integers in a row,
//// then it should print the sum and the average of these numbers like:
//
// Sum: 22, Average: 4.4
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me 5 numbers!");
    /*   int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int d = sc.nextInt();
       int e = sc.nextInt();

   int sum= a+b+c+d+e;
   int average= sum/5;
       System.out.println("sum: "+sum);
       System.out.println("average: "+average);
*/
        // Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
        //task 20 print the bigger
        // Write a program that asks for two numbers and prints the bigger one
        double avg = 0;
        int sum = 0;
        int max = 0;
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            sum = sum + array[i];
            avg = (double) sum / array.length;
            if (array[i] > array[max]){
                max=array[i];
            }
        }

        System.out.println(sum);
        System.out.println(avg);
        System.out.println(array[max]);
    }
}