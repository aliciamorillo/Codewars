public class TrafficLights {

  public static String updateLight(String current) {
    
    String newColor = "";
    
    if(current.equals("green")){
      newColor = "yellow";
    }
    
    if(current.equals("yellow")){
      newColor = "red";
    }
    
    if(current.equals("red")){
      newColor = "green";
    }
  
    return newColor;
  }
  
}