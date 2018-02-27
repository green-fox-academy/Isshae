import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class printEachLine {
  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt", then prints
    // each of lines form the file.
    // If the program is unable to read the file (for example it does not exists),
    // then it should print an error message like: "Unable to read file: my-file.txt"


    try {
      Path path= Paths.get("my-file.txt");
      Files.readAllLines(path);
    }catch (IOException IOE){
      System.err.println("Unable to read file: my-file.txt");
    }

  }
}
