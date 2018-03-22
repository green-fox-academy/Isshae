package examBasicsBolb.copy;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {
  public void copy(String arg1, String arg2) {
    List<String> sourceContent = new ArrayList<>();
    try {
      for (String lines : Files.readAllLines(Paths.get(arg1))) {
        sourceContent.add(lines);
      }
      Files.write(Paths.get(arg2), sourceContent, StandardOpenOption.WRITE);
    } catch (IOException e) {
      System.out.println("could not read file");
    }

  }
}
