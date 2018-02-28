package fleetOfThings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Fleet {
  /*You have the Thing class
You have the Fleet class
You have the FleetOfThings class with a main method
Download those, use those
In the main method create a fleet
Achieve this output:
1. [ ] Get milk
2. [ ] Remove the obstacles
3. [x] Stand up
4. [x] Eat lunch*/
  private ArrayList<Thing> things;




  public Fleet() {
    things = new ArrayList<>();
  }

  public void add(Thing thing) {
    things.add(thing);
  }

  @Override
  public String toString() {
    String result = "";
    for(int i = 0; i < things.size(); i++) {
      result += (i+1) + ". " + things.get(i) + "\n";
    }
    return result;
  }

}
