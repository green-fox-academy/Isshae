import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class decryptDouble {
  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    String fileName = "duplicated-chars.txt";
    Path path = Paths.get(fileName);
    File myFile = new File(fileName);

    System.out.println(decrypt(myFile, path));
  }

  private static String decrypt(File myFile, Path path) {
    String fileName = "duplicated-chars.txt";
    List<String> dectrypted = new ArrayList<String>();
    ArrayList<Character> chars = new ArrayList<>();
    ArrayList<String> strings = new ArrayList<>();
    StringBuilder builder = new StringBuilder(chars.size());
    try {
      Scanner scanner = new Scanner(new File(fileName));
      while (scanner.hasNext()) {
        dectrypted.add(scanner.next());

      }
 
      for (int i = 0; i < dectrypted.size(); i++) {
        chars.add(dectrypted.toString().charAt(i));

      }
      for (int i = 0; i < chars.size(); i++) {
        chars.remove(i);

      }

      for (Character ch : chars) {
        builder.append(ch);
      }

    } catch (IOException IOEx) {
      System.err.println("Something went wrong!");
    }

    return chars.toString();
  }
}
