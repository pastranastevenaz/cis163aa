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
