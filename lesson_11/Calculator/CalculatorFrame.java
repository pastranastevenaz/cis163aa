import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
* <h1>CalculatorFrame</h1>
* <p>The CalculatorFrame Class extends a JFrame and implements the Action Listener. The frame includes a
* text field for the first and second operand. The user can selet the multiply oor the divide operation.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-31
*/
public class CalculatorFrame extends JFrame implements ActionListener{
  double firstNum;
  double secondNum;
  double operation;

  JLabel firstNumberLabel = new JLabel("First Number");
  JTextField firstNumberInput = new JTextField(7);
  JLabel secondNumberLabel = new JLabel("Second Number");
  JTextField secondNumberInput = new JTextField(7);
  JButton multiplyButton = new JButton("X");
  JButton divideButton = new JButton("/");
  JButton equalsButtton = new JButton("=");
  JLabel answer = new JLabel("");
  public CalculatorFrame(){
    super("Calculator");
    setSize(150,170);
    setLayout(new FlowLayout());
    add(firstNumberLabel);
    add(firstNumberInput);
    add(secondNumberLabel);
    add(secondNumberInput);
    add(multiplyButton);
    add(divideButton);
    add(equalsButtton);
    add(answer);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    multiplyButton.addActionListener(this);
    divideButton.addActionListener(this);
    equalsButtton.addActionListener(this);
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    Object src = e.getSource();
    firstNum = Double.parseDouble(firstNumberInput.getText());
    secondNum = Double.parseDouble(secondNumberInput.getText());
    if (src == multiplyButton) {
      operation = firstNum * secondNum;
      System.out.println(operation);
    }
    else if (src == divideButton) {
      operation = firstNum/secondNum;
      System.out.println(operation);
    }
    else if (src == equalsButtton) {
      answer.setText(Double.toString(operation));
    }
  }
}
