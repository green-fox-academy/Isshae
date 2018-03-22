package garden;

public class Main {
  public static void main(String[] args) {
    Garden garden = new Garden();

    garden.plantList.add(new Tree("Green"));
    garden.plantList.add(new Tree("Silver"));
    garden.plantList.add(new Flower("Orange"));
    garden.plantList.add(new Flower("Blue"));

    garden.watering(40);
    garden.watering(70);


  }
}
