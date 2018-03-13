package fishTank;

public abstract class Fish {
  String name;
  int weight;
  String color;

  public Fish(String name, int weight, String color) {
    this.name = name;
    this.weight = weight;
    this.color = color;
  }

  public abstract void feedFish();

  public abstract String fishStatus();
}