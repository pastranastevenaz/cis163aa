/**
* <h1>InsertionSort/h1>
* <p>The InsertionSort class has one public method that accepts an integer array. It uses
* the insertion sort method to sort the passed in array in ascending order.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-22
*/
public class InsertionSort{
  public void sortInsertion(int[] passedArrray){
    int a = 1;
    while(a < passedArrray.length){
      int temp = passedArrray[a];
      int b = a -1;
      while(b >= 0 && passedArrray[b] > temp){
        passedArrray[b + 1] = passedArrray[b];
        --b;
      }
      passedArrray[b + 1] = temp;
      ++a;
      System.out.println("Performed a swap");
    }
    System.out.print("\n Our new array is: ");
    for(int c:passedArrray){
      System.out.print(c);
      System.out.print(", ");
    }
  }
}
