import javax.swing.*;
import java.text.*;
/**
* <h1>Pay</h1>
* <p>The Pay class is an application which creates several JOptionPanes to prompt the user for
* some employee information in order to calculate pay and deductions. The final JOptionPane displays
* totals, or an error message if the total deductions exceeds the gross pay.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-04-03
*/
public class Pay{
  NumberFormat formatter = new DecimalFormat("#0.00");

  boolean skillLevelNeeded = true;
  int skillLevel;
  double hourlyWage;
  double totalHoursWorked;
  double straightHoursWorked;
  double overtimeHoursWorked;
  double straightHoursPay;
  double overtimeHoursPay;
  double grossPay;
  double netPay;
  double totalDeductions = 0.0;
  boolean hasMedical = false;
  boolean hasDental = false;
  boolean hasLongTerm = false;
  boolean hasRetirement = false;
  final double SKILL_LEVEL_1_PAY = 17.00;
  final double SKILL_LEVEL_2_PAY = 20.00;
  final double SKILL_LEVEL_3_PAY = 22.00;
  final double MEDICAL_INSURANCE = 32.00;
  final double DENTAL_INSURANCE = 20.00;
  final double LONG_TERM_DISABILITY_INSURANCE = 10.00;
  double retirementDeduction = 0.0;

  public void calculatePay(){
    if (skillLevel == 1){
      straightHoursPay = (straightHoursWorked * SKILL_LEVEL_1_PAY);
      overtimeHoursPay = (overtimeHoursWorked * (SKILL_LEVEL_1_PAY * 1.5));
      grossPay = (overtimeHoursPay + straightHoursPay);
    }else if(skillLevel == 2){
      straightHoursPay = (straightHoursWorked * SKILL_LEVEL_2_PAY);
      overtimeHoursPay = (overtimeHoursWorked * (SKILL_LEVEL_2_PAY * 1.5));
      grossPay = (overtimeHoursPay + straightHoursPay);
    }else if(skillLevel == 3){
      straightHoursPay = (straightHoursWorked * SKILL_LEVEL_3_PAY);
      overtimeHoursPay = (overtimeHoursWorked * (SKILL_LEVEL_3_PAY * 1.5));
      grossPay = (overtimeHoursPay + straightHoursPay);
    }
    //Console output to check variable values
    System.out.println(straightHoursPay);
    System.out.println(overtimeHoursPay);
  }

  public void initialPrompt(){
    do{
      String _skillLevelString = JOptionPane.showInputDialog("Please enter your skill level.");

      if(_skillLevelString.equals("1")){
        System.out.println("1 entered");
        skillLevel = 1;
        hourlyWage = SKILL_LEVEL_1_PAY;
        skillLevelNeeded = false;
      }else if(_skillLevelString.equals("2")){
        System.out.println("2 entered");
        skillLevel = 2;
        hourlyWage = SKILL_LEVEL_2_PAY;
        skillLevelNeeded = false;
      }else if(_skillLevelString.equals("3")){
        System.out.println("3 entered");
        skillLevel = 3;
        hourlyWage = SKILL_LEVEL_3_PAY;
        skillLevelNeeded = false;
      }else{
        System.out.println("invalid optiion entered");
      }
    }while(skillLevelNeeded);
  }

  public void calculateHours(){
    String _totalHoursWorked = JOptionPane.showInputDialog("How manny hours did you work?");
    totalHoursWorked = Double.parseDouble(_totalHoursWorked);
    overtimeHoursWorked = (totalHoursWorked - 40.00);
    straightHoursWorked = totalHoursWorked - overtimeHoursWorked;
    //Console output to check variable values
    System.out.println(totalHoursWorked);
    System.out.println(straightHoursWorked);
    System.out.println(overtimeHoursWorked);
  }

  public void calculateInsurance(){
    int medicalSelection;
    int dentalSelection;
    int longTermSelection;
    int retirementSelection;
    if(skillLevel == 2){
      medicalSelection = JOptionPane.showConfirmDialog(null, "Would you like to add medical insurance for $32.00?");
      hasMedical = (medicalSelection == JOptionPane.YES_OPTION);
      dentalSelection = JOptionPane.showConfirmDialog(null, "Would you like to add dental insurance for $20.00?");
      hasDental = (dentalSelection == JOptionPane.YES_OPTION);
      longTermSelection = JOptionPane.showConfirmDialog(null, "Would you like to add long term disability insurance for $10.00?");
      hasLongTerm = (longTermSelection == JOptionPane.YES_OPTION);
    }else if(skillLevel == 3){
      medicalSelection = JOptionPane.showConfirmDialog(null, "Would you like to add medical insurance for $32.00?");
      hasMedical = (medicalSelection == JOptionPane.YES_OPTION);
      dentalSelection = JOptionPane.showConfirmDialog(null, "Would you like to add dental insurance for $20.00?");
      hasDental = (dentalSelection == JOptionPane.YES_OPTION);
      longTermSelection = JOptionPane.showConfirmDialog(null, "Would you like to add long term disability insurance for $10.00?");
      hasLongTerm = (longTermSelection == JOptionPane.YES_OPTION);
      retirementSelection = JOptionPane.showConfirmDialog(null, "Would you like to participate in the retirement plan at 3% of your gross pay?");
      hasRetirement = (retirementSelection == JOptionPane.YES_OPTION);
    }else{
      // Console output notes
      System.out.println("skillLevel == 1 therefore no prompts for insurance.");
    }
    if(hasMedical){
      totalDeductions = totalDeductions + MEDICAL_INSURANCE;
    }
    if(hasDental){
      totalDeductions = totalDeductions + DENTAL_INSURANCE;
    }
    if(hasLongTerm){
      totalDeductions = totalDeductions + LONG_TERM_DISABILITY_INSURANCE;
    }
    if(hasRetirement){
      retirementDeduction = (grossPay * 0.03);
      totalDeductions = totalDeductions + retirementDeduction;
    }
    System.out.println(formatter.format(retirementDeduction));
    System.out.println(totalDeductions);
  }

  public void displayTotals(){
    if(totalDeductions > grossPay){
      JOptionPane.showMessageDialog(null, "ERROR: 257\nDeductions cannot exceed gross pay!", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
    }else{
      JOptionPane.showMessageDialog(null,"Hours woked: "+totalHoursWorked+"\nHourly pay rate: $"+ hourlyWage+"\nRegular pay: $"+straightHoursPay+"\nOvertime pay: $"+overtimeHoursPay+"\nTotal pay: $"+grossPay+"\nTotal deductions: $"+totalDeductions+ "\nNet pay: $"+netPay );
    }
  }

  public void calculateNetPay(){
    netPay = grossPay - totalDeductions;
  }

  public static void main(String[] args) {
    Pay payApp = new Pay();
    payApp.initialPrompt();
    payApp.calculateHours();
    payApp.calculatePay();
    payApp.calculateInsurance();
    payApp.calculateNetPay();
    payApp.displayTotals();
  }
}
