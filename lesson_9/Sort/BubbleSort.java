/**
* <h1>BubbleSort/h1>
* <p>The BubbleSort class has one public method that accepts an integer array. It uses
* the bubble sort method to sort the passed in array in ascending order.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-22
*/
public class BubbleSort{
  public int temp;
  public void sortBubble(int[] passedArrray){
    for(int a = 0; a < passedArrray.length -1; ++a){
      for(int b = 0; b < passedArrray.length - 1; ++b){
        if(passedArrray[b] > passedArrray[b + 1]){
          temp = passedArrray[b];
          passedArrray[b] = passedArrray[b + 1];
          passedArrray[b + 1] = temp;
          System.out.println(passedArrray[b]+ " was swapped with " + passedArrray[b + 1]);
        }
      }
    }
    System.out.print("\n Our new array is: ");
    for(int c:passedArrray){
      System.out.print(c);
      System.out.print(", ");
    }

  }
}
