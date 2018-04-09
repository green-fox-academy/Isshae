package poker;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Poker {
  WhiteHand whiteHand = new WhiteHand();

  int j = 11;
  int q = 12;
  int k = 13;
  int a = 14;



  public String evaluateWinner(List<Card> whiteList, List<Card> blackList) {
    Collections.reverse(whiteList);
    Collections.reverse(blackList);
    for (int i = 0; i < whiteList.size(); i++) {
      if (whiteList.get(i).getValue() > blackList.get(i).getValue()) {
        return "White wins! " + cardValueConverter(whiteList.get(i));
      } else if (whiteList.get(i).getValue() < blackList.get(i).getValue()) {
        return "Black wins! " + cardValueConverter(blackList.get(i));
      }
    }
    return "Tie";
  }
  public String cardValueConverter(Card card){
    if (card.getValue() == 11){
      return "Jack";
    }else if (card.getValue() == 12){
      return "Queen";
    }else if (card.getValue() == 13){
      return "King";
    }else if (card.getValue() == 14){
      return "Ace";
    }
    return card.getValue() + "";
  }
}
