import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class homeWork {
  public static void main(String[] args) {
    ArrayList<Map<String, String >> trees = new ArrayList<Map<String, String>>();

    Map<String, String> row0 = new HashMap<String, String>();
    row0.put("type", "Oak");
    row0.put("leaf color", "Green");
    row0.put("age", "2");
    row0.put("sex","male");
    trees.add( row0 );

    Map<String, String> row1 = new HashMap<String, String>();
    row1.put("type", "birch");
    row1.put("leaf color", "blue");
    row1.put("age", "5");
    row1.put("sex","male");
    trees.add( row1 );

    Map<String, String> row2 = new HashMap<String, String>();
    row2.put("type", "poplar");
    row2.put("leaf color", "silver");
    row2.put("age", "4");
    row2.put("sex","female");
    trees.add( row2 );

    Map<String, String> row3 = new HashMap<String, String>();
    row3.put("type", "pine");
    row3.put("leaf color", "black");
    row3.put("age", "10");
    row3.put("sex","female");
    trees.add( row3 );

    Map<String, String> row4 = new HashMap<String, String>();
    row4.put("type", "willow");
    row4.put("leaf color", "yellow");
    row4.put("age", "1");
    row4.put("sex","female");
    trees.add( row4 );

    for (int i = 0; i <trees.size() ; i++) {
      System.out.println(trees.get(i));
    }

  }
}
