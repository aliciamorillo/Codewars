public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
    
    String words[] = name.split(" ");
    String newName = "";
    
    for(String word : words){
      newName += word.charAt(0) + ".";
    }
    
    return newName.substring(0, newName.length() - 1).toUpperCase();
  }
}