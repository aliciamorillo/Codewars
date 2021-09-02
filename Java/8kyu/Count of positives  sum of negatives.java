import java.util.*;

public class Kata{
    public static int[] countPositivesSumNegatives(int[] input){
      
      int countPos = 0;
      int countNeg = 0;
      
      int[]newArray;
      
      if (input == null || input.length == 0) return new int[] {};
      
      for(int number: input){
        if(number > 0){
          countPos++;
        }
        
        if(number<0){
          countNeg += number;
        }
        
      }
      
      return new int[] {countPos, countNeg}; //return an array with count of positives and sum of negatives
    }
}