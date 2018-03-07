package flyable;

public class Helicopter extends Vehicle implements Flyable {

  public Helicopter(String name) {
    super(name);
  }

  @Override
  public void accelerate() {
    System.out.println("Accelerate in a fast way ");
  }

  @Override
  public void land() {
    System.out.println("Smootely");
  }

  @Override
  public void fly() {
    System.out.println("Fast");
  }
  /*Create a Flyable interface
it should have land, fly and takeOff methods (TakeOff in C#)
Create an abstract Vehicle class
it should have at least 3 fields
Extend Helicopter class from Vehicle
implement your Flyable interface
Extend Bird from your abstract Animal class (zoo exercise)
implement yourˇFlyable interface*/


}
