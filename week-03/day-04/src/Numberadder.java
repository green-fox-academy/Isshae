import java.util.Scanner;
// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.


public class Numberadder {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number: ");
    int num = scanner.nextInt();

    System.out.println(numberAdder(num));
  }

  private static int numberAdder(int num) {

   if (num==0){
     return 0;
   }else{
     return num+numberAdder(num-1);
   }


  }
}
