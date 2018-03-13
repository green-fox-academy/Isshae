package multiplicationTable;

public class MultiplicationTable {
  public static void main(String[] args) {
// Create a function that prints the multiplication table of a given base number.
// It should take the base number as a parameter and prints the output to the
// console.

    int inputNumber = 5;

    multiply(inputNumber);

  }

  private static void multiply(int inputNumber) {
    for (int i = 1; i < 11; i++) {
      int result = 0;
      result = i * inputNumber;
      System.out.println(i + " * " + inputNumber + " = " + result);
    }

  }

}
