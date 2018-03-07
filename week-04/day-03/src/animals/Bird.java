package animals;

import flyable.Flyable;

public class Bird extends Animal implements Flyable{

  public Bird(String name, int age, int weight) {
    super(name, age, weight);
  }

  @Override
  public String breed() {
    return "eggs";
  }

  @Override
  public void land() {
    System.out.println("Smootely");
  }

  @Override
  public void fly() {
    System.out.println("Without sound");
  }
}
