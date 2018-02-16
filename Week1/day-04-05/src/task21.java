import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {

        // Write a program that asks for two numbers
// Thw first number represents the number of girls that comes to a party, the
// second the boys
// It should print: The party is exellent!
// If the the number of girls and boys are equal and there are more people coming than 20
//
// It should print: Quite cool party!
// It there are more than 20 people coming but the girl - boy ratio is not 1-1
//
// It should print: Average party...
// If there are less people coming than 20
//
// It should print: Sausage party
// If no girls are coming, regardless the count of the people

        Scanner sc = new Scanner(System.in);

        System.out.println("Give me the number of girls");
        int numGirls = sc.nextInt();
        System.out.println("Give me the number of boys");
        int numBoys = sc.nextInt();

        if (numBoys == numGirls && numBoys + numGirls > 20) {
            System.out.println("The party is Exellent");
        } else if (numBoys + numGirls > 20 && numBoys != numGirls) {
            System.out.println("Quite cool party!");
        }else if (numGirls+numBoys>20){
            System.out.println("Average party...");
        }else if (numGirls==0){
            System.out.println("Sausage party");
        }
    }
}