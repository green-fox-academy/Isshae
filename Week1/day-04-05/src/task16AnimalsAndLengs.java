import java.util.Scanner;

public class task16AnimalsAndLengs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of chicks: ");
        int chicks = sc.nextInt();
        System.out.println("Number of piggies: ");
        int piggies = sc.nextInt();

        int legs= (chicks*2)+(piggies*4);

        System.out.println("All the legs together: "+legs);

    }

}
