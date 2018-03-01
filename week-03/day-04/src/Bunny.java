public class Bunny {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

    int bunny = 10;
    int ears = 2;
    System.out.println(earstogether(bunny, ears));
  }

  private static int earstogether(int bunny, int ears) {
    if (bunny == 0) {
      return bunny;
    } else {
      return ears + earstogether(bunny - 1, ears);
    }

  }
}
