import java.util.*;
public class Shiritori{
  
 public static List<String> theGame(List<String> words){
    
    List<String> result = new ArrayList<>();
   
    if(words.size() == 0){
      return result;
    }
   
    if(words.get(0).length() != 0){
      result.add(words.get(0));
    }
   
    for(int i = 1; i < words.size(); i++){
      String word = words.get(i);
      if(!word.isEmpty()){
        if(result.get(i - 1).charAt(result.get(i - 1).length() - 1) == word.charAt(0)){
          result.add(word);
        } else {
          break;
        }
      } else {
        break;
      }
    }
    
    return result;

  }

}