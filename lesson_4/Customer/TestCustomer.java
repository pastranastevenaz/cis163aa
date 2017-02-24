/**
* <h1>TestCustomer/h1>
* <p>This file creates a Customer object which calls the instance's pay method.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-15
*/
public class TestCustomer{
  public static void main(String[] args) {
    Customer Steven = new Customer("Steven", "Pastrana");
    Steven.pay();
  }
}
