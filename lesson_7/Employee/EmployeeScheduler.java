import java.nio.file.*;
import java.io.*;
import java.util.*;

public class EmployeeScheduler{


  ArrayList<String> employees = new ArrayList<String>();
  ArrayList<Employee> employeesArraylist = new ArrayList<Employee>();
  ArrayList<String> detailedLog = new ArrayList<String>();
  ArrayList<String> log = new ArrayList<String>();
  String employeeHeader = "FIRST NAME | LAST NAME | SKILL | WAGE | ID NUMBER"+'\n'+"=======================================";
  int employeeCount=0;
  int fortyHours = 40;
  Scanner input = new Scanner(System.in);
  //initialize array of Employees
  public void init(){
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
    System.out.println("======================================="+"\n ---- Let's begin our scheduling.");
  }

  public void createObjects(){
    for(String i:employees){
      int counter = 0;
      String[] words = i.split(" ");
      String fn = words[0];
      String ln = words[1];
      String sk = words[2];
      Double wg = Double.parseDouble(words[3]);
      Integer id = Integer.parseInt(words[4]);

      Employee newEmployee = new Employee(fn, ln, sk, wg, id);
      employeesArraylist.add(newEmployee);
      // System.out.println(employeesArraylist.get(counter));
      counter = counter + 1;
    }
  }

  public void promptForEach(){
    double mondayHours;
    double tuesdayHours;
    double wednesdayHours;
    double thursdayHours;
    double fridayHours;
    String question = "How many hour would you like to schedule ";
    // employeesArraylistSize =
    for(int i = 0; i < employeesArraylist.size(); i++){
      String tempOutput;
      double hoursLeftToSchedule = 40.00;
      double hoursScheduled = 0;
      double overtimeHours;
      Employee tempEmp = employeesArraylist.get(i);
      String tempName = tempEmp.getFirstName() + " " + tempEmp.getLastName();

      //Monday Hours
      System.out.println(question + tempName + " on Monday");
      mondayHours = input.nextDouble();
      hoursLeftToSchedule = hoursLeftToSchedule - mondayHours;
      hoursScheduled = hoursScheduled + mondayHours;
      tempOutput = tempName+ " is scheduled for "+ mondayHours+ " hours on Monday.";
      System.out.println(tempName+ " has "+hoursLeftToSchedule+ " hours left to schedule\n");
      System.out.println(tempOutput);
      detailedLog.add(tempOutput);

      // Tuesday
      System.out.println(question + tempName + " on Tuesday");
      tuesdayHours = input.nextDouble();
      hoursLeftToSchedule = hoursLeftToSchedule - tuesdayHours;
      hoursScheduled = hoursScheduled + tuesdayHours;
      tempOutput = tempName+ " is scheduled for "+ tuesdayHours+ " hours on Tuesday.";
      System.out.println(tempName+ " has "+hoursLeftToSchedule+ " hours left to schedule\n");
      System.out.println(tempOutput);
      detailedLog.add(tempOutput);

      //Wednesday
      System.out.println(question + tempName + " on Wednesday");
      wednesdayHours = input.nextDouble();
      hoursLeftToSchedule = hoursLeftToSchedule - wednesdayHours;
      hoursScheduled = hoursScheduled + wednesdayHours;
      tempOutput = tempName+ " is scheduled for "+ wednesdayHours+ " hours on Wednesday.";
      System.out.println(tempName+ " has "+hoursLeftToSchedule+ " hours left to schedule\n");
      System.out.println(tempOutput);
      detailedLog.add(tempOutput);

      // Thursday
      System.out.println(question + tempName + " on Thursday");
      thursdayHours = input.nextDouble();
      hoursLeftToSchedule = hoursLeftToSchedule - thursdayHours;
      hoursScheduled = hoursScheduled + thursdayHours;
      tempOutput = tempName+ " is scheduled for "+ thursdayHours+ " hours on Thursday";
      System.out.println(tempName+ " has "+hoursLeftToSchedule+ " hours left to schedule\n");
      System.out.println(tempOutput);
      detailedLog.add(tempOutput);

      // Friday
      System.out.println(question + tempName + " on Friday");
      fridayHours = input.nextDouble();
      hoursLeftToSchedule = hoursLeftToSchedule - fridayHours;
      hoursScheduled = hoursScheduled + fridayHours;
      tempOutput = tempName+ " is scheduled for "+ fridayHours+ " hours on Friday.";
      System.out.println(tempName+ " has "+hoursLeftToSchedule+ " hours left to schedule\n");
      System.out.println(tempOutput);
      detailedLog.add(tempOutput);

      overtimeHours = hoursScheduled - 40;

      if(hoursScheduled > 40){
        String finTempOutput = tempName+ " is scheduled for a total of " + hoursScheduled + " hours, including "+ overtimeHours+ " hours of overtime.";
        System.out.println(finTempOutput);
        log.add(finTempOutput);
      }else{
        String finTempOutput = tempName+ " is scheduled for a total of " + hoursScheduled + " hours";
        System.out.println(finTempOutput);
        log.add(finTempOutput);
      }
      }
    }

    public void finalPrompt(){
      System.out.println("\nWould you like to view the detailed or general scheduling log?\nPress 1 for detailed log\nPress 2 for general log\nPress 3 to exit program");
      char logChoice = input.next().charAt(0);
      if(logChoice == '1'){
        for(String i:detailedLog){
          System.out.println(i);
        }
        finalPrompt();
      }else if(logChoice == '2'){
        for(String h:log){
          System.out.println(h);
        }
        finalPrompt();
      }else if(logChoice == '3'){
        exitProgram();
      }else{
        System.out.println("ERROR: Please select a proper option");
        finalPrompt();
      }
    }

    public void exitProgram(){
      System.out.print("Goodbye");
    }

  public static void main(String[] args) {
    EmployeeScheduler employeeSchedule = new EmployeeScheduler();
    employeeSchedule.init();
    employeeSchedule.displayAll();
    employeeSchedule.createObjects();
    employeeSchedule.promptForEach();
    employeeSchedule.finalPrompt();
  }
}
