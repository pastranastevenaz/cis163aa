import java.util.*;

public class Deleteme {
  enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}
  public static void main(String[] args) {
    Stream<Integer> numbers = Stream.of(new Integer[]{1,2,3,4,5});
    numbers.forEach(number -> System.out.println(number));
  }
}
