package pirates;

public class Main{

  public static void main(String[] args) {
   /* Create a Pirate class. While you can add other fields and methods, you must have these methods:-

            drinkSomeRum() - intoxicates the Pirate some
    howsItGoingMate() - when called, the Pirate replies, if drinkSomeRun was called:-
            0 to 4 times, "Pour me anudder!"
else, "Arghh, I'ma Pirate. How d'ya d'ink its goin?", the pirate passes out and sleeps it off.
            If you manage to get this far, then you can try to do the following.

    die() - this kills off the pirate, in which case, drinkSomeRum, etc. just result in he's dead.
    brawl(x) - where pirate fights another pirate (if that other pirate is alive) and there's a 1/3 chance, 1 dies, the other dies or they both pass out.
    And... if you get that far...

    Add a parrot.*/

    Pirate jack = new Pirate("Jack");
    Pirate john = new Pirate("John");
    Pirate george=new Pirate("George");
Ship ship=new Ship();
ship.fillShip();

ship.toString();
   /* for (int i = 0; i <ship.crew.size() ; i++) {
      System.out.println(ship.crew.get(i).piratetoString());
    }*/

  }
}
