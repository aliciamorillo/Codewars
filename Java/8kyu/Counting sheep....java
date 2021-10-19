public class Counter {
  public int countSheeps(Boolean[] arrayOfSheeps) {
    int sum = 0;
    for(Boolean sheep : arrayOfSheeps) {
        if(sheep != null && sheep){
            sum ++;
        }
    }
    return sum;
  }
}