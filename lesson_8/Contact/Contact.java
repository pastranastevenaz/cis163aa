public class Contact{
  private String name;
  private String number;
  private String address;

  // CONSIDER OVERIDING THE TO STRING METHOD

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

  public Contact(String instanceName, String instanceNumber, String instanceAddress){
    this.name = instanceName;
    this.number = instanceNumber;
    this.address = instanceAddress;
  }

}
