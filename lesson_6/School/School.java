/**
* <h1>School/h1>
* <p>This class will initialize and populate an Arraylist of students, using the student.txt file stored in the same directory
*  It will prompt the end user to enter a student ID to search for a matching ID in the ArrayList. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-08
*/

import java.nio.file.*;
import java.io.*;
import java.util.*;


public class School{
    static ArrayList<String> studentArrayList = new ArrayList<String>();
    static int studentNumber;
    static int arrayLen = studentArrayList.size();
    Scanner scanner = new Scanner(System.in);

    public void prompt(){
      System.out.println("Enter a Student id number for search or enter 999 to exit program");
      studentNumber = scanner.nextInt();
      if (studentNumber == 999){
        exitProgram();
      }else if (studentNumber < arrayLen+1 && studentNumber > 0){
        System.out.println("Student found");
        findStudent(studentNumber);
        prompt();
      }else{
        System.out.println('\n'+"That index does not exist... Please try again."+'\n');
        prompt();
      }
    }

    public void exitProgram(){
      System.out.println("Goodbye");
    }

    public void findStudent(int searchNumber){
      int searchNum = searchNumber - 1;
        String choice = studentArrayList.get(searchNum);
        System.out.println(choice);
      }


    public void createStudentArray(){
      // Assign the File to a variable
      Path file = Paths.get("./student.txt");
      InputStream input = null;
      // Populate the ArrayList from the text file
      try
      {
        input = Files.newInputStream(file);
        BufferedReader reader = new
          BufferedReader(new InputStreamReader(input));
        String s = null;
        s = reader.readLine();
          do{
            studentArrayList.add(s);
            arrayLen ++;
          }while
          ((s = reader.readLine()) != null);
      reader.close();
      System.out.println(studentArrayList);
      }catch (IOException e)
      {
        System.out.println(e);
      }
    }

    public static void main(String[] args){
      School schoolInstance = new School();
      schoolInstance.createStudentArray();
      schoolInstance.prompt();
    }

}
