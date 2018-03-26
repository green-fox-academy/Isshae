import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Strings {
  public static void main(String[] args) {
//Write a Stream Expression to find the uppercase characters in a string!
    List<String> words = Arrays.asList("fasDDfasdf", "SDAFASDFfasASDFSA");
    String word = "fSDFdFADFasfA";

    System.out.println(word.chars()
            .filter(Character::isUpperCase)
            .mapToObj(c -> Character.toString((char) c))
            .collect(Collectors.joining(", ")));

    //  Write a Stream Expression to find the strings which starts with A and ends with I in the following array:
    ArrayList<String> cities = new ArrayList<>(Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH",
            "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS"));

    cities.stream()
            .filter(c -> c.startsWith("A") && c.endsWith("I"))
            .forEach(System.out::print);

    //Write a Stream Expression to find the frequency of characters in a given string!
    Map<Character, Long> characterFrequency = word.chars()
            .mapToObj(c -> (char) c)
            .collect(groupingBy(c -> c, counting()));
    System.out.println(characterFrequency);


    // Write a Stream Expression to convert a char array to a string!
    char[] chars = {'a', 'l', 'm', 'a'};
    String newWord = new String(chars);
    System.out.println(newWord);

  }
}
