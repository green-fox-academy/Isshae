package flyable;

public abstract class Vehicle {
/*Create a Flyable interface
it should have land, fly and takeOff methods (TakeOff in C#)
Create an abstract Vehicle class
it should have at least 3 fields
Extend Helicopter class from Vehicle
implement your Flyable interface
Extend Bird from your abstract Animal class (zoo exercise)
implement yourˇFlyable interface*/

private int speed;
private int weight;
private String name;

  public Vehicle(String name) {
    this.name = name;
    weight = 100;
    speed = 0;
  }

  public abstract void accelerate();
}
