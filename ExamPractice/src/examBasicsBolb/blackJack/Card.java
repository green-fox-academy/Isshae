package examBasicsBolb.blackJack;

import java.util.Random;

public class Card {

  Random random = new Random();
  String[] randomCardType = new String[]{"Clubs", "Diamonds", "Hearts", "Spades"};
  String[] randomCardValue = new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
  private String value;
  private String type;

  public Card() {
    this.value = (randomCardValue[random.nextInt(randomCardValue.length)]);
    this.type = (randomCardType[random.nextInt(randomCardType.length)]);
  }

  @Override
  public String toString() {
    return this.value + " " + this.type;
  }

  public String getType() {
    return type;
  }
}
