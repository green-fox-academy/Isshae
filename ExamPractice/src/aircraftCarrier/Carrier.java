package aircraftCarrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {
  /*The carrier should be able to store aircrafts
Each carrier should have a store of ammo represented as number
The inital ammo should be given by a parameter in it's constructor
The carrier also has a health point given in it's constructor as well*/

  private int amountInAmmoStorage;
  private int health;
  private String name;
  List<Aircraft> aircraftStorage;

  public Carrier(String name, int amountInAmmoStorage) {
    this.name = name;
    this.amountInAmmoStorage = amountInAmmoStorage;
    this.health = 5000;
    aircraftStorage = new ArrayList<>();
  }

  public void addAircraft(Aircraft aircraft) {
    aircraftStorage.add(aircraft);
  }

  public void fillAllAircraftWithAmmo() {
    if (amountInAmmoStorage <= 0) {
      System.out.println("Sorry pal we're outta ammo");
    } else {
      for (int i = 0; i < aircraftStorage.size(); i++) {
        Aircraft aircraft = aircraftStorage.get(i);
        if (aircraft.isPriority()) {
          amountInAmmoStorage = aircraftStorage.get(i).refill(amountInAmmoStorage);
        } else {
          amountInAmmoStorage = aircraftStorage.get(i).refill(amountInAmmoStorage);
        }
      }
    }
  }

  public void carrierBattle(Carrier carrier) {
    int damageCounter = 0;
    for (int i = 0; i < aircraftStorage.size(); i++) {
      damageCounter += aircraftStorage.get(i).fight();
    }
    carrier.health -= damageCounter;
    if (carrier.health <= 0) {
      System.out.println("It's dead Jim :(");
    } else {
      System.out.println("The battle can go on... after a quick refill " + carrier.health);
    }
  }

  public int getAmountInAmmoStorage() {
    return amountInAmmoStorage;
  }

  public int getHealth() {
    return health;
  }

  public void setAmountInAmmoStorage(int amountInAmmoStorage) {
    this.amountInAmmoStorage = amountInAmmoStorage;
  }
}
