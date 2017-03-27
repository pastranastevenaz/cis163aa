import java.util.*;
import java.io.*;
import java.nio.file.*;

/**
* <h1>RealEstateFinder/h1>
* <p>This class includes the main method of the Real Estate program. It initailly creates an
* ArrayList of Strings which it populates with a text file in  the same directory. It then uses that
* ArrayList to create a second Arraylist of RealEstate objects. The program then asks the user
* too select an option for sorting the list of properties.  </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-27
*/

public class RealEstateFinder{
  ArrayList<String> realEstateArrayList = new ArrayList<String>();
  ArrayList<RealEstate> propertiesArrayList = new ArrayList<RealEstate>();
  Scanner in = new Scanner(System.in);
  int count;

  public void initApp(){
    Path file = Paths.get("./realestate.txt");
    InputStream input = null;
    try{
      input = Files.newInputStream(file);
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      String s = null;
      s = reader.readLine();
      do{
        realEstateArrayList.add(s);
      }while((s = reader.readLine())!= null);
      reader.close();
    }catch(IOException e){
      System.out.println(e);
    }
  }

  public void createProperty(){
    for(String props:realEstateArrayList){
      String words[] = props.split(" ");
      String _location = words[0];
      int _price = Integer.parseInt(words[1]);
      String _description = words[2];
      RealEstate newRearlEstate = new RealEstate(_location, _price, _description);
      propertiesArrayList.add(newRearlEstate);
    }
  }

  public void initPrompt(){
    System.out.println("Greetings. the current properties are: ");
    displayAllProperties();
  }

  public void displayAllProperties(){
    for (RealEstate r:propertiesArrayList){
      System.out.println(r);
    }
  }

  public void displayOptions(){

        System.out.println("\n\nHow would you like to sort the properties?\n1.) Sort by Location\n2.) Sort by Price\n3.) Sort by Desription\n4.) Quit Program\n  Select by Number\n>>");
        char response = in.next().charAt(0);
        if(response == '1'){
          Collections.sort(propertiesArrayList, RealEstate.realEstateLocationComparator);
          for(RealEstate re:propertiesArrayList){
            System.out.println(re);
          }
          displayOptions();
        }else if(response == '2'){
          Collections.sort(propertiesArrayList, RealEstate.realEstatePriceComparator);
          for(RealEstate re:propertiesArrayList){
            System.out.println(re);
          }
          displayOptions();
        }else if(response == '3'){
          Collections.sort(propertiesArrayList, RealEstate.realEstateDescriptionComparator);
          for(RealEstate re:propertiesArrayList){
            System.out.println(re);
          }
          displayOptions();
        }else if(response == '4'){
          endProgram();
        }else{
          System.out.println("Invalid option...... Try again.");
          displayOptions();
        }
    }

  public void endProgram(){
    System.out.println("  GOODBYE  ");
  }
  public static void main(String[] args) {
    RealEstateFinder app = new RealEstateFinder();
    app.initApp();
    app.initPrompt();
    app.createProperty();
    app.displayAllProperties();
    app.displayOptions();

  }
}
