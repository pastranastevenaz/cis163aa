import java.util.*;
import java.io.*;
import java.nio.file.*;

public class MyContacts{
  // Add, Remove, Change Order, Print, and Exit.
  ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
  Scanner in = new Scanner(System.in);

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
    String n = in.next();
    System.out.println("Please enter a phone number (10 digits), no spaces or special characters");
    String _n = in.next();
    System.out.println("Please enter an address");
    String a = in.next();
    addContact(n, _n, a);
  }
  public void addContact(String _name, String _number, String _address){
    Contact newContact = new Contact(_name, _number, _address);
    contactArrayList.add(newContact);
    System.out.print(newContact);
  }

  public void remove(){

  }

  public void changeOrder(){

  }

  public void print(){

  }

  public void exit(){
    System.out.println("Goodbye");
  }

  public static void main(String[] args) {
    MyContacts mainProgram = new MyContacts();
    mainProgram.mainPrompt();
  }
}
