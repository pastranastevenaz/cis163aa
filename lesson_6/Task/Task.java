/**
* <h1>Task/h1>
* <p>This class is the template for the Task object. It simply declares the variables and methods to set and get said variables.
* There is also an overide of the toString() method, in order to display all the instance variables when the toString method is called from
* the TaskCreator class/p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-08
*/

public class Task{
  @Override
  public String toString() {
     return ("ID:"+this.getID()+
                 " Title: "+ this.getTitle() +
                 " Time: "+ this.getTime() +
                 " Price: " + this.getPrice());
               }
  private int ID;
  private String title;
  private String time;
  private double price;

  public void setID(int i){
    this.ID = i;
  }
  public int getID(){
    return this.ID;
  }
  public void setTitle(String t){
    this.title=t;
  }
  public String getTitle(){
    return this.title;
  }
  public void setTime(String _t){
    this.time=_t;
  }
  public String getTime(){
    return this.time;
  }
  public void setPrice(double p){
    this.price=p;
  }
  public double getPrice(){
    return this.price;
  }
  public Task(int _ID, String _title, String _time, double _price ){
    this.ID=_ID;
    this.title=_title;
    this.time=_time;
    this.price=_price;
  }
}
