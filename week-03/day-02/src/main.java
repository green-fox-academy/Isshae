import java.util.Scanner;

public class main {

  public static void main(String[] args) {

    // Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
    Scanner scanner=new Scanner(System.in);


    int input=scanner.nextInt();
    calculator(input);

  }

  private static void calculator(int input) {
    System.out.println("Give me a number:");
    int a=10;
    try{
      System.out.println(a / input);
    }catch(ArithmeticException AE){
      System.err.println("fail");
    }
  }
}
