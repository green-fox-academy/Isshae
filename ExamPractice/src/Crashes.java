import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Crashes {
  public static final String FILE_NAME = "crash-incidents.txt";
  public static void main(String[] args) {
    // The crash-incidents.csv file contains data of road crash-incidents.
// (id; location; surface type; surface condition; light condition; weather condition; crash date; year)
// Your task will be to count how many crash-incidents happened at good/bad
// weather conditions.
// Good weather conditions are CLOUDY and CLEAR.
// Bad weather conditions are RAIN, FREEZING RAIN, SNOW, FOG and SEVERE CROSSWINDS.
// So create the necessary method(s) that returns with the amount of crash-incidents.
// And print the return value to the console:
// The amount of crashes at good weather conditions: {amount}
// The amount of crashes at bad weather conditions: {amount}

    System.out.println("The amount of crashes at good weather conditions: " + goodWeatherAccs());
    System.out.println("The amount of crashes at bad weather conditions: " + badWeatherAccs());
  }

  private static int badWeatherAccs() {
    int sumOfBadWeatherAccs = 0;

    try {
      List<String> fileContent = Files.readAllLines(Paths.get(FILE_NAME));
      for (int i = 0; i <fileContent.size() ; i++) {
        if (fileContent.get(i).toLowerCase().contains("rain") || fileContent.get(i).toLowerCase().contains("freezing rain")
                || fileContent.get(i).toLowerCase().contains("snow") || fileContent.get(i).toLowerCase().contains("fog")
                || fileContent.get(i).toLowerCase().contains("severe crosswinds")){
          sumOfBadWeatherAccs++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return sumOfBadWeatherAccs;
  }

  private static int goodWeatherAccs() {
    int sumOfGoodWeatherAccs = 0;

    try {
      List<String> fileContent = Files.readAllLines(Paths.get(FILE_NAME));
      for (int i = 0; i < fileContent.size(); i++) {
        if (fileContent.get(i).toLowerCase().contains("cloudy") || fileContent.get(i).toLowerCase().contains("clear")){
          sumOfGoodWeatherAccs++;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }


    return sumOfGoodWeatherAccs;
  }

}
