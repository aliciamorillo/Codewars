public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
          
      if(nb_petals % 6 == 1){
        return "I love you";
      }
      
      if(nb_petals % 6 == 2){
        return "a little";
      }
      
      if(nb_petals % 6 == 3){
        return "a lot";
      }
      
      if(nb_petals % 6 == 4){
        return "passionately";
      }
      
      if(nb_petals % 6 == 5){
        return "madly";
      }
      
      return "not at all";
    }
}