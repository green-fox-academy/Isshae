package animals;

public class Mammal extends Animal {
  public Mammal(String name, int age, int weight) {
    super(name, age, weight);
  }

  @Override
  public String breed() {
    return "give birth";
  }
}
