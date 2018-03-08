package anagram;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

  Anagram anagram = new Anagram();
  String word1 = "dog";
  String word2 = "god";

  @Test
  public void angramTest() {
    assertEquals(true, anagram.angram(word1, word2));
  }
}