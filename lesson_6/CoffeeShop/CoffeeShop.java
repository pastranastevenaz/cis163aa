import java.util.Scanner;

public class CoffeeShop{
  static double COFFEE_PRICE = 3.25;
  static double ESPRESSO_PRICE = 4.25;
  static double TEA_PRICE = 2.75;
  static double SUGAR_PRICE = 0.50;
  static double CREAMER_PRICE = 0.50;
  static double DOUBLE_SHOT_PRICE = 1.25;

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
        System.out.println("Ordered a tea.");
        isDone();
        break;
        default:
        System.out.println("Invalid option. Please try again.");
        order();
      }

    } while ( orderComplete == false);
    calcTotal();
  }
  //  COFFEE OPTIONS ===================================//
  public void iceOptions(){
    System.out.println("Ordering coffee. Would you like ice for an additional $0.00?"+'\n'+"[y/n]");
    char iceChoice = i.next().charAt(0);
    while (iceChoice != 'y' && iceChoice != 'n'){
      System.out.println("Invalid option. Please try again.");
      iceOptions();
    }
    if (iceChoice == 'y'){
      System.out.println("Ice added to drink");
      creamerOptions();
    }else {
      System.out.println("No ice selected");
      creamerOptions();
    }
  }
  public void creamerOptions(){
    System.out.println("Would you like Cream for an additional $0.50?"+'\n'+"[y/n]");
    char creamChoice = i.next().charAt(0);
    while (creamChoice != 'y' && creamChoice != 'n'){
      System.out.println("Invalid option. Please try again.");
      creamerOptions();
    }
    if (creamChoice == 'y'){
      runningTotal = runningTotal + CREAMER_PRICE;
      System.out.println("Creamer added to drink");
      sugarOptions();
    }else {
      System.out.println("No creamer selected");
      sugarOptions();
    }
  }
  public void sugarOptions(){
    System.out.println("Would you like Sugar for an additional $0.50?"+'\n'+"[y/n]");
    char sugarChoice = i.next().charAt(0);
    while (sugarChoice != 'y' && sugarChoice != 'n'){
      System.out.println("Invalid option. Please try again.");
      sugarOptions();
    }
    if (sugarChoice == 'y'){
      runningTotal = runningTotal + SUGAR_PRICE;
      System.out.println("Sugar added to drink");
      isDone();
    }else {
      System.out.println("No sugar selected");
      isDone();
    }
  }
  // ESPRESSO OPTIONS ========================//
  public void caramelOptions(){
    System.out.println("Would you like caramel sweetener for an additional $0.00?"+'\n'+"[y/n]");
    char caramelChoice = i.next().charAt(0);
    while (caramelChoice != 'y' && caramelChoice != 'n'){
      System.out.println("Invalid option. Please try again.");
      caramelOptions();
    }
    if (caramelChoice == 'y'){
      System.out.println("Creamer added to drink");
      chocolateOptions();
    }else {
      System.out.println("No creamer selected");
      chocolateOptions();
    }
  }
  public void chocolateOptions(){
    System.out.println("Would you like chocolate for an additional $0.00?"+'\n'+"[y/n]");
    char chocolateChoice = i.next().charAt(0);
    while (chocolateChoice != 'y' && chocolateChoice != 'n'){
      System.out.println("Invalid option. Please try again.");
      chocolateOptions();
    }
    if (chocolateChoice == 'y'){
      System.out.println("Chocolate added to drink");
      doubleShotOptions();
    }else {
      System.out.println("No chocolate selected");
      doubleShotOptions();
    }
  }
  public void doubleShotOptions(){
    System.out.println("Would you like a double shot for an additional $1.25?"+'\n'+"[y/n]");
    char doubleShotChoice = i.next().charAt(0);
    while (doubleShotChoice != 'y' && doubleShotChoice != 'n'){
      System.out.println("Invalid option. Please try again.");
      doubleShotOptions();
    }
    if (doubleShotChoice == 'y'){
      runningTotal = runningTotal + DOUBLE_SHOT_PRICE;
      System.out.println("Double shot selected");
      isDone();
    }else {
      System.out.println("Single shot selected");
      isDone();
    }
  }
 // This method is called when the customer finalizes the order. It presents the total.
 // I would like to present a list of everything ordered, but am unaware of how to doo that without using
 // data structures, like arrays which we have not covered in class yet.
  public void calcTotal(){
    System.out.println("Thank you for visiting. You total is $"+ String.format("%.2f", runningTotal));
  }

  // This method is called when an order is completed. It asks the user if they are finished ordering.
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
