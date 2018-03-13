package fishTank;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
  List<Fish> aquarium;

  public Aquarium() {
    this.aquarium = new ArrayList<>();
  }


  public void add(Fish fish) {
    this.aquarium.add(fish);
  }


  public void feed() {
    for (Fish fish : aquarium) {
      fish.feedFish();
    }
  }

  public void removeOversizedFishes() {
    for (int i = 0; i < aquarium.size(); i++) {
      if (aquarium.get(i).weight >= 11) {
        aquarium.remove(aquarium.get(i));
      }
    }
  }

  public String status() {
    String result = "";
    for (Fish fish : aquarium) {
     result += fish.fishStatus() + "\n";
    }
    return result;
  }
}
