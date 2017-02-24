/**
* <h1>Customer/h1>
* <p>This file holds the class file for the Customer template. It will be used by the TestCustomer file.
* It has one nested static class with one static method. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-15
*/

public class Customer{
  private String name;
  private String lastName;

  public Customer(String n, String ln){
    this.name = n;
    this.lastName = ln;
  }
  public void pay(){
    CreditCard.pay();
  }

  public void setName(String customerName){
    name = customerName;
  }
  public void getName(){
    System.out.println(name);
  }
  public void setLastName(String customerLastName){
    lastName = customerLastName;
  }
  public void getLastName(){
    System.out.println(lastName);
  }
  public static class CreditCard{
    public static void pay(){
      System.out.println("Paid");
    }
  }
}
