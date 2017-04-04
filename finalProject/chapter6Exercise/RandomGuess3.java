import java.util.*;
/**
* <h1>RandomGuess3</h1>
* <p>The RandomGuess3 class is a game which the main method instantiates an instance if itself.
* it then calls the class' startGame method which runs the game under 2 do/while loops. The user
* is prompted to guess of a number between 1 and 1000. They are told if there guess is too high, too low,
* or correct. Once the correct number is guessed, the user is shown their number of guesses for that
* iteration, and is asked if they would like to play again. If the user decides not to play again,
* a boolean value isPlaying is set to false, which causes the do/while loop to exit, thus ending the game.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-04-03
*/
public class RandomGuess3{
  final int MIN_NUM = 1;
  final int MAX_NUM = 1000;
  boolean isWrong = true;
  boolean isPlaying = true;
  int numOfGuesses = 1;
  int randomNumber;
  Scanner userInput = new Scanner(System.in);

  public void startGame(){
    createRandomNumber();
    do{
      System.out.println("I'm thinking of a number between 1 to 1000.Can you guess it?\n>>");

      do{
        System.out.println(randomNumber);
        int guess = userInput.nextInt();
        if(guess > randomNumber){
          System.out.println("That guess is too high. Try again.\n>>");
          numOfGuesses++;
        }else if (guess < randomNumber){
          System.out.println("That guess is too low. Try again.\n>>");
          numOfGuesses++;
        }else{
          isWrong = false;
          System.out.println("That is correct!!! You guessed "+numOfGuesses+" times.\nWould you like to play again?\nPress the y key to play again, or any other key to quit.");
          char playAgain = userInput.next().charAt(0);
          if(playAgain == 'y'){
            numOfGuesses = 1;
            createRandomNumber();
            isPlaying =true;
          }else{
            isPlaying = false;
            System.out.println("Thank you for playing");
          }
        }
      }while(isWrong);

    }while(isPlaying);
  }

  public void createRandomNumber(){
    randomNumber = ((int)(Math.random()*1000)%MAX_NUM+MIN_NUM);
  }
  public static void main(String[] args) {
    RandomGuess3 guessGame = new RandomGuess3();
    guessGame.startGame();
  }
}
