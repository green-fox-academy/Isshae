package anagram;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {
  /*Write a function, that takes two strings and returns a boolean value based on if the two strings are Anagramms or not.
Create a test for that.*/

  public boolean angram(String word1, String word2) {
    char[] charArray2 = word2.toCharArray();
    char[] charArray = word1.toCharArray();
    Arrays.sort(charArray);
    Arrays.sort(charArray2);
    return Arrays.equals(charArray, charArray2);
  }

  public static void main(String[] args) {
    Anagram anagram = new Anagram();

    System.out.println(anagram.angram("dog", "god"));
  }
}
