class TimeUtils {
  public static String convertTime(int timeDiff) {
    
    int numberOfDays = timeDiff / 86400;
    int numberOfHours = (timeDiff % 86400 ) / 3600 ;
    int numberOfMinutes = ((timeDiff % 86400 ) % 3600 ) / 60;
    int numberOfSeconds = ((timeDiff % 86400 ) % 3600 ) % 60;

    String hour = numberOfDays + " " + numberOfHours + " "
      + numberOfMinutes + " " + numberOfSeconds;
    
    return hour;
    
  } 
}