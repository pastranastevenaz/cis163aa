import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
* <h1>HelloFrame</h1>
* <p>The HelloFram class extends the JFrame and inplements an ActionListener. It creates a label and
* textfield for the first and last name. It also provides a button with an event listenter which
* will populate a JLabel with the greeting concatenated with the first and last name entered by the user</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-30
*/
public class HelloFrame extends JFrame implements ActionListener{
  JLabel firstNameLabel = new JLabel("Enter your first name");
  Font bigFont = new Font("Arial", Font.BOLD, 16);
  JTextField firstNameInput = new JTextField(20);
  JLabel lastNameLabel = new JLabel("Enter your last name");
  JTextField lastNameInput = new JTextField(20);
  JButton pressMe = new JButton("Press me");
  JLabel greeting = new JLabel("");
  public HelloFrame(){
    super("Hello");
    setSize(300,250);
    setLayout(new FlowLayout());
    firstNameLabel.setFont(bigFont);
    lastNameLabel.setFont(bigFont);
    greeting.setFont(bigFont);
    add(firstNameLabel);
    add(firstNameInput);
    add(lastNameLabel);
    add(lastNameInput);
    add(pressMe);
    pressMe.setToolTipText("press me for a customized greeting");
    add(greeting);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pressMe.addActionListener(this);
  }
  @Override
  public void actionPerformed(ActionEvent e){
    String firstName = firstNameInput.getText();
    String lastName = lastNameInput.getText();
    String greet = "Hello, " + firstName+" "+lastName;
    greeting.setText(greet);
  }
}
