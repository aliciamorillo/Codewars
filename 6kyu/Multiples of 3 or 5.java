import java.util.stream.IntStream;
import static org.junit.Assert.assertEquals;

public class Solution {

  public int solution(int number) {
    
    if(number == 0){
      return 0;
      
    } else {
      return IntStream.range(1, number)
      .filter(n -> n % 3 == 0 || n % 5 == 0)
      .sum();
    }
    
  }
}