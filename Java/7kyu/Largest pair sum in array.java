public class Solution{
    public static int largestPairSum(int[] numbers){
        int temp = 0;
        int largest1 = numbers[0];
        int largest2 = numbers[1];

        if (largest1 < largest2){
          temp = largest1;
          largest1 = largest2;
          largest2 = temp;
        }
        
        for (int i = 2; i < numbers.length; i++){
          if (numbers[i] > largest1){
            largest2 = largest1;
            largest1 = numbers[i];
          }
          else if (numbers[i] >= largest2){
            largest2 = numbers[i];
          }
        }
      
        return largest1 + largest2;
    }
}