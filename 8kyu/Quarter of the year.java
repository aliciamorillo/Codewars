public class Kata {
    public static int quarterOf(int month) {
        if(month > 0 && month <= 3){
          return 1;
        } else if(month <= 6){
          return 2;
        } else if(month <= 9){
          return 3;
        } else if(month <= 12){
          return 4;
        }
      
      return 0;
    }
}