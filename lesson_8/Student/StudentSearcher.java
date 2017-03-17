import java.util.*;
import java.io.*;
import java.nio.file.*;
/**
* <h1>StudentSearcher/h1>
* <p>This class will initialize and populate an Arraylist of students, using the studentlist.txt file stored in the same directory
*  It will prompt the end user to enter a student ID to search for a matching ID in the ArrayList. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-16
*/
public class StudentSearcher{
  ArrayList<String> students = new ArrayList<String>();
  Scanner i = new Scanner(System.in);
  static int numOfStudents = 0;
  int searchNum;

  public void init(){
    Path file = Paths.get("./studentlist.txt");
    InputStream input = null;
    try{
      input = Files.newInputStream(file);
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      String s = null;
      s = reader.readLine();
      do{
        students.add(s);
        numOfStudents++;
      }while((s = reader.readLine()) != null);
      reader.close();
    }catch(IOException e){
      System.out.println(e);
    }
  }

  public void printStudents(){
    for(String i:students){
      System.out.println(i);
    }
  }

  public void initializeSearch(){
    System.out.println("There are a total of " + numOfStudents+ " in the array. Please enter student id number for search \n --Example: 1 or 12");
    searchNum=i.nextInt();
    if (searchNum < 1){
      System.out.println("Invalid input");
      initializeSearch();
    }else if(searchNum > numOfStudents){
      System.out.println("Invalid input");
      initializeSearch();
    }else{
     findStudent(searchNum);
    }
  }

  public void findStudent(int sn){
    int s = sn - 1;
    String choice = students.get(s);
    System.out.println(choice);
    System.out.println("\nEnter q to quit program, or any other key to continue searching.");
    char continueChar=i.next().charAt(0);
    if (continueChar == 'q'){
      exitProg();
    }else{
      initializeSearch();
    }
  }


  public void exitProg(){
    System.out.println("Goodbye");
  }

  public static void main(String[] args) {
    StudentSearcher searcher = new StudentSearcher();
    searcher.init();
    searcher.printStudents();
    searcher.initializeSearch();
  }
}
