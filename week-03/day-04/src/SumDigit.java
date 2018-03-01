public class SumDigit {
  public static void main(String[] args) {
    // Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

int num =987;

    System.out.println(sumDigits(num));

  }

  private static int sumDigits(int num) {
    int sum=0;
    if (num == 0)
      return sum;
    sum = num%10 + sumDigits(num/10);
    return sum;
  }
}
