package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {
  /*Create a pirates.Ship class.
The pirates.Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
When a ship is created it doesn't have a crew or a captain.
The ship can be filled with pirates and a captain via fillShip() method.
Filling the ship with a captain and random number of pirates.
Ships should be represented in a nice way on command line including information about
captains consumed rum, state (passed out / died) MODOSITANI A toString METODUSAT!!!
number of alive pirates in the crew
Ships should have a method to battle other ships: ship.battle(otherShip)
should return true if the actual ship (this) wins
the ship should win if its calculated score is higher
calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
The loser crew has a random number of losses (deaths).
The winner captain and crew has a party, including a random number of rum :)*/
  public String[] Beginning = {"Kr", "Ca", "Ra", "Mrok", "Cru",
          "Ray", "Bre", "Zed", "Drak", "Mor", "Jag", "Mer", "Jar", "Mjol",
          "Zork", "Mad", "Cry", "Zur", "Creo", "Azak", "Azur", "Rei", "Cro",
          "Mar", "Luk"};
  public String[] Middle = {"air", "ir", "mi", "sor", "mee", "clo",
          "red", "cra", "ark", "arc", "miri", "lori", "cres", "mur", "zer",
          "marac", "zoir", "slamar", "salmar", "urak"};
  public String[] End = {"d", "ed", "ark", "arc", "es", "er", "der",
          "tron", "med", "ure", "zur", "cred", "mur"};

  public Random random = new Random();

  List<Pirate> crew=new ArrayList<>();

  public void fillShip(){
   int shipCrew=random.nextInt(30)+6;
    for (int i = 0; i <shipCrew ; i++) {
      crew.add(new Pirate(generateName()));
      crew.get(i).setDrunkLevel(random.nextInt(4)+1);
      if (i==shipCrew-1){
        crew.get(i).setRank("Captain");
      }
    }
  }

  public String generateName() {

    return Beginning[random.nextInt(Beginning.length)] +
            Middle[random.nextInt(Middle.length)] +
            End[random.nextInt(End.length)];
  }


}
