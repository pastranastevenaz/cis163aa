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

import java.nio.file.*;
import java.io.*;
public class School{
  public static void main(String[] args)
  {
    Path file = Paths.get("./student.txt");
    InputStream input = null;
    try
    {
      input = Files.newInputStream(file);
      BufferedReader reader = new
        BufferedReader(new InputStreamReader(input));
      String s = null;
      s = reader.readLine();
      System.out.println(s);
      input.close();
    }catch (IOException e)
    {
      System.out.println(e);
    }
  }
}
