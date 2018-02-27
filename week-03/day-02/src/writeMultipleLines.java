import com.sun.org.apache.xml.internal.serialize.LineSeparator;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class writeMultipleLines {
  public static void main(String[] args) {
    // Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.
    Scanner scanner = new Scanner(System.in);
    System.out.println("Number:");
    String fileName = "my-file.txt";
    Path filePath = Paths.get(fileName);
    String word = "Kiskutya";
    int numberOfLines = scanner.nextInt();

    writeLines(filePath, word, numberOfLines);
  }

  private static void writeLines(Path filePath, String word, int numberOfLines) {
    try {
      if (!Files.exists(filePath)) {
        Files.createFile(filePath);
      }
      for (int i = 0; i < numberOfLines; i++) {
        Files.write(filePath, word.getBytes(), StandardOpenOption.APPEND);
        Files.write(filePath, "\n".getBytes(), StandardOpenOption.APPEND);
      }

    } catch (IOException IOEx) {
      System.err.println();
    }
  }
}
