/**
* <h1>ShowStudent</h1>
* <p>This file creates a Student object. It then callles its setter methods to override the instance's default values.
* Finally, it prints to the terminal, the instance's values using its getter methods.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-14
*/
public class ShowStudent{
  public static void main(String[] args) {
    Student myStudent = new Student();

    myStudent.setIdNum(1);
    myStudent.setCreditHoursEarned(3);
    myStudent.setPointsEarned(7);



    System.out.println("Information for Student: "+myStudent.getIdNum()+".");
    System.out.println("============================="+'\n'+"Credit Hours Earned: "+myStudent.getCreditHoursEarned()+'\n'+"Points Earned: "+myStudent.getPointsEarned());

    System.out.println("============================="+'\n'+"GPA: "+myStudent.getGpa());
  }
}
