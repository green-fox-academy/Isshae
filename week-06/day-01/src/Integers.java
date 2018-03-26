import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Integers {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14));
    numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n + ", ")
            .forEach(System.out::print);
    System.out.println();

    // Write a Stream Expression to get the average value of the odd numbers from the following array:

    IntSummaryStatistics ststs = numbers.stream()
            .mapToInt((n) -> n)
            .filter(n -> n % 2 != 0)
            .summaryStatistics();

    System.out.println(ststs.getAverage());

    //Write a Stream Expression to get the squared value of the positive numbers from the following array:
    numbers.stream()
            .filter(n -> n > 0)
            .map(n -> n * n)
            .map(n -> n + ", ")
            .forEach(System.out::print);

    System.out.println();

    //Write a Stream Expression to find which number squared value is more then 20 from the following array:

    ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 9, 2, 8, 6, 5));

    numbers2.stream()
            .map(n -> n * n)
            .filter(n -> n > 20)
            .map(n -> n + ", ")
            .forEach(System.out::print);
    System.out.println();

    //Write a Stream Expression to find the frequency of numbers in the following array:
    ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2));

    System.out.println(
            numbersList.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting())));

  }
}
