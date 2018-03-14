package fishTank;

import java.util.stream.Stream;

public class Koi extends Fish {
// - Koi, gains 2 gramms when feeded.
  // Each fish has a name, weight, color and has a status and feed method.

  public Koi(String name, int weight, String color) {
    super(name, weight, color);
  }

  @Override
  public void feedFish() {
    setWeight(getWeight() + 2);
  }

  @Override
  public String fishStatus() {
    return this.name + ", Weight: " + getWeight() + ", Color: " + this.color;
  }
}
