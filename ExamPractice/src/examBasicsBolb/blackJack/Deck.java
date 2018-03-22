package examBasicsBolb.blackJack;

import java.util.ArrayList;

public class Deck {
  private int deckSize;
  private ArrayList<Card> cardDeck;
  private int clubsCounter = 0;
  private int diamondsCounter = 0;
  private int heartsCounter = 0;
  private int spadesCounter = 0;

  public Deck(int deckSize) {
    this.deckSize = deckSize;
    this.cardDeck = new ArrayList<>();
    for (int i = 0; i < deckSize; i++) {
      cardDeck.add(new Card());
      checkCardTypePositiveCount(i);
      if (diamondsCounter > (deckSize / 4)) {
        cardDeck.remove(i);
        diamondsCounter--;
        i--;
      } else if (heartsCounter > (deckSize / 4)) {
        cardDeck.remove(i);
        heartsCounter--;
        i--;
      } else if (spadesCounter > (deckSize / 4)) {
        cardDeck.remove(i);
        spadesCounter--;
        i--;
      } else if (clubsCounter > (deckSize / 4)) {
        cardDeck.remove(i);
        clubsCounter--;
        i--;
      }
    }
  }

  public Card draw() {
    Card card = cardDeck.get(cardDeck.size() - 1);
    cardDeck.remove(cardDeck.size() - 1);
    checkCardTypeNegativeCount(card);
    return card;
  }

  public int checkCardTypePositiveCount(int i) {
    switch (cardDeck.get(i).getType()) {
      case "Hearts":
        return heartsCounter++;
      case "Diamonds":
        return diamondsCounter++;
      case "Spades":
        return spadesCounter++;
      default:
        return clubsCounter++;
    }
  }

  public int checkCardTypeNegativeCount(Card card) {
    switch (card.getType()) {
      case "Hearts":
        return heartsCounter--;
      case "Diamonds":
        return diamondsCounter--;
      case "Spades":
        return spadesCounter--;
      default:
        return clubsCounter--;
    }
  }

  @Override
  public String toString() {

    return cardDeck.size() + " - " + clubsCounter + " Clubs, " + diamondsCounter + " Diamonds, " +
            spadesCounter + " Spades, " + heartsCounter + " Hearths,";
  }
}
