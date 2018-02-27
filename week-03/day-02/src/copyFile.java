import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class copyFile {
  public static void main(String[] args) {
    // Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful


    File myFile= new File("my-file.txt");
    File myFile2=new File("myFile.txt");

    System.out.println(copyFunction(myFile, myFile2));
  }

  private static Boolean copyFunction(File myFile, File myFile2) {
   boolean result=true;
    Path myFilePath= Paths.get("my-file.txt");
    Path myFile2Path= Paths.get("myFile.txt");
    try{
      for (String lines:Files.readAllLines(myFilePath)) {
        Files.write(myFile2Path,lines.getBytes(),StandardOpenOption.APPEND);
        Files.write(myFile2Path,"\n".getBytes(),StandardOpenOption.APPEND);

      }
    }catch(IOException IOEx){
      return false;
    }

    return result;
  }
}
