public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int sum = 0;
    
    for(int point: classPoints){
      sum += point;
    }
    
    if(yourPoints > sum/classPoints.length){
      return true;
    } else {
      return false;
    }
  }
}