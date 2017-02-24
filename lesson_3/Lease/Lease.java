import java.util.Scanner;
/**
* <h1>Lease/h1>
* <p>This file is a class for the Lease template. It will be used by the TestLease file.
* It contains all the getter and setter methods, the constructor, the pet fee methods, as well as
* the methods for the user to set and show the instance's values. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-14
*/
public class Lease{
  private String name;
  private int aptNum;
  private int rent;
  private int term;
  private int PET_FEE = 10;


  public Lease(){
    name = "XXX";
    aptNum = 0;
    rent = 1000;
    term = 12;
  }

  public void setName(String n){
    name = n;
  }
  public String getName(){
    return name;
  }
  public void setAptNum(int an){
    aptNum = an;
  }
  public int getAptNum(){
    return aptNum;
  }
  public void setRent(int r){
    rent = r;
  }
  public int getRent(){
    return rent;
  }
  public void setTerm(int t){
    term = t;
  }
  public int getTerm(){
    return term;
  }
  public static void explainPetPolicy(){
    System.out.println("There is a $10 fee for pets, which has been added to your total monthly rent.");
  }
  public void addPetFee(){
    rent = rent + PET_FEE;
    explainPetPolicy();
  }
  public void getData(){
    Scanner input = new Scanner(System.in);
    System.out.println("What is the lessee's name?");
    String lesseName = input.nextLine();
    setName(lesseName);
    System.out.println("Enter the apartment number.");
    int apartmentNum = input.nextInt();
    setAptNum(apartmentNum);
    input.nextLine();
    System.out.println("Enter the Rent amount.");
    int rentAmount = input.nextInt();
    setRent(rentAmount);
    input.nextLine();
    System.out.println("Enter the Term length in months.");
    int termLength = input.nextInt();
    setTerm(termLength);
    input.nextLine();
    System.out.println("=====================");
  }
  public void showValues(){
    System.out.println("Lessee: "+name +'\n'+
                       "Apartment Number: "+aptNum+'\n'+
                       "Rent Amount: $"+rent+'\n'+
                       "Term Length: "+term+" months"+'\n');
  }
}
