/**
* <h1>Car/h1>
* <p>This file is a class file for the Car template. It will be used by the and TestCar file.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-15
*/

public class Car {
  private String make;
  private int speed;
  private static int DEFAULT_SPEED = 50;

  Car(String carMake){
    this.make = carMake;
    this.speed = DEFAULT_SPEED;
  }
  Car(){
    this.make = "Chevrolet";
    this.speed = DEFAULT_SPEED;
  }

  public void setMake(String m){
    make = m;
  }
  public String getMake(){
    return make;
  }

  public int speed(){
    return DEFAULT_SPEED;
  }
  public void speed(int newSpeed){
    speed = newSpeed;
  }
  public int getSpeed(){
    return speed;
  }

}
