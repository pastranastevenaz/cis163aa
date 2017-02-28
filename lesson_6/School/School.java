// Create an application entitled School.java. The class will prompt
// the user with the following options: load student list, find
// student, and exit. The load student list will call the StudentFileReader
// class provided and will read the student.txt provided. To run the
// StudentFileReader, you will need to provide the path to the student.txt.
// The find student option will search the list looking for the student
// based on a user input student ID. The loop will need to exit as soon
// as the student ID is found. The student name will be printed to the
// console. The School.java application will continue to accept user
// inputs until the user selects the exit option.

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class School{
  public static void main(String[] args) {
    School students = new School();
    StudentFileReader.readFile();

  }
  public static class StudentFileReader{
    public static void readFile(){
    try {
      File studentList = new File("./student.txt");

      Scanner studentScanner = new Scanner(studentList);
      String line = studentScanner.nextLine();
      System.out.println(line);

    } catch (FileNotFoundException e) {
     e.printStackTrace();
    }
  }
  }
}
