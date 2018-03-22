package examBasicsBolb.oddAvg;


import java.util.ArrayList;

public class OddAvg {

  public static void main(String[] args) {
    // Create a function called `oddAverage` that takes a list of numbers as parameter
    // and returns the average value of the odd numbers in the list
    // Create basic unit tests for it with at least 3 different test cases

    ArrayList<Integer> listOfNumbers = new ArrayList<>();
    OddAvg oddAvg = new OddAvg();
    oddAvg.fillList(listOfNumbers);
    System.out.println(oddAvg.oddAverage(listOfNumbers));

  }

  public int oddAverage(ArrayList<Integer> listOFNumbers) {
    int sumOfOdd = 0;
    int oddCounter = 0;
    for (int i = 0; i < listOFNumbers.size(); i++) {
      if (listOFNumbers.get(i) % 2 == 0) {
        sumOfOdd += listOFNumbers.get(i);
        oddCounter++;
      }
    }
    return sumOfOdd / oddCounter;
  }

  public void fillList(ArrayList<Integer> listOfNumbers) {
    for (int i = 1; i < 10; i++) {
      listOfNumbers.add(i);
    }
  }
}