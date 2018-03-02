package pirates;

import java.util.Random;

public class Pirate {
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


  private int drunkLevel;
  private boolean isDead;
  private String rank;
  private String name;
  private String pourMe = "Pour me anudder!";
  private String imPirate = "Arghh, I'ma feeling good! How d'ya d'ink its goin?";
  private String dead;

  public Pirate(String name) {
    this.name = name;
    drunkLevel = 0;
    isDead = false;
    rank = "Sea rat";
    dead = this.getName() + " is dead!";
  }

  public void drinkSomeRum() {
    if (isDead) {
      System.out.println(dead);
    }
    if (0 < drunkLevel && drunkLevel <= 4) {
      System.out.println(pourMe);
    } else if(5 < drunkLevel && drunkLevel <= 6) {
      System.out.println(imPirate);
    }else{
      System.out.println(this.getName()+" drank himself to the ground, and fainted!");
    }
    drunkLevel++;
  }

  public void howsItGoingMate() {
    if (isDead) {
      System.out.println(dead);

    } else {

    }
  }


  public void die() {
    isDead = true;
  }

  public void brawl(Pirate pirate) {
    Random random = new Random();
    int result = random.nextInt(3) + 1;
    if (isDead) {
      // System.out.println(dead);
    } else {
      if (result == 1) {
        this.die();
        System.out.println(pirate.getName() + " took a cheap shot and killed "+this.getName());
      } else if (result == 2) {
        pirate.die();
        System.out.println("In a heroic battle " + this.getName() + " has won!");
      } else {
        this.die();
        pirate.die();
        System.out.println("They were too drunk and killed each other!");

      }
    }

  }


  public String piratetoString() {
    String result = "";

    if (this.getRank().equals("Captain")) {
      result = "Me Blue beard " + this.getName() + "I have all the Rum in the ship c'uz I'm the " + this.getRank();
    } else {
      result = "Me  " + this.getName() + " I love RUM if Captain leave me som c'uz I'm a " + this.getRank();
    }


    return result;
  }

  public String getRank() {
    return rank;
  }

  public int getDrunkLevel() {
    return drunkLevel;
  }

  public boolean isDead() {
    return isDead;
  }

  public String getName() {
    return name;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public void setDrunkLevel(int drunkLevel) {
    this.drunkLevel = drunkLevel;
  }
}
