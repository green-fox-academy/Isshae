package garden;


import java.util.ArrayList;

public class Garden {
  /*The garden.Garden
is able to hold unlimited amount of flowers or trees
when watering it should only water those what needs water with equally divided amount amongst them
eg. watering with 40 and 4 of them need water then each gets watered with 10
The Flower
needs water if its current water amount is less then 5
when watering it the flower can only absorb the 75% of the water
eg. watering with 10 the flower's amount of water should only increase with 7.5
The Tree
needs water if its current water amount is less then 10
when watering it the tree can only absorb the 40% of the water
eg. watering with 10 the tree's amount of water should only increase with 4*/

  ArrayList<Plant> plantList;
  double standardWA;

  public Garden() {
    this.plantList = new ArrayList<>();
    this.standardWA = 10;
  }

  public void watering(int wateringAmount) {
    while (wateringAmount > 0) {
      for (int i = 0; i < plantList.size(); i++) {
        double newCWA = (standardWA * plantList.get(i).absorbtionAmount);
        if (plantList.get(i).needsWatering())
          plantList.get(i).setCurrentWaterAmount(plantList.get(i).getCurrentWaterAmount() + newCWA);
        wateringAmount -= standardWA;
      }
    }
    checkStatus();
  }

  public void checkStatus() {
    for (int i = 0; i < plantList.size(); i++) {
      if (plantList.get(i).needsWatering()) {
        System.out.println(plantList.get(i).color + " " + plantList.get(i).type + " "
                + plantList.get(i).getCurrentWaterAmount() + " needs watering.");
      } else {
        System.out.println(plantList.get(i).color + " " + plantList.get(i).type + " "
                + plantList.get(i).getCurrentWaterAmount() + " doesn't need watering.");
      }
    }
    System.out.println("\n");
  }
}

