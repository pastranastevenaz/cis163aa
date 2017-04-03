/**
* <h1>Die</h1>
* <p>The Die class is the template for the Die object. It declares it's variables, and constructor.
* The constructor uses the built in Math.random() method to set the dieNumber variable to a
* random number between 1 and 6.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-04-03
*/
public class Die{
  int dieNumber;
  final int HIGHEST_VALUE = 6;
  final int LOWEST_VALUE = 1;
  public int getDieNumber(){
    return this.dieNumber;
  }

  public Die(){
    int randomVal = ((int)(Math.random()*100)%HIGHEST_VALUE+LOWEST_VALUE);
    dieNumber = randomVal;
  }
}
