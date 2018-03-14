package fishTank;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Tang extends Fish {
  // - Tang, gains 1 gramms when feeded and can suffer short-term memory loss.
  boolean isShortTermMemoryLoss;

  public Tang(String name, int weight, String color, boolean isShortTermMemoryLoss) {
    super(name, weight, color);
    this.isShortTermMemoryLoss = isShortTermMemoryLoss;
  }

  @Override
  public void feedFish() {
   setWeight(getWeight() + 1);
  }

  @Override
  public String fishStatus() {
    return this.name + ", Weight: " + getWeight() + ", Color: " + this.color + " Short-term memory loss: " + isShortTermMemoryLoss;
  }
}
