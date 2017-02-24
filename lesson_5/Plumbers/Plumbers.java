import java.util.Scanner;
/**
* <h1>Plumbers/h1>
* <p>This file has a Plumbers class, as well as a nested billing class, with a single method that prints a charge successful message to standard out.
* The Plumbers class asks the user whether they require flood or pipe repair service, as well as the number of rooms or pipes affected.
* It then queries the user if they also need the other service as well.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-22
*/
public class Plumbers{
  static double estimate;
  boolean flood = false;
  boolean pipe = false;
  Scanner plumbingInput = new Scanner(System.in);

  public void greeting(){
    System.out.println("Greetings. What can we help you with today?"+'\n'+"1. Flooding"+'\n'+"2. Burst pipes"+'\n'+"     Enter selection number....");
    int serviceRequested = plumbingInput.nextInt();
    if (serviceRequested == 1){
      flood = true;
      this.flooding();
    }else if(serviceRequested == 2){
      pipe = true;
      this.pipes();
    }else {
      System.out.println('\n'+"None selected"+'\n'+"Please make a valid selection"+'\n');
      greeting();
    }
  }
  //Method to handle flooding estimate.
  public void flooding(){
    System.out.println("How many rooms require flood treatment?");
    int n = plumbingInput.nextInt();
    if(n == 0 || n < 0){
      estimate = estimate + 0;
    }else if(n == 1){
      estimate = estimate + 300;
    }else if(n == 2){
      estimate = estimate + 500;
    }else {
      estimate = estimate + 750;
    }
    if(pipe == false){
      floodingAlso();
    }else{
      pay();
    }
  }
  //Method to handle burst pipe estimate.
  public void pipes(){
    System.out.println("How many pipes require repair?");
    int _n = plumbingInput.nextInt();
    if (_n == 0 || _n< 0){
      estimate = estimate + 0;
    }else if(_n == 1){
      estimate = estimate + 50;
    }else if (_n == 2){
      estimate =  estimate + 75;
    }else {
      estimate = estimate + 100;
    }
    if (flood == false){
      pipesAlso();
    }else{
      pay();
    }
  }
  //Method to query additional flooding repairs
  public void floodingAlso(){
    System.out.println('\n'+"Do you also require burst pipe repair?"+'\n'+"[y/n]");
    char i = plumbingInput.next().charAt(0);
    if (i == 'y'){
      pipes();
    }else if (i == 'n'){
      pay();
    }else{
      System.out.println('\n'+"Not a valid selection. Please try again.");
      floodingAlso();
    }
  }
  // Method to query additional pipe repair
  public void pipesAlso(){
    System.out.println('\n'+"Do you also require flood treatment?"+'\n'+"[y/n]");
    char _i = plumbingInput.next().charAt(0);
    if (_i == 'y'){
      flooding();
    }else if (_i == 'n'){
      pay();
    }else{
      System.out.println('\n'+"Not a valid selection. Please try again.");
      pipesAlso();
    }
  }
  public void pay(){
    Billing.chargeCardOnFile();
  }

  public static void main(String[] args) {
    Plumbers plumb = new Plumbers();
    plumb.greeting();

  }
  public static class Billing{
    public static void chargeCardOnFile(){
      System.out.println('\n'+"Payment Successful $"+ String.format("%.2f", estimate) + " charged to card on file.");
    }
  }
}
