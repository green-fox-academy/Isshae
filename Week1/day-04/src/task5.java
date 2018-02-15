public class task5 {
    public static void main(String[] args){
       //05 TwoNumbers
        // Create a program that prints a few operations on two numbers: 22 and 13
        // Print the result of 13 added to 22
        // Print the result of 13 substracted from 22
        // Print the result of 22 multiplied by 13
        // Print the result of 22 divided by 13 (as a decimal fraction)
        // Print the integer part of 22 divided by 13
        // Print the reminder of 22 divided by 13

        int a = 22;
        int b = 13;
        int result= a+b;
        System.out.println(result);

        int result2= a-b;
        System.out.println(result2);

        int result3= a*b;
        System.out.println(result3);

        double result4= (double) a/b;
        System.out.println(result4);

        int result5= a/b;
        System.out.println(result5);

        int result6= a%b;
        System.out.println(result6);
    }
}
