/**
* <h1>Employee/h1>
* <p>This is the class file for the Employee object. It contains the instance variables and their public mutators</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-09
*/
public class Employee{

  @Override
  public String toString() {
     return (" First Name:"+this.getFirstName()+
             " Last Name: "+ this.getLastName() +
             " Skill: "+ this.getSkill() +
             " Salary: " + this.getSalary()+
             " Employee ID:" + this.getEmployeeID());
           }

  private String firstName;
  private String lastName;
  private String skill;
  private double salary;
  private int employeeID;

  public Employee(String a, String b, String c, double d, int e){
    firstName = a;
    lastName = b;
    skill = c;
    salary = d;
    employeeID = e;
  }

  public void setFirstName(String f){
    this.firstName = f;
  }
  public String getFirstName(){
    return firstName;
  }
  public void setLastName(String l){
    this.lastName = l;
  }
  public String getLastName(){
    return lastName;
  }
  public void setSkill(String s){
    this.skill = s;
  }
  public String getSkill(){
    return skill;
  }
  public void setSalary(double _s){
    this.salary = _s;
  }
  public double getSalary(){
    return salary;
  }
  public void setEmployeeID(int i){
    this.employeeID = i;
  }
  public int getEmployeeID(){
    return employeeID;
  }
}
