package charSequence;

public class Shifter implements CharSequence {

  private String string;
  int shifts;

  public Shifter(String string, int shifts) {
    this.string = string;
    this.shifts = shifts;
  }


  @Override
  public int length() {
    return string.length();
  }

  @Override
  public char charAt(int index) {
    return string.charAt(index + shifts);
  }

  @Override
  public CharSequence subSequence(int start, int end) {

    return string.subSequence(start, end);

  }
  /*Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
//  should print out: a
  Create a Shifter class implementing this interface
This charsequence can be set up with a string (that is to be shifted) and a number (which will tell how many to shift)
Implement the methods so the returned results of them will be shifted*/

  public String getString() {
    return string;
  }
}
