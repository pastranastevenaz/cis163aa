/**
* <h1>TestCar/h1>
* <p>This file creates a Car object. It then prints out the car make and default speed to terminal.</p>
* <p>After, it sets the new speed by calling the speed() method and passing the new speed as a parameter. </p>
* <p>Finally, it prints the make and new speed to terminal.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-15
*/

public class TestCar{
  public static void main(String[] args) {
    Car CarOne = new Car("Honda");
    System.out.println("The "+CarOne.getMake()+"'s default speed is "+CarOne.speed()+" MPH.");
    //Change the speed
    CarOne.speed(65);
    System.out.println("The "+CarOne.getMake()+"'s new speed is "+CarOne.getSpeed()+" MPH.");
  }
}
