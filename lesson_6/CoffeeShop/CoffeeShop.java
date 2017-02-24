import java.util.Scanner;

public class CoffeeShop{
  static double COFFEE_PRICE = 3.25;
  static double ESPRESSO_PRICE = 4.25;
  static double TEA_PRICE = 2.75;
  static double SUGAR_PRICE = 0.50;
  static double CREAMER_PRICE = 0.50;

  double runningTotal;
  boolean orderComplete = false;

  Scanner i = new Scanner(System.in);

  public void order(){
    do{
      System.out.println("What would you like to order?"+'\n'+"  -Please enter selection number.");
      System.out.println("1: Coffee $3.25"+'\n'+"2: Espresso $4.25"+'\n'+"3: Tea $2.75"+'\n'+">>");
      int orderSelection = i.nextInt();
      switch (orderSelection){
        case 1: runningTotal = runningTotal + COFFEE_PRICE;
        iceOptions();
        break;
        case 2: runningTotal = runningTotal + ESPRESSO_PRICE;
        caramelOptions();
        break;
        case 3: runningTotal = runningTotal + TEA_PRICE;
        teaOptions();
        break;
        default:
        System.out.println("Invalid option. Please try again.");
        order();
      }

    } while ( orderComplete == false);
    calcTotal();
  }
  // The following are all the optional add on methods.
  public void iceOptions(){
    System.out.println("Ordering coffee. Would you like ice for an additional $0.00?"+'\n'+"[y/n]");
    char iceChoice = i.next().charAt(0);
    if (iceChoice == 'y'){
      System.out.println("Ice added to drink");
      creamerOptions();
    }else if(iceChoice == 'n'){
      System.out.println("No ice selected");
      creamerOptions();
    }else{
      System.out.println("Invalid option. Please try again.");
      iceOptions();
    }
  }
  public void creamerOptions(){
    System.out.println("Would you like Cream for an additional $0.50?"+'\n'+"[y/n]");
    char creamChoice = i.next().charAt(0);
    if (creamChoice == 'y'){
      runningTotal = runningTotal + CREAMER_PRICE;
      System.out.println("Creamer added to drink.");
      sugarOptions();
    }else if (creamChoice == 'n'){
      System.out.println("No creamer added");
      sugarOptions();
    }else {
      System.out.println("Invalid option. Please try again.");
      creamerOptions();
    }
  }
  public void sugarOptions(){
    System.out.println("Would you like Sugar for an additional $0.50?"+'\n'+"[y/n]");
    char sugarChoice = i.next().charAt(0);
    if (sugarChoice == 'y'){
      runningTotal = runningTotal + SUGAR_PRICE;
      System.out.println("Sugar added to drink.");
      isDone();
    }else if (sugarChoice == 'n'){
      System.out.println("No sugar added");
      isDone();
    }else {
      System.out.println("Invalid option. Please try again.");
      sugarOptions();
    }
  }
  public void caramelOptions(){
    System.out.println("Would you like caramel sweetener for an additional $0.00?"+'\n'+"[y/n]");
    char sugarChoice = i.next().charAt(0);
    if (sugarChoice == 'y'){
      System.out.println("Caramel sweetener added to drink.");
      chocolateOptions();
    }else if (sugarChoice == 'n'){
      System.out.println("No carmel sweetener added");
      chocolateOptions();
    }else {
      System.out.println("Invalid option. Please try again.");
      caramelOptions();
    }
  }
  public void chocolateOptions(){

  }
  public void calcTotal(){
    System.out.println("Called calcTotal()");
  }

  // Tis method is called when an order is completed. It asks the user if they are finished ordering.
  public void isDone(){
    System.out.println('\n'+"Would you like something else?"+'\n'+"[y/n]");
    char orderStat = i.next().charAt(0);
    if (orderStat == 'y'){
      orderComplete = false;
    }else if(orderStat == 'n'){
      orderComplete = true;
    }else{
      System.out.println("Input error. Please try again");
      isDone();
    }
  }
  public static void main(String[] args) {
    CoffeeShop newOrder = new CoffeeShop();
    newOrder.order();
  }
}
