/**
* <h1>Contact/h1>
* <p>This class is the template for the Contact object. It decalres the private instance variables
* and the public mutators, as well as the constructor. There is also an Override of the to string method. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-18
*/
public class Contact{
  private int index;
  private String name;
  private String number;
  private String address;


  @Override
  public String toString() {
     return (" Index: "+this.getIndex()+
             " Name: "+this.getName()+
             " Number: "+ this.getNumber() +
             " Address: "+ this.getAddress());
           }
  public void setIndex(int i){
      this.index = i;
  }
  public int getIndex(){
    return this.index;
  }
  public void setName(String n){
    this.name = n;
  }
  public String getName(){
    return this.name;
  }
  public void setNumber(String num){
    this.number = num;
  }
  public String getNumber(){
    return this.number;
  }
  public void setAddress(String add){
    this.address = add;
  }
  public String getAddress(){
    return this.address;
  }

  public Contact(int instanceIndex, String instanceName, String instanceNumber, String instanceAddress){
    this.index = instanceIndex;
    this.name = instanceName;
    this.number = instanceNumber;
    this.address = instanceAddress;
  }

}
