/**
* <h1>Student/h1>
* <p>This file is a class file for the Student template. It will be used by the ShowStudent and ShowStudent2 files.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-14
*/
public class Student {
  private int idNum;
  private int creditHoursEarned;
  private int pointsEarned;
  private double gpa;

  public Student(){
    idNum = 9999;
    creditHoursEarned = 3;
    pointsEarned = 12;
  }

  public void setIdNum(int id){
    idNum = id;
  }
  public int getIdNum(){
    return idNum;
  }
  public void setCreditHoursEarned(int credits){
    creditHoursEarned = credits;
  }
  public int getCreditHoursEarned(){
    return creditHoursEarned;
  }
  public void setPointsEarned(int points){
    pointsEarned = points;
  }
  public int getPointsEarned(){
    return pointsEarned;
  }
  public double getGpa(){
    gpa = (double) pointsEarned/(double) creditHoursEarned;
    return gpa;
  }
}
