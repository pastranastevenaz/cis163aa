import java.util.Scanner;
/**
* <h1>Inches to Feet Interactive</h1>
* <p>This program converts inches inputed by the end user, to feet and outputs the total inches in feet and inches to terminal</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-10
*/
public class InchesToFeetInteractive {
  public static void main(String[] args) {
    Scanner in = new  Scanner(System.in);
    System.out.println("Enter a length in inches. ");
    int inputInches = in.nextInt();
    in.nextLine();
    int feet = inputInches/12;
    int inches = inputInches%12;
    if (inches > 0){
      System.out.println("You entered " + feet + " feet and " + inches + " inches.");
    }else{
      System.out.println(feet + " feet.");
    }
  }
}
