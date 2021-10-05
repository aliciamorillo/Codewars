public class Solution {
    public static String repeatStr(final int repeat, final String string) {
      String word = "";
      int i = 0;
      
      for(i=0; i < repeat; i++){
        word += string; 
      }
      
        return word;
    }
}