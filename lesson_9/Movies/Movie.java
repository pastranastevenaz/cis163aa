import java.util.*;
/**
* <h1>Movie/h1>
* <p>This class is the template for the Movie object. It contains it's private
* instance variables, it's public mutators, an overide of the toString method,
* as welll as comparator overides for the instance's 3 properties.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-23
*/
public class Movie{

  @Override
  public String toString(){
    return(this.name+" "+this.genre+" "+this.time);
  }

  private String name;
  private String genre;
  private int time;

  public Movie(String a, String b, int c){
    this.name = a;
    this.genre = b;
    this.time = c;
  }
  public String getMovieName(){
    return this.name;
  }
  public String getMovieGenre(){
    return this.genre;
  }
  public int getMovieTime(){
    return this.time;
  }
  public void setMovieName(String _name_){
    this.name = _name_;
  }
  public void setMovieGenre(String _genre_){
    this.genre = _genre_;
  }
  public void setMovieTime(int _time_){
    this.time = _time_;
  }

  public static Comparator<Movie> movieNameComparator = new Comparator<Movie>(){
    public int compare(Movie m1, Movie m2){
      String MovieName1 = m1.getMovieName().toUpperCase();
      String MovieName2 = m2.getMovieName().toUpperCase();
      //Ascending
      return MovieName1.compareTo(MovieName2);
      // Descending
      // return MovieName2.compareTo(MovieName1);
    }
  }; //End Movie Name Compare Override

  public static Comparator<Movie> movieGenreComparator = new Comparator<Movie>(){
    public int compare(Movie m1, Movie m2){
      String MovieGenre1 = m1.getMovieGenre().toUpperCase();
      String MovieGenre2 = m2.getMovieGenre().toUpperCase();
      // Ascending
      return MovieGenre1.compareTo(MovieGenre2);
      // Descending
      // return MovieGenre2.compareTo(MovieGenre1);
    }
  }; // End Movie Genre Compare Override

  public static Comparator<Movie> movieTimeComparator = new Comparator<Movie>(){
    public int compare(Movie m1, Movie m2){

    //  Ascending
    return (m1.getMovieTime() - m2.getMovieTime());
    }
  }; // End Movie Time Compare overide
}//End Class
