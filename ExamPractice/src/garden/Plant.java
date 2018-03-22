package garden;

import java.util.ArrayList;

public class Plant {

  double currentWaterAmount;
  double desiredWaterAmount;
  double absorbtionAmount;
  String color;
  String type;
  ArrayList<Plant> plantList;


  public Plant(double desiredWaterAmount, double absorptionAmount, String color, String type) {
    this.currentWaterAmount = 0;
    this.desiredWaterAmount = desiredWaterAmount;
    this.absorbtionAmount = absorptionAmount;
    this.color = color;
    this.type = type;
    this.plantList = new ArrayList<>();
  }

  public boolean needsWatering() {
    return currentWaterAmount < desiredWaterAmount;
  }

  public double getAbsorbtionAmount() {
    return absorbtionAmount;
  }

  public double getCurrentWaterAmount() {
    return currentWaterAmount;
  }

  public void setCurrentWaterAmount(double currentWaterAmount) {
    this.currentWaterAmount = currentWaterAmount;
  }
}
