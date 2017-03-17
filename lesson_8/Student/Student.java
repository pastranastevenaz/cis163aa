/**
* <h1>Student/h1>
* <p>This is the class template for the student. It contains the variables and mutators of the class. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-16
*/
public class Student{
  private int studentID;
  private String firstName;
  private String lastName;
  private double GPA;

  public Student(int a, String b, String c, double d){
    this.studentID = a;
    this.firstName = b;
    this.lastName = c;
    this.GPA = d;
  }

  public void setFirstName(String first){
    this.firstName = first;
  }
  public String getFirstName(){
    return this.firstName;
  }
  public void setLastName(String last){
    this.lastName = last;
  }
  public String getLastName(){
    return this.lastName;
  }
  public void setGPA(double gpa){
    this.GPA = gpa;
  }
  public double getGPA(){
    return this.GPA;
  }
  public void setStudentID(int studentid){
    this.studentID = studentid;
  }
  public int getStudentID(){
    return this.studentID;
  }
}
