import java.util.*;
import java.io.*;
import java.nio.file.*;
/**
* <h1>MyContacts/h1>
* <p>This allows the user to create a contact, remove a contact, change the order off the contact list,
* and display the contacts of the contact list.  </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-18
*/
public class MyContacts{

  ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
  ArrayList<Contact> tempList = new ArrayList<Contact>();

  Scanner in = new Scanner(System.in);
  int _index = 0;

  public void mainPrompt(){
    System.out.println("Please Select from the following options\n1) add contact\n2) remove contact\n3) change order \n4) print \n5) exit");
    // Use a switch statement with options for uppercase,lowercase, each case calls corresponding method
    String mainChoice = in.next();
    switch (mainChoice){
      case "1":
      case "add":
      case "add contact":
      case "Add contact":
      case "Add Contact":
      case "add Contact":
      case "ADD CONTACT":
        add();
        break;
      case "2":
      case "remove":
      case "remove contact":
      case "Remove contact":
      case "Remove Contact":
      case "remove Contact":
      case "REMOVE CONTACT":
        remove();
        break;
      case "3":
      case "change":
      case "change order":
      case "Change order":
      case "Change Order":
      case "change Order":
      case "CHANGE ORDER":
        changeOrder();
        break;
      case "4":
      case "print":
      case "Print":
      case "PRINT":
        print();
        break;
      case "5":
      case "exit":
      case "Exit":
      case "EXIT":
        exit();
        break;
      default:
        System.out.println("Not a valid selection");
        mainPrompt();
        break;
    }

  }

  public void add(){
    System.out.println("Please enter a contact name");
    in.nextLine();
    String n = in.nextLine();
    System.out.println("Please enter a phone number (10 digits), no spaces or special characters");
    String _n = in.next();
    in.nextLine();
    System.out.println("Please enter an address");
    String a = in.nextLine();
    _index++;
    int _i = _index;
    addContact(_i, n, _n, a);
    mainPrompt();
  }
  public void addContact(int _myIndex, String _name, String _number, String _address){
    Contact newContact = new Contact(_myIndex, _name, _number, _address);
    contactArrayList.add(newContact);
    System.out.println(newContact + "\n");
  }

  public void remove(){
    for(Contact c:contactArrayList){
      System.out.println(c.getIndex()+" | "+ c.getName()+" | "+c.getNumber()+" | "+c.getAddress());
    }
    System.out.println("");
    System.out.println("Please enter the index number of the contact you wish to remove");
    int myChoice = in.nextInt();
    myChoice = myChoice - 1;
    System.out.println("You are about to delete contact: " +contactArrayList.get(myChoice));
    System.out.println("Are you sure?\n[y/n]");
    char deleteChoice = in.next().charAt(0);
    if(deleteChoice == 'y'){
      contactArrayList.remove(myChoice);
      System.out.println("Item deleted");
    }else if(deleteChoice == 'n'){
      System.out.println("Item not deleted");
    }else{
      System.out.println("Invalid input");
    }
    mainPrompt();
  }

  public void changeOrder(){
    for(Contact c:contactArrayList){
      System.out.println(c.getIndex()+" | "+ c.getName()+" | "+c.getNumber()+" | "+c.getAddress());
    }
    System.out.println("");
    System.out.println("Please enter the index of the first item to change the order of.");
    int orderChoiceOne = in.nextInt();
    orderChoiceOne = orderChoiceOne - 1;
    System.out.println("Please enter the index of the second item");
    int orderChoiceTwo = in.nextInt();
    orderChoiceTwo = orderChoiceTwo - 1;

    String t1Name = contactArrayList.get(orderChoiceOne).getName();
    String t1Number = contactArrayList.get(orderChoiceOne).getNumber();
    String t1Address = contactArrayList.get(orderChoiceOne).getAddress();
    Contact t1 = new Contact(1,t1Name,t1Number,t1Address);

    String t2Name = contactArrayList.get(orderChoiceTwo).getName();
    String t2Number = contactArrayList.get(orderChoiceTwo).getNumber();
    String t2Address = contactArrayList.get(orderChoiceTwo).getAddress();
    Contact t2 = new Contact(2,t2Name,t2Number,t2Address);
    tempList.set(0, t1);
    tempList.set(1, t2);
    //
    contactArrayList.set(orderChoiceOne, tempList.get(1));
    contactArrayList.set(orderChoiceTwo, tempList.get(0));
    mainPrompt();
  }

  public void print(){
    for(Contact c:contactArrayList){
      System.out.println(c.getIndex()+" | "+ c.getName()+" | "+c.getNumber()+" | "+c.getAddress());
    }
    System.out.println("");
    mainPrompt();
  }

  public void exit(){
    System.out.println("Goodbye");
  }
  public void populateTemp(){
    Contact firstTemp = new Contact(0, "Temp1", "0001234567", "temp address");
    Contact secondTemp = new Contact(1, "Temp2", "0007654321", "temp address");
    tempList.add(firstTemp);
    tempList.add(secondTemp);
  }

  public static void main(String[] args) {
    MyContacts mainProgram = new MyContacts();
    mainProgram.populateTemp();
    mainProgram.mainPrompt();
  }
}
