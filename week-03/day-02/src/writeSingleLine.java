import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class writeSingleLine {
  public static void main(String[] args) {
    // Open a file called "my-file.txt"
    // Write your name in it as a single line
    // If the program is unable to write the file,
    // then it should print an error message like: "Unable to write file: my-file.txt"

    String fileName = "myFile.txt";
    Path path1 = Paths.get(fileName);
    File myFile = new File(fileName);
    //List<String> name = Arrays.asList("Vajtai-Syellak Gergely");
String name="Vajtai-Syellak Gergely";

    try {
      
      Files.write(path1, name.getBytes(), StandardOpenOption.WRITE);
      System.out.print(Files.readAllLines(path1));

    } catch (IOException IOEx) {

    }

  }
}
