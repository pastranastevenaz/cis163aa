/**
* <h1>Triangle/h1>
* <p>This file holds a class for the Triangle template. It will be used by the TestTriangle file.
* The constructor takes two parameters, which it uses to calculate the length of the hypotenuse.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-15
*/

public class Triangle{
  private double A;
  private double B;
  private double C;

  public Triangle (float _a, float _b){
    A=_a;
    B=_b;
    double tempC = (A*A)+(B*B);
    C = Math.sqrt(tempC);
  }

  public void printC(){
    System.out.println("C: "+C);

  }



}
