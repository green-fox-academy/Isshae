public class BunniesAgain {
  public static void main(String[] args) {
    // We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

    int bunnies = 101;

    System.out.println(earsAgain(bunnies));
  }

  private static int earsAgain(int bunnies) {
    int ears = 0;
    if (bunnies % 2 == 0) {
      ears = 3;
    } else {
      ears = 2;
    }
    if (bunnies == 0) {
      return bunnies;

    } else {

      return ears +earsAgain(bunnies - 1);
    }
  }
}

