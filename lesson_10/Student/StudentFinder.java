import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream.*;
/**
* <h1>Student/h1>
* <p>The StudentFinder class initiaizes by reading the student.txt file located in the same directory
* and popluating an Arraylist of Student objects, and ann ArrayList of the Strings of the date that
* make up the Student obects. The StudentFinder class then prompts the user for a letter to search
* and returns all instances where the Student name starts with that letter.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-30
*/
public class StudentFinder{
  ArrayList<String> stringAL = new ArrayList<String>();
  ArrayList<Student> studentAL = new ArrayList<Student>();
  Scanner in = new Scanner(System.in);
  String response;
  int count = 0;

  public void initalPromp(){
    System.out.println("Hello please enter the first letter of a student to search: \n>>");
    response = in.nextLine();
    findStudent(response);
  }

  public void initProgram(){
    Path file = Paths.get("./studentlist.txt");
    InputStream input = null;
    try{
      input = Files.newInputStream(file);
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      String s = null;
      s = reader.readLine();
      do{
        stringAL.add(s);
      }while((s = reader.readLine()) != null);
      reader.close();
    }catch(IOException e ){
      System.out.println(e);
    }
  }

  public void createStudent(){
    for(String s:stringAL){
      String words[] = s.split(" ");
      String tempName = words[0];
      int tempID = Integer.parseInt(words[1]);
      double tempGPA = Double.parseDouble(words[2]);
      Student newStudent = new Student(tempName,tempID,tempGPA);
      studentAL.add(newStudent);
      count++;
    }
  }

  public void displayAll(){
    for (Student stu:studentAL){
      System.out.println(stu);
    }
  }

  public void findStudent(String res){
    System.out.println("called findStudent()");
    String testResponse = res.toLowerCase();
    System.out.println(testResponse);
    ArrayList<String> names = new ArrayList<String>();
    for(String n:stringAL){
      if (n.substring(0,1).equals(response)){
        names.add(n);
      }
    }
    System.out.println("Last, First Name | ID | GPA");
    for (String item:names){
      System.out.println(item);
    }
  }

  public static void main(String[] args) {
    StudentFinder app = new StudentFinder();
    app.initProgram();
    app.createStudent();
    app.displayAll();
    app.initalPromp();
  }
}
