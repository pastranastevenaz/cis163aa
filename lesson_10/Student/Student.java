/**
* <h1>Student/h1>
* <p>This is the class template for the student. It contains the variables and mutators of the class.
* It is a copy of the student class from a prior assignment with a few modifications. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-29
*/
public class Student{
  @Override
  public String toString(){
    return(this.name+" | "+this.studentID+" | "+this.GPA);
  }
  private String name;
  private int studentID;
  private double GPA;

  public Student(String a, int b, double c){
    this.name = a;
    this.studentID = b;
    this.GPA = c;
  }

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
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
