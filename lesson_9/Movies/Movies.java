import java.util.*;
import java.io.*;
import java.nio.file.*;
/**
* <h1>Movies/h1>
* <p>This class includes the main method of the program. It calls
* the initArray() method, which populates an ArrayList from the local movies.txt file.
* It then calls the createMovies() method, which iterates through the afformentiond ArrayList.
* As it iterates, it creates instances of the Movie class, and adds them
* to the movieArrayList ArrayList. Finally, the main method calls a display() method,
* which displays an unsorted list of all movies, followed by a prompt, asking the user how they
* would like to sort the list. </p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-23
*/
public class Movies{
  // public String[][] movieList;
  ArrayList<Movie> movieArrayList = new ArrayList<Movie>();
  ArrayList<String> myMovs = new ArrayList<String>();
  Scanner in = new Scanner(System.in);

  public void initArray(){

    // List<String> lines = Files.readAllLines(Paths.get("./movies.txt"));
    Path file = Paths.get("./movies.txt");
    InputStream input = null;
    try{
      input = Files.newInputStream(file);
      BufferedReader reader = new BufferedReader(new InputStreamReader(input));
      String s = null;
      s = reader.readLine();
      do{
        // System.out.println(s);
        myMovs.add(s);
      }while((s = reader.readLine()) != null);
      // System.out.println(inner);
      reader.close();
    }catch(IOException e){
      System.out.println(e);
    }
  }

  public void createMovies(){
    for(String i:myMovs){
      int count = 0;
      String[] words = i.split(" ");
      String _name = words[0];
      String _genre = words[1];
      int _time = Integer.parseInt(words[2]);
      Movie newMov = new Movie(_name,_genre,_time);
      movieArrayList.add(newMov);
    }
  }

  public void display(){
    for(Movie m:movieArrayList){
      System.out.println(m);
    }
  }

  public void initialPrompt(){
    System.out.println("============================\nPlease select an option by number");
    System.out.println("1.) Sort by name\n2.) Sort by genre\n3.) Sort by time\n4.) Quit Program>>>");
    char sortChoice = in.next().charAt(0);
    if (sortChoice == '1'){
      sortByName();
    }else if(sortChoice == '2'){
      sortByGenre();
    }else if(sortChoice == '3'){
      sortByTime();
    }else if(sortChoice == '4'){
      exitProgram();
    }else{
      System.out.println("Invalid optiion.....\nPlease try again");
      initialPrompt();
    }
  }

  public void sortByName(){
    System.out.println("Sorting by name:\n=======================");
    Collections.sort(movieArrayList, Movie.movieNameComparator);
    for (Movie n:movieArrayList){
      System.out.println(n);
    }
    initialPrompt();
  }

  public void sortByGenre(){
    System.out.println("Sorting by genre:\n=======================");
    Collections.sort(movieArrayList, Movie.movieGenreComparator);
    for(Movie n:movieArrayList){
      System.out.println(n);
    }
    initialPrompt();
  }

  public void sortByTime(){
    System.out.println("Sort by time:\n=======================");
    Collections.sort(movieArrayList, Movie.movieTimeComparator);
    for(Movie n:movieArrayList){
      System.out.println(n);
    }
    initialPrompt();
  }

  public void exitProgram(){
    System.out.println("Goodbye");
  }

  public static void main(String[] args) {
    Movies movieInstance = new Movies();
    movieInstance.initArray();
    movieInstance.createMovies();
    movieInstance.display();
    movieInstance.initialPrompt();


  }
}
