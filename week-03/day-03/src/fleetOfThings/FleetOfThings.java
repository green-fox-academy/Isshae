package fleetOfThings;

public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Thing getMilk = new Thing("Get milk");
    Thing remove = new Thing("Remove the obstacles");
    Thing standUp = new Thing("Stand up", true);
    Thing eatLunch = new Thing("Eat lunch");
    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    eatLunch.complete();

    fleet.add(getMilk);
    fleet.add(remove);
    fleet.add(standUp);
    fleet.add(eatLunch);

    System.out.println(fleet);
  }
}
