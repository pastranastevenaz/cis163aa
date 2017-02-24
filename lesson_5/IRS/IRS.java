import java.util.Scanner;
/**
* <h1>IRS/h1>
* <p>This file has an IRS class. It instanciates an instance of the class, then calls the startAudit method, which
* in turn calls methods to ask about the presence of W2s, receipts, and total children deductions. The final method call printsthe calculated status of the
* audit, as well as any applicable fine.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-20
*/
public class IRS{
  Scanner i = new Scanner(System.in);
  boolean w2 = false;
  boolean receipts = false;
  int childDeductions;
  double fine;
  boolean pass = true;
  public void startAudit(){
    askW2();
    askReceipts();
    childDeduct();
    outputStatus();
  }
  public void askW2(){
    System.out.println("Did they provide W2?"+'\n'+"[y/n]");
    char w = i.next().charAt(0);
    if (w == 'y'){
      w2 = true;
    }else if (w == 'n'){
      w2 = false;
      pass = false;
      fine = fine + 500;
    }else{
      System.out.println("ERROR"+'\n'+"please make a valid selection.");
      askW2();
    }
  }
  public void askReceipts(){
    System.out.println("Did they provide receipts for donations?"+'\n'+"[y/n]");
    char w = i.next().charAt(0);
    if (w == 'y'){
      receipts = true;
    }else if (w == 'n'){
      receipts = false;
      pass = false;
      fine = fine + 300;
    }else{
      System.out.println("ERROR"+'\n'+"please make a valid selection.");
      askReceipts();
    }
  }
  public void childDeduct(){
    System.out.println("How many children were deducted?");
    childDeductions = i.nextInt();
    if(childDeductions > 3 && receipts == false && w2 == false){
      fine = fine + 1000;
      pass = false;
    }
  }
  public void outputStatus(){
    if (pass == true){
      System.out.println('\n'+"===================="+'\n'+"Conrgratulations. You've passed your audit.");
    }else{
      System.out.println('\n'+"===================="+'\n'+"We are sorry to inform you, you did not pass the audit"+'\n'+"Current Fine: $"+ String.format("%.2f", fine));
    }
  }

  public static void main(String[] args) {
    IRS audit = new IRS();
    audit.startAudit();
  }
}
