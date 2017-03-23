/**
* <h1>TestSort/h1>
* <p>This class calls a sort method from the BubbleSort.java class and the
* InsertionSort.java class. It will pass those methods an array of integers.
* Each method will inform the user when an action has been taken by the
* algorithm. IT will finally print the new order of the array.</p>
* <br>
* STE2253402
* CIS163AA - Java Programming: Level I - Class # 29647
* @author  Steven Pastrana
* @version 1.0
* @since   2017-03-22
*/
public class TestSort{
  public static final int[] numberList = {22, 32, 13, 5, 18, 11, 9};
  public static void main(String[] args) {
    System.out.print("Our original Array is ");
    for(int x:numberList){
      System.out.print(x);
      System.out.print(", ");
    }

    System.out.println("\n===|| BUBBLE SORT ||===");
    BubbleSort bs = new BubbleSort();
    bs.sortBubble(numberList);
    System.out.println("\n=========================\n===||INSERTION SORT||===");
    InsertionSort is = new InsertionSort();
    is.sortInsertion(numberList);
  }
}
