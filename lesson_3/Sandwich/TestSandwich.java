
/**
* <h1>Test Sandwich</h1>
* <p>This file creates a Sandwich object, calls its setter methods set the values,
*  then calls its getter methods in the print method call to print the order and price to the terminal. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-14
*/
public class TestSandwich{
  public static void main(String[] args) {
    Sandwich defaultSandwich = new Sandwich();
    Sandwich newSandwich = new Sandwich();
    newSandwich.setMainIngredient("tofu");
    newSandwich.setBreadType("wheat");
    newSandwich.setPrice(6.99);
    System.out.println("Default sandwich is: a "+defaultSandwich.getMainIngredient()+" on "+newSandwich.getBreadType()+" priced at "+defaultSandwich.getPrice()+'\n'+"=========================");
    System.out.println("You ordered a "+newSandwich.getMainIngredient()+" on "+newSandwich.getBreadType()+" sandwich, priced at $"+newSandwich.getPrice()+".");
  }
}
