package petrolStation;

public class Station {
   /*Create Station and Car classes
Station
gasAmount
refill(car) -> decreases the gasAmount by the capacity of the car and increases the cars gasAmount
Car
gasAmount
capacity
create constructor for Car where:
initialize gasAmount -> 0
initialize capacity -> 100*/

   private  int gasAmount=1000+refill(new Car());


  public int refill(Car car){
    int newGasAmount=gasAmount-(car.capacity-car.gasAmount);
   return newGasAmount;
  }

  public int getGasAmount() {
    return gasAmount;
  }
}
