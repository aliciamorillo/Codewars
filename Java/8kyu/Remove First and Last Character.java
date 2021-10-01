public class RemoveChars {
    public static String remove(String str) {
        StringBuilder newString = new StringBuilder(str);
      
        newString = newString.deleteCharAt(0);
        newString = newString.deleteCharAt(newString.length() - 1);

        return newString.toString();
    }
}