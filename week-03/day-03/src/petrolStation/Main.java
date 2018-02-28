package petrolStation;

public class Main {
  public static void main(String[] args) {
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

    Station gasStation=new Station();
    Car car=new Car();

    gasStation.refill(car);
    System.out.println(gasStation.getGasAmount());
    gasStation.refill(car);
    System.out.println(gasStation.getGasAmount());
  }
}
