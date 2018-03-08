package fibonacci;

public class Fibonacci {
  /*Write a function that computes a member of the fibonacci sequence by a given index
Create tests that covers all types of input (like in the previous workshop exercise)*/

  private static int index = 7;

  public static void main(String[] args) {
    System.out.println(getFibonacciNumber(index));
  }

  public static int getFibonacciNumber(int index) {
    int n0 = 0;
    int n1 = 1;
    int nIndex = 0;
    for (int i = 2; i < index; ++i) {
      nIndex = n0 + n1;
      n0 = n1;
      n1 = nIndex;
    }
return nIndex;
  }
}
