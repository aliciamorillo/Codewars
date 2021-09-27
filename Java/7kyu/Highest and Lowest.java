public class Kata {
  public static String highAndLow(String numbers) {
    
    String[] strArr = numbers.split(" ");
    int[] arrNumbers = new int[strArr.length];
    
    for (int i = 0; i < strArr.length; i++) {
          String num = strArr[i];
          arrNumbers[i] = Integer.parseInt(num);
    }
        
    int max = arrNumbers[0];
    int min = arrNumbers[0];
    
    for(int i = 0; i < arrNumbers.length; i++){
      if (arrNumbers[i] > max){
        max = arrNumbers[i];
      }
      
      if(arrNumbers[i] < min){
        min = arrNumbers[i];
      }
                 
    }
    
    return max + " " + min;
  }
}