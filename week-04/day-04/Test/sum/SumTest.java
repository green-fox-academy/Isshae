package sum;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
/*Create different tests where you
test your method with an empyt list
with a list with one element in it
with multiple elements in it
with a null
Run them
Fix your code if needed*/


public class SumTest {
  Sum sum;
  List<Integer> listOfNums = new ArrayList<>();
  List<Integer> listOfNums2 = Arrays.asList(1, 2, 3, 4, 5);
  List<Integer> listOfNums3 = Arrays.asList(1);

  @Before
  public void setUp() {
    sum = new Sum();

  }
  @Test
  public void sumAllEleementsWithNullsTest() {
    assertEquals(0, sum.sumAllEleements(listOfNums));
  }

  @Test
  public void sumAllEleementsTest() {
    assertEquals(15, sum.sumAllEleements(listOfNums2));
  }
  @Test
  public void sumAllEleementsTestWithOneNumber() {
    assertEquals(1, sum.sumAllEleements(listOfNums3));
  }
}