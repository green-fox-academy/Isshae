import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class countLines {
  public static void main(String[] args) {
    // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

    String fileName = "myFile.txt";

    countTheLines(fileName);

   /* List<String> myList = Arrays.asList("test", "test2");

    for (String elem : myList) {
      System.out.println(elem);
    }*/

  }

  private static void countTheLines(String fileName) {
    File myFile = new File(fileName);
    Path path1 = Paths.get(fileName);
    int count = 0;
    try {
      if (myFile.exists()) {
        myFile.createNewFile();
      }
      for (String line : Files.readAllLines(path1)) {
        count++;

      }
    } catch (IOException IOEx) {

    }
    System.out.println(count);
  }
}
