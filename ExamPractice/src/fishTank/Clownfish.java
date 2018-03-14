package fishTank;

public class Clownfish extends Fish {
  // - Clownfish, gains 1 gramm when feeded and has stripe color.
  String stripeColor;

  public Clownfish(String name, int weight, String color, String stripeColor) {
    super(name, weight, color);
    this.stripeColor = stripeColor;
  }

  @Override
  public void feedFish() {
    setWeight(getWeight() + 1);
  }

  @Override
  public String fishStatus() {
    return this.name + ", Weight: " + getWeight() + ", Color: " + this.color + " Stripe color: " + this.stripeColor;
  }
}
