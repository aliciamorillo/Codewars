public class Positive{

  public static int sum(int[] arr){
    int sum = 0;
    
    for(int a: arr){
      
      if(a>0){
        sum += a;
      }
      
    }
    
    if(sum == 0){
      return 0;
    } else {
      return sum;
    }
    
  }

}