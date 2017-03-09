import java.nio.file.*;
import java.io.*;
import java.util.*;

public class EmployeeScheduler{
  ArrayList<String> employees = new ArrayList<String>();
  ArrayList<String[]> employeesArraylist = new ArrayList<String[]>();
  int employeeCount=0;
  String employeeHeader = "FIRST NAME | LAST NAME | SKILL | WAGE | ID NUMBER"+'\n'+"=======================================";
  int fortyHours = 40;
  //initialize array of Employees
  public void init(){
    System.out.println("called init");
    Path file = Paths.get("./employees.txt");
    InputStream input = null;
    try{
      input = Files.newInputStream(file);
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      String s = null;
      s = reader.readLine();
      do{
        employees.add(s);
        // employeeCount++;
      }while((s = reader.readLine()) != null);
      reader.close();
      // System.out.println(employees);
    }catch(IOException e){
      System.out.println(e);
    }
  }
  //Display list of all employees
  public void displayAll(){
    // System.out.println("called listAllEmployees");
    System.out.println(employeeHeader);
    for(String i:employees){
      employeeCount++;
      System.out.println(employeeCount+": "+i);
    }
    System.out.println("=======================================");
  }
  // This method will iterate through the arraylist of employees and ask how many hours to schedule the emplyee each day.
  public void createObjects(){
    // System.out.println("called scheduler");
    for(String i:employees){
      int counter = 0;
      String[] words = i.split(" ");
      String fn = words[0];
      String ln = words[1];
      String sk = words[2];
      Double wg = Double.parseDouble(words[3]);
      Integer id = Integer.parseInt(words[4]);

      Employee newEmployee = new Employee(fn, ln, sk, wg, id);
      employeesArraylist.add(new String[counter]);
      counter++;
    }
  }
  public void promptForEach(){
    System.out.println();
  }


  public static void main(String[] args) {
    EmployeeScheduler employeeSchedule = new EmployeeScheduler();
    employeeSchedule.init();
    employeeSchedule.displayAll();
    employeeSchedule.createObjects();
    employeeSchedule.promptForEach();
    for(String n:employeeSchedule.employees){
      System.out.println("Hello");
      // Promptfor Each employee about eery day of the week.
    }
  }
}
