package week13;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort1 
{
   public static void main(String[] args)
   {
      String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
      
      // Create and display a list containing the suits array elements
      List<String> list = Arrays.asList(suits); 
      System.out.printf("Unsorted array elements: %s%n", list);

      Collections.sort(list, Collections.reverseOrder()); // sort ArrayList
      System.out.printf("Sorted array elements: %s%n", list);
   } 
} // end class Sort1