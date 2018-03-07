package animals;

public class Bird extends Animal {

  public Bird(String name, int age, int weight) {
    super(name, age, weight);
  }

  @Override
  public String breed() {
    return "eggs";
  }
}
