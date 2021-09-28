 public class Sum {
    public int GetSum(int a, int b) {
      int max = Math.max(a, b);
      int current = Math.min(a, b);
      int sum = 0;
      
      while (current <= max) {
        sum += current++;
      }
  
      return a == b ? a : sum;
    }
    
  }