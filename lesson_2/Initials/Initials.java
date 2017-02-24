import java.util.Scanner;
/**
* <h1>Initials</h1>
* <p>This program displays the three initials of a user entered name to the terminal. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-02-10
*/

public class Initials {
  public static void main(String[] args) {
    String firstName, secondName, thirdName;
    char firstInitial, secondInitial, thirdInitial;
    Scanner nameInput = new Scanner(System.in);
    System.out.println("What is your first name?");
    firstName = nameInput.nextLine();
    System.out.println("Greetings " + firstName + ", what is your middle name?");
    secondName= nameInput.nextLine();
    System.out.println("Thank you; and your last name?");
    thirdName = nameInput.nextLine();
    firstInitial = firstName.charAt(0);
    secondInitial = secondName.charAt(0);
    thirdInitial = thirdName.charAt(0);
    System.out.println("Thank you " + firstName +
                        ", your initials are " +
                        firstInitial + "." +
                        secondInitial + "." +
                        thirdInitial + ".");
  }
}
