/**
* <h1>Restaurant/h1>
* <p>This file has a Restaurant class. It has methods for ordering a salad or a sandwich. It has a method to present a bill. The main method first creates
* an instance of the Restaurant class. The main method then calls the startOrder() method, which starts the ordering process and tallies and keeps track of the state of the
* mealPrice variable as the order progresses. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-20
*/
import java.util.Scanner;
public class Restaurant{
  String mealSelection;
  String mealType;
  double mealPrice;
  boolean lettuce = false;
  boolean tomatoes = false;
  boolean cheese = false;

  Scanner roboServer = new Scanner(System.in);
  // Method called to finalize order and present bill.
  public void bill(){
    System.out.println("===========================");
    System.out.println("*  THANK YOU FOR VISITING "+'\n'+"*"+'\n'+"*");
    System.out.println("* You ordered a "+mealSelection+'\n'+"*"+'\n'+"*");
    System.out.println("---------------------------");
    System.out.println("* TOTAL: $"+ String.format("%.2f", mealPrice));
  }
  // Method called when ordering a salad
  public void salad(){
    System.out.println("Preparing salad");
    System.out.println("Would you like tomatoes?"+'\n'+"[y/n]");
    char _tomatoChoice = roboServer.next().charAt(0);
    if (_tomatoChoice == 'y'){
      tomatoes = true;
      mealPrice = mealPrice + 0.50;
      System.out.println("Adding tomatoes");
    }
    else{
      System.out.println("No tomatoes");
    }

    System.out.println("Would you like cheese?"+'\n'+"[y/n]");
    char _cheeseChoice = roboServer.next().charAt(0);
    if (_cheeseChoice == 'y'){
      cheese = true;
      mealPrice = mealPrice + 0.50;
      System.out.println("Adding cheese");
    }
    else{
      System.out.println("No cheese");
    }
  }
  // Method called when ordering a sandwich
  public void sandwich(){
      System.out.println('\n'+"Preparing sandwich");
      System.out.println("Would you like lettuce?"+'\n'+"[y/n]");
      char lettuceChoice = roboServer.next().charAt(0);
      if (lettuceChoice == 'y'){
        lettuce = true;
        mealPrice = mealPrice + 1.00;
        System.out.println("Adding Lettuce");
      }
      else{
        System.out.println("No lettuce");
      }
      System.out.print("Would you like Tomatoes?"+'\n'+"[y/n]");
      char tomatoChoice = roboServer.next().charAt(0);
      if(tomatoChoice == 'y'){
        tomatoes = true;
        mealPrice = mealPrice + 1.00;
        System.out.println("Adding tomatoes");
      }
      else{
        System.out.println("No tomatoes");
      }

      System.out.println("Would you like cheese?"+'\n'+"[y/n]");
      char cheeseChoice = roboServer.next().charAt(0);
      if(cheeseChoice == 'y'){
        cheese = true;
        mealPrice = mealPrice + 1.00;
        System.out.println("Adding cheese");
      }
      else{
        System.out.println("No cheese");
      }
    }
  public void startOrder(){
    System.out.println("Hello, please select one.");
    System.out.println("Salad"+'\n'+"Sandwich");
    mealType = roboServer.nextLine();
    switch(mealType)
    {
      case "Salad":
      case "salad":
      case "SALAD":
        mealSelection = "Salad";
        mealPrice = 8.00;
        salad();
        break;
      case "Sandwich":
      case "sandwich":
      case "SANDWICH":
        mealSelection = "Sandwich";
        mealPrice = 7.00;
        sandwich();
        break;
      default:
        System.out.println('\n'+":-("+'\n'+"Aw, Snap! Something went wrong while selecting a meal! Retry or skip this meal."+'\n');
        startOrder();
    }
  }
  public static void main(String[] args) {
    Restaurant myRestaurant = new Restaurant();
    myRestaurant.startOrder();
    myRestaurant.bill();
  }
}
