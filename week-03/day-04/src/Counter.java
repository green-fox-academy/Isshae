import java.util.Scanner;

public class Counter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number: ");
    int num = scanner.nextInt();

    System.out.println(counter(num));


  }

  private static int counter(int num) {

    if (num == 1) {
      return 1;
    } else {
      System.out.println(num);
      num = counter(num - 1);

      return num;


    }
  }
}
