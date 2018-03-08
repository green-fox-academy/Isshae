package countLetters;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static countLetters.CountLetters.maping;
import static org.junit.Assert.*;

public  class CountLettersTest {
 static String word = "asdasdasd";

static Map setUpMap(){
  Map<Character,Integer> map = new HashMap<>();
  map.put('a',3);
  map.put('s',3);
  map.put('d',3);
return map;
}
  @Test
  public void mapingTest() {
    assertEquals(setUpMap(),maping(word));
  }
}