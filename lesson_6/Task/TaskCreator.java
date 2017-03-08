/**
* <h1>TaskCreator/h1>
* <p>This class prompts the user into creating a new Task. If the user elects to create a new class, an instance of the class oject is
* created and saved to an ArrayList of tasks. Once the end user is finished creating tasks, they are given the opttion of displaying all tasks
* in the ArrayList of tasks. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-08
*/
import java.util.*;


public class TaskCreator{
  Scanner i = new Scanner(System.in);
  char greetingResponse;
  char endCreateResponse;
  String greet = "Welcome to the task creator. Would you like to create a new task?" + '\n'+"[y/n]";
  int taskID;
  String taskTitle;
  String taskTime;
  double taskPrice;
  int objectsInArray = 0;
  ArrayList<Task> taskArrayList = new ArrayList<Task>();

  public void greeting(){
    System.out.println(greet);
    greetingResponse = i.next().charAt(0);
    if (greetingResponse == 'y' || greetingResponse == 'Y' ){
      createTask();
    }else if (greetingResponse == 'n' || greetingResponse == 'N'){
      endCreate();
    }else{
      System.out.println("Improper input. please try again"+'\n');
      greeting();
    }
  }

  public void createTask(){
    // System.out.println("Called createTask()");
    System.out.println('\n'+"The following prompts will guide you in creating a new task."+'\n'+"Please give your task a 3 digit ID number." + '\n'+"....Example: 321");
    taskID = i.nextInt();
    i.nextLine();
    System.out.println('\n'+"Please assign a title to your new task"+ '\n'+ "....Example: My Title");
    taskTitle = i.nextLine();
    System.out.println('\n' + "Please assign time to your new task"+'\n'+"....Example: 1:45");
    taskTime = i.nextLine();
    System.out.println("Please assign a price "+'\n'+"....Example: 21.95");
    taskPrice = i.nextDouble();
    System.out.println('\n'+"Created new task."+'\n'+"===================="+'\n'+"Task ID: "+this.taskID+'\n'+"Task Title: "+this.taskTitle+'\n'+"Task Time: " + this.taskTime+'\n'+"TaskPrice: "+this.taskPrice+'\n');
    Task newTask = new Task(this.taskID, this.taskTitle, this.taskTime, this.taskPrice);
    taskArrayList.add(newTask);
    // System.out.println(newTask);
    greeting();
  }

  public void endCreate(){
    System.out.println("Thank you foor using the Task Creator. Would you like to display all tasks?" + '\n'+ "[y/n]");
    endCreateResponse = i.next().charAt(0);
    if (endCreateResponse == 'y' || endCreateResponse == 'Y' ){
      displayTasks();
    }else if (endCreateResponse == 'n' || endCreateResponse == 'N' ){
      quitProgram();
    }
    else{
      System.out.println("Improper input. please try again"+'\n');
      endCreate();
    }
  }


  public void quitProgram(){
    System.out.println("Goodbye");
  }
  public void displayTasks(){
    // System.out.println("called displayTasks()");
    for(Task temp : taskArrayList){
      System.out.println(temp);
    }
  }

  public static void main(String[] args) {
    TaskCreator TC = new TaskCreator();
    TC.greeting();
  }
}
