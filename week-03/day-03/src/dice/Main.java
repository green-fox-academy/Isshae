package dice;

public class Main {
  public static void main(String[] args) {
    /*You have a Dice class which has 6 dice
You can roll all of them with roll()
Check the current rolled numbers with getCurrent()
You can reroll with reroll()
Your task is to get where all dice is a 6*/
    Dice myDice = new Dice();

    myDice.roll();
    myDice.getCurrent();
    for (int i = 0; i <myDice.dices.length ; i++) {

      if (myDice.getCurrent(i) !=6){
        while(myDice.getCurrent(i) !=6){
          myDice.reroll(i);
        }

      }
      System.out.println(myDice.toString());
    }




  }
}
