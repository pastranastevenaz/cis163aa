/**
* <h1>Inches to Feet</h1>
* <p>This program converts inches to feet and outputs the total inches in feet and inches to terminal</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-09
*/
public class InchesToFeet {
  public static void main(String[] args) {
    int inputInches = 24;
    int feet = inputInches/12;
    int inches = inputInches%12;
    if (inches > 0){
      System.out.println(feet + " feet and " + inches + " inches.");
    }else{
      System.out.println(feet + " feet.");
    }
  }
}
