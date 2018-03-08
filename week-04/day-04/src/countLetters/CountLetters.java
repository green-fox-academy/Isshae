package countLetters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountLetters {
  /*Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
Create a test for that.*/
  public static void main(String[] args) {


    String word = "asdasdasd";
    System.out.println(maping(word));


  }


  public static Map<Character, Integer> maping(String word) {
    Map<Character, Integer> map = new HashMap<Character, Integer> ();
    List<Character> chars = new ArrayList<>();

    for (int i = 0; i < word.length(); i++) {
      if (!chars.contains(word.charAt(i))) {
        chars.add(word.charAt(i));
      }
    }
    for (int i = 0; i < chars.size(); i++) {
      int sum = 0;
      for (int j = 0; j < word.length(); j++) {
        if (chars.get(i).equals(word.charAt(j))) {
          sum++;
        }
        map.put(chars.get(i),sum);
      }
    }
    return map;
  }
}
