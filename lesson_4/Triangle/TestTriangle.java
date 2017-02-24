/**
* <h1>TestTriangle/h1>
* <p>This file creates a Triangle object. It passes two integers as the constructors parameters, then calls
* the instance's printC method, which prints the length of the calculated hypotenuse to the terminal. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-15
*/
public class TestTriangle{
  public static void main(String[] args) {
    Triangle trilateral = new Triangle(3,4);
    trilateral.printC();
  }
}
