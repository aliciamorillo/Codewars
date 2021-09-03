class Solution {
  public static String camelCase(String input) {
    String newString = "";
    
    for(int i = 0; i < input.length(); i++){
      Character ch = input.charAt(i);
      if(Character.isUpperCase(ch)){
        newString += " " + Character.toUpperCase(ch);
      } else {
        newString += ch;
      }
    }
    
    return newString;
  }
}