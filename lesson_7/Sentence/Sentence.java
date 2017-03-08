/**
* <h1>Sentence/h1>
* <p>This class prompts the user into entering 3 words, a subject, an adverb, and a verb. It will then use the StringBuilder class to build
* a sentence. The string will then be displayed in the terminal. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-08
*/
import java.util.*;

public class Sentence{
  StringBuilder mySb = new StringBuilder();
  Scanner input = new Scanner(System.in);
  String subject;
  String adverb;
  String verb;

  public void initPrompt(){
    System.out.println("Greetings. Please enter a Subject.");
    subject = input.nextLine();
    System.out.println("Please enter an adverb.");
    adverb = input.nextLine();
    System.out.println("Please enter a verb.");
    verb = input.nextLine();

    System.out.println(subject+adverb+verb);
  }

  public static void main(String[] args) {
    Sentence instanceOfSentence = new Sentence();
    instanceOfSentence.initPrompt();
  }
}
