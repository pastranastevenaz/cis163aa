import java.util.*;
import java.io.*;
import java.nio.file.*;

public class StudentSearcher{
  ArrayList<String> students = new ArrayList<String>();
  Scanner input = new Scanner(System.in);

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

  public static void main(String[] args) {
    StudentSearcher searcher = new StudentSearcher();
    searcher.init();
    searcher.printStudents();
  }
}
