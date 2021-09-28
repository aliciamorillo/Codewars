public class SquareDigit {

  public int squareDigits(int n) {
    String temp = Integer.toString(n);
    
    int[] numbers = new int[temp.length()];
    for (int i = 0; i < temp.length(); i++) {
        numbers[i] = temp.charAt(i) - '0';
    }
    
    String concat = "";
    
    for(int i = 0; i < numbers.length; i++){
      concat += (numbers[i]*numbers[i]) + "";
    }
    
    return Integer.valueOf(concat);
  }

}