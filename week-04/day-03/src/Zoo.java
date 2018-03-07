import animals.*;

public class Zoo {

  public static void main(String[] args) {

    Reptile reptile = new Reptile("Crocodile", 32, 23);
    Mammal mammal = new Mammal("Koala", 21, 21);
    Bird bird = new Bird("Parrot", 3, 1);

    System.out.println("How do you breed?");
    System.out.println("A " + reptile.getName() + " is breeding by " + reptile.breed());
    System.out.println("A " + mammal.getName() + " is breeding by " + mammal.breed());
    System.out.println("A " + bird.getName() + " is breeding by " + bird.breed());
  }
}