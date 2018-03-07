package charSequence;

public class Gnirts implements CharSequence {
  /*Create a Gnirts class implementing this interface
It should have one String field that can be set via the constructor
Implementing the interfaces methods always think of the field as backwards, so at the second position of "this example"
there is a 'p'
In a main method try out all the methods*/

  String string;

  public Gnirts(String string) {
    this.string = string;
  }


  @Override
  public int length() {

    return this.getString().length();
  }

  @Override
  public char charAt(int index) {
    return getString().charAt(length()-index-1);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String reverseString = "";
    for (int i = this.getString().length()-1; i > 0; i--) {
      reverseString += this.getString().charAt(i);
    }
    return reverseString.subSequence(start, end);

  }

  public String getString() {
    return string;
  }
}
