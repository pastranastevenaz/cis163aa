/**
* <h1>Test Lease</h1>
* <p>This test file creates 4 Lease objects. It then calls the getData method on the first three which prompts the user to enter
* the instance's values. It then callls the showValues method on the firsts instance, followed by a call to the first instance's
* addPetFee method. Lastly, the file then calls the showValues method on all four instances, showing the values entered by 
* the user, or the default values set by the constructor.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-14
*/
public class TestLease {

  public static void main(String[] args) {
    Lease leaseOne = new Lease();
    Lease leaseTwo = new Lease();
    Lease leaseThree = new Lease();
    Lease leaseFour = new Lease();

    leaseOne.getData();
    leaseTwo.getData();
    leaseThree.getData();

    leaseOne.showValues();
    leaseOne.addPetFee();
    leaseOne.showValues();

    leaseTwo.showValues();

    leaseThree.showValues();

    leaseFour.showValues();

  }
}
