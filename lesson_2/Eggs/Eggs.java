import javax.swing.JOptionPane;
/**
* <h1>Eggs</h1>
* <p>This POS program prompts the user for the number of eggs being purchased. It will then
* calculate and display the amount owed with a breakdown of charges
* a carton of a dozen eggs sells for $3.25. A Loose egg sells for $0.45. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-10
*/
public class Eggs {
  public static void main(String[] args) {
    final double CARTON_PRICE = 3.25;
    final double SINGLE_PRICE = 0.45;
    String eggsInput = JOptionPane.showInputDialog(null, "How many eggs are you requesting?");
    int eggsPurchased = Integer.parseInt(eggsInput);
    int eggCartonsSold = eggsPurchased/12;
    int eggSinglesSold = eggsPurchased%12;
    double cartonSubtotal = CARTON_PRICE * eggCartonsSold;
    double singleSubtotal = SINGLE_PRICE * eggSinglesSold;
    double purchaseTotal = cartonSubtotal+singleSubtotal;
    JOptionPane.showMessageDialog(null, "You ordered "+eggsPurchased+" eggs. That's "+eggCartonsSold+" dozen at $"
                                  +CARTON_PRICE+" per dozen, and "+eggSinglesSold+" single eggs at $"+SINGLE_PRICE
                                  +" per egg. Your total is $"+purchaseTotal+"."
                                  );
  }
}
