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
  private String name;
  private String pourMe = "Pour me anudder!";
  private String imPirate = "Arghh, I'ma Pirate. How d'ya d'ink its goin?";
  private String dead = "I'm dead";

  public Pirate(String name) {
  this.name=name;
    drunkLevel = 0;
    isDead = false;
  }

  public void drinkSomeRum() {
    if (isDead) {
      System.out.println(dead);
    } else {
      drunkLevel++;
    }
  }

  public void howsItGoingMate() {
    if (isDead) {
      System.out.println(dead);

    } else {
     if (0 < drunkLevel && drunkLevel <= 4) {
        System.out.println(pourMe);
      } else {
        System.out.println(imPirate);
      }
    }
  }
  public void die(){
    isDead=true;
  }
  public void brawl(Pirate pirate){
    Random random= new Random();
    int result=random.nextInt(3)+1;
    if (isDead) {
      System.out.println(dead);
    } else {
      if (result==1){
        this.die();
        System.out.println("The winner is: "+pirate.getName());
      }else if (result==2){
        pirate.die();
        System.out.println("The winner is: "+this.getName());
      }else{
        this.die();
        pirate.die();
        System.out.println("Both of them are dead!");

      }
    }

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
}
