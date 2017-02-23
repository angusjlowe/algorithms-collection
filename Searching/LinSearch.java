import java.io.*;
import java.util.*;

public class LinSearch {

   public static int linSearch(int[] array, int k) {
      for(int i = 0; i < array.length; i++) {
         if(array[i] == k) {
            return i;
         }
      }
      return -1;
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int searchingFor = sc.nextInt();
      int arraySize = sc.nextInt();
      int[] array = new int[arraySize];
      for(int i = 0; i < arraySize; i++) {
         array[i] = sc.nextInt();
      }
      sc.close();
      int index = linSearch(array, searchingFor);
      System.out.println(index);
   }
}
