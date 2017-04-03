import java.util.*;
/**
* <h1>DiceGame</h1>
* <p>The DiceGame class houses the main method of the application. It instantiates an instance of the DiceGame class,
* and than uses it to call it's public  roll() method. The roll() method instantiates 6 die
* for the user, and 6 die for the opponent, which it then stores in their respective ArrayLists.
* Finally, it prints the results of the roll to the console.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-04-03s
*/
public class DiceGame{
  ArrayList<Die> myDieArray = new ArrayList<Die>();
  ArrayList<Die> opponentDieArray = new ArrayList<Die>();


  public void roll(){
    Die die1 = new Die();
    Die die2 = new Die();
    Die die3 = new Die();
    Die die4 = new Die();
    Die die5 = new Die();
    myDieArray.add(die1);
    myDieArray.add(die2);
    myDieArray.add(die3);
    myDieArray.add(die4);
    myDieArray.add(die5);
    // int val1 = die1.getDieNumber();
    // int val2 = die2.getDieNumber();
    // int val3 = die3.getDieNumber();
    // int val4 = die4.getDieNumber();
    // int val5 = die5.getDieNumber();
    System.out.print("My Dice: ");
    for (Die d:myDieArray){
      System.out.print(d.getDieNumber()+", ");
    }
    System.out.println(" ");
    Die opponentDie1 = new Die();
    Die opponentDie2 = new Die();
    Die opponentDie3 = new Die();
    Die opponentDie4 = new Die();
    Die opponentDie5 = new Die();
    opponentDieArray.add(opponentDie1);
    opponentDieArray.add(opponentDie2);
    opponentDieArray.add(opponentDie3);
    opponentDieArray.add(opponentDie4);
    opponentDieArray.add(opponentDie5);
    // int opponentVal1 = opponentDie1.getDieNumber();
    // int opponentVal2 = opponentDie2.getDieNumber();
    // int opponentVal3 = opponentDie3.getDieNumber();
    // int opponentVal4 = opponentDie4.getDieNumber();
    // int opponentVal5 = opponentDie5.getDieNumber();
    System.out.print("Opponents Dice: ");
    for(Die od: opponentDieArray){
      System.out.print(od.getDieNumber()+", ");
    }
    System.out.println(" ");
  }
  public static void main(String[] args) {
    DiceGame game = new DiceGame();
    game.roll();
  }
}
