/**
* <h1>Palindrom/h1>
* <p>This class prompts the user to enter a word and test if the word entered is a palindrom. It does so using a String builder object
* to reverse the string and then assings it to another variable. It then uses the equals() method to test for equality of strings.
* It will finally inform the user if the word they entered is infact a palindrome.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-08
*/

import java.util.*;
import java.io.*;

public class Palindrome{
  boolean isPalindrome;
  String sampleWord;
  String reverseSampleWord;
  StringBuilder sb = new StringBuilder();
  Scanner input = new Scanner(System.in);

  public void initProgram(){
    System.out.println("Please enter a word to test for palindrome.");
    sampleWord = input.nextLine();
    sampleWord = sampleWord.toLowerCase();
    sb.append(sampleWord);
    sb = sb.reverse();
    reverseSampleWord = sb.toString();
    System.out.println(reverseSampleWord);
    if (sampleWord.equals(reverseSampleWord)){
      System.out.println("This is a palindrome");
    }else{
      System.out.println("False. This is not a palindrome");
    }
  }
  public static void main(String[] args) {
    Palindrome instanceOfPalindrome = new Palindrome();
    instanceOfPalindrome.initProgram();
  }
}
