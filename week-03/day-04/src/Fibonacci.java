public class Fibonacci {
  static int[] memoization;


  public static void main(String[] args) {
    // The fibonacci sequence is a famous bit of mathematics, and it happens to
// have a recursive definition. The first two values in the sequence are
// 0 and 1 (essentially 2 base cases). Each subsequent value is the sum of the
// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21
// and so on. Define a recursive fibonacci(n) method that returns the nth
// fibonacci number, with n=0 representing the start of the sequence.

    int fibo = 8;

    System.out.println(fibonacci(fibo));
  }

  public static int fibonacci(int fibo) {
    if (fibo == 0) {
      return memoization[0];
    } else {
      int f = memoization[fibo];
      if (f == 0) {
        f = fibonacci(fibo - 1) + fibonacci(fibo - 2);
        memoization[fibo] = f;
      }
      return f;
    }
  }
}
