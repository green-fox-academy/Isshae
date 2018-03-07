package animals;

public class Reptile extends Animal {
  public Reptile(String name, int age, int weight) {
    super(name, age, weight);
  }

  @Override
  public String breed() {
    return "eggs";
  }
}
