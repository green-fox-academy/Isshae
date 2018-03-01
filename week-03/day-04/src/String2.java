public class String2 {
  public static void main(String[] args) {
    // Given a string, compute recursively a new string where all the 'x' chars have been removed.

    String string = "xzyxzy";
    char charX = 'x';
    char charY = 0;
    System.out.println(changeToY(string, charX, charY));
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
