package fibonacci;

import org.junit.Test;

import static fibonacci.Fibonacci.getFibonacciNumber;
import static org.junit.Assert.*;

public class FibonacciTest {


  @Test
  public void testGetFibonacciNumber() {
    assertEquals(8, getFibonacciNumber(7) );
  }
}