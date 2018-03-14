package countLetters;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CountLettersTest {
  String word = "asd asd asd";
  String emptyWord = "";
  CountLetters countLetters;

  @Before
  public void setUpObject() {
    countLetters = new CountLetters();
  }

  @Test
  public void falseMappingTest() {
    Map<Character, Integer> falseMap = new HashMap<>();
    falseMap.put('a', 3);
    falseMap.put('s', 3);
    falseMap.put('d', 3);
    falseMap.put(' ', 2);
    assertNotEquals(falseMap, countLetters.mapping(word));
  }

  @Test
  public void mappingTest() {
    Map<Character, Integer> map = new HashMap<>();
    map.put('a', 3);
    map.put('s', 3);
    map.put('d', 3);
    assertEquals(map, countLetters.mapping(word));
  }

  @Test
  public void emptyMapTest() {
    Map<Character, Integer> emptyMap = new HashMap<>();
    assertEquals(emptyMap, countLetters.mapping(emptyWord));

  }
}