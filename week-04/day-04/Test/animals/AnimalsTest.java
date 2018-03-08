package animals;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalsTest {
  Animals animal;

  @Before
 public void setUpAnimal() {
    animal = new Animals();
  }

  @Test
  public void testEat() {
    assertEquals(50, animal.eat());
  }

  @Test
  public void testDrink() {
    assertEquals(50, animal.drink());
  }

  @Test
  public void testPlay() {
  }
}