package charSequence;


public class Mian {
  public static void main(String[] args) {

    Gnirts word = new Gnirts("miertNemMukodsz?");
    System.out.println(word.length());

    System.out.println(word.charAt(2));
    System.out.println(word.subSequence(0, 7));

    Shifter shifter = new Shifter("remelemMukodik", 2);
    System.out.println(shifter.charAt(0));
  }
}
