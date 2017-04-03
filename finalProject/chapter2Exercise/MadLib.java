import javax.swing.JOptionPane;
/**
* <h1>MadLib</h1>
* <p>The MadLib class has two public methods. The play game method is called from the main method.
* It creates several JOptionPanes prompting the user for several words, which it will use to craft
* a sentence. After the sentence is displayed, the askToPlay method is called, which ask the player
* if they'd like to play once more. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-04-02
*/
public class MadLib{

  public void playGame(){
    String w1 = JOptionPane.showInputDialog("Enter an noun.");
    String w2 = JOptionPane.showInputDialog("Enter another noun.\nIdeally, something bigger than the first noun");
    String w3 = JOptionPane.showInputDialog("Enter another noun");
    String w4 = JOptionPane.showInputDialog("Enter a verb in the past tense");
    String w5 = JOptionPane.showInputDialog("Enter another noun");
    String w6 = JOptionPane.showInputDialog("Enter another past tense verb");
    String madLibSentence = "The itsy bitsy "+w1+" went up the "+w2+".\nDown came the "+w3+" and "+w4+ " the "+w1+ " out.\nOut came the "+w5+" and dried up all the "+w3+", so the itsy bitsy "+w1+ " "+w6+ " up the "+w2+ " again.";
    JOptionPane.showMessageDialog(null, madLibSentence);
    askToPlay();
  }
  public void askToPlay(){
    int selection;
    boolean isYes;
    selection = JOptionPane.showConfirmDialog(null, "Would you like to play again?");
    isYes = (selection == JOptionPane.YES_OPTION);
    if (isYes){
      playGame();
    }else{
      JOptionPane.showMessageDialog(null, "Thanks for playing.");
    }
  }

  public static void main(String[] args) {
    MadLib game = new MadLib();
    game.playGame();
  }
}
