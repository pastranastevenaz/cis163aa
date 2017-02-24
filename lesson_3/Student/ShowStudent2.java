/**
* <h1>ShowStudent2</h1>
* <p>This file creates a Student object. Unlike the ShowStudent file, it does not override the default constructor's values.
* It calls the getter methods to print the instance's values to the terminal.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-14
*/
public class ShowStudent2{
  public static void main(String[] args) {
    Student myDefaultStudent = new Student();

    System.out.println("Information for Student: "+myDefaultStudent.getIdNum()+".");
    System.out.println("============================="+'\n'+"Credit Hours Earned: "+myDefaultStudent.getCreditHoursEarned()+'\n'+"Points Earned: "+myDefaultStudent.getPointsEarned());

    System.out.println("============================="+'\n'+"GPA: "+myDefaultStudent.getGpa());
  }
}
