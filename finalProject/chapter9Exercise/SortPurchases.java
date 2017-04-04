import java.util.*;
/**
* <h1>SortPurchases</h1>
* <p>The SortPurchases class is the main class for the applicatiion. It contains the main method, which
* instantiates an instance of itself. The main method than calls the createPurchase() method five
* times, each time prompting the user for the values to each of the Purchase objects' values.
* Finally, the createPurchase() method adds each Purchase created to an ArrayList called purchaseList.
* Once all purchases have been created and added to the purchaseList, the main method calls the
* sortOrderPrompt() method, which will continuously ask the user to select a sorting method, and
* display the contents of the purchaseList in the order requested by the user, until the user elects
* to exit the program. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-04-04
*/
public class SortPurchases{
  static final int NEEDED_PURCHASES = 5;
  Scanner userIn = new Scanner(System.in);
  ArrayList<Purchase> purchaseList = new ArrayList<Purchase>();

  public void createPurchase(int num){
    int count = num + 1;
    System.out.println("Lets create purchase number "+count);
    System.out.println("======================");
    System.out.println("Enter a purchase description.\n>>");
    String tempPurchaseDesc = userIn.nextLine();
    System.out.println(tempPurchaseDesc);
    System.out.println("Enter a purchase price. (ex:5.99)");
    System.out.println(">>");
    System.out.print("$");
    double tempPurchasePrice = userIn.nextDouble();
    userIn.nextLine();
    System.out.println(" ");
    System.out.println("Enter time in minutes");
    int tempPurchaseTime = userIn.nextInt();
    userIn.nextLine();
    Purchase newPurchase = new Purchase(tempPurchaseDesc, tempPurchasePrice, tempPurchaseTime);
    purchaseList.add(newPurchase);
  }
  public void sortOrderPrompt(){
    boolean orderPrompt = true;
    do{
      System.out.println("How would you like to sort all the purchases?\n1.) By Service Decription\n2.) By Price\n3.) By Time\n0.) Exit Program\n>>");
      char sortSelection = userIn.next().charAt(0);
      if(sortSelection == '1'){
        System.out.println("==============================");
        Collections.sort(purchaseList, Purchase.purchaseDescriptionComparator);
        for(Purchase p:purchaseList){
          System.out.println(p.getServiceDescription()+" | $"+p.getPrice()+" | "+p.getTime());
        }
      }else if(sortSelection == '2'){
        Collections.sort(purchaseList, Purchase.purchasePriceComparator);
        for(Purchase p:purchaseList){
          System.out.println(p.getServiceDescription()+" | $"+p.getPrice()+" | "+p.getTime());
        }
      }else if(sortSelection == '3'){
        Collections.sort(purchaseList, Purchase.purchaseTimecomparator);
        for(Purchase p:purchaseList){
          System.out.println(p.getServiceDescription()+" | $"+p.getPrice()+" | "+p.getTime());
        }
      }else if(sortSelection == '0'){
        System.out.println("Goodbye");
        orderPrompt = false;
      }

    }while(orderPrompt);
  }

  public void exitProgram(){
    System.out.println("Goodbye");
  }



  public static void main(String[] args) {

    SortPurchases purchaseApp = new SortPurchases();
    for(int n=0;n<NEEDED_PURCHASES;n++){
      purchaseApp.createPurchase(n);
    }
    System.out.println("=========================");
    System.out.println("Okay! We've created all the purchases");
    System.out.println("=========================");
    purchaseApp.sortOrderPrompt();
  }
}
