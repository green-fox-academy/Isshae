public class Bunny {
  public static void main(String[] args) {
    // We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

    int bunny = 10;
    int ears = 2;
    System.out.println(earstogether(bunny));
  }

  private static int earstogether(int bunny) {
    if (bunny == 0) {
      return 0;
    } else {
      return 2 + earstogether(bunny - 1);
    }

  }
}
