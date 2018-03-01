public class Strings {
  public static void main(String[] args) {
    // Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

    String x = "XXXxxxXXXXXxxxxxXXXxxx";
    char charX = 'x';
    char charY = 'y';
    System.out.println(changeToY(x, charX, charY));
  }

  private static String changeToY(String x, char charX, char charY) {
    if (x.length() < 1) {
      return x;
    } else {
      char newChar = charX == x.charAt(0) ? charY : x.charAt(0);
      return newChar + changeToY(x.substring(1), charX, charY );
    }
  }
}
