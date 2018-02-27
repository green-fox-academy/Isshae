import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class logs {
  public static void main(String[] args) {
    // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

    String fileName = "logs";
    Path path1 = Paths.get(fileName);
    System.out.println();
    File myFile = new File(fileName);

    IPAdresses(myFile);
getPostRatio(myFile);
  }

  private static ArrayList<String> getPostRatio(File myFile) {
    String line = "";
    ArrayList<String> IPAdresses = new ArrayList<String>();

    try {
      FileReader fr = new FileReader(myFile);
      BufferedReader br = new BufferedReader(fr);

      while ((line = br.readLine()) != null) {
        line.split("\\s+");
        IPAdresses.add(line.split("\\s+")[6]);
        System.out.println(line.split("\\s+")[6]);
      }
    } catch (IOException e) {
      System.out.println("File not found!");
    }

    return IPAdresses;

  }

  private static ArrayList<String> IPAdresses(File myFile) {

    String line = "";
    ArrayList<String> IPAdresses = new ArrayList<String>();

    try {
      FileReader fr = new FileReader(myFile);
      BufferedReader br = new BufferedReader(fr);

      while ((line = br.readLine()) != null) {
        line.split("\\s+");
        IPAdresses.add(line.split("\\s+")[5]);
        System.out.println(line.split("\\s+")[5]);
      }
    } catch (IOException e) {
      System.out.println("File not found!");
    }

    return IPAdresses;
  }

}

