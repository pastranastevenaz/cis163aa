import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import java.nio.file.*;
/**
* <h1>ContactsFrame</h1>
* <p>The ContactsFrame Class extends a JFrame and implements the Action Listener. The frame includes a
* text field for the name and number. The user can input a name and number, add it to the contacts list,
* and finally, save it to disk.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-04-02
*/
public class ContactsFrame extends JFrame implements ActionListener{
  String name;
  String number;
  final int WIDTH = 300;
  final int HEIGHT = 260;
  ArrayList<String> contactStringArray = new ArrayList();

  JLabel nameLabel = new JLabel("Name");
  JLabel numberLabel = new JLabel("Number");
  JTextField nameInput = new JTextField(20);
  JTextField numberInput = new JTextField(10);
  JButton saveButton = new JButton("Save");
  JButton addButton = new JButton("Add");
  JLabel warning = new JLabel("");

  public ContactsFrame(){
    super("Contacts");
    setSize(HEIGHT,WIDTH);
    setLayout(new FlowLayout());
    add(nameLabel);
    add(nameInput);
    add(numberLabel);
    add(numberInput);
    add(addButton);
    add(saveButton);
    add(warning);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    addButton.addActionListener(this);
    saveButton.addActionListener(this);
    initArrayList();
  }

  public void initArrayList(){
    System.out.println("initArrayList called");
    Path file = Paths.get("./contacts.txt");
    InputStream input = null;
    try{
      input = Files.newInputStream(file);
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      String s = null;
      s = reader.readLine();
      do{
        contactStringArray.add(s);
      }while((s = reader.readLine()) != null);
      reader.close();
      for(String n:contactStringArray){
        System.out.println(n);
      }
    }catch(IOException e){
      System.out.println(e);
    }
  }

  public void saveToFile(){
    System.out.println("Save to file called");
    // Path fileToSave = Paths.get("./contacts.txt");
    try{

      FileWriter writer = new FileWriter("./contacts.txt");
      for(String line:contactStringArray){
        writer.write(line+"\n");
      }
      writer.close();
    }catch(IOException e){
      System.out.println(e);
    }
  }

  @Override
  public void actionPerformed(ActionEvent e){
    name = nameInput.getText();
    number = numberInput.getText();

    Object src = e.getSource();
    if (src == saveButton){
      System.out.println("saveButton pressed");
      warning.setText("");
      saveToFile();
    }else if(src == addButton){
      String newContact = name + " " + number;
      System.out.println(newContact);
      nameInput.setText("");
      numberInput.setText("");
      contactStringArray.add(newContact);
      warning.setText("Warning! Contact not saved to disk");
    }
  }
}
